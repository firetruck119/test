package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class UprightMechanismEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double yzdd;
    private Double yzxd;
    private Double yzlltl;
    private Double yzgcyl;

    private Double h;
    private Double lbd;
    private Double lbx;
    private Double lbp;
//    private Double lbpf;

    //非页面数据
    private Double ljdhzf;
    private Double dcgssp;
    private Double grugssp;
    private Double lbtzh;
    private Double ldcgh;
    private Double ldslzh;

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
    private Double m5;
    private Double m6;
    private Double m11;
    private Double m20;
    private Double m21;
    private Double myzs;
    private Double myzsf;

    private Double lsljd;
    private Double lshljd;
    private Double ljd1;
    private Double ljd2;
    private Double ljd3;
    private Double ljd4;
    private Double ljd5;
    private Double ljd6;
    private Double ljd11;
    private Double ljd20;
    private Double ljd21;

    private Double ljdf1;
    private Double ljdf2;
    private Double ljdf3;
    private Double ljdf4;
    private Double ljdf5;
    private Double ljdf6;
    private Double ljdf11;
    private Double ljdf20;
    private Double ljdf21;

    private Double ljdc;
    private Double ljcyy;
    private Double lyhq;

    private Double ljdcf;
    private Double ljcyyf;
    private Double lyhqf;

    private Double lyg;
    private Double hyg;
    private Double byg;
    private Double eyg;
    private Double ayg;
    private Double iiminyg;

    private Double dd1;
    private Double aja;
    private Double wjax;
    private Double ljat;
    private Double ljab;
    private Double dd2;

    private String yzjgModel;
    private String dcModel;
    private String dcgssModel;
    private String ffbbModel;
    private String btModel;
    private String gruModel;

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

        map.put("yzdd", CommonFunc.convertDoubleToString(yzdd));
        map.put("yzxd", CommonFunc.convertDoubleToString(yzxd));
        map.put("yzlltl", CommonFunc.convertDoubleToString(yzlltl));
        map.put("yzgcyl", CommonFunc.convertDoubleToString(yzgcyl));

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("lbp", CommonFunc.convertDoubleToString(lbp));
//        map.put("lbpf", CommonFunc.convertDoubleToString(lbpf));

        map.put("ljdhzf", CommonFunc.convertDoubleToString(ljdhzf));
        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));

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
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("m6", CommonFunc.convertDoubleToString(m6));
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("m20", CommonFunc.convertDoubleToString(m20));
        map.put("m21", CommonFunc.convertDoubleToString(m21));
        map.put("myzs", CommonFunc.convertDoubleToString(myzs));
        map.put("myzsf", CommonFunc.convertDoubleToString(myzsf));

        map.put("lsljd", CommonFunc.convertDoubleToString(lsljd));
        map.put("lshljd", CommonFunc.convertDoubleToString(lshljd));
        map.put("ljd1", CommonFunc.convertDoubleToString(ljd1));
        map.put("ljd2", CommonFunc.convertDoubleToString(ljd2));
        map.put("ljd3", CommonFunc.convertDoubleToString(ljd3));
        map.put("ljd4", CommonFunc.convertDoubleToString(ljd4));
        map.put("ljd5", CommonFunc.convertDoubleToString(ljd5));
        map.put("ljd6", CommonFunc.convertDoubleToString(ljd6));
        map.put("ljd11", CommonFunc.convertDoubleToString(ljd11));
        map.put("ljd20", CommonFunc.convertDoubleToString(ljd20));
        map.put("ljd21", CommonFunc.convertDoubleToString(ljd21));

        map.put("ljdf1", CommonFunc.convertDoubleToString(ljdf1));
        map.put("ljdf2", CommonFunc.convertDoubleToString(ljdf2));
        map.put("ljdf3", CommonFunc.convertDoubleToString(ljdf3));
        map.put("ljdf4", CommonFunc.convertDoubleToString(ljdf4));
        map.put("ljdf5", CommonFunc.convertDoubleToString(ljdf5));
        map.put("ljdf6", CommonFunc.convertDoubleToString(ljdf6));
        map.put("ljdf11", CommonFunc.convertDoubleToString(ljdf11));
        map.put("ljdf20", CommonFunc.convertDoubleToString(ljdf20));
        map.put("ljdf21", CommonFunc.convertDoubleToString(ljdf21));

        map.put("ljdc", CommonFunc.convertDoubleToString(ljdc));
        map.put("ljcyy", CommonFunc.convertDoubleToString(ljcyy));
        map.put("lyhq", CommonFunc.convertDoubleToString(lyhq));

        map.put("ljdcf", CommonFunc.convertDoubleToString(ljdcf));
        map.put("ljcyyf", CommonFunc.convertDoubleToString(ljcyyf));
        map.put("lyhqf", CommonFunc.convertDoubleToString(lyhqf));

        map.put("lyg", CommonFunc.convertDoubleToString(lyg));
        map.put("hyg", CommonFunc.convertDoubleToString(hyg));
        map.put("byg", CommonFunc.convertDoubleToString(byg));
        map.put("eyg", CommonFunc.convertDoubleToString(eyg));
        map.put("ayg", CommonFunc.convertDoubleToString(ayg));
        map.put("iiminyg", CommonFunc.convertDoubleToString(iiminyg));

        map.put("dd1", CommonFunc.convertDoubleToString(dd1));
        map.put("aja", CommonFunc.convertDoubleToString(aja));
        map.put("wjax", CommonFunc.convertDoubleToString(wjax));
        map.put("ljat", CommonFunc.convertDoubleToString(ljat));
        map.put("ljab", CommonFunc.convertDoubleToString(ljab));
        map.put("dd2", CommonFunc.convertDoubleToString(dd2));
        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
//        Double yzlltl = map.get("yzlltl");
        Double ff2 = map.get("ff2");
//        Double ljdcf = map.get("ljdcf");
//        Double ljcyyf = map.get("ljcyyf");
        Double f1 = map.get("f1");
        Double o = map.get("o");
//        Double ayg = map.get("ayg");
//        Double ljab = map.get("ljab");
        Double rr2 = map.get("rr2");
        Double rr1 = map.get("rr1");
        Double fmax1 = map.get("fmax1");

        Double fyt = yzlltl * 2 / 2 ;
        Double fyn = fyt * ljcyyf / ljdcf ;
        String p1;
        if (fyn < ff2) {
            p1 = "<" ;
        } else if (fyn == ff2) {
            p1 = "=";
        } else{
            p1 = ">";
        }
        String g1 = (fyn >= ff2) ? "符合" : "不符合";

        Double ay1 = f1 / o / 230 ;
        String p2;
        if (ay1 < ayg) {
            p2 = "<" ;
        } else if (ay1 == ayg) {
            p2 = "=";
        } else{
            p2 = ">";
        }
        String g2 = (ay1 <= ayg) ? "符合" : "不符合";

        Double fmaxy1 = 1627964.36 * ljab * rr1 * rr2 / 210000 / ( rr2 - rr1 ) ;
        String p3;
        if (fmaxy1 < fmax1) {
            p3 = "<" ;
        } else if (fmaxy1 == fmax1) {
            p3 = "=";
        } else{
            p3 = ">";
        }
        String g3 = (fmaxy1 >= fmax1) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("yzlltl", CommonFunc.convertDoubleToString(yzlltl));
        result.put("ff2", CommonFunc.convertDoubleToString(ff2));
        result.put("ljdcf", CommonFunc.convertDoubleToString(ljdcf));
        result.put("ljcyyf", CommonFunc.convertDoubleToString(ljcyyf));
        result.put("f1", CommonFunc.convertDoubleToString(f1));
        result.put("o", CommonFunc.convertDoubleToString(o));
        result.put("ayg", CommonFunc.convertDoubleToString(ayg));
        result.put("ljab", CommonFunc.convertDoubleToString(ljab));
        result.put("rr2", CommonFunc.convertDoubleToString(rr2));
        result.put("rr1", CommonFunc.convertDoubleToString(rr1));
        result.put("fmax1", CommonFunc.convertDoubleToString(fmax1));
        result.put("fyt", CommonFunc.convertDoubleToString(fyt));
        result.put("fyn", CommonFunc.convertDoubleToString(fyn));
        result.put("p1", CommonFunc.convertDoubleToString(p1));
        result.put("g1", CommonFunc.convertDoubleToString(g1));
        result.put("ay1", CommonFunc.convertDoubleToString(ay1));
        result.put("p2", CommonFunc.convertDoubleToString(p2));
        result.put("g2", CommonFunc.convertDoubleToString(g2));
        result.put("fmaxy1", CommonFunc.convertDoubleToString(fmaxy1));
        result.put("p3", CommonFunc.convertDoubleToString(p3));
        result.put("g3", CommonFunc.convertDoubleToString(g3));
        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

//      工作状态仰柱液压缸校核

        Double f2= 1.25 * myzs * 10;
        Double fyyg= f2 * ljdc / ljcyy;
        Double a1= fyyg * 2 / 2;
        map.put("f2", f2);
        map.put("fyyg", fyyg);
        map.put("a1", a1);

//      非工作状态仰柱液压缸校核
        Double ff2 = myzsf * 10;
        Double fyygf = ff2 * ljdcf / ljcyyf;
        Double a2 = fyygf * 2 / 2;
        map.put("ff2", ff2);
        map.put("fyygf", fyygf);
        map.put("a2", a2);

//      工作状态擦窗机各部件对铰支点D产生的倾覆力矩
        Double msljd =1.25 * 10 * tsl * lsljd;
        Double mshljd =1.25 * 10 * tshl * lshljd;
        Double mjd1 =1.25 * 10 * m1 * ljd1;
        Double mjd2 =1.25 * 10 * m2 * ljd2;
        Double mjd3 =1.25 * 10 * m3 * ljd3;
        Double mjd4 =1.25 * 10 * m4 * ljd4;
        Double mjd5 =1.25 * 10 * m5 * ljd5;
        Double mjd6 =1.25 * 10 * m6 * ljd6;
        Double mjd20 =1.25 * 10 * m20 * ljd20;
//      工作状态擦窗机各部件对铰支点D产生的抗倾覆力矩
        Double mjd11 =1.25 * 10 * m11 * ljd11;
        Double mjd21 =1.25 * 10 * m21 * ljd21;
        map.put("msljd", msljd);
        map.put("mshljd", mshljd);
        map.put("mjd1", mjd1);
        map.put("mjd2", mjd2);
        map.put("mjd3", mjd3);
        map.put("mjd4", mjd4);
        map.put("mjd5", mjd5);
        map.put("mjd6", mjd6);
        map.put("mjd11", mjd11);
        map.put("mjd20", mjd20);
        map.put("mjd21", mjd21);

//      工作状态前撑杆稳定性校核
        Double mjdq =msljd + mshljd + mjd1 + mjd2 + mjd3 + mjd4 + mjd5 + mjd6 + mjd20;
        Double mjdk =mjd11 + mjd21;
        Double mjd =mjdq - mjdk;
        Double f1 =mjd / lyhq;
        Double k =1000 * 1 * lyg / iiminyg;
        Double o;
        if (k >= 0 && k < 5) {
            o = 1.0;
        } else if (k >= 5 && k < 15) {
            o = 0.97;
        } else if (k >= 15 && k < 25) {
            o = 0.95;
        } else if (k >= 25 && k < 35) {
            o = 0.91;
        } else if (k >= 35 && k < 45) {
            o = 0.87;
        } else if (k >= 45 && k < 55) {
            o = 0.83;
        } else if (k >= 55 && k < 65) {
            o = 0.79;
        } else if (k >= 65 && k < 75) {
            o = 0.72;
        } else if (k >= 75 && k < 85) {
            o = 0.65;
        } else if (k >= 85 && k < 95) {
            o = 0.55;
        } else  {
            o = 0.43;
        }
        Double s1 = f1 / o / ayg;
        map.put("mjdq", mjdq);
        map.put("mjdk", mjdk);
        map.put("mjd", mjd);
        map.put("f1", f1);
        map.put("k", k);
        map.put("o", o);
        map.put("s1", s1);

//      非工作状态擦窗机各部件对铰支点D产生的倾覆力矩
        Double mjdf1 =10 * m1 * ljdf1;
        Double mjdf2 =10 * m2 * ljdf2;
        Double mjdf3 =10 * m3 * ljdf3;
        Double mjdf4 =10 * m4 * ljdf4;
        Double mjdf5 =10 * m5 * ljdf5;
        Double mjdf6 =10 * m6 * ljdf6;
        Double mjdf20 =10 * m20 * ljdf20;
//      非工作状态擦窗机各部件对铰支点D产生的抗倾覆力矩
        Double mjdf11 =10 * m11 * ljdf11;
        Double mjdf21 =10 * m21 * ljdf21;
        map.put("mjdf1", mjdf1);
        map.put("mjdf2", mjdf2);
        map.put("mjdf3", mjdf3);
        map.put("mjdf4", mjdf4);
        map.put("mjdf5", mjdf5);
        map.put("mjdf6", mjdf6);
        map.put("mjdf11", mjdf11);
        map.put("mjdf20", mjdf20);
        map.put("mjdf21", mjdf21);

//      非工作状态前撑杆稳定性校核
        Double mjdqf =mjdf1 + mjdf2 + mjdf3 + mjdf4 + mjdf5 + mjdf6 + mjdf20;
        Double mjdkf =mjdf11 + mjdf21;
        Double mjdf =mjdkf - mjdqf;
        Double ff1 =mjdf / lyhqf;
        Double sf1 = ff1 / ayg;
        map.put("mjdqf", mjdqf);
        map.put("mjdkf", mjdkf);
        map.put("mjdf", mjdf);
        map.put("ff1", ff1);
        map.put("sf1", sf1);

//      前撑杆连接轴弯曲应力校核
        Double fmax1;
        if (f1 < ff1) {
            fmax1 = ff1;
        } else {
            fmax1 = f1;
        }
        Double qf1 = fmax1 / 2 / ljat;
        Double mja = qf1 * ljat * ljat / 2;
        Double sja = mja / wjax;
        map.put("fmax1", fmax1);
        map.put("qf1", qf1);
        map.put("mja", mja);
        map.put("sja", sja);

//      前撑杆连接轴剪切应力校核
        Double tja = fmax1 / 2 / aja;
        map.put("tja", tja);

//      前撑杆连接轴合成应力校核
        Double sivja = sqrt(sja * sja + 3 * tja * tja);
        map.put("sivja", sivja);

//      前撑杆连接与前撑杆接触应力校核
        Double rr2 = dd2 / 2;
        Double rr1 = dd1 / 2;
        Double shzja = 0.418 * sqrt(fmax1 * 210000 * (rr2 - rr1) / ljab / rr1 / rr2);
        map.put("rr2", rr2);
        map.put("rr1", rr1);
        map.put("shzja", shzja);

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
        Double a1 = doubleMap.get("a1");
        Double a2 = doubleMap.get("a2");
        String b1 = takeSignByCompareNumber(a1, yzlltl);
        String b2 = takeSignByCompareNumber(a2, yzlltl);
        String u1 = takeStringByCompareNumber(a1, yzlltl);
        String u2 = takeStringByCompareNumber(a2, yzlltl);
        map.put("b1", CommonFunc.convertDoubleToString(b1));
        map.put("b2", CommonFunc.convertDoubleToString(b2));
        map.put("u1", CommonFunc.convertDoubleToString(u1));
        map.put("u2", CommonFunc.convertDoubleToString(u2));

        Double s1 = doubleMap.get("s1");
        Double sf1 = doubleMap.get("sf1");
        String b3 = takeSignByCompareNumber(s1, 230.0);
        String b4 = takeSignByCompareNumber(sf1, 313.33);
        String u3 = takeStringByCompareNumber(s1, 230.0);
        String u4 = takeStringByCompareNumber(sf1, 313.33);
        map.put("b3", CommonFunc.convertDoubleToString(b3));
        map.put("b4", CommonFunc.convertDoubleToString(b4));
        map.put("u3", CommonFunc.convertDoubleToString(u3));
        map.put("u4", CommonFunc.convertDoubleToString(u4));

        Double sja = doubleMap.get("sja");
        Double tja = doubleMap.get("tja");
        Double sivja = doubleMap.get("sivja");
        String b5 = takeSignByCompareNumber(sja, 246.67);
        String b6 = takeSignByCompareNumber(tja, 142.41);
        String b7 = takeSignByCompareNumber(sivja, 246.67);
        String u5 = takeStringByCompareNumber(sja, 246.67);
        String u6 = takeStringByCompareNumber(tja, 142.41);
        String u7 = takeStringByCompareNumber(sivja, 246.67);
        map.put("b5", CommonFunc.convertDoubleToString(b5));
        map.put("b6", CommonFunc.convertDoubleToString(b6));
        map.put("b7", CommonFunc.convertDoubleToString(b7));
        map.put("u5", CommonFunc.convertDoubleToString(u5));
        map.put("u6", CommonFunc.convertDoubleToString(u6));
        map.put("u7", CommonFunc.convertDoubleToString(u7));

        Double shzja = doubleMap.get("shzja");
        String b8 = takeSignByCompareNumber(shzja, 533.33);
        String u8 = takeStringByCompareNumber(shzja, 533.33);
        map.put("b8", CommonFunc.convertDoubleToString(b8));
        map.put("u8", CommonFunc.convertDoubleToString(u8));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
