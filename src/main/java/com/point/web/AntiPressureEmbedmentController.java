package com.point.web;

import com.point.entity.pdf.AntiPressureEmbedmentEntity;
import com.point.itext.PdfUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.io.UnsupportedEncodingException;
import java.util.Map;

@Controller
public class AntiPressureEmbedmentController {
    @Autowired
    PdfUtil pdfUtil;

    @GetMapping("/AntiPressureEmbedment")
    public String greetingForm(Model model, @ModelAttribute AntiPressureEmbedmentEntity antiPressureEmbedmentEntity) {
        model.addAttribute("AntiPressureEmbedmentEntity", new AntiPressureEmbedmentEntity());
        return "AntiPressureEmbedment";
    }

    @PostMapping("/AntiPressureEmbedment")
    public Object pdfTest(@ModelAttribute AntiPressureEmbedmentEntity antiPressureEmbedmentEntity,BindingResult result) {
        Map<String, String> map = antiPressureEmbedmentEntity.getMapForPdf();
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String(("抗压预埋件计算书.pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        byte[] pdfBtyes = pdfUtil.fromPDFTempletToPdfWithValue(map, null, "抗压预埋件计算书");
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfBtyes, headers, HttpStatus.OK);
        return responseEntity;
    }
}
