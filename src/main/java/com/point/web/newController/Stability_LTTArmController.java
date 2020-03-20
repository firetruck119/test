package com.point.web.newController;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.StabilityEnity_LSFArmEntity;
import com.point.entity.pdf.StabilityEnity_LTTArmEntity;
import com.point.itext.PdfCreater;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class Stability_LTTArmController {

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

    @GetMapping("/Stability_LTTArm")
    public String getMap(Model model) {
        model.addAttribute("entity", new StabilityEnity_LTTArmEntity());
        return "Stability_LTTArm";
    }
    @PostMapping("/Stability_LTTArm/getCheck")
    @ResponseBody
    public Object getCheck(@ModelAttribute StabilityEnity_LTTArmEntity entity) {
        return entity.checkCN("");
    }
    @GetMapping("/Stability_LTTArm/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        StabilityEnity_LTTArmEntity entity = new StabilityEnity_LTTArmEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }
    @PostMapping("/Stability_LTTArm/getPDF")
    public Object getPDF(@ModelAttribute StabilityEnity_LTTArmEntity entity,
                         HttpServletRequest request,
                         @RequestParam(required = false) String language,
                         @RequestParam(required = false) String sjht,
                         @RequestParam(required = false) Boolean check) throws IOException, DocumentException {

        Map<String, File> imageMap = new HashMap<>();
        try {
            imageMap = tool.getImageMap(sjht,request);
        } catch (Exception e) {
        }
        urlCacheData.saveCacheValue(sjht,imageMap);
        cacheData.saveCacheValue(sjht,entity);
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForPDF(language), imageMap, "new/下回转伸缩臂-稳定性校核及轮压计算书"+language));
        if (null!=check&&check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForCheckPDF(language), imageMap, "new/下回转伸缩臂稳定性校核及轮压计算书验证部分"));
            return tool.getResponseEntity("下回转伸缩臂稳定性校核及轮压计算书+验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("下回转伸缩臂稳定性校核及轮压计算书", list.get(0));
    }
}
