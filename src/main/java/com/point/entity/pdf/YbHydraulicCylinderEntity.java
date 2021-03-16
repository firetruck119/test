package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class YbHydraulicCylinderEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double dbyj;
    private Double ybljz;
    private Double ybljzf;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double gruybxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double tslp;
    private Double tshlp;
    private Double m5ybp;
    private Double yblltlk;
    private Double yblltlfk;
    private Double ybs;

    //    提示提醒
    private String grutstx;

    private Double ybdd;
    private Double ybxd;
    private Double yblb;
    private Double yblbf;
    private Double ybi;
    private Double yblltl;
    private Double ybgcyl;
    private Double ybn1;
    private Double ybn;
    private Double ybnk;

    private Double yblltlf;

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

    private Double lsljz;
    private Double lshljz;
    private Double ljz1;
    private Double ljz2;
    private Double ljz3;
    private Double ljz4;
    private Double ljz5;

    private Double lsljzf;
    private Double lshljzf;
    private Double ljzf1;
    private Double ljzf2;
    private Double ljzf3;
    private Double ljzf4;
    private Double ljzf5;

    private String ybyygModel;
    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;
    private String gruybModel;
    private String ybfztModel;

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
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));
        map.put("ybljz", CommonFunc.convertDoubleToString(ybljz));
        map.put("ybljzf", CommonFunc.convertDoubleToString(ybljzf));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("gruybxs", CommonFunc.convertDoubleToString(gruybxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("tslp", CommonFunc.convertDoubleToString(tslp));
        map.put("tshlp", CommonFunc.convertDoubleToString(tshlp));
        map.put("m5ybp", CommonFunc.convertDoubleToString(m5ybp));
        map.put("yblltlk", CommonFunc.convertDoubleToString(yblltlk));
        map.put("yblltlfk", CommonFunc.convertDoubleToString(yblltlfk));
        map.put("ybs", CommonFunc.convertDoubleToString(ybs));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("ybdd", CommonFunc.convertDoubleToString(ybdd));
        map.put("ybxd", CommonFunc.convertDoubleToString(ybxd));
        map.put("yblb", CommonFunc.convertDoubleToString(yblb));
        map.put("yblbf", CommonFunc.convertDoubleToString(yblbf));
        map.put("ybi", CommonFunc.convertDoubleToString(ybi));
        map.put("yblltl", CommonFunc.convertDoubleToString(yblltl));
        map.put("ybgcyl", CommonFunc.convertDoubleToString(ybgcyl));
        map.put("ybn1", CommonFunc.convertDoubleToString(ybn1));
        map.put("ybn", CommonFunc.convertDoubleToString(ybn));
        map.put("ybnk", CommonFunc.convertDoubleToString(ybnk));

        map.put("yblltlf", CommonFunc.convertDoubleToString(yblltlf));

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

        map.put("lsljz", CommonFunc.convertDoubleToString(lsljz));
        map.put("lshljz", CommonFunc.convertDoubleToString(lshljz));
        map.put("ljz1", CommonFunc.convertDoubleToString(ljz1));
        map.put("ljz2", CommonFunc.convertDoubleToString(ljz2));
        map.put("ljz3", CommonFunc.convertDoubleToString(ljz3));
        map.put("ljz4", CommonFunc.convertDoubleToString(ljz4));
        map.put("ljz5", CommonFunc.convertDoubleToString(ljz5));

        map.put("lsljzf", CommonFunc.convertDoubleToString(lsljzf));
        map.put("lshljzf", CommonFunc.convertDoubleToString(lshljzf));
        map.put("ljzf1", CommonFunc.convertDoubleToString(ljzf1));
        map.put("ljzf2", CommonFunc.convertDoubleToString(ljzf2));
        map.put("ljzf3", CommonFunc.convertDoubleToString(ljzf3));
        map.put("ljzf4", CommonFunc.convertDoubleToString(ljzf4));
        map.put("ljzf5", CommonFunc.convertDoubleToString(ljzf5));

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

        Double mslz= 10 * tsl * lsljz ;
        Double mshlz= 10 * tshl * lshljz ;
        Double mz1= 10 * m1 * ljz1 ;
        Double mz2= 10 * m2 * ljz2 ;
        Double mz3= 10 * m3 * ljz3 ;
        Double mz4= 10 * m4 * ljz4 ;
        Double mz5= 10 * m5yb * ljz5 ;
        map.put("mslz", mslz);
        map.put("mshlz", mshlz);
        map.put("mz1", mz1);
        map.put("mz2", mz2);
        map.put("mz3", mz3);
        map.put("mz4", mz4);
        map.put("mz5", mz5);

        Double mz = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 ;
        Double fs = mz / ybljz ;
        Double fsn = ybn * fs / ybn1 ;
        Double fsnk = fsn / 1000 ;
        map.put("mz", mz);
        map.put("fs", fs);
        map.put("fsn", fsn);
        map.put("fsnk", fsnk);

        Double fk = 3.14 * 3.14 * 180000 * ybi / 4 / yblb / yblb ;
        Double fkn = fk / ybnk ;
        Double f1 = fs ;
        Double f1n = f1 / ybn1 ;
        Double fknk = fkn / 1000 ;
        Double f1nk = f1n / 1000 ;
        map.put("fk", fk);
        map.put("fkn", fkn);
        map.put("f1", f1);
        map.put("f1n", f1n);
        map.put("fknk", fknk);
        map.put("f1nk", f1nk);

        Double mslzf= 10 * tslp * lsljzf ;
        Double mshlzf= 10 * tshlp * lshljzf ;
        Double mzf1= 10 * m1 * ljzf1 ;
        Double mzf2= 10 * m2 * ljzf2 ;
        Double mzf3= 10 * m3 * ljzf3 ;
        Double mzf4= 10 * m4 * ljzf4 ;
        Double mzf5= 10 * m5ybp * ljzf5 ;
        map.put("mslzf", mslzf);
        map.put("mshlzf", mshlzf);
        map.put("mzf1", mzf1);
        map.put("mzf2", mzf2);
        map.put("mzf3", mzf3);
        map.put("mzf4", mzf4);
        map.put("mzf5", mzf5);

        Double mzf = mslzf + mshlzf + mzf1 + mzf2 + mzf3 + mzf4 + mzf5 ;
        Double fsf = mzf / ybljzf ;
        Double fsnf = ybn * fsf / ybn1 ;
        Double fsnfk = fsnf / 1000 ;
        map.put("mzf", mzf);
        map.put("fsf", fsf);
        map.put("fsnf", fsnf);
        map.put("fsnfk", fsnfk);

        Double fkf = 3.14 * 3.14 * 180000 * ybi / 4 / yblbf / yblbf ;
        Double fknf = fkf / ybnk ;
        Double f2 = fsf ;
        Double f2n = f2 / ybn1 ;
        Double fknfk = fknf / 1000 ;
        Double f2nk = f2n / 1000 ;
        map.put("fkf", fkf);
        map.put("fknf", fknf);
        map.put("f2", f2);
        map.put("f2n", f2n);
        map.put("fknfk", fknfk);
        map.put("f2nk", f2nk);

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
        Double fsn = doubleMap.get("fsn");
        String ybb1 = takeSignByCompareNumber(fsn, yblltl);
        String ybm1 = takeStringByCompareNumber(fsn, yblltl);
        map.put("ybb1", CommonFunc.convertDoubleToString(ybb1));
        map.put("ybm1", CommonFunc.convertDoubleToString(ybm1));

        Double f1n = doubleMap.get("f1n");
        Double fkn = doubleMap.get("fkn");
        String ybb2 = takeSignByCompareNumber(f1n, fkn);
        String ybm2 = takeStringByCompareNumber(f1n, fkn);
        map.put("ybb2", CommonFunc.convertDoubleToString(ybb2));
        map.put("ybm2", CommonFunc.convertDoubleToString(ybm2));

        Double fsnf = doubleMap.get("fsnf");
        String ybb3 = takeSignByCompareNumber(fsnf, yblltl);
        String ybm3 = takeStringByCompareNumber(fsnf, yblltl);
        map.put("ybb3", CommonFunc.convertDoubleToString(ybb3));
        map.put("ybm3", CommonFunc.convertDoubleToString(ybm3));

        Double f2n = doubleMap.get("f2n");
        Double fknf = doubleMap.get("fknf");
        String ybb4 = takeSignByCompareNumber(f2n, fknf);
        String ybm4 = takeStringByCompareNumber(f2n, fknf);
        map.put("ybb4", CommonFunc.convertDoubleToString(ybb4));
        map.put("ybm4", CommonFunc.convertDoubleToString(ybm4));


        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
