package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.DsHydraulicCylinderEntity;
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
public class DsHydraulicCylinderController {

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

    @GetMapping("/pdf/DsHydraulicCylinder")
    public String getMap2() {
        return "pdf/DsHydraulicCylinder";
    }

    @GetMapping("/DsHydraulicCylinder")
    public String getMap() {
        return "DsHydraulicCylinder";
    }

    @GetMapping("/DsHydraulicCylinder/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        DsHydraulicCylinderEntity entity = new DsHydraulicCylinderEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("DsHydraulicCylinder/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute DsHydraulicCylinderEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("DsHydraulicCylinder/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute DsHydraulicCylinderEntity entity,
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
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/顶升液压缸校核计算书"));
        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/立柱顶轮校核计算书验证部分"));
//            return tool.getResponseEntity("立柱顶轮校核计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("顶升液压缸校核计算书", list.get(0));
    }
}

