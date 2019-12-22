package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.entity.pdf.GiantSlewingMotorEntity;
import com.point.entity.pdf.WireRopeEntity;
import com.point.itext.PdfCreater;
import com.point.itext.PdfUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class WireRopeController {

    @Autowired
    PdfUtil pdfUtil;
    @Autowired
    PdfCreater pdf;
    private ResponseEntity<byte[]> getResponseEntity(String localName, byte[] bytes) {
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String((localName + ".pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/WireRope")
    public String wireropeForm(Model model, @ModelAttribute WireRopeEntity wireRopeEntity) {
        model.addAttribute("WireRopeEntity", new WireRopeEntity());
        return "WireRope";
    }
    @PostMapping("/WireRopePDF1")
    public Object pdfTest(@ModelAttribute WireRopeEntity wireRopeEntity) {
        Map<String, String> map = wireRopeEntity.getMapForPdf();
        String name="钢丝绳/";
        if(wireRopeEntity.getXh1()==null&&wireRopeEntity.getXh2()==null){
            return null;
        }else if(map.get("xh1")==null){
            name+="无吊船版钢丝绳校核计算书";
        }else if(map.get("xh2")==null){
            name+="无GRU版钢丝绳校核计算书";
        }else {
            name+="钢丝绳校核计算书";
        }
        byte[] pdfBtyes = pdfUtil.fromPDFTempletToPdfWithValue(map, null, name);
        return getResponseEntity(name, pdfBtyes);
    }
    @PostMapping("/WireRopePDF2")
    public Object pdf2(@ModelAttribute WireRopeEntity wireRopeEntity) throws IOException, DocumentException {
        String name="钢丝绳/";
        if(wireRopeEntity.getXh1()==null&&wireRopeEntity.getXh2()==null){
            return null;
        }else if(wireRopeEntity.getXh1()==null){
            name+="无吊船版钢丝绳校核计算书";
        }else if(wireRopeEntity.getXh2()==null){
            name+="无GRU版钢丝绳校核计算书";
        }else {
            name+="钢丝绳校核计算书";
        }
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue(wireRopeEntity.getMapForPdf(), null, name));
        list.add(pdf.fromPDFTempletToPdfWithValue(wireRopeEntity.getMapForPdf2(), null, name+"验证部分"));
        return getResponseEntity(name+"验证部分", pdf.MergePDF(list));
    }
    @PostMapping("WireRope/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute WireRopeEntity wireRopeEntity){
        return wireRopeEntity.getCheck();
    }
}
