package com.point.web;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.point.common.Consts;
import com.point.common.CustomerException;
import com.point.entity.GridDataJsonModel;
import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectColumnDefinitionDetail;
import com.point.entity.ProjectData;
import com.point.excel.ExcelUtil;
import com.point.mapper.ProjectColumnDefinitionMapper;
import com.point.mapper.ProjectDataMapper;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.net.URLEncoder;
import java.text.Collator;
import java.text.SimpleDateFormat;
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
    public ModelAndView addProjectColumnDefinition(@ModelAttribute ProjectColumnDefinition projectColumnDefinition, HttpServletResponse response) {
        ModelAndView modelAndView = new ModelAndView("ProjectColumnDefinitionAdd");
        try {
            if (StringUtils.isEmptyOrWhitespace(projectColumnDefinition.getColumnname())) {
                modelAndView.addObject("message", "列名不能为空");
                return modelAndView;
            }
            List<ProjectColumnDefinition> allData = projectColumnDefinitionMapper.selectByExample(null);
            Set<String> allColunmNames = allData.stream().map(ProjectColumnDefinition::getColumnname).collect(Collectors.toSet());
            if (allColunmNames.contains(projectColumnDefinition.getColumnname())) {
                modelAndView.addObject("message",
                        projectColumnDefinition.getColumnname() + "与已有列名重复");
                return modelAndView;
            }
            projectColumnDefinitionMapper.insertSelective(projectColumnDefinition);
            response.sendRedirect("/ProjectColumnDefinitionList");
        } catch (IOException e) {

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
            Map<ProjectColumnDefinition, Field> dataFieldMap = excelUtil.getDataFieldMap(definitionList);
            for (Map.Entry<ProjectColumnDefinition, Field> fieldEntry : dataFieldMap.entrySet()) {
                if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_STRING) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    List<String> stringValues = new ArrayList<>();
                    detail.setStringValues(stringValues);
                    for (ProjectData projectData : projectDataList) {
                        if (fieldEntry.getValue().get(projectData) != null) {
                            stringValues.add(fieldEntry.getValue().get(projectData).toString());
                        }
                    }
                    if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_LETTER) {
                        stringValues = stringValues.stream().distinct().collect(Collectors.toList());
                        String[] stringArray = stringValues.toArray(new String[stringValues.size()]);
                        Collator cmp = Collator.getInstance(java.util.Locale.CHINA);
                        Arrays.sort(stringArray, cmp);
                        detail.setStringValues(Arrays.asList(stringArray));
                    } else if (fieldEntry.getKey().getQueryconditionorder() == Consts.QUERYCONDITIONORDER_RATE) {
                        Map<String, Long> rateMap = stringValues.stream().collect(Collectors.groupingBy(x -> x, Collectors.counting()));
                        stringValues = rateMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).collect(Collectors.toList());
                        Collections.reverse(stringValues);
                        detail.setStringValues(stringValues);
                    }
                } else if (fieldEntry.getKey().getColumndatatype() == Consts.COLUMNDATATYPE_NUMBERIC) {
                    ProjectColumnDefinitionDetail detail = new ProjectColumnDefinitionDetail(fieldEntry.getKey());
                    result.add(detail);
                    if(fieldEntry.getKey().getQueryconditionorder()==Consts.QUERYCONDITIONORDER_NUMBER_VALUE){
                        List<Double> doubleValues = new ArrayList<>();
                        for (ProjectData projectData : projectDataList) {
                            if (fieldEntry.getValue().get(projectData) != null) {
                                doubleValues.add(Double.parseDouble(fieldEntry.getValue().get(projectData).toString()));
                            }
                        }
                        Collections.sort(doubleValues);
                        detail.setStringValues(new ArrayList<>());
                        doubleValues.forEach(x->detail.getStringValues().add(String.valueOf(x)));
                    }else if(fieldEntry.getKey().getQueryconditionorder()==Consts.QUERYCONDITIONORDER_NUMBER_RANGE_){
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
            }
            result.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            model.setStatus("true");
            model.setData(result);
            model.setTotals(result.size());

        } catch (Exception ex) {
            model.setStatus("false");
            model.setMessage(ex.getMessage());
        }
        return model;
    }

    @PostMapping("/projectDataImport")
    private ModelAndView projectDataImport(@ModelAttribute MultipartFile excelData) {
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
            result.setMessage("导入成功，新增"+insertList.size()+"条数据，更新"+updateList.size()+"条数据");
        } catch (CustomerException cex) {
            result.setStatus("false");
            result.setMessage("没有数据导入," + cex.getMessage());
        } catch (Exception ex) {
            result.setStatus("false");
            result.setMessage("系统发生未知异常，请检查数据，或联系维护人员：" + ex);
        }
        Map<String, String> modelMap = new HashMap<>();
        modelMap.put("message", result.getMessage());
        return new ModelAndView("ProjectData", modelMap);
    }

    @PostMapping("queryProjectData")
    private GridDataJsonModel queryProjectData(@RequestBody String map) {
        GridDataJsonModel model = new GridDataJsonModel();
        try {
            JSONObject jb = JSONArray.parseObject(map);
            Map<String, String> queryCondition = JSONObject.parseObject(jb.toJSONString()
                    , new TypeReference<Map<String, String>>() {
                    });
            List<ProjectColumnDefinition> columnDefinitionList = projectColumnDefinitionMapper.selectByExample(null);
            columnDefinitionList.sort(Comparator.comparing(ProjectColumnDefinition::getProjectcolumndefinitionid));
            List<ProjectData> projectDataList = queryProjectData(queryCondition, columnDefinitionList);
            List<ProjectColumnDefinition> headers = new ArrayList<>();
            ProjectColumnDefinition header1 = new ProjectColumnDefinition();
            ProjectColumnDefinition header2 = new ProjectColumnDefinition();
            headers.add(header1);
            headers.add(header2);
            header1.setColumnname("序号");
            header1.setColumndatatype(Consts.COLUMNDATATYPE_STRING);
            header2.setColumnname("名称");
            header2.setColumndatatype(Consts.COLUMNDATATYPE_STRING);
            headers.addAll(columnDefinitionList);
            List<String> rows = new ArrayList<>();
            Map<ProjectColumnDefinition, Field> definitionFieldMap = excelUtil.getDataFieldMap(columnDefinitionList);
            for (ProjectData projectData : projectDataList) {
                List<String> row = new ArrayList<>();
                row.add(projectData.getProjectdataid().toString());
                row.add(projectData.getProjectname());
                for (ProjectColumnDefinition columnDefinition : columnDefinitionList) {
                    Field field = definitionFieldMap.get(columnDefinition);
                    Object object = field.get(projectData);
                    //因为用半角逗号做分隔符，为防误判这里把半角逗号替换成全角
                    row.add(object == null ? Consts.NULL : object.toString().replace(",","，"));
                }
                rows.add(String.join(",", row.toArray(new String[0])));
            }
            model.setStatus("true");
            model.setData(rows);
            model.setHeaders(headers);
        } catch (Exception ex) {

        }
        return model;
    }

    @PostMapping("/exportExcel")
    private void exportExcel(@RequestParam String map, HttpServletResponse response) {//, HttpServletResponse response
        try {
            JSONObject jb = JSONArray.parseObject(map);
            Map<String, String> queryCondition = JSONObject.parseObject(jb.toJSONString()
                    , new TypeReference<Map<String, String>>() {
            });
            List<ProjectColumnDefinition> columnDefinitionList = projectColumnDefinitionMapper.selectByExample(null);
            List<ProjectData> projectDataList = queryProjectData(queryCondition,columnDefinitionList);
            HSSFWorkbook workbook = excelUtil.getHSSFWorkbook(projectDataList, columnDefinitionList);
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

        }
    }

    private List<ProjectData> queryProjectData(Map<String, String> queryCondition
            , List<ProjectColumnDefinition> columnDefinitionList) {
        List<ProjectData> result = new ArrayList<>();
        try {
            queryCondition = queryCondition.entrySet().stream()
                    .filter(x -> !StringUtils.isEmpty(x.getValue()))
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            String primaryKey = queryCondition.get("projectDataId");
            List<ProjectData> allData = new ArrayList<>();
            if (primaryKey == null) {
                allData = projectDataMapper.selectByExample(null);
            } else {
                ProjectData primaryData = projectDataMapper.selectByPrimaryKey(Integer.parseInt(primaryKey));
                allData.add(primaryData);
            }
            Map<ProjectColumnDefinition, Field> dataFieldMap = excelUtil.getDataFieldMap(columnDefinitionList);
            Map<Integer, Field> indexFieldMap = dataFieldMap.entrySet().stream()
                    .collect(Collectors.toMap(x -> x.getKey().getProjectcolumndefinitionid(), x -> x.getValue()));

            for (ProjectData item : allData) {
                boolean filter = false;
                for (Map.Entry<String, String> entry : queryCondition.entrySet()) {
                    if (entry.getKey().equals("projectDataName")) {
                        String projectDataName = item.getProjectname();
                        if (!projectDataName.contains(entry.getValue())) {
                            filter = true;
                            break;
                        }
                    }
                    if (entry.getKey().startsWith("stringValue")) {
                        int columnIndex = Integer.parseInt(entry.getKey().substring("stringValue".length()));
                        Object object = indexFieldMap.get(columnIndex).get(item);
                        if (object == null) {
                            filter = true;
                            break;
                        }
                        String columnData = object.toString();
                        if (!columnData.contains(entry.getValue())) {
                            filter = true;
                            break;
                        }
                    } else if (entry.getKey().startsWith("minValue") || entry.getKey().startsWith("maxValue")) {
                        boolean greatThan = entry.getKey().startsWith("minValue");
                        int columnIndex = Integer.parseInt(entry.getKey().substring("minValue".length()));
                        Object object = indexFieldMap.get(columnIndex).get(item);
                        if (object == null) {
                            filter = true;
                            break;
                        }
                        double columnData = Double.parseDouble(object.toString());
                        double compareDate = Double.parseDouble(entry.getValue());
                        if (greatThan) {
                            if (columnData < compareDate) {
                                filter = true;
                                break;
                            }
                        } else {
                            if (columnData > compareDate) {
                                filter = true;
                                break;
                            }
                        }
                    }
                }
                if (!filter) {
                    result.add(item);
                }
            }
        } catch (Exception ex) {

        }
        return result;
    }


}
