package com.point.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.common.Logger;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectData;
import com.point.excel.ExcelUtil;
import com.point.mapper.ProjectColumnDefinitionMapper;
import com.point.mapper.ProjectDataMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

@Controller
public class ImportExportProjectDataController {
    @Autowired
    ProjectDataMapper projectDataMapper;

    @Autowired
    ProjectColumnDefinitionMapper projectColumnDefinitionMapper;

    @Autowired
    ExcelUtil excelUtil;

    @GetMapping("/ImportExportProjectData")
    public String getMap(){
        return "ImportExportProjectData";
    }

    @PostMapping("/ImportProjectData")
    private Object projectDataImport(@ModelAttribute MultipartFile excelData) {
        GridDataJsonModel result = new GridDataJsonModel();
        try {
            List<ProjectColumnDefinition> columnDefinitionList = projectColumnDefinitionMapper.selectByExample(null);
            int columns = columnDefinitionList.size();
            List<ProjectData> dataList = excelUtil.readExcel(excelData, columns);
            HashSet<String> projectNameSet = new HashSet<>();
            columnDefinitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            Map<ProjectColumnDefinition, Field> dataFieldMap = excelUtil.getDataFieldMap(columnDefinitionList);
            for (ProjectData projectData : dataList) {
                if (projectNameSet.contains(projectData.getProjectname())) {
                    throw new CustomerException("导入存在重复数据：" + projectData.getProjectname());
                }
                for (Map.Entry<ProjectColumnDefinition, Field> entry : dataFieldMap.entrySet()) {
                    boolean checkNumber = entry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC;
                    if (checkNumber) {
                        try {
                            String columnData = entry.getValue().get(projectData) == null ? Consts.NULL : entry.getValue().get(projectData).toString();
                            Double.parseDouble(columnData);
                        } catch (Exception ex) {
                            Logger.getInstance().error("ex",ex);
                            throw new CustomerException(entry.getKey().getColumnname() + "必须为数值, 请检查" + projectData.getProjectname());
                        }
                    }
                }
                projectNameSet.add(projectData.getProjectname());
            }
            List<ProjectData> existedList = projectDataMapper.selectByExample(null);
            Map<Integer, ProjectData> existedMap = existedList.stream()
                    .collect(Collectors.toMap(ProjectData::getProjectdataid, v -> v));
            Set<String> existedProjectNames = existedList.stream().map(ProjectData::getProjectname).collect(Collectors.toSet());
            List<ProjectData> insertList = new ArrayList<>();
            List<ProjectData> updateList = new ArrayList<>();
            //序号大于0表示是更新原有数据，需要根据名称检验原数据是否存在，序号等于0表示是差人新数据，名称唯一
            for (ProjectData projectData : dataList) {
                if (projectData.getProjectdataid() == 0) {
                    if (existedProjectNames.contains(projectData.getProjectname())) {
                        throw new CustomerException("此名称已存在：" + projectData.getProjectname());
                    }
                    insertList.add(projectData);
                } else {
                    ProjectData existedData = existedMap.get(projectData.getProjectdataid());
                    if (existedData == null) {
                        throw new CustomerException("序号：" + projectData.getProjectdataid() + "并不存在");
                    } else if (!existedData.getProjectname().equals(projectData.getProjectname())) {
                        throw new CustomerException("序号：" + projectData.getProjectdataid() + "对应名称与系统不一致");
                    } else {
                        updateList.add(projectData);
                    }
                }
            }
            insertList.forEach(x -> projectDataMapper.insertSelective(x));
            updateList.forEach(x -> projectDataMapper.updateByPrimaryKeySelective(x));
            result.setStatus("true");
            result.setMessage("导入成功，新增" + insertList.size() + "条数据，更新" + updateList.size() + "条数据");
        } catch (CustomerException cex) {
            result.setStatus("false");
            result.setMessage("没有数据导入," + cex.getMessage());
        } catch (Exception ex) {
            Logger.getInstance().error("ex",ex);
            result.setStatus("false");
            result.setMessage("系统发生未知异常，请检查数据，或联系维护人员：" + ex);
        }
        Map<String, String> modelMap = new HashMap<>();
        modelMap.put("message", result.getMessage());
        return new ModelAndView("ImportExportProjectData", modelMap);
    }

    @GetMapping("/ExportProjectData")
    private void exportExcel( HttpServletResponse response) {//, HttpServletResponse response
        try {
            List<ProjectColumnDefinition> columnDefinitionList = projectColumnDefinitionMapper.selectByExample(null);
            List<ProjectData> allData = projectDataMapper.selectByExample(null);
            HSSFWorkbook workbook = excelUtil.getHSSFWorkbook(allData, columnDefinitionList);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmssSSS");
            String fileName = "excel导出结果" + sdf.format(new Date());

            try {
                OutputStream os = response.getOutputStream();
                response.setHeader("content-disposition", "attachment;filename="
                        + URLEncoder.encode(fileName, "utf-8") + ".xls");

                workbook.write(os);
                os.flush();
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("/ProjectData");
        } catch (Exception ex) {
            Logger.getInstance().error("ex",ex);
        }
    }
}
