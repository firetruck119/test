package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.ShzFarmStabilityEntity;
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
public class ShzFarmStabilityController {

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

    @GetMapping("/pdf/ShzFarmStability")
    public String getMap2() {
        return "pdf/ShzFarmStability";
    }

    @GetMapping("/ShzFarmStability")
    public String getMap() {
        return "ShzFarmStability";
    }

    @GetMapping("/ShzFarmStability/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        ShzFarmStabilityEntity entity = new ShzFarmStabilityEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("ShzFarmStability/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute ShzFarmStabilityEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("ShzFarmStability/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute ShzFarmStabilityEntity entity,
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
            name = "上回转固定臂-稳定性校核及轮压计算书";
        } else if ( entity.getXljzsyModel().equals("静载试验") ) {
            name = "上回转固定臂-稳定性校核及轮压计算书-静载试验";
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/" + name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/上回转固定臂-稳定性校核及轮压计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/上回转固定臂-稳定性校核及轮压计算书-静载试验"));
        }
        return tool.getResponseEntity(name, list.get(0));

//        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/上回转固定臂稳定性校核及轮压计算书"));
//        if (null!=check&&check) {
////            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/立柱顶轮校核计算书验证部分"));
////            return tool.getResponseEntity("立柱顶轮校核计算书验证部分", pdf.MergePDF(list));
//        }
//        return tool.getResponseEntity("上回转固定臂稳定性校核及轮压计算书", list.get(0));
    }
}

