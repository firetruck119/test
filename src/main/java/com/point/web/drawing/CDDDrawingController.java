package com.point.web.drawing;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.CommonFunc;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.drawing.CDDDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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

//    @Autowired
//    DrawingTableController drawing;

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

    @PostMapping("CDDDrawing/jy")
    @ResponseBody
    public Object janyan(@ModelAttribute CDDDrawingEntity entity) {
        return entity.takeMapForPDF("");
    }
    private Map entity2Map(Object entity){
        Class clazz = entity.getClass();
        Field[] fields = clazz.getDeclaredFields();
        Map<String, String> map = new HashMap<>();
        Iterator<Field> it = CollectionUtils.arrayToList(fields).iterator();
        try {
            while (it.hasNext()) {
                Field f = it.next();
                f.setAccessible(true);
                String v = "";
                if(f.getType().getName().toString().equals("java.lang.Double"))
                    v= CommonFunc.convertDoubleToString(Double.parseDouble(f.get(entity).toString()));
                else
                    v=f.get(entity).toString();
                String name = f.getName();
                map.put(name, v);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return map;
    }
    @PostMapping("CDDDrawing/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute CDDDrawingEntity entity,
                         @RequestParam(required = false) String pdfType,
                         @RequestParam(required = false) Boolean check,
                         @RequestParam(required = false) String sjht) throws IOException, DocumentException {
        cacheData.saveCacheValue(sjht, entity);
        List<byte[]> list = new ArrayList<>();
        String name = "";
        if ( entity.getCddxhModel().equals("CDD240(2A)") ) {
            name = "CDD240（2A）";
        } else if ( entity.getCddxhModel().equals("CDD240(3A)") ) {
            name = "CDD240（3A）";
        } else if ( entity.getCddxhModel().equals("CDD240(4A)") ) {
            name = "CDD240（4A）";
        }
        Map map= entity2Map(entity);
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing(map, null, "/CDD/" + name));
        return tool.getResponseEntity(name, list.get(0));
    }
}