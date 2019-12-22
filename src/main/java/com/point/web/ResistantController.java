package com.point.web;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.point.entity.pdf.ResistantEnity;
import com.point.entity.pdf.TensileEnity;
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
public class ResistantController {
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
    private Image getLocalImage(String name) throws IOException, BadElementException {
        Image img=null;
        try {
            img= Image.getInstance("/root/image/Resistant/"+name+".png");
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            return img;
        }
    }
    private Map<String, Image> getImageMap(HttpServletRequest request) throws IOException, BadElementException {
        Map<String, MultipartFile> files = ((MultipartHttpServletRequest) request).getFileMap();
        Map<String, Image> imageMap = new HashMap<>();
        for (Map.Entry<String, MultipartFile> e : files.entrySet()) {
            if(!e.getValue().isEmpty())
                imageMap.put(e.getKey(), Image.getInstance(e.getValue().getBytes()));
        }
        for(int i=0;i<4;i++){
            String name="tu"+(i+1);
            System.out.println(imageMap.get(name));
            if (imageMap.get(name) == null) {
                imageMap.put(name,getLocalImage(name));
            }
        }
        return imageMap;
    }
    @GetMapping("/Resistant")
    public String greetingForm(Model model, @ModelAttribute ResistantEnity enity) {
        model.addAttribute("ResistantEnity", new ResistantEnity());
        return "Resistant";
    }

    @PostMapping("/resistantpdf1")
    public Object pdf1(@ModelAttribute ResistantEnity enity, HttpServletRequest request) {
        Map<String, String> textMap = new HashMap<>();
        textMap = enity.getMapForPDF1();
        Map<String, Image> imageMap = new HashMap<>();
        try {
            imageMap = getImageMap(request);
        } catch (Exception e) {
        }
        byte[] pdfBtyes;
        pdfBtyes = pdf.fromPDFTempletToPdfWithValue(textMap, imageMap, "抗压埋件计算书");
        return getResponseEntity("抗压埋件计算书", pdfBtyes);
    }
    @PostMapping("/resistantpdf2")
    public Object pdf2(@ModelAttribute ResistantEnity enity, HttpServletRequest request) throws IOException, DocumentException {
        Map<String, Image> imageMap = new HashMap<>();
        try {
            imageMap = getImageMap(request);
        } catch (Exception e) {

        }
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue(enity.getMapForPDF1(), imageMap, "抗压埋件计算书"));
        list.add(pdf.fromPDFTempletToPdfWithValue(enity.getMapForPDF2(), imageMap, "抗压埋件计算书验证部分"));
        return getResponseEntity("抗压埋件计算书验证部分", pdf.MergePDF(list));
    }
    @PostMapping("resistant/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute ResistantEnity enity){
        return enity.checkCN();
    }
}
