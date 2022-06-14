package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.ThreeJibEntity;
import com.point.itext.PdfCreater;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ThreeJibController {

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

    @GetMapping("/pdf/ThreeJib")
    public String getMap2() {
        return "pdf/ThreeJib";
    }

    @GetMapping("/ThreeJib")
    public String getMap() {
        return "ThreeJib";
    }

    @GetMapping("/ThreeJib/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        ThreeJibEntity entity = new ThreeJibEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("ThreeJib/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute ThreeJibEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("ThreeJib/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute ThreeJibEntity entity,
                         @RequestParam(required = false) String pdfType,
                         @RequestParam(required = false) Boolean check,
                         @RequestParam(required = false) String sjht) throws IOException, DocumentException {

        Map<String, File> imageMap = new HashMap<>();
        try {
            imageMap = tool.getImageMap(sjht, request);
        } catch (Exception e) {
        }
        urlCacheData.saveCacheValue(sjht, imageMap);
        cacheData.saveCacheValue(sjht, entity);
        List<byte[]> list = new ArrayList<>();
        String name = "";
        if ( entity.getXljzsyModel().equals("常规工况") ) {
            name = "3+1伸缩臂机吊臂校核计算书";
        } else if ( entity.getXljzsyModel().equals("静载试验") ) {
            name = "3+1伸缩臂机吊臂校核计算书-静载试验";
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/" + name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/3+1伸缩臂机吊臂校核计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/3+1伸缩臂机吊臂校核计算书-静载试验"));
        }
        return tool.getResponseEntity(name, list.get(0));

//        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/3+1伸缩臂机吊臂校核计算书"));
//        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/3+1伸缩臂机吊臂校核计算书验证部分"));
//            return tool.getResponseEntity("3+1伸缩臂机吊臂校核计算书验证部分", pdf.MergePDF(list));
//        }
//        return tool.getResponseEntity("3+1伸缩臂机吊臂校核计算书", list.get(0));
    }
}

