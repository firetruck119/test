package com.point.web.drawing;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.CommonFunc;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.drawing.CDDDrawingEntity;
import com.point.entity.drawing.DijiaDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;

@Controller
public class CDDDrawingController {

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

    @GetMapping("/CDDDrawing")
    public String getMap() {
        return "drawing/CDDDrawing";
    }

    @GetMapping("/CDDDrawing/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String, Object> result = new HashMap<>();
        CDDDrawingEntity entity = new CDDDrawingEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        Map<String, InputURLCache> imagemap = urlCacheData.readCacheValue(batchId);
        result.put("imagelist", imagemap);
        return result;
    }

    @PostMapping("CDDDrawing/showDrawing")
    @ResponseBody
    public String showDrawing(HttpServletResponse response, @ModelAttribute CDDDrawingEntity entity) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        String name=null;
        List<byte[]> list = new ArrayList<>();
        String temp=entity._getImageName();
        if(temp!=null){
            //如果对象直接通过逻辑获取图片名，直接赋值
            name=temp;
        }else {
            //否则查询数据库
            List<String> names = drawing.getPDFName("CDD",pdf.entity2Map(entity));
            name=names.get(0)+".png";
        }
        return name;
    }

    @PostMapping("CDDDrawing/getPDF")
    public Object getPDF(@ModelAttribute CDDDrawingEntity entity,
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
            List<String> names = drawing.getPDFName("CDDDrawing", map);
            name=names.get(0);
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing( entity.takeMapForPDF( ), null, "CDD/" + name));
        return tool.getResponseEntity(name, list.get(0));
    }
}