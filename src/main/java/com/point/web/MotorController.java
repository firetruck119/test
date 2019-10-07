package com.point.web;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.point.entity.pdf.GiantSlewingMotorEntity;
import com.point.itext.PdfCreater;
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
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MotorController {
    @Autowired
    PdfCreater pdf;

    @GetMapping("/Motor")
    public String greetingForm(Model model, @ModelAttribute GiantSlewingMotorEntity giantSlewingMotorEntity) {
        model.addAttribute("GiantSlewingMotorEntity", new GiantSlewingMotorEntity());
        return "Motor";
    }

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

    private Map<String, Image> getImageMap(HttpServletRequest request) throws IOException, BadElementException {
        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();
        Map<String, Image> imageMap = new HashMap<>();

        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            imageMap.put(e.getKey(), Image.getInstance(e.getValue().getBytes()));
        }
        return imageMap;
    }

    @PostMapping("/motorpdf1")
    public Object pdf1(@ModelAttribute GiantSlewingMotorEntity giantSlewingMotorEntity, HttpServletRequest request) throws IOException, BadElementException {
        Map<String, String> textMap = new HashMap<>();
        textMap = giantSlewingMotorEntity.getMapForPdf1();
        Map<String, Image> imageMap = new HashMap<>();
        try {
            imageMap = getImageMap(request);
        } catch (Exception e) {

        }
        byte[] pdfBtyes;
        pdfBtyes = pdf.fromPDFTempletToPdfWithValue(textMap, imageMap, "大回转电机驱动力矩和功率校核计算书");
        return getResponseEntity("大回转电机驱动力矩和功率校核计算书", pdfBtyes);
    }

    @PostMapping("/motorpdf2")
    public Object pdf2(@ModelAttribute GiantSlewingMotorEntity giantSlewingMotorEntity, HttpServletRequest request) throws IOException, DocumentException {
        Map<String, Image> imageMap = new HashMap<>();
        try {
            imageMap = getImageMap(request);
        } catch (Exception e) {

        }
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue(giantSlewingMotorEntity.getMapForPdf1(), imageMap, "大回转电机驱动力矩和功率校核计算书"));
        list.add(pdf.fromPDFTempletToPdfWithValue(giantSlewingMotorEntity.getMapForPdf2(), imageMap, "大回转电机校核计算书验证部分"));
        return getResponseEntity("大回转电机校核计算书验证", pdf.MergePDF(list));
    }
    @PostMapping("motor/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute GiantSlewingMotorEntity giantSlewingMotorEntity){
        return giantSlewingMotorEntity.getCheck();
    }
}
