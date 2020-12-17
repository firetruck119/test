package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.YygglYxrjEntity;
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
public class YygglYxrjController {

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

    @GetMapping("/pdf/YygglYxrj")
    public String getMap2() {
        return "pdf/YygglYxrj";
    }

    @GetMapping("/YygglYxrj")
    public String getMap() {
        return "YygglYxrj";
    }

    @GetMapping("/YygglYxrj/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        YygglYxrjEntity entity = new YygglYxrjEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("YygglYxrj/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute YygglYxrjEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("YygglYxrj/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute YygglYxrjEntity entity,
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
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/液压缸功率及油箱容积计算书"));
        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/仰臂液压缸校核计算书验证部分"));
//            return tool.getResponseEntity("1+1伸缩臂机吊臂校核计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("液压缸功率及油箱容积计算书", list.get(0));
    }
}

