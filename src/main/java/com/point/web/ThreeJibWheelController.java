package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.ThreeJibWheelEntity;
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
public class ThreeJibWheelController {

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

    @GetMapping("/ThreeJibWheel")
    public String getMap() {
        return "ThreeJibWheel";
    }

    @GetMapping("/ThreeJibWheel/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        ThreeJibWheelEntity entity = new ThreeJibWheelEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("ThreeJibWheel/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute ThreeJibWheelEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("ThreeJibWheel/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute ThreeJibWheelEntity entity,
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
        if ( entity.getSsjgxsModel().equals("齿轮齿条式伸缩机构") ) {
            name = "3+1吊臂滚轮、链条及齿轮齿条式伸缩机构校核计算书";
        } else if ( entity.getSsjgxsModel().equals("液压式伸缩机构") ) {
            name = "3+1吊臂滚轮、链条及液压式伸缩机构校核计算书";
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/" + name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/3+1吊臂滚轮、链条及齿轮齿条式伸缩机构校核计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/3+1吊臂滚轮、链条及液压式伸缩机构校核计算书"));
        }
        return tool.getResponseEntity(name, list.get(0));
    }
}