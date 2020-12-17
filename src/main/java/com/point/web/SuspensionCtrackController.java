package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.SuspensionCtrackEntity;
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
public class SuspensionCtrackController {

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

    @GetMapping("/pdf/SuspensionCtrack")
    public String getMap2() {
        return "pdf/SuspensionCtrack";
    }

    @GetMapping("/SuspensionCtrack")
    public String getMap() {
        return "SuspensionCtrack";
    }

    @GetMapping("/SuspensionCtrack/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        SuspensionCtrackEntity entity = new SuspensionCtrackEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("SuspensionCtrack/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute SuspensionCtrackEntity entity){
        return entity.takeMapForPDF("");
    }
    @PostMapping("SuspensionCtrack/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute SuspensionCtrackEntity entity,
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
            name="简支梁悬挂C型轨强度及挠度校核计算书";
        } else if(pdfType.equals("DoubleSpanbeam")){
            name="双跨梁悬挂C型轨强度及挠度校核计算书";
        }
        if(!name.equals(""))
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/"+name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/简支梁悬挂C型轨强度及挠度校核计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/双跨梁悬挂C型轨强度及挠度校核计算书"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/悬挂C型轨校核计算书验证部分"));
            return tool.getResponseEntity("new/悬挂C型轨校核计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity(name, list.get(0));
    }
}
