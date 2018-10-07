package com.point.web;

import com.point.entity.CleaningCycleCalculation;
import com.point.itext.PdfUtil;
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
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.util.*;

@Controller
public class CleaningCycleCalculationController {

    @Autowired
    PdfUtil pdfUtil;

    @GetMapping("/aaa")
    public String test(Model model) {
        return "result";
    }

    @GetMapping("/CleaningCycleCalculation")
    public String greetingForm(Model model,@ModelAttribute CleaningCycleCalculation cleaningCycleCalculation) {
        model.addAttribute("CleaningCycleCalculation", new CleaningCycleCalculation());
        return "greeting";
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

    @PostMapping("/CleaningCycleCalculation")
    public Object greetingSubmit(@ModelAttribute CleaningCycleCalculation cleaningCycleCalculation) {
        Map<String,String> map=new HashMap<String, String>();
        map.put("projectName",cleaningCycleCalculation.getProjectName() + "项目");
        map.put("calculator",cleaningCycleCalculation.getCalculator());
        map.put("check",cleaningCycleCalculation.getCheck());
        map.put("date",cleaningCycleCalculation.getDate());
        map.put("no",cleaningCycleCalculation.getNo());
        map.put("a",cleaningCycleCalculation.getA());
        map.put("b",cleaningCycleCalculation.getB());
        map.put("h",cleaningCycleCalculation.getH());
        map.put("l",cleaningCycleCalculation.getL());
        map.put("l1",cleaningCycleCalculation.getL1());
        map.put("n",cleaningCycleCalculation.getN());
        map.put("t1",cleaningCycleCalculation.getT1());
        map.put("ti",cleaningCycleCalculation.getTi());
        map.put("v1",cleaningCycleCalculation.getV1());
        map.put("v2",cleaningCycleCalculation.getV2());
        map.put("w",cleaningCycleCalculation.getW());

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

        BigDecimal n1 = l.divide(w,2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal s_ = h.multiply(l1);
        BigDecimal t2 = s_.divide(v2,2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t3 = h.divide(v1,2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t4 = a.multiply(new BigDecimal(2));
        BigDecimal t = t1.add(t2).add(t3).add(t4);
        BigDecimal t_1 = n1.multiply(t).divide(n,2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t_2 = t_1.divide(ti.multiply(new BigDecimal(60)),2,BigDecimal.ROUND_HALF_EVEN);
        BigDecimal t_3 = t_2.divide(b,2,BigDecimal.ROUND_HALF_EVEN);

        map.put("n1",myformatString(n1));
        map.put("s_",myformatString(s_));
        map.put("t2",myformatString(t2));
        map.put("t3",myformatString(t3));
        map.put("t4",myformatString(t4));
        map.put("t",myformatString(t));
        map.put("t_1",myformatString(t_1));
        map.put("t_2",myformatString(t_2));
        map.put("t_3",myformatString(t_3));
//        map.put("n1",entity.getN1());
//        map.put("s_",entity.getS_());
//        map.put("t2",entity.getT2());
//        map.put("t3",entity.getT3());
//        map.put("t4",entity.getT4());
//        map.put("t",entity.getT());
//        map.put("t_1",entity.getT_1());
//        map.put("t_2",entity.getT_2());
//        map.put("t_3",entity.getT_3());
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
            ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(pdfUtil.fromPDFTempletToPdfWithValue(map), headers, HttpStatus.OK);
            return responseEntity;
        }else{
            return "result";
        }
    }

}
