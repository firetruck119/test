package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.IdlerWheelYygEntity;
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
public class IdlerWheelYygController {

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

    @GetMapping("/pdf/IdlerWheelYyg")
    public String getMap2() {
        return "pdf/IdlerWheelYyg";
    }

    @GetMapping("/IdlerWheelYyg")
    public String getMap() {
        return "IdlerWheelYyg";
    }

    @GetMapping("/IdlerWheelYyg/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        IdlerWheelYygEntity entity = new IdlerWheelYygEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("IdlerWheelYyg/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute IdlerWheelYygEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("IdlerWheelYyg/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute IdlerWheelYygEntity entity,
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
//        String name="";
//        if(pdfType.equals("LzglYygQ")) {
//            name="1+1顶升立柱滚轮及液压缸校核计算书(Q)";
//        } else if(pdfType.equals("LzglYygH")){
//            name="1+1顶升立柱滚轮及液压缸校核计算书(H)";
//        }

        String name = "";
        if ( entity.getXljzsyModel().equals("常规工况") ) {
            if ( entity.getDsyygwzModel().equals("顶升液压缸在立柱前") ) {
                name = "1+1顶升立柱滚轮及液压缸校核计算书(Q)";
            } else if ( entity.getDsyygwzModel().equals("顶升液压缸在立柱后") ) {
                name = "1+1顶升立柱滚轮及液压缸校核计算书(H)";
            }
        } else if ( entity.getXljzsyModel().equals("静载试验") ) {
            if ( entity.getDsyygwzModel().equals("顶升液压缸在立柱前") ) {
                name = "1+1顶升立柱滚轮及液压缸校核计算书(Q)-静载试验";
            } else if ( entity.getDsyygwzModel().equals("顶升液压缸在立柱后") ) {
                name = "1+1顶升立柱滚轮及液压缸校核计算书(H)-静载试验";
            }
        }
        if(!name.equals(""))
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/"+name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1顶升立柱滚轮及液压缸校核计算书(Q)"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1顶升立柱滚轮及液压缸校核计算书(H)"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1顶升立柱滚轮及液压缸校核计算书(Q)-静载试验"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/1+1顶升立柱滚轮及液压缸校核计算书(H)-静载试验"));
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/配重计算书验证部分"));
//            return tool.getResponseEntity("配重计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity(name, list.get(0));
    }
}

