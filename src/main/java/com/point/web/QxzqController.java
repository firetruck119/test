package com.point.web;

import com.point.common.CacheData;
import com.point.entity.pdf.QxzqEntity;
import com.point.itext.PdfUtil;
import com.point.web.newController.Tool.ComparatorHanYuPinYin;
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

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;
@Controller
public class QxzqController {
    @Autowired
    private PdfUtil pdfUtil;

    @Autowired
    private CacheData<QxzqEntity> cacheData;



    @GetMapping("/qxzq")
    public String greetingForm(String batchId, Model model) {
        QxzqEntity qxzqEntity = new QxzqEntity();
        cacheData.readCacheValue(batchId, qxzqEntity);
        model.addAttribute("QxzqEntity", qxzqEntity);
        return "qxzq";
    }


    @PostMapping("/qxzqpdf")
    public Object pdfTest(@ModelAttribute QxzqEntity qxzqEntity, String batchId) {
        cacheData.saveCacheValue(batchId,qxzqEntity);
        Map<String , String> map = qxzqEntity.getMapForPdf();
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String(("清洗周期计算书.pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        byte[] pdfBtyes = pdfUtil.fromPDFTempletToPdfWithValue(map, null, "清洗周期计算书");
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfBtyes, headers, HttpStatus.OK);
        return responseEntity;
    }

    //设置Url，和前端ajax对应
    @PostMapping("/qxzqcheck")
    //将返回的对象转换为Json格式的数据
    @ResponseBody
    public Object check(@ModelAttribute QxzqEntity qxzqEntity){
        //通过对象方法获取需要的数据Map，，交由MVC，转换为Json返回给前端
        return qxzqEntity.check();
    }
}
