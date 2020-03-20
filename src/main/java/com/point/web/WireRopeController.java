package com.point.web;

import com.itextpdf.text.DocumentException;
import com.point.common.CacheData;
import com.point.common.ImageCacheData;
import com.point.common.URLCacheData;
import com.point.entity.InputURLCache;
import com.point.entity.pdf.GiantSlewingMotorEntity;
import com.point.entity.pdf.StabilityEnity_LTTArmEntity;
import com.point.entity.pdf.WireRopeEntity;
import com.point.itext.PdfCreater;
import com.point.itext.PdfUtil;
import com.point.web.newController.Tool.ToolForPDFController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class WireRopeController {
    @Autowired
    PdfCreater pdf;

    @Autowired
    PdfUtil pdfUtil;
    @Autowired
    ToolForPDFController tool;

    @Autowired
    CacheData cacheData;

    @Autowired
    ImageCacheData imageCacheData;

    @Autowired
    URLCacheData urlCacheData;
    private ResponseEntity<byte[]> getResponseEntity(String localName, byte[] bytes) {
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String((localName + ".pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        return new ResponseEntity<byte[]>(bytes, headers, HttpStatus.OK);
    }
    @GetMapping("/WireRope/getData")
    @ResponseBody
    public Object getData(String batchId) {
        Map<String,Object> result=new HashMap<>();
        WireRopeEntity entity = new WireRopeEntity();
        cacheData.readCacheValue(batchId, entity);
        result.put("datalist",entity);
        Map<String, InputURLCache> imagemap=urlCacheData.readCacheValue(batchId);
        result.put("imagelist",imagemap);
        return result;
    }
    @GetMapping("/WireRope")
    public String wireropeForm(Model model, @ModelAttribute WireRopeEntity wireRopeEntity) {
        model.addAttribute("WireRopeEntity", new WireRopeEntity());
        return "WireRope";
    }
    @PostMapping("/WireRopePDF1")
    public Object pdfTest(@ModelAttribute WireRopeEntity wireRopeEntity,String sjht) {
        Map<String, String> map = wireRopeEntity.createMapForPdf();
        cacheData.saveCacheValue(sjht,wireRopeEntity);
        String name="钢丝绳/";
        if(wireRopeEntity.getDcgssxh().equals("无")&&wireRopeEntity.getGrugssxh().equals("无")){
            return null;
        }else if(wireRopeEntity.getDcgssxh().equals("无")){
            name+="无吊船版钢丝绳校核计算书";
        }else if(wireRopeEntity.getGrugssxh().equals("无")){

            name+="无GRU版钢丝绳校核计算书";
        }else {
            name+="钢丝绳校核计算书";
        }
        byte[] pdfBtyes = pdfUtil.fromPDFTempletToPdfWithValue(map, null, name);
        return getResponseEntity(name, pdfBtyes);
    }
    @PostMapping("/WireRopePDF2")
    public Object pdf2(@ModelAttribute WireRopeEntity wireRopeEntity,String sjht) throws IOException, DocumentException {
        String name="钢丝绳/";
        cacheData.saveCacheValue(sjht,wireRopeEntity);
        if(wireRopeEntity.getDcgssxh().equals("无")&&wireRopeEntity.getGrugssxh().equals("无")){
            return null;
        }else if(wireRopeEntity.getDcgssxh().equals("无")){
            name+="无吊船版钢丝绳校核计算书";
        }else if(wireRopeEntity.getGrugssxh().equals("无")){

            name+="无GRU版钢丝绳校核计算书";
        }else {
            name+="钢丝绳校核计算书";
        }
        List<byte[]> list = new ArrayList<>();
        list.add(pdf.fromPDFTempletToPdfWithValue(wireRopeEntity.createMapForPdf(), null, name));
        list.add(pdf.fromPDFTempletToPdfWithValue(wireRopeEntity.createMapForPdf2(), null, name+"验证部分"));
        return getResponseEntity(name+"验证部分", pdf.MergePDF(list));
    }
    @PostMapping("WireRope/jy")
    @ResponseBody
    public Object sendjiaoyan(@ModelAttribute WireRopeEntity wireRopeEntity){
        return wireRopeEntity.check();
    }
}
