package com.point.newPDF.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.point.common.CustomerException;
import com.point.excel.DataTableExcelUtil;
import com.point.newPDF.Service.MailService;
import com.point.newPDF.Service.SelectTabelService;
import com.point.newPDF.entity.select.DataTableEntity;
import com.point.newPDF.entity.select.TableColumnEntity;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.util.*;

@Controller
public class DataTableController {
    @Autowired
    SelectTabelService selectService;
    @Autowired
    DataTableExcelUtil util;

    @GetMapping("/dataTable")
    public String getWeb(Model model) {
        model.addAttribute("mainHtml", "dataTable");
        model.addAttribute("pdfname", "dataTable");
        return "newHtml/home";
    }

    @PostMapping("/dataTable/updataTable")
    @ResponseBody
    public int updataById(DataTableEntity entity) throws CustomerException {
        return selectService.updataById(entity);
    }

    @GetMapping("/dataTable/getList")
    @ResponseBody
    public List<DataTableEntity> getList() {
        List<DataTableEntity> l=selectService.getAll();
        return l;
    }

    @PostMapping("/dataTable/createNewTable")
    @ResponseBody
    public Object createNewTable(DataTableEntity entity) throws CustomerException {
        return selectService.insertTable(entity);
    }

    @PostMapping("/dataTable/deleteTable")
    @ResponseBody
    public Object deleteTable(DataTableEntity entity) throws CustomerException {
        return selectService.delete(entity);
    }

    @PostMapping("/dataTable/upExcel")
    @ResponseBody
    public Object upExcel( DataTableEntity tableEntity, @RequestParam("excelData") MultipartFile file) throws Exception {
        util.readExcel(file, tableEntity);
        selectService.inesrtJson(tableEntity);
        return "123";
    }

    @PostMapping(value="/dataTable/downLoadExcel")
    @ResponseBody
    public void downLoadExcel(@RequestBody DataTableEntity tableEntity, HttpServletResponse response) throws Exception {
        Map<String, TableColumnEntity> columnMap = new LinkedHashMap<>();
        Map<String, Map<String, String>> dataMap = new LinkedHashMap<>();
        DataTableEntity entity=selectService.getTable(tableEntity.getId());
        columnMap = JSON.parseObject(entity.getColumnsJSON(), new TypeReference<LinkedHashMap<String, TableColumnEntity>>() {
        });
        dataMap = JSON.parseObject(entity.getRowsJSON(), new TypeReference<LinkedHashMap<String, Map<String, String>>>() {
        });
        try {
            OutputStream os = response.getOutputStream();
            response.setHeader("content-disposition", "attachment;filename="
                    + URLEncoder.encode(tableEntity.getTablename(), "utf-8") + ".xls");
            Workbook workbook = util.getHSSFWorkbook(columnMap, dataMap);
            workbook.write(os);
            os.flush();
            os.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/dataTable/getTable/rowlist")
    @ResponseBody
    public Object rowlist(){
        return "123";
    }

    @GetMapping("/dataTable/getTable/{tableDataId}")
    @ResponseBody
    public Object getTable(@PathVariable("tableDataId") String tableId) throws CustomerException {
        DataTableEntity entity = selectService.getTable(Integer.parseInt(tableId));
        return entity;
    }
    @Autowired
    MailService service;

    @Autowired
    TemplateEngine templateEngine;

    @GetMapping("/sendMail")
    public void sendMail(){
        service.sendVerification("from","to","648485080@qq.com","DSFAFDAS");
    }

    @GetMapping("/dataTable/getTableByName/{name}")
    @ResponseBody
    public Object getTableByName(@PathVariable("name") String name) throws CustomerException {
        DataTableEntity entity = selectService.getTableByName(name);
        return entity;
    }
}
