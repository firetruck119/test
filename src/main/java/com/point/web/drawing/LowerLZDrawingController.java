package com.point.web.drawing;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.*;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.drawing.LowerLZDrawingEntity;
import com.point.itext.PdfCreater;
import com.point.newPDF.controller.DrawingTableController;
import com.point.web.newController.Tool.ToolForPDFController;
import org.apache.tomcat.util.http.fileupload.ByteArrayOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class LowerLZDrawingController {

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

    @GetMapping("/pdf/LowerLZDrawing")
    public String getMap2() { return "pdf/LowerLZDrawing"; }

    @GetMapping("/LowerLZDrawing")
    public String getMap() {
        return "drawing/LowerLZDrawing";
    }

    @GetMapping("/LowerLZDrawing/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String, Object> result = new HashMap<>();
        LowerLZDrawingEntity entity = new LowerLZDrawingEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist", entity);
        Map<String, InputURLCache> imagemap = urlCacheData.readCacheValue(batchId);
        result.put("imagelist", imagemap);
        return result;
    }

    @PostMapping("LowerLZDrawing/showDrawing")
    @ResponseBody
    public String showDrawing(HttpServletResponse response, @ModelAttribute LowerLZDrawingEntity entity) throws IOException, DocumentException, NoSuchFieldException, IllegalAccessException {
        String name=null;
        List<byte[]> list = new ArrayList<>();
        String temp=entity._getImageName();
        if(temp!=null){
            //如果对象直接通过逻辑获取图片名，直接赋值
            name=temp;
        }else {
            //否则查询数据库
            List<String> names = drawing.getPDFName("lzxxz",pdf.entity2Map(entity));
            name=names.get(0)+".png";
        }
        return name;
    }

    @PostMapping("LowerLZDrawing/getPDF")
    public Object getPDF(@ModelAttribute LowerLZDrawingEntity entity,
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
            List<String> names = drawing.getPDFName("lzxxz", map);
            name=names.get(0);
        }
        list.add(pdf.fromPDFTempletToPdfWithValue_Drawing( entity.takeMapForPDF( ), null, "/LowerLZ/" + name));
        return tool.getResponseEntity(name, list.get(0));
    }

    public static  void main(String[] args) {
        //模板路径
        String templatePath = "C:\\Users\\Administrator\\Desktop\\LZX(300×300)(6.3)(4M).pdf";
        //生成的新文件路径
        String newPDFPath = "C:\\Users\\Administrator\\Desktop\\1.pdf";
        PdfReader reader;
        FileOutputStream out;
        ByteArrayOutputStream bos;
        PdfStamper stamper;
        try {
            out = new FileOutputStream(newPDFPath);//输出流
            reader = new PdfReader(templatePath);//读取pdf模板
            bos = new ByteArrayOutputStream();
            stamper = new PdfStamper(reader, bos);
            AcroFields form = stamper.getAcroFields();
            java.util.Iterator<String> it = form.getFields().keySet().iterator();
            while (it.hasNext()) {
                String name = it.next().toString();
                //填写内容部分
                form.setField(name, "10900");
                //
            }
            stamper.setFormFlattening(false);//如果为false那么生成的PDF文件还能编辑，一定要设为true
            stamper.close();

            Document doc = new Document();
            PdfCopy copy = new PdfCopy(doc, out);
            doc.open();
            PdfImportedPage importPage = copy.getImportedPage(
                    new PdfReader(bos.toByteArray()), 1);
            copy.addPage(importPage);
            doc.close();

        } catch (IOException e) {
            System.out.println(1);
        } catch (DocumentException e) {
            System.out.println(2);
        }
    }
}