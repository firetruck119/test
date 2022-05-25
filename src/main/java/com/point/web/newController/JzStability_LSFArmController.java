package com.point.web.newController;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.MyEnv;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
//import com.point.entity.pdf.StabilityEnity_LSFArmEntity;
import com.point.entity.pdf.JzStabilityEnity_LSFArmEntity;
import com.point.itext.PdfCreater;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller

public class JzStability_LSFArmController {

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

    @GetMapping("/pdf/JzStability_LSFArm")
    public String getMap2(Model model) {
        model.addAttribute("entity", new JzStabilityEnity_LSFArmEntity());
        return "pdf/JzStability_LSFArm";
    }

    @GetMapping("/JzStability_LSFArm")
    public String getMap(Model model) {
        model.addAttribute("entity", new JzStabilityEnity_LSFArmEntity());
        return "JzStability_LSFArm";
    }

    @GetMapping("/JzStability_LSFArm/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String, Object> result = new HashMap<>();
        JzStabilityEnity_LSFArmEntity entity = new JzStabilityEnity_LSFArmEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        Map<String, InputURLCache> imagemap = urlCacheData.readCacheValue(batchId);
        result.put("imagelist", imagemap);
        return result;
    }

    @PostMapping("/JzStability_LSFArm/getCheck")
    @ResponseBody
    public Object getCheck(@ModelAttribute JzStabilityEnity_LSFArmEntity entity) {
        return entity.checkCN("");
    }

    @PostMapping("/JzStability_LSFArm/getPDF")
    public Object getPDF(@ModelAttribute JzStabilityEnity_LSFArmEntity entity,
                         HttpServletRequest request,
                         @RequestParam(required = false) String language,
                         @RequestParam(required = false) String sjht,
                         @RequestParam(required = false) Boolean check) throws IOException, DocumentException {

        Map<String, File> imageMap = new HashMap<>();
        try {
            imageMap = tool.getImageMap(sjht, request);
        } catch (Exception e) {
        }
        urlCacheData.saveCacheValue(sjht, imageMap);
        cacheData.saveCacheValue(sjht, entity);
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForPDF(language), imageMap, "new/下回转固定臂-稳定性校核及轮压计算书" + language));
        if (null != check && check) {
            list.add(pdf.fromPDFTempletToPdfWithValue_New(entity.createMapForCheckPDF(language), imageMap, "new/稳定性校核及轮压计算书验证部分"));
            return tool.getResponseEntity("稳定性校核及轮压计算书", pdf.MergePDF(list));
        }
        return tool.getResponseEntity("稳定性校核及轮压计算书", list.get(0));
    }
}
//    @RequestMapping("getImg")
//    public void getImg2(HttpServletRequest request, HttpServletResponse response,String filename)
//            throws IOException {
//        FileInputStream fis = null;
//        OutputStream os = null;
//        try {
//            if (MyEnv.isLocal()) {
//                fis = new FileInputStream("D:/image/"+filename);
//            } else {
//                fis = new FileInputStream("/root/image/" + filename );
//            }
//            os = response.getOutputStream();
//            int count = 0;
//            byte[] buffer = new byte[1024 * 8];
//            while ((count = fis.read(buffer)) != -1) {
//                os.write(buffer, 0, count);
//                os.flush();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                fis.close();
//                os.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//}
