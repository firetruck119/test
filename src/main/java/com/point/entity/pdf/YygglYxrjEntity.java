package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class YygglYxrjEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double yygdd;
    private Double yygxd;
    private Double yyga;
    private Double yyggcyl;
    private Double yygs;
    private Double yygt;
    private Double yygv;
    private Double yygn1;

    private String yygModel;


    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        map.put("no", CommonFunc.convertDoubleToString(no));
        map.put("ver", CommonFunc.convertDoubleToString(ver));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("shr", CommonFunc.convertDoubleToString(shr));
        map.put("pzr", CommonFunc.convertDoubleToString(pzr));
        map.put("date", CommonFunc.convertDoubleToString(date));

        map.put("yygdd", CommonFunc.convertDoubleToString(yygdd));
        map.put("yygxd", CommonFunc.convertDoubleToString(yygxd));
        map.put("yyga", CommonFunc.convertDoubleToString(yyga));
        map.put("yyggcyl", CommonFunc.convertDoubleToString(yyggcyl));
        map.put("yygs", CommonFunc.convertDoubleToString(yygs));
        map.put("yygt", CommonFunc.convertDoubleToString(yygt));
        map.put("yygv", CommonFunc.convertDoubleToString(yygv));
        map.put("yygn1", CommonFunc.convertDoubleToString(yygn1));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        Double yygq = yyga * yygv * yygn1 / 1000 ;
        Double yyggcyl1 = 10.1972 * yyggcyl ;
        Double yyggl = yygq * yyggcyl1 / 612 / 0.9 ;
        Double yygdjgl;
        if (yyggl <= 0.75) {
            yygdjgl = 0.75;
        } else if (0.75 < yyggl && yyggl <= 1.1) {
            yygdjgl = 1.1;
        } else if (1.1 < yyggl && yyggl <= 1.5) {
            yygdjgl = 1.5;
        } else if (1.5 < yyggl && yyggl <= 2.2) {
            yygdjgl = 2.2;
        } else if (2.2 < yyggl && yyggl <= 3) {
            yygdjgl = 3.0;
        } else if (3 < yyggl && yyggl <= 4) {
            yygdjgl = 4.0;
        } else if (4 < yyggl && yyggl <= 5.5) {
            yygdjgl = 5.5;
        } else if (5.5 < yyggl && yyggl <= 7.5) {
            yygdjgl = 7.5;
        } else if (7.5 < yyggl && yyggl <= 11) {
            yygdjgl = 11.0;
        } else {
            yygdjgl = 15.0;
        }
        map.put("yygq", yygq);
        map.put("yyggcyl1",yyggcyl1);
        map.put("yyggl", yyggl);
        map.put("yygdjgl", yygdjgl);

        Double yygyxrj = 1.4 * yyga * yygs * yygn1 / 1000000 ;
//        String yygyxxh;
//        if (yygyxrj <= 45) {
//            yygyxxh ="A";
//        } else if (yygyxrj > 45 && yygyxrj <= 65) {
//            yygyxxh ="B";
//        } else if (yygyxrj > 65 && yygyxrj <= 105) {
//            yygyxxh ="C";
//        } else if (yygyxrj > 105 && yygyxrj <= 155) {
//            yygyxxh ="D";
//        } else if (yygyxrj > 155 && yygyxrj <= 205) {
//            yygyxxh ="E";
//        } else {
//            yygyxxh ="F";
//        }
        map.put("yygyxrj", yygyxrj);
//        map.put("yygyxxh", yygyxxh);

        return map;
    }


    private String takeSignByCompareNumber(Double a, Double b) {
        if (a > b) {
            return ">";
        } else if (a == b) {
            return "=";
        } else {
            return "<";
        }
    }
//    private String takeEnStringByCompareNumber(Double a, Double b) {
//        if (a > b) {
//            return "doesn't meet";
//        } else {
//            return "meets";
//        }
//    }
    private String takeStringByCompareNumber(Double a, Double b) {
        if (a > b) {
            return "不满足";
        } else {
            return "满足";
        }
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);

//        Double yygyxrj = 1.4 * yyga * yygs * yygn1 / 1000000 ;
        Double yygyxrj = doubleMap.get("yygyxrj");
        String yygyxxh;
        if (yygyxrj <= 45) {
            yygyxxh ="A";
        } else if (yygyxrj > 45 && yygyxrj <= 65) {
            yygyxxh ="B";
        } else if (yygyxrj > 65 && yygyxrj <= 105) {
            yygyxxh ="C";
        } else if (yygyxrj > 105 && yygyxrj <= 155) {
            yygyxxh ="D";
        } else if (yygyxrj > 155 && yygyxrj <= 205) {
            yygyxxh ="E";
        } else  if (yygyxrj > 205 && yygyxrj <= 305) {
            yygyxxh ="F";
        }else {
            yygyxxh ="特制";
        }
        map.put("yygyxxh", CommonFunc.convertDoubleToString(yygyxxh));
//        map.put("yygyxrj", yygyxrj);
//        map.put("yygyxxh", yygyxxh);

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
