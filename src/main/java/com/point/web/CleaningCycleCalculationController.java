package com.point.web;

import com.point.common.CacheData;
import com.point.entity.CleaningCycleCalculation;
import com.point.entity.Gangsi;
import com.point.entity.pdf.WheelLoadEntity;
import com.point.itext.PdfUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.*;

@Controller
public class CleaningCycleCalculationController {

    @Autowired
    private PdfUtil pdfUtil;

    @Autowired
    private CacheData<CleaningCycleCalculation> cacheData;

    @GetMapping("/aaa")
    public String test(Model model) {
        return "result";
    }

    @GetMapping("/CleaningCycleCalculation")
    public String greetingForm(String batchId, Model model) {
        CleaningCycleCalculation cleaningCycleCalculation = new CleaningCycleCalculation();
        cacheData.readCacheValue(batchId, cleaningCycleCalculation);
        model.addAttribute("CleaningCycleCalculation", cleaningCycleCalculation);
        return "greeting";
    }

    @GetMapping("/pdfTest")
    public String pdfTest(Model model,@ModelAttribute Gangsi gangsi) {
        model.addAttribute("Gangsi", new Gangsi());
        return "pdfTest";
    }


    private String myformatString(BigDecimal decimal){
        String number = decimal.stripTrailingZeros().toPlainString();
        if(decimal.compareTo(new BigDecimal(1000))>0 && number.contains(".")){
            String result = "";
            for(char c : number.toCharArray()){
                if(c=='.'){
                    break;
                }
                result+=c;
            }
            return result;
        }else if(decimal.compareTo(new BigDecimal(100))>0 && number.contains(".")){
            if(number.length()>5){
                return number.substring(0,5);
            }
        }
        return number;
    }


    @PostMapping("/pdfTest")
    public Object pdfTest(@ModelAttribute Gangsi gangsi) {
        Map<String,String> map=new HashMap<String, String>();

        //输入
        map.put("project_name",gangsi.getProject_name() + "项目");
        map.put("jisuanren",gangsi.getJisuanren());
        map.put("calculated_contents",gangsi.getCalculated_contents());
        map.put("jisuanshijian",gangsi.getJisuanshijian());
        map.put("cn",gangsi.getCn());
        map.put("f0",gangsi.getF0().toString());
        map.put("s",gangsi.getS().toString());
        //输出
        map.put("fuhao",gangsi.getFuhao());
        map.put("zp",gangsi.getZp().toString());
        map.put("manzu",gangsi.getManzu());

        if (gangsi.getOpType().equals("1")) {
            HttpHeaders headers = new HttpHeaders();
            String fileName = null;
            try {
                fileName = new String(("钢丝绳计算书").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }//为了解决中文名称乱码问题
            headers.setContentDispositionFormData("attachment", fileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
                ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfUtil.fromPDFTempletToPdfWithValue(map,null,"钢丝绳计算书"), headers, HttpStatus.OK);
            return responseEntity;
        }else{
            return "result";
        }
    }

    @PostMapping("/CleaningCycleCalculation")
    public Object greetingSubmit(@ModelAttribute CleaningCycleCalculation cleaningCycleCalculation, String batchId) {
        cacheData.saveCacheValue(batchId, cleaningCycleCalculation);
        Map<String, String> textMap = new HashMap<String, String>();
        //输入
        //textMap.put("projectName",cleaningCycleCalculation.getProjectName() + "项目");
        textMap.put("calculator", cleaningCycleCalculation.getCalculator());
        textMap.put("check", cleaningCycleCalculation.getCheck());
        textMap.put("date", cleaningCycleCalculation.getDate());
        textMap.put("no", cleaningCycleCalculation.getNo());
        textMap.put("a", cleaningCycleCalculation.getA());
        textMap.put("b", cleaningCycleCalculation.getB());
        textMap.put("h", cleaningCycleCalculation.getH());
        textMap.put("l", cleaningCycleCalculation.getL());
        textMap.put("l1", cleaningCycleCalculation.getL1());
        textMap.put("n", cleaningCycleCalculation.getN());
        textMap.put("t1", cleaningCycleCalculation.getT1());
        textMap.put("ti", cleaningCycleCalculation.getTi());
        textMap.put("v1", cleaningCycleCalculation.getV1());
        textMap.put("v2", cleaningCycleCalculation.getV2());
        textMap.put("w", cleaningCycleCalculation.getW());

        //计算
        BigDecimal a = new BigDecimal(cleaningCycleCalculation.getA());
        BigDecimal b = new BigDecimal(cleaningCycleCalculation.getB());
        BigDecimal h = new BigDecimal(cleaningCycleCalculation.getH());
        BigDecimal l = new BigDecimal(cleaningCycleCalculation.getL());
        BigDecimal l1 = new BigDecimal(cleaningCycleCalculation.getL1());
        BigDecimal n = new BigDecimal(cleaningCycleCalculation.getN());
        BigDecimal t1 = new BigDecimal(cleaningCycleCalculation.getT1());
        BigDecimal ti = new BigDecimal(cleaningCycleCalculation.getTi());
        BigDecimal v1 = new BigDecimal(cleaningCycleCalculation.getV1());
        BigDecimal v2 = new BigDecimal(cleaningCycleCalculation.getV2());
        BigDecimal w = new BigDecimal(cleaningCycleCalculation.getW());

        //输出
        BigDecimal n1 = l.divide(w, 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal s_ = h.multiply(l1);
        BigDecimal t2 = s_.divide(v2, 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t3 = h.divide(v1, 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t4 = a.multiply(new BigDecimal(2));
        BigDecimal t = t1.add(t2).add(t3).add(t4);
        BigDecimal t_1 = n1.multiply(t).divide(n, 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t_2 = t_1.divide(ti.multiply(new BigDecimal(60)), 2, BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t_3 = t_2.divide(b, 2, BigDecimal.ROUND_HALF_EVEN);

        textMap.put("n1", myformatString(n1));
        textMap.put("s_", myformatString(s_));
        textMap.put("t2", myformatString(t2));
        textMap.put("t3", myformatString(t3));
        textMap.put("t4", myformatString(t4));
        textMap.put("t", myformatString(t));
        textMap.put("t_1", myformatString(t_1));
        textMap.put("t_2", myformatString(t_2));
        textMap.put("t_3", myformatString(t_3));
        cleaningCycleCalculation.setT_3(myformatString(t_3));


        if (cleaningCycleCalculation.getOpType().equals("1")) {
            HttpHeaders headers = new HttpHeaders();
            String fileName = null;
            try {
                fileName = new String((cleaningCycleCalculation.getProjectName() + ".pdf").getBytes("gb2312"), "iso-8859-1");//解决中文乱码
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }//为了解决中文名称乱码问题
            headers.setContentDispositionFormData("attachment", fileName);
            headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
            ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfUtil.fromPDFTempletToPdfWithValue(textMap, null, "LX005"), headers, HttpStatus.OK);
            return responseEntity;
        } else {
            return "result";
        }
    }

}
