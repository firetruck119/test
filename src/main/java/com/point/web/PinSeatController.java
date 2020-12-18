package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.PinSeatEntity;
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
public class PinSeatController {
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

    @GetMapping("/pdf/PinSeat")
    public String greetingForm2(Model model) {
        return "pdf/PinSeat";
    }

    @GetMapping("/PinSeat")
    public String greetingForm(Model model) {
        return "PinSeat";
    }
    @GetMapping("/PinSeat/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        PinSeatEntity entity = new PinSeatEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }
    @PostMapping("/pinseatpdf1")
    public Object getPDF( PinSeatEntity entity,
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
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(), imageMap, "new/T型防风销座 销钉及连接螺栓计算书"));
        if (null!=check&&check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheck(), imageMap, "new/T型防风销座 销钉及连接螺栓计算书验证部分"));
            return tool.getResponseEntity("T型防风销座 销钉及连接螺栓计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("T型防风销座 销钉及连接螺栓计算书", list.get(0));
    }

    @PostMapping("PinSeat/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute PinSeatEntity entity){
        return entity.check();
    }
}
