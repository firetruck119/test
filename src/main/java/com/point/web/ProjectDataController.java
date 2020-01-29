package com.point.web;

import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectColumnDefinitionDetail;
import com.point.entity.ProjectData;
import com.point.excel.ExcelUtil;
import com.point.mapper.ProjectColumnDefinitionMapper;
import com.point.mapper.ProjectDataMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@RestController
public class ProjectDataController {
    @Autowired
    ProjectDataMapper projectDataMapper;

    @Autowired
    ProjectColumnDefinitionMapper projectColumnDefinitionMapper;

    @Autowired
    ExcelUtil excelUtil;

    @GetMapping("/ProjectColumnDefinitionList")
    public ModelAndView projectColumnDefinitionList() {
        ModelAndView modelAndView = new ModelAndView("ProjectColumnDefinitionList");
        return modelAndView;
    }

    @GetMapping("/ProjectData")
    public ModelAndView ProjectData() {
        ModelAndView modelAndView = new ModelAndView("ProjectData");
        return modelAndView;
    }

    @GetMapping("/ProjectColumnDefinitionAdd")
    public ModelAndView projectColumnDefinitionAdd() {
        ModelAndView modelAndView = new ModelAndView("ProjectColumnDefinitionAdd");
        return modelAndView;
    }

    @PostMapping("/ProjectColumnDefinitionAdd")
    public String addProjectColumnDefinition(@ModelAttribute ProjectColumnDefinition projectColumnDefinition, HttpServletResponse response) {
        try {
            projectColumnDefinitionMapper.insertSelective(projectColumnDefinition);
            response.sendRedirect("/ProjectColumnDefinitionList");
        } catch (IOException e1) {

        }
        return null;
    }

    @PostMapping("/getProjectColumnDefinitionList")
    public GridDataJsonModel getProjectColumnDefinitionList() {
        GridDataJsonModel model = new GridDataJsonModel();
        List<ProjectColumnDefinition> list = projectColumnDefinitionMapper.selectByExample(null);
        list.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
        model.setStatus("success");
        model.setData(list);
        model.setTotals(list.size());
        return model;
    }

    @PostMapping("/getProjectColumnDefinitionDetailList")
    public GridDataJsonModel getProjectColumnDefinitionDetailList() {
        GridDataJsonModel model = new GridDataJsonModel();
        try {
            List<ProjectColumnDefinitionDetail> result = new ArrayList<>();
            List<ProjectData> projectDataList = projectDataMapper.selectByExample(null);
            List<ProjectColumnDefinition> definitionList = projectColumnDefinitionMapper.selectByExample(null);
            definitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            Map<ProjectColumnDefinition, Field> dataFieldMap = getDataFieldMap(definitionList);
            for (Map.Entry<ProjectColumnDefinition, Field> fieldEntry : dataFieldMap.entrySet()) {
                if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_STRING) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    Set<String> stringValues = new HashSet<>();
                    detail.setStringValues(stringValues);
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {
                            stringValues.add(fieldEntry.getValue().get(projectData).toString());
                        }
                    }
                } else if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {
                            double doubleValue = Double.parseDouble(fieldEntry.getValue().get(projectData).toString());
                            if (detail.getMinValue() == null || doubleValue < detail.getMinValue()) {
                                detail.setMinValue(doubleValue);
                            }
                            if (detail.getMaxValue() == null || doubleValue > detail.getMaxValue()) {
                                detail.setMaxValue(doubleValue);
                            }
                        }
                    }
                }
            }
            model.setStatus("true");
            model.setData(definitionList);
            model.setTotals(definitionList.size());

        } catch (Exception ex) {
            model.setStatus("false");
            model.setMessage(ex.getMessage());
        }
        return model;
    }

    @PostMapping("/projectDataImport")
    private GridDataJsonModel projectDataImport(@ModelAttribute MultipartFile excelData) {
        GridDataJsonModel result = new GridDataJsonModel();
        try {
            List<ProjectColumnDefinition> columnDefinitionList = projectColumnDefinitionMapper.selectByExample(null);
            int columns = columnDefinitionList.size();
            List<ProjectData> dataList = excelUtil.readExcel(excelData, columns);
            HashSet<String> projectNameSet = new HashSet<>();
            columnDefinitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            Map<ProjectColumnDefinition, Field> dataFieldMap = getDataFieldMap(columnDefinitionList);
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
        }catch (CustomerException cex){
             result.setStatus("false");
            result.setMessage("没有数据导入," + cex);
        }
        catch (Exception ex) {
            result.setStatus("false");
            result.setMessage("系统发生未知异常，请检查数据，或联系维护人员：" + ex);
        }
        return result;
    }

    private void aaa(){
        try {
            List<ProjectData> list = new ArrayList<>();
            Map<Integer, String> queryCondition = new HashMap<>();
            queryCondition.put(0, "1");
            queryCondition.put(1, "3");
            Map<Integer, Field> fieldMap = new HashMap<>();
            for (int i = 0; i < 2; i++) {
                Field fieldTag = ProjectData.class.getDeclaredField("datacolumn" + i);
                fieldMap.put(i, fieldTag);
            }
            List<ProjectData> result = new ArrayList<>();
            for (ProjectData item : list) {
                boolean isEqual = true;
                for (Map.Entry<Integer, String> entry : queryCondition.entrySet()) {
                    if (!entry.getValue().equals(fieldMap.get(entry.getKey()).get(item))) {
                        isEqual = false;
                        break;
                    }
                }
                if (isEqual) {
                    result.add(item);
                }
            }
        }catch (Exception ex){

        }
    }

    private Map<ProjectColumnDefinition, Field> getDataFieldMap(List<ProjectColumnDefinition> columnDefinitionList){
        Map<ProjectColumnDefinition, Field> dataFieldMap = new HashMap<>();
        try {
            for (ProjectColumnDefinition columnDefinition : columnDefinitionList) {
                Field dataColumnFeild = ProjectData.class.getDeclaredField("datacolumn"
                        + columnDefinition.getProjectcolumndefinitionid());
                dataColumnFeild.setAccessible(true);
                dataFieldMap.put(columnDefinition, dataColumnFeild);
            }
        }catch (Exception ex){

        }
        return dataFieldMap;
    }

}
