package com.point.newPDF.controller;


import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.itext.PdfCreater;
import com.point.itext.PdfUtil;
import com.point.newPDF.entity.PDFEntity;
import com.point.newPDF.entity.RoleEntity;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.security.RolesAllowed;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@Controller
public class PDFController {
    @Autowired
    PdfCreater pdf;

    @Autowired
    PdfUtil pdfUtil;
    @Autowired
    ToolForPDFController tool;

    @Autowired
    CacheData cacheData;

    @Autowired
    ImageCacheData imageCacheData;

    @Autowired
    URLCacheData urlCacheData;

    @GetMapping("/pdf/{pdfname}")
    public String getWeb(Model model, @PathVariable("pdfname") String pdfname) {
        model.addAttribute("mainHtml", "pdf");
        model.addAttribute("pdfname", pdfname);
        return "newHtml/home";
    }


    @GetMapping(value = "/pdf/{pdfname}/getData")
    @ResponseBody
    public Object getData(@RequestParam String batchId, @PathVariable("pdfname") String pdfname) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Map<String, Object> result = new HashMap<>();
        PDFEntity entity = PDFEntity.makePDFEntity(pdfname);
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        Map<String, InputURLCache> imagemap = urlCacheData.readCacheValue(batchId);
        return result;
    }
    @PostMapping("/pdf/{pdfname}/getPDF/{type}")
    public String getPDF(Model model,
                         @RequestParam Map map,
                         @RequestParam(required=false) String sjht,
                         @PathVariable("pdfname") String pdfname,
                         @PathVariable("type") String type) throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        PDFEntity entity = PDFEntity.makePDFEntity(pdfname,map);
        cacheData.saveCacheValue(sjht,entity);
        return "newHtml/home";
    }

    @PostMapping("/savePicture")
    @ResponseBody
    public Object savePicture(
            @RequestParam("file") MultipartFile uploadImage) throws IOException {
        if (uploadImage.isEmpty())
            return "";
        File file = null;
        String s[] = uploadImage.getOriginalFilename().split("\\.");
        LocalDateTime t = LocalDateTime.now();
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyyMMdd");
        try {
            file = new File("A:/image/" + t.format(dtf2)  + getRandomName() + '.' + s[s.length - 1]);
        } catch (Exception e) {
            file = new File("/root/image/" + t.format(dtf2)  + getRandomName() + '.' + s[s.length - 1]);
        }
        uploadImage.transferTo(file);
        return file.getName();
    }


    private String getRandomName() {
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<4;i++){
            sb.append('-');
            for(int j=0;j<4;j++){
                int number=random.nextInt(62);
                sb.append(str.charAt(number));
            }
        }
        return sb.toString();
    }
}
