package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class PtPlatformUnconstrainedEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double ldc;
    private Double bdc;
    private Double hdc;
    private Double adch;
    private Double adcz;
    private Double ab;
    private Double abz;

    private Double chb;
    private Double clh;
    private Double cc;
//    private String ptdcmc;

    //非页面数据
    private Double dcgssp;
//    private Double dcgssn;

    private Double swp;
    private Double r1;
    private Double mwr;
    private Double mffbb;
//    private Double dchwll;
    private Double tsl;

    private String ptdcModel;
    private String dcgssModel;
    private String ffbbModel;

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


        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("ldc", CommonFunc.convertDoubleToString(ldc));
        map.put("bdc", CommonFunc.convertDoubleToString(bdc));
        map.put("hdc", CommonFunc.convertDoubleToString(hdc));
        map.put("adch", CommonFunc.convertDoubleToString(adch));
        map.put("adcz", CommonFunc.convertDoubleToString(adcz));
        map.put("ab", CommonFunc.convertDoubleToString(ab));
        map.put("abz", CommonFunc.convertDoubleToString(abz));

        map.put("chb", CommonFunc.convertDoubleToString(chb));
        map.put("clh", CommonFunc.convertDoubleToString(clh));
        map.put("cc", CommonFunc.convertDoubleToString(cc));
//        map.put("ptdcmc", CommonFunc.convertDoubleToString(ptdcmc));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
//        map.put("dcgssn", CommonFunc.convertDoubleToString(dcgssn));

        map.put("swp", CommonFunc.convertDoubleToString(swp));
        map.put("r1", CommonFunc.convertDoubleToString(r1));
        map.put("mwr", CommonFunc.convertDoubleToString(mwr));
        map.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
//        map.put("dchwll", CommonFunc.convertDoubleToString(dchwll));
        map.put("tsl", CommonFunc.convertDoubleToString(tsl));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
        Double vmin = map.get("vmin");
        Double a1z = map.get("a1z");
        Double a2z = map.get("a2z");

        Double fw1y = 0.613 * cc * a1z * vmin * vmin ;
        String p1;
        if ( fw1y < 400 ) {
            p1 = "<" ;
        } else if ( fw1y == 400 ) {
            p1 = "=";
        } else{
            p1 = ">";
        }
        String g1 = ( fw1y <= 400 ) ? "符合" : "不符合";

        Double fw2y = 0.613 * cc * a2z * vmin * vmin ;
        String p2;
        if ( fw2y < 400 ) {
            p2 = "<" ;
        } else if ( fw2y == 400 ) {
            p2 = "=";
        } else{
            p2 = ">";
        }
        String g2 = ( fw2y <= 400 ) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("vmin", CommonFunc.convertDoubleToString(vmin));
        result.put("a1z", CommonFunc.convertDoubleToString(a1z));
        result.put("a2z", CommonFunc.convertDoubleToString(a2z));
        result.put("cc", CommonFunc.convertDoubleToString(cc));
        result.put("fw1y", CommonFunc.convertDoubleToString(fw1y));
        result.put("p1", CommonFunc.convertDoubleToString(p1));
        result.put("g1", CommonFunc.convertDoubleToString(g1));
        result.put("fw2y", CommonFunc.convertDoubleToString(fw2y));
        result.put("p2", CommonFunc.convertDoubleToString(p2));
        result.put("g2", CommonFunc.convertDoubleToString(g2));
        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

//      最大横向位移风速计算
        Double tana= 4 / h;
        Double aj=Math.toDegrees(Math.atan(tana));
        Double fw1s= tana * 10 * tsl;
        Double fw1= (fw1s <= 400) ? fw1s : 400;
        Double a1z= 0.7 + ab + adch;
        Double v1s=sqrt(fw1 / 0.613 / cc / a1z);
        Double v1= (v1s <= 8.3) ? v1s : 8.3;;
        map.put("tana", tana);
        map.put("aj",  aj);
        map.put("fw1s", fw1s);
        map.put("fw1", fw1);
        map.put("a1z", a1z);
        map.put("v1s", v1s);
        map.put("v1", v1);

//      最大纵向位移风速计算
        Double tanb= 0.4 * ldc / h;
        Double bj=Math.toDegrees(Math.atan(tanb));
        Double fw2s= tanb * 10 * tsl;
        Double fw2= (fw2s <= 400) ? fw2s : 400;
        Double a2z= 0.35 + abz + adcz;
        Double v2s=sqrt(fw2 / 0.613 / cc / a2z);
        Double v2= (v2s <= 8.3) ? v2s : 8.3;;
        map.put("tanb", tanb);
        map.put("bj", bj);
        map.put("fw2s", fw2s);
        map.put("fw2", fw2);
        map.put("a2z", a2z);
        map.put("v2s", v2s);
        map.put("v2", v2);

//      小节+报警值
        Double vmin= (v1 >= v2) ? v2 : v1;
        Double vmax= (v1 >= v2) ? v1 : v2;
        Double vb= 0.75 * vmin;
        map.put("vmin", vmin);
        map.put("vmax", vmax);
        map.put("vb", vb);
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
        Double fw1s = doubleMap.get("fw1s");
        Double v1s = doubleMap.get("v1s");
        String b1 = takeSignByCompareNumber(fw1s, 400.0);
        String b2 = takeSignByCompareNumber(v1s, 8.3);
        String u1 = takeStringByCompareNumber(fw1s, 400.0);
        String u2 = takeStringByCompareNumber(v1s, 8.3);
        map.put("b1", CommonFunc.convertDoubleToString(b1));
        map.put("b2", CommonFunc.convertDoubleToString(b2));
        map.put("u1", CommonFunc.convertDoubleToString(u1));
        map.put("u2", CommonFunc.convertDoubleToString(u2));

        Double fw2s = doubleMap.get("fw2s");
        Double v2s = doubleMap.get("v2s");
        String b3 = takeSignByCompareNumber(fw2s, 400.0);
        String b4 = takeSignByCompareNumber(v2s, 8.3);
        String u3 = takeStringByCompareNumber(fw2s, 400.0);
        String u4 = takeStringByCompareNumber(v2s, 8.3);
        map.put("b3", CommonFunc.convertDoubleToString(b3));
        map.put("b4", CommonFunc.convertDoubleToString(b4));
        map.put("u3", CommonFunc.convertDoubleToString(u3));
        map.put("u4", CommonFunc.convertDoubleToString(u4));

        Double vmax = doubleMap.get("vmax");
        String b5 = takeSignByCompareNumber(vmax, 8.3);
        map.put("b5", CommonFunc.convertDoubleToString(b5));

         for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
         }
        map.put("tana", CommonFunc.convertDoubleToString4(doubleMap.get("tana")));
        map.put("tanb", CommonFunc.convertDoubleToString4(doubleMap.get("tanb")));
        map.put("aj", CommonFunc.convertDoubleToString4(doubleMap.get("aj")));
        map.put("bj", CommonFunc.convertDoubleToString4(doubleMap.get("bj")));
        return map;
    }

}
