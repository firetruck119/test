package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.SszdcWireRopeEntity;
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
public class SszdcWireRopeController {

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

    @GetMapping("/pdf/SszdcWireRope")
    public String getMap2() {
        return "pdf/SszdcWireRope";
    }

    @GetMapping("/SszdcWireRope")
    public String getMap() {
        return "SszdcWireRope";
    }

    @GetMapping("/SszdcWireRope/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        SszdcWireRopeEntity entity = new SszdcWireRopeEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("SszdcWireRope/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute SszdcWireRopeEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("SszdcWireRope/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute SszdcWireRopeEntity entity,
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
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/伸缩子吊船钢丝绳校核计算书"));
        if (null!=check&&check) {
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/1+1伸缩臂机吊臂校核计算书验证部分"));
//            return tool.getResponseEntity("1+1伸缩臂机吊臂校核计算书验证部分", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("伸缩子吊船钢丝绳校核计算书", list.get(0));
    }
}

