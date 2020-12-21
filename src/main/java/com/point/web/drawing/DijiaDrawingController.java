package com.point.web.drawing;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.CommonFunc;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.drawing.DijiaDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.security.error.UserException;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.lang.reflect.Field;
import java.util.*;

@Controller
public class DijiaDrawingController {

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

//    @GetMapping("/pdf/DijiaDrawing")
//    public String getMap2() {
//        return "pdf/dijia";
//    }

    @GetMapping("/DijiaDrawing")
    public String getMap() {
        return "drawing/dijia";
    }

    @GetMapping("/DijiaDrawing/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String, Object> result = new HashMap<>();
        DijiaDrawingEntity entity = new DijiaDrawingEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        return result;
    }

    @PostMapping("DijiaDrawing/getDrawingName")
    @ResponseBody
    public Object getDrawingName(@ModelAttribute DijiaDrawingEntity entity) throws NoSuchFieldException, IllegalAccessException, UserException {
        Map map = drawing.getPDF("dijia", pdf.entity2Map(entity));
        return map;
    }

    @PostMapping("DijiaDrawing/showDrawing")
    @ResponseBody
    public String showDrawing(HttpServletResponse response, @ModelAttribute DijiaDrawingEntity entity) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        String name=null;
        List<byte[]> list = new ArrayList<>();
        String temp=entity._getImageName();
        if(temp!=null){
            name=temp;
        }else {
            List<String> names = drawing.getPDFName("dijia",pdf.entity2Map(entity));
            name=names.get(0)+".png";
        }
        return name;
    }

    @PostMapping("DijiaDrawing/getPDF")
    public Object getPDF(@ModelAttribute DijiaDrawingEntity entity,
                         @RequestParam(required = false) String sjht) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        Map map= pdf.entity2Map(entity);
        cacheData.saveCacheValue(sjht, entity);
        String name=null;
        String temp=entity._getPDFName();
        List<byte[]> list = new ArrayList<>();
        if(temp!=null){
            name=temp;
        }else {
            cacheData.saveCacheValue(sjht, entity);
            List<String> names = drawing.getPDFName("dijia", map);
            name=names.get(0);
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing(null, null, "/dijia/" + name));
        return tool.getResponseEntity(name, list.get(0));
    }
}
