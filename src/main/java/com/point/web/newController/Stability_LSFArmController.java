package com.point.web.newController;

import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.entity.InputImageCache;
import com.point.entity.pdf.PinSeatEntity;
import com.point.entity.pdf.StabilityEnity;
import com.point.entity.pdf.StabilityEnity_LSFArmEntity;
import com.point.itext.PdfCreater;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class Stability_LSFArmController {

    @Autowired
    PdfCreater pdf;

    @Autowired
    ToolForPDFController tool;

    @Autowired
    CacheData cacheData;

    @Autowired
    ImageCacheData imageCacheData;

    @GetMapping("/Stability_LSFArm")
    public String getMap(Model model) {
        model.addAttribute("entity", new StabilityEnity_LSFArmEntity());
        return "Stability_LSFArm";
    }

    @GetMapping("/Stability_LSFArm/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        StabilityEnity_LSFArmEntity entity = new StabilityEnity_LSFArmEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String,byte[]> imagemap=imageCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("/Stability_LSFArm/getCheck")
    @ResponseBody
    public Object getCheck(@ModelAttribute StabilityEnity_LSFArmEntity entity) {
        return entity.checkCN("");
    }

    @PostMapping("/Stability_LSFArm/getPDF")
    public Object getPDF(@ModelAttribute StabilityEnity_LSFArmEntity entity,
                         HttpServletRequest request,
                         @RequestParam(required = false) String language,
                         @RequestParam(required = false) String sjht,
                         @RequestParam(required = false) Boolean check) throws IOException, DocumentException {

        Map<String, InputImageCache> imageMap = new HashMap<>();
        try {
            imageMap = tool.getImageMap_New(request);
        } catch (Exception e) {
        }
        imageCacheData.saveCacheValue(sjht,imageMap);
        cacheData.saveCacheValue(sjht,entity);
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForPDF(language), imageMap, "new/下回转固定臂-稳定性校核及轮压计算书"));
        if (null!=check&&check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForCheckPDF(), imageMap, "new/稳定性校核及轮压计算书验证部分"));
            return tool.getResponseEntity("稳定性校核及轮压计算书", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("稳定性校核及轮压计算书", list.get(0));
    }
}
