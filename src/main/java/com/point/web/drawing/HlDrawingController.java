package com.point.web.drawing;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.drawing.HlDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class HlDrawingController {

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

    @Autowired
    DrawingTableController drawing;

    @GetMapping("/pdf/HlDrawing")
    public String getMap2() { return "pdf/HlDrawing"; }

    @GetMapping("/HlDrawing")
    public String getMap() {
        return "drawing/HlDrawing";
    }

    @GetMapping("/HlDrawing/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String, Object> result = new HashMap<>();
        HlDrawingEntity entity = new HlDrawingEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        Map<String, InputURLCache> imagemap = urlCacheData.readCacheValue(batchId);
        result.put("imagelist", imagemap);
        return result;
    }

    @PostMapping("HlDrawing/showDrawing")
    @ResponseBody
    public String showDrawing(HttpServletResponse response, @ModelAttribute HlDrawingEntity entity) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        String name=null;
        List<byte[]> list = new ArrayList<>();
        String temp=entity._getImageName();
        if(temp!=null){
            //如果对象直接通过逻辑获取图片名，直接赋值
            name=temp;
        }else {
            //否则查询数据库
            List<String> names = drawing.getPDFName("hltz",pdf.entity2Map(entity));
            name=names.get(0)+".png";
        }
        return name;
    }

    @PostMapping("HlDrawing/getPDF")
    public Object getPDF(@ModelAttribute HlDrawingEntity entity,
                         @RequestParam(required = false) String sjht) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {

        cacheData.saveCacheValue(sjht, entity);
        String name=null;
        List<byte[]> list = new ArrayList<>();
        String temp=entity._getPDFName();
        if(temp!=null){
            name=temp;
        }else {
            Map map= pdf.entity2Map(entity);
            cacheData.saveCacheValue(sjht, entity);
            List<String> names = drawing.getPDFName("hltz", map);
            name=names.get(0);
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing( entity.takeMapForPDF( ), null, "/hltz/" + name));
        return tool.getResponseEntity(name, list.get(0));
    }
}