package com.point.web;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.HorizontalTracksEntity;
import com.point.entity.pdf.PinSeatEntity;
import com.point.entity.pdf.TensileEnity;
import com.point.itext.PdfCreater;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class TensileController {
    @Autowired
    PdfCreater pdf;

    @Autowired
    ToolForPDFController tool;

    @Autowired
    CacheData cacheData;

    @Autowired
    ImageCacheData imageCacheData;

    @Autowired
    URLCacheData urlCacheData;

    @GetMapping("/pdf/Tensile")
    public String greetingForm2(Model model) {
        return "pdf/Tensile";
    }

    @GetMapping("/Tensile")
    public String greetingForm(Model model) {
        return "Tensile";
    }
    @GetMapping("/Tensile/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        TensileEnity entity = new TensileEnity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }
    @PostMapping("/tensilepdf1")
    public Object getPDF(@ModelAttribute TensileEnity entity,
                         HttpServletRequest request,
                         @RequestParam(required = false) String language,
                         @RequestParam(required = false) String sjht,
                         @RequestParam(required = false) Boolean check) throws IOException, DocumentException {
        Map<String, File> imageMap = new HashMap<>();
        try {
            imageMap = tool.getImageMap(sjht,request);
        } catch (Exception e) {
        }
        urlCacheData.saveCacheValue(sjht,imageMap);
        cacheData.saveCacheValue(sjht,entity);
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takePDFMap(), imageMap, "new/抗拉埋件计算书"));
        if (null!=check&&check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeCheckMapForCheck(), imageMap, "new/抗拉埋件计算书验证部分"));
            return tool.getResponseEntity("抗拉埋件计算书计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("抗拉埋件计算书", list.get(0));
    }

    @PostMapping("tensile/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute TensileEnity tensileEnity){
        return tensileEnity.checkCN();
    }
}
