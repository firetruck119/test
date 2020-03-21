package com.point.web;

import com.point.common.CacheData;
import com.point.entity.pdf.WheelLoadEntity;
import com.point.entity.pdf.YanshiEntity;
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
public class YanshiController {
    @Autowired
    private PdfUtil pdfUtil;

    @Autowired
    private CacheData<YanshiEntity> cacheData;



    @GetMapping("/yanshi")
    public String greetingForm(String batchId, Model model) {
        YanshiEntity yanshiEntity = new YanshiEntity();
        cacheData.readCacheValue(batchId, yanshiEntity);
        model.addAttribute("YanshiEntity", yanshiEntity);
        return "yanshi";
    }


    @PostMapping("/yanshipdf")
    public Object pdfTest(@ModelAttribute YanshiEntity yanshiEntity, String batchId) {
        cacheData.saveCacheValue(batchId,yanshiEntity);
        Map<String, String> map = yanshiEntity.getMapForPdf();
        HttpHeaders headers = new HttpHeaders();
        String fileName = null;
        try {
            fileName = new String(("演示计算书.pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }//为了解决中文名称乱码问题
        headers.setContentDispositionFormData("attachment", fileName);
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        byte[] pdfBtyes = pdfUtil.fromPDFTempletToPdfWithValue(map, null, "演示计算书");
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfBtyes, headers, HttpStatus.OK);
        return responseEntity;
    }

}
