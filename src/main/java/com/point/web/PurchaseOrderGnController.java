package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.PurchaseOrderGnEntity;
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
public class PurchaseOrderGnController {

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

    @GetMapping("/pdf/PurchaseOrderGn")
    public String getMap2() {
        return "pdf/PurchaseOrderGn";
    }

    @GetMapping("/PurchaseOrderGn")
    public String getMap() {
        return "PurchaseOrderGn";
    }
    @GetMapping("/PurchaseOrderGn/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        PurchaseOrderGnEntity entity = new PurchaseOrderGnEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }

    @PostMapping("PurchaseOrderGn/jy")
    @ResponseBody
    public Object janyan (@ModelAttribute PurchaseOrderGnEntity entity){return entity.takeMapForPDF("");
    }
    @PostMapping("PurchaseOrderGn/getPDF")
    public Object getPDF(HttpServletRequest request,
                         @ModelAttribute PurchaseOrderGnEntity entity,
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
        if(pdfType.equals("CgdGn")) {
            name="采购单(国内)";
        } else if(pdfType.equals("RbhGn")){
            name="热继电器检查册(国内)";
        }
        if(!name.equals(""))
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/"+name));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/采购单(国内)"));
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/热继电器检查册(国内)"));
//            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/加筋板版水平轨道计算书校核验证"));
//            return tool.getResponseEntity("采购单校核验证", pdf.MergePDF(list));
        }
        return tool.getResponseEntity(name, list.get(0));
    }



//        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForPDF(pdfType), imageMap, "new/采购单(国内)"));
////        if (null!=check&&check) {
////              list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.takeMapForCheckPDF(), imageMap, "new/整机成本估算计算书验证部分"));
////              return tool.getResponseEntity("整机成本估算计算书验证部分", pdf.MergePDF(list));
////        }
//        return tool.getResponseEntity("采购单(国内)", list.get(0));
//    }
}

