package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.JibFrontButtFlangeEntity;
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
public class JibFrontButtFlangeController {

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

    @GetMapping("/pdf/JibFrontButtFlange")
    public String getMap2() {
        return "pdf/JibFrontButtFlange";
    }

    @GetMapping("/JibFrontButtFlange")
    public String getMap() {
        return "JibFrontButtFlange";
    }

    @GetMapping("/JibFrontButtFlange/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        JibFrontButtFlangeEntity entity = new JibFrontButtFlangeEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("JibFrontButtFlange/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute JibFrontButtFlangeEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("JibFrontButtFlange/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute JibFrontButtFlangeEntity entity,
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
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/吊臂前对接法兰螺栓及焊缝校核计算书"));
        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/立柱顶轮校核计算书验证部分"));
//            return tool.getResponseEntity("立柱顶轮校核计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("吊臂前对接法兰螺栓及焊缝校核计算书", list.get(0));
    }
}

