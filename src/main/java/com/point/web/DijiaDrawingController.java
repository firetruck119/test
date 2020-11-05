package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.DijiaDrawingEntity;
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
public class DijiaDrawingController {

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

    @GetMapping("/DijiaDrawing")
    public String getMap() {
        return "DijiaDrawing";
    }

    @GetMapping("/DijiaDrawing/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        DijiaDrawingEntity entity = new DijiaDrawingEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("DijiaDrawing/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute DijiaDrawingEntity entity){
        return entity.check();
    }
    @PostMapping("DijiaDrawing/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute DijiaDrawingEntity entity,
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
        String name="";
        if(pdfType.equals("PeiZhong")) {
            name="配重计算书";
        } else if(pdfType.equals("PeiZhongWuTu")){
            name="无图版配重计算书";
        }
        if(!name.equals(""))
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/"+name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/配重计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/无图版配重计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/配重计算书验证部分"));
            return tool.getResponseEntity("配重计算书验证部分", pdf.MergePDF(list));
        }

         return tool.getResponseEntity(name, list.get(0));

    }
}
