package com.point.web.drawing;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.pdf.DijiaDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
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

    @PostMapping("DijiaDrawing/showDrawing")
    @ResponseBody
    public String showDrawing(HttpServletResponse response, @ModelAttribute DijiaDrawingEntity entity) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        Class clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String, String> map = new HashMap<>();
        Iterator<Field> it = CollectionUtils.arrayToList(fields).iterator();
        try {
            while (it.hasNext()) {
                Field f = it.next();
                f.setAccessible(true);
                String v = f.get(entity).toString();
                String name = f.getName();
                map.put(name, v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        List<String> name = drawing.getPDFName("dijia", map);
        return name.get(0)+".png";
    }

    @PostMapping("DijiaDrawing/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute DijiaDrawingEntity entity,
                         @RequestParam(required = false) String pdfType,
                         @RequestParam(required = false) Boolean check,
                         @RequestParam(required = false) String sjht) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {

        Class clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String, String> map = new HashMap<>();
        Iterator<Field> it = CollectionUtils.arrayToList(fields).iterator();
        try {
            while (it.hasNext()) {
                Field f = it.next();
                f.setAccessible(true);
                String v = f.get(entity).toString();
                String name = f.getName();
                map.put(name, v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        cacheData.saveCacheValue(sjht, entity);
        List<byte[]> list = new ArrayList<>();
        List<String> name = drawing.getPDFName("dijia", map);
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing(null, null, "/dijia/" + name.get(0)));
        return tool.getResponseEntity(name.get(0), list.get(0));
    }
}
