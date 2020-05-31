package com.point.newPDF.entity;

import com.alibaba.fastjson.JSON;

import java.util.Map;

public interface PDFEntity {

    static public PDFEntity makePDFEntity(String pdfname) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        pdfname = pdfname.replace('-', '_');
        Class clasz = Class.forName("com.point.newPDF.entity." + pdfname + "Entity");
        PDFEntity entity = (PDFEntity) clasz.newInstance();
        return entity;
    }

    static public PDFEntity makePDFEntity(String pdfname, Map<String,String> map) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        pdfname = pdfname.replace('-', '_');
        String jsonStr= JSON.toJSONString(map);
        Object obj=JSON.parseObject(jsonStr, Class.forName("com.point.newPDF.entity." + pdfname + "Entity"));
        return (PDFEntity)obj;
    }

    abstract void CalculateValue();
}
