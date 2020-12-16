package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class CDDDrawingEntity {


    private Double cdddy;
    private Double cddpl;
    private Double psgd;
    private Double gsscd;

    private String cddxhModel;
    private String gjdqModel;
    private String gjdq;
    private String xmmc;


    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        map.put("cdddy", CommonFunc.convertDoubleToString(cdddy));
        map.put("cddpl", CommonFunc.convertDoubleToString(cddpl));
        map.put("psgd", CommonFunc.convertDoubleToString(psgd));
        map.put("gsscd", CommonFunc.convertDoubleToString(gsscd));
        map.put("gjdq", CommonFunc.convertDoubleToString(gjdq));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }
//
//    public Map<String, String> check() {
//        Map<String, String> map = new HashMap<>();
//        takeMapForCheckPDF();
//        takeMapForPDF("");
//
//        return map;
//
//    }



    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        return map;
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);
        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
