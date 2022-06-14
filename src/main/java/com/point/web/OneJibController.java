package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.OneJibEntity;
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
public class OneJibController {

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

    @GetMapping("/pdf/OneJib")
    public String getMap2() {
        return "pdf/OneJib";
    }

    @GetMapping("/OneJib")
    public String getMap() {
        return "OneJib";
    }

    @GetMapping("/OneJib/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        OneJibEntity entity = new OneJibEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("OneJib/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute OneJibEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("OneJib/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute OneJibEntity entity,
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
            name = "1+1伸缩臂机吊臂校核计算书";
        } else if ( entity.getXljzsyModel().equals("静载试验") ) {
            name = "1+1伸缩臂机吊臂校核计算书-静载试验";
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/" + name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1伸缩臂机吊臂校核计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1伸缩臂机吊臂校核计算书-静载试验"));
        }
        return tool.getResponseEntity(name, list.get(0));

//        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1伸缩臂机吊臂校核计算书"));
//        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/1+1伸缩臂机吊臂校核计算书验证部分"));
//            return tool.getResponseEntity("1+1伸缩臂机吊臂校核计算书验证部分", pdf.MergePDF(list));
//        }
//        return tool.getResponseEntity("1+1伸缩臂机吊臂校核计算书", list.get(0));
    }
}

