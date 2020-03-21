package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class YanshiEntity {
    private String a;
    private Double b;
    private Double c;

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;

    }
    public Map<String,String> getMapForPdf(){
        Map<String,String> result = new HashMap<>();
        Double d=b+c;

        result.put("a",a);
        Map<String, Double> paramMap = new HashMap<>();
        paramMap.put("b",b);
        paramMap.put("c",c);
        paramMap.put("d",d);

        for(Map.Entry<String, Double> entry : paramMap.entrySet()){
            result.put(entry.getKey(),CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return result;
    }
}
