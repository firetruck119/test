package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class YbAxisEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double lbd;
    private Double ybljz;
    private Double yygjd;
    private Double lyyglz;
    private Double ldzlz;
    private Double ybdzly;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double gruybxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double lslhz;
    private Double lhz4;
    private Double lhz5;
    private Double lhz6;

    //    提示提醒
    private String grutstx;

    private Double ybdzd1;
    private Double ybdza;
    private Double ybdzd2;
    private Double ybdzwx;
    private Double ybdzb;
    private Double ybdzc;
    private Double ybdzt;

    private Double swp;
    private Double r1;
    private Double mwr;
    private Double mffbb;
    private Double tsl;
    private Double hwll;
    private Double hsw;
    private Double tshl;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5yb;
    private Double m6;

    private Double lslyz;
    private Double lshlyz;
    private Double lyz1;
    private Double lyz2;
    private Double lyz3;
    private Double lyz4;
    private Double lyz5;
    private Double lyz6;

    private Double lsljz;
    private Double lshljz;
    private Double ljz1;
    private Double ljz2;
    private Double ljz3;
    private Double ljz4;
    private Double ljz5;
    private Double ljz6;

    private String ybdzxhModel;
    private String dcModel;
    private String dcgssModel;
    private String ffbbModel;
    private String btModel;
    private String gruModel;
    private String gruybModel;

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
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("ybljz", CommonFunc.convertDoubleToString(ybljz));
        map.put("yygjd", CommonFunc.convertDoubleToString(yygjd));
        map.put("lyyglz", CommonFunc.convertDoubleToString(lyyglz));
        map.put("ldzlz", CommonFunc.convertDoubleToString(ldzlz));
        map.put("ybdzly", CommonFunc.convertDoubleToString(ybdzly));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("gruybxs", CommonFunc.convertDoubleToString(gruybxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        map.put("lhz4", CommonFunc.convertDoubleToString(lhz4));
        map.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        map.put("lhz6", CommonFunc.convertDoubleToString(lhz6));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("ybdzd1", CommonFunc.convertDoubleToString(ybdzd1));
        map.put("ybdza", CommonFunc.convertDoubleToString(ybdza));
        map.put("ybdzd2", CommonFunc.convertDoubleToString(ybdzd2));
        map.put("ybdzwx", CommonFunc.convertDoubleToString(ybdzwx));
        map.put("ybdzb", CommonFunc.convertDoubleToString(ybdzb));
        map.put("ybdzc", CommonFunc.convertDoubleToString(ybdzc));
        map.put("ybdzt", CommonFunc.convertDoubleToString(ybdzt));

        map.put("swp", CommonFunc.convertDoubleToString(swp));
        map.put("r1", CommonFunc.convertDoubleToString(r1));
        map.put("mwr", CommonFunc.convertDoubleToString(mwr));
        map.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        map.put("tsl", CommonFunc.convertDoubleToString(tsl));
        map.put("hwll", CommonFunc.convertDoubleToString(hwll));
        map.put("hsw", CommonFunc.convertDoubleToString(hsw));
        map.put("tshl", CommonFunc.convertDoubleToString(tshl));
        map.put("m1", CommonFunc.convertDoubleToString(m1));
        map.put("m2", CommonFunc.convertDoubleToString(m2));
        map.put("m3", CommonFunc.convertDoubleToString(m3));
        map.put("m4", CommonFunc.convertDoubleToString(m4));
        map.put("m5yb", CommonFunc.convertDoubleToString(m5yb));
        map.put("m6", CommonFunc.convertDoubleToString(m6));

        map.put("lslyz", CommonFunc.convertDoubleToString(lslyz));
        map.put("lshlyz", CommonFunc.convertDoubleToString(lshlyz));
        map.put("lyz1", CommonFunc.convertDoubleToString(lyz1));
        map.put("lyz2", CommonFunc.convertDoubleToString(lyz2));
        map.put("lyz3", CommonFunc.convertDoubleToString(lyz3));
        map.put("lyz4", CommonFunc.convertDoubleToString(lyz4));
        map.put("lyz5", CommonFunc.convertDoubleToString(lyz5));
        map.put("lyz6", CommonFunc.convertDoubleToString(lyz6));

        map.put("lsljz", CommonFunc.convertDoubleToString(lsljz));
        map.put("lshljz", CommonFunc.convertDoubleToString(lshljz));
        map.put("ljz1", CommonFunc.convertDoubleToString(ljz1));
        map.put("ljz2", CommonFunc.convertDoubleToString(ljz2));
        map.put("ljz3", CommonFunc.convertDoubleToString(ljz3));
        map.put("ljz4", CommonFunc.convertDoubleToString(ljz4));
        map.put("ljz5", CommonFunc.convertDoubleToString(ljz5));
        map.put("ljz6", CommonFunc.convertDoubleToString(ljz6));

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

        Double mslyz= 1.25 * 10 * tsl * lslyz ;
        Double mshlyz= 1.25 * 10 * tshl * lshlyz ;
        Double myz1= 1.25 * 10 * m1 * lyz1 ;
        Double myz2= 1.25 * 10 * m2 * lyz2 ;
        Double myz3= 1.25 * 10 * m3 * lyz3 ;
        Double myz4= 1.25 * 10 * m4 * lyz4 ;
        Double myz5= 1.25 * 10 * m5yb * lyz5 ;
        Double myz6= 1.25 * 10 * m6 * lyz6 ;
        map.put("mslyz", mslyz);
        map.put("mshlyz", mshlyz);
        map.put("myz1", myz1);
        map.put("myz2", myz2);
        map.put("myz3", myz3);
        map.put("myz4", myz4);
        map.put("myz5", myz5);
        map.put("myz6", myz6);

        Double mslz= 10 * tsl * lsljz ;
        Double mshlz= 10 * tshl * lshljz ;
        Double mz1= 10 * m1 * ljz1 ;
        Double mz2= 10 * m2 * ljz2 ;
        Double mz3= 10 * m3 * ljz3 ;
        Double mz4= 10 * m4 * ljz4 ;
        Double mz5= 10 * m5yb * ljz5 ;
        Double mz6= 10 * m6 * ljz6 ;
        map.put("mslz", mslz);
        map.put("mshlz", mshlz);
        map.put("mz1", mz1);
        map.put("mz2", mz2);
        map.put("mz3", mz3);
        map.put("mz4", mz4);
        map.put("mz5", mz5);
        map.put("mz6", mz6);

        Double ybdzmy = mslyz + mshlyz + myz1 + myz2 + myz3 + myz4 + myz5 + myz6 ;
        Double ybdzf1 = ybdzmy / ybdzly ;
        Double ybdzmz = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 + mz6 ;
        Double ybdzfs = ybdzmz / ybljz ;
        Double cosa = Math.cos(yygjd / 180 * Math.PI) ;
        Double ybdzf2 = ybdzfs * cosa ;
        Double ybdzf = Math.sqrt( ybdzf1 * ybdzf1 + ybdzf2 * ybdzf2 ) ;
        Double ybdzq = ybdzf2 / ybdzc ;
        Double ybdzmg = ybdzq * ybdzc * ybdzb ;
        Double ybdzs = ybdzmg / ybdzwx ;
        map.put("ybdzmy", ybdzmy);
        map.put("ybdzf1", ybdzf1);
        map.put("ybdzmz", ybdzmz);
        map.put("ybdzfs", ybdzfs);
        map.put("cosa", cosa);
        map.put("ybdzf2", ybdzf2);
        map.put("ybdzf", ybdzf);
        map.put("ybdzq", ybdzq);
        map.put("ybdzmg", ybdzmg);
        map.put("ybdzs", ybdzs);

        Double ybdzts = ybdzf / 2 / ybdza ;
        map.put("ybdzts", ybdzts);

        Double siv = Math.sqrt( ybdzs * ybdzs + 3 * ybdzts * ybdzts ) ;
        map.put("siv", siv);

        Double jyyl = ybdzf / 2 / ybdzd1 / ybdzt ;
        map.put("jyyl", jyyl);

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

        Double ybdzs = doubleMap.get("ybdzs");
        String ybdzp1 = takeSignByCompareNumber(ybdzs, 246.67);
        String ybdzm1 = takeStringByCompareNumber(ybdzs, 246.67);
        map.put("ybdzp1", CommonFunc.convertDoubleToString(ybdzp1));
        map.put("ybdzm1", CommonFunc.convertDoubleToString(ybdzm1));

        Double ybdzts = doubleMap.get("ybdzts");
        String ybdzp2 = takeSignByCompareNumber(ybdzts, 142.41);
        String ybdzm2 = takeStringByCompareNumber(ybdzts, 142.41);
        map.put("ybdzp2", CommonFunc.convertDoubleToString(ybdzp2));
        map.put("ybdzm2", CommonFunc.convertDoubleToString(ybdzm2));

        Double siv = doubleMap.get("siv");
        String ybdzp3 = takeSignByCompareNumber(siv, 246.67);
        String ybdzm3 = takeStringByCompareNumber(siv, 246.67);
        map.put("ybdzp3", CommonFunc.convertDoubleToString(ybdzp3));
        map.put("ybdzm3", CommonFunc.convertDoubleToString(ybdzm3));

        Double jyyl = doubleMap.get("jyyl");
        String ybdzp4 = takeSignByCompareNumber(jyyl, 230.0);
        String ybdzm4 = takeStringByCompareNumber(jyyl, 230.0);
        map.put("ybdzp4", CommonFunc.convertDoubleToString(ybdzp4));
        map.put("ybdzm4", CommonFunc.convertDoubleToString(ybdzm4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
