package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.HorizontalTracksFxEntity;
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
public class HorizontalTracksFxController {

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

    @GetMapping("/HorizontalTracksFx")
    public String getMap() {
        return "HorizontalTracksFx";
    }

    @GetMapping("/HorizontalTracksFx/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        HorizontalTracksFxEntity entity = new HorizontalTracksFxEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("HorizontalTracksFx/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute HorizontalTracksFxEntity entity){
        return entity.takeMapForPDF("");
    }
    @PostMapping("HorizontalTracksFx/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute HorizontalTracksFxEntity entity,
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
        if(pdfType.equals("SimplySupported")) {
            name="无筋板版水平轨道校核计算书(简支梁)(1.5倍)";
        } else if(pdfType.equals("DoubleSpanbeam")){
            name="无筋板版水平轨道校核计算书(双跨梁)(1.5倍)";
        }else if(pdfType.equals("SimplySupportedEn")){
            name="无筋板版水平轨道校核计算书(简支梁)英文版(1.5倍)";
        }else if(pdfType.equals("DoubleSpanbeamEn")){
            name="无筋板版水平轨道校核计算书(双跨梁)英文版(1.5倍)";
        }
        if(!name.equals(""))
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/"+name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/无筋板版水平轨道校核计算书(简支梁)(1.5倍)"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/无筋板版水平轨道校核计算书(双跨梁)(1.5倍)"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/无筋板版水平轨道计算书校核验证(1.5倍)"));
            return tool.getResponseEntity("无筋板版水平轨道计算书校核验证(1.5倍)", pdf.MergePDF(list));
        }
        return tool.getResponseEntity(name, list.get(0));
    }
}
