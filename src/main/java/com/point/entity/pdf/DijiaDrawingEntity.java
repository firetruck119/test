package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DijiaDrawingEntity {

    private String lg;
    private String ll;
    private String lzpxj;

    private String djhzxs;
    private String hzzc;
    private String yxjgxz;
    private String djbdb;
    private String djlx;
    private String djqsjg;

    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
//        map.put("lg", CommonFunc.convertDoubleToString(lg));
//        map.put("ll", CommonFunc.convertDoubleToString(ll));
//        map.put("lzpxj", CommonFunc.convertDoubleToString(lzpxj));
//        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> check() {
        Map<String, String> map = new HashMap<>();
        takeMapForCheckPDF();
        takeMapForPDF("");

        return map;

    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();
        return result;
    }

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
