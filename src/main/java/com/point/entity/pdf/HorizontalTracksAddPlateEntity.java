package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

@Data
public class HorizontalTracksAddPlateEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double lkj;
    private Double dcw;
    private Double bcw;
//    private Double fzed;
//    private Double fze;
//    private Double vzed;
//    private Double vyed;
//    private Double rzed;

    //新加轨道计算参数输入
    private Double fzedk;
    private Double fzek;
    private Double vzedk;
    private Double vyedk;
    private Double rzedk;



    private Double bef1x;
    private Double bef1c;

    private String gdxh;
    //private String gdxhy;
    private String gcph;
    private Double bjb;
    private Double gdh;
    private Double gdb;
    private Double gdtw;
    private Double gdtfs;
    private Double gdtfx;
    private Double gdhw;
    private Double gdhy;
    private Double gdsy;
    private Double gdiy;
    private Double gdiz;
    private Double gdwysel;
    private Double gdwyxel;
    private Double gdwzel;
    private Double gdz;
    private Double gdy;
    private Double gdss;
    private Double gdshzr;
    private String trackModel;
    //private String steelHave;
    private String steelModel;
    private String trippingModel;

    public String nameOfPDF(String type) {
        switch (type) {
            case "SimplySupported":
                return "加筋板版水平轨道校核计算书(简支梁).pdf";
            case "DoubleSpanbeam":
                return "加筋板版水平轨道校核计算书(双跨梁).pdf";
        }
        return null;
    }

    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        //String gdjb = steelHave;
        //String gdjby = gdjb.equals("有")?"has":"hasn't";
        //map.put("gdjb",gdjb);
        //map.put("gdjby",gdjby);
        map.put("no", CommonFunc.convertDoubleToString(no));
        map.put("ver", CommonFunc.convertDoubleToString(ver));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("shr", CommonFunc.convertDoubleToString(shr));
        map.put("pzr", CommonFunc.convertDoubleToString(pzr));
        map.put("date", CommonFunc.convertDoubleToString(date));
        map.put("lkj", CommonFunc.convertDoubleToString(lkj));
        map.put("dcw", CommonFunc.convertDoubleToString(dcw));
        map.put("bcw", CommonFunc.convertDoubleToString(bcw));
        map.put("fzedk", CommonFunc.convertDoubleToString(fzedk));
        map.put("fzek", CommonFunc.convertDoubleToString(fzek));
        map.put("vzedk", CommonFunc.convertDoubleToString(vzedk));
        map.put("vyedk", CommonFunc.convertDoubleToString(vyedk));
        map.put("rzedk", CommonFunc.convertDoubleToString(rzedk));
       /*
        map.put("fzed", CommonFunc.convertDoubleToString(fzed));
        map.put("fze", CommonFunc.convertDoubleToString(fze));
        map.put("vzed", CommonFunc.convertDoubleToString(vzed));
        map.put("vyed", CommonFunc.convertDoubleToString(vyed));
        map.put("rzed", CommonFunc.convertDoubleToString(rzed));
        */
        map.put("bef1x", CommonFunc.convertDoubleToString(bef1x));
        map.put("bef1c", CommonFunc.convertDoubleToString(bef1c));
        map.put("gdxh", CommonFunc.convertDoubleToString(gdxh));
        // map.put("gdxhy", CommonFunc.convertDoubleToString(gdxhy));
        map.put("gcph", CommonFunc.convertDoubleToString(gcph));
        map.put("bjb", CommonFunc.convertDoubleToString(bjb));
        map.put("gdh", CommonFunc.convertDoubleToString(gdh));
        map.put("gdb", CommonFunc.convertDoubleToString(gdb));
        map.put("gdtw", CommonFunc.convertDoubleToString(gdtw));
        map.put("gdtfs", CommonFunc.convertDoubleToString(gdtfs));
        map.put("gdtfx", CommonFunc.convertDoubleToString(gdtfx));
        map.put("gdhw", CommonFunc.convertDoubleToString(gdhw));
        map.put("gdhy", CommonFunc.convertDoubleToString(gdhy));
        map.put("gdsy", CommonFunc.convertDoubleToString(gdsy));
        map.put("gdiy", CommonFunc.convertDoubleToString(gdiy));
        map.put("gdiz", CommonFunc.convertDoubleToString(gdiz));
        map.put("gdwysel", CommonFunc.convertDoubleToString(gdwysel));
        map.put("gdwyxel", CommonFunc.convertDoubleToString(gdwyxel));
        map.put("gdwzel", CommonFunc.convertDoubleToString(gdwzel));
        map.put("gdz", CommonFunc.convertDoubleToString(gdz));
        map.put("gdy", CommonFunc.convertDoubleToString(gdy));
        map.put("gdss", CommonFunc.convertDoubleToString(gdss));
        map.put("gdshzr", CommonFunc.convertDoubleToString(gdshzr));
        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
        Double myed = map.get("myed");
        Double mzed = map.get("mzed");
        Double a2 = map.get("a2");
        Double a3 = map.get("a3");
        Double a4 = map.get("a4");
        Double a5 = map.get("a5");
        Double a6 = map.get("a6");
        Double a7 = map.get("a7");
        Double a8 = map.get("a8");
        Double a9 = map.get("a9");
        Double a10 = map.get("a10");
        Double a11 = map.get("a11");
        Double fz = map.get("fz");
        Double fy = map.get("fy");
        Double myeds = map.get("myeds");
        Double mzeds = map.get("mzeds");
        Double b2 = map.get("b2");
        Double b3 = map.get("b3");
        Double b4 = map.get("b4");
        Double b5 = map.get("b5");
        Double b6 = map.get("b6");
        Double b7 = map.get("b7");
        Double b8 = map.get("b8");
        Double b9 = map.get("b9");
        Double b10 = map.get("b10");
        Double b11 = map.get("b11");
        Double fzs = map.get("fzs");
        Double fys = map.get("fys");
        Double o1 = myeds / myed;
        Double o2 = mzeds / mzed;
        Double o3 = b2 / a2;
        Double o4 = b3 / a3;
        Double o5 = b4 / a4;
        Double o6 = b5 / a5;
        Double o7 = b6 / a6;
        Double o8 = b7 / a7;
        Double o9 = b8 / a8;
        Double o10 = b9 / a9;
        Double o11 = b10 / a10;
        Double o12 = b11 / a11;
        Double o13 = fzs / fz;
        Double o14 = fys / fy;
        String g1 = (0.77 <= o1 && o1 <= 0.85) ? "符合" : "不符合";
        String g2 = (0.77 <= o2 && o2 <= 0.85) ? "符合" : "不符合";
        String g3 = (0.66 <= o3 && o3 <= 0.9) ? "符合" : "不符合";
        String g4 = (0.75 <= o4 && o4 <= 0.85) ? "符合" : "不符合";
        String g5 = (0.95 <= o5 && o5 <= 1.05) ? "符合" : "不符合";
        String g6 = (0.79 <= o6 && o6 <= 1.05) ? "符合" : "不符合";
        String g7 = (0.95 <= o7 && o7 <= 1.05) ? "符合" : "不符合";
        String g8 = (0.95 <= o8 && o8 <= 1.05) ? "符合" : "不符合";
        String g9 = (0.95 <= o9 && o9 <= 1.05) ? "符合" : "不符合";
        String g10 = (0.95 <= o10 && o10 <= 1.05) ? "符合" : "不符合";
        String g11 = (0.95 <= o11 && o11 <= 1.05) ? "符合" : "不符合";
        String g12 = (0.95 <= o12 && o12 <= 1.05) ? "符合" : "不符合";
        String g13 = (0.68 <= o13 && o13 <= 0.75) ? "符合" : "不符合";
        String g14 = (0.68 <= o14 && o14 <= 0.75) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("myeds", CommonFunc.convertDoubleToString(myeds));
        result.put("mzeds", CommonFunc.convertDoubleToString(mzeds));
        result.put("b2", CommonFunc.convertDoubleToString(b2));
        result.put("b3", CommonFunc.convertDoubleToString(b3));
        result.put("b4", CommonFunc.convertDoubleToString(b4));
        result.put("b5", CommonFunc.convertDoubleToString(b5));
        result.put("b6", CommonFunc.convertDoubleToString(b6));
        result.put("b7", CommonFunc.convertDoubleToString(b7));
        result.put("b8", CommonFunc.convertDoubleToString(b8));
        result.put("b9", CommonFunc.convertDoubleToString(b9));
        result.put("b10", CommonFunc.convertDoubleToString(b10));
        result.put("b11", CommonFunc.convertDoubleToString(b11));
        result.put("fzs", CommonFunc.convertDoubleToString(fzs));
        result.put("fys", CommonFunc.convertDoubleToString(fys));
        result.put("myed", CommonFunc.convertDoubleToString(myed));
        result.put("mzed", CommonFunc.convertDoubleToString(mzed));
        result.put("a2", CommonFunc.convertDoubleToString(a2));
        result.put("a3", CommonFunc.convertDoubleToString(a3));
        result.put("a4", CommonFunc.convertDoubleToString(a4));
        result.put("a5", CommonFunc.convertDoubleToString(a5));
        result.put("a6", CommonFunc.convertDoubleToString(a6));
        result.put("a7", CommonFunc.convertDoubleToString(a7));
        result.put("a8", CommonFunc.convertDoubleToString(a8));
        result.put("a9", CommonFunc.convertDoubleToString(a9));
        result.put("a10", CommonFunc.convertDoubleToString(a10));
        result.put("a11", CommonFunc.convertDoubleToString(a11));
        result.put("fz", CommonFunc.convertDoubleToString(fz));
        result.put("fy", CommonFunc.convertDoubleToString(fy));
        result.put("o1", CommonFunc.convertDoubleToString(o1));
        result.put("o2", CommonFunc.convertDoubleToString(o2));
        result.put("o3", CommonFunc.convertDoubleToString(o3));
        result.put("o4", CommonFunc.convertDoubleToString(o4));
        result.put("o5", CommonFunc.convertDoubleToString(o5));
        result.put("o6", CommonFunc.convertDoubleToString(o6));
        result.put("o7", CommonFunc.convertDoubleToString(o7));
        result.put("o8", CommonFunc.convertDoubleToString(o8));
        result.put("o9", CommonFunc.convertDoubleToString(o9));
        result.put("o10", CommonFunc.convertDoubleToString(o10));
        result.put("o11", CommonFunc.convertDoubleToString(o11));
        result.put("o12", CommonFunc.convertDoubleToString(o12));
        result.put("o13", CommonFunc.convertDoubleToString(o13));
        result.put("o14", CommonFunc.convertDoubleToString(o14));
        result.put("g1", CommonFunc.convertDoubleToString(g1));
        result.put("g2", CommonFunc.convertDoubleToString(g2));
        result.put("g3", CommonFunc.convertDoubleToString(g3));
        result.put("g4", CommonFunc.convertDoubleToString(g4));
        result.put("g5", CommonFunc.convertDoubleToString(g5));
        result.put("g6", CommonFunc.convertDoubleToString(g6));
        result.put("g7", CommonFunc.convertDoubleToString(g7));
        result.put("g8", CommonFunc.convertDoubleToString(g8));
        result.put("g9", CommonFunc.convertDoubleToString(g9));
        result.put("g10", CommonFunc.convertDoubleToString(g10));
        result.put("g11", CommonFunc.convertDoubleToString(g11));
        result.put("g12", CommonFunc.convertDoubleToString(g12));
        result.put("g13", CommonFunc.convertDoubleToString(g13));
        result.put("g14", CommonFunc.convertDoubleToString(g14));

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

         /*
        表1数据
         */
        Double fzed= fzedk * 1000;
        Double fze= fzek * 1000;
        Double vzed= vzedk * 1000;
        Double vyed= vyedk * 1000;
        Double rzed= rzedk * 1000;
        map.put("fzed", fzed);
        map.put("fze", fze);
        map.put("vzed", vzed);
        map.put("vyed", vyed);
        map.put("rzed", rzed);

        /*
        表2数据,表3数据
         */
        if (trackModel.equals("其它")) {
            Double gdh1 = gdh;
            Double gdb1 = gdb;
            Double gdtw1 = gdtw;
            Double gdtfs1 = gdtfs;
            Double gdtfx1 = gdtfx;
            Double gdz1 = gdz;
            Double gdsy1 = gdsy;
            Double gdiiy = gdiy / 10000;
            Double gdiiz = gdiz / 10000;
            Double gdwys = gdwysel / 1000;
            Double gdwyx = gdwyxel / 1000;
            Double gdwz = gdwzel / 1000;
            Double gdss1 = gdss;
            Double gdshzr1 = gdshzr;
            map.put("gdb1", gdb1);
            map.put("gdh1", gdh1);
            map.put("gdtw1", gdtw1);
            map.put("gdtfs1", gdtfs1);
            map.put("gdtfx1", gdtfx1);
            map.put("gdz1", gdz1);
            map.put("gdsy1", gdsy1);
            map.put("gdiiy", gdiiy);
            map.put("gdiiz", gdiiz);
            map.put("gdwys", gdwys);
            map.put("gdwyx", gdwyx);
            map.put("gdwz", gdwz);
            map.put("gdss1", gdss1);
            map.put("gdshzr1", gdshzr1);
        }

        Double myed = vzed * lkj / 4;//S
        Double myeds = 13 * vzed * lkj / 64;//D
        Double mzed = vyed * lkj / 4;//S
        Double mzeds = 13 * vyed * lkj / 64;//D
        Double sxeds = (myeds * gdz / gdiy) + (mzeds * gdy / gdiz);//D
        Double sxed = (myed * gdz / gdiy) + (mzed * gdy / gdiz);//S
        Double b1 = gdb * gdhy / gdtw / gdhw;//D
        Double a1 = gdb * gdhy / gdtw / gdhw;//S
        Double ted1 = vzed * gdsy / gdtw / gdiy;
        Double ted2 = vzed / gdtw / gdhw;
        Double ted;
        if (a1 < 0.6) {
            ted = ted1;
        } else {
            ted = ted2;
        }
        if (b1 < 0.6) {
            ted = ted1;
        } else {
            ted = ted2;
        }
        Double a2 = Math.pow(sxed / gdss, 2) + 3 * Math.pow(ted / gdss, 2);
        Double b2 = Math.pow(sxeds / gdss, 2) + 3 * Math.pow(ted / gdss, 2);
        map.put("myed", myed);
        map.put("myeds", myeds);
        map.put("mzed", mzed);
        map.put("mzeds", mzeds);
        map.put("sxed", sxed);
        map.put("sxeds", sxeds);
        map.put("a1", a1);
        map.put("b1", b1);
        map.put("ted1", ted1);
        map.put("ted2", ted2);
        map.put("ted", ted);
        map.put("a2", a2);
        map.put("b2", b2);

        Double iw = gdiz * gdh * gdh / 4;
        Double it = 0.4 * (gdb * gdtfx * gdtfx * gdtfx + gdh * gdtw * gdtw * gdtw + gdb * gdhy * gdhy * gdhy);
        Double s = sqrt(210000 * iw / 81000 / it);
        Double ccr = 1.35 * 3.14 * (sqrt(1 + Math.pow(3.14 * s / lkj, 2) * (1 + 0.55 * 0.55)) + 0.55 * 3.14 * s / lkj);
        Double mcr = ccr * sqrt(210000 * gdiz * 81000 * it) / lkj;
        Double klt = sqrt(gdss * gdwysel / mcr);
        Double qlt1 = 0.5 * (1 + 0.34 * (klt - 0.4) + 0.75 * klt * klt);
        Double qlt2 = 0.5 * (1 + 0.49 * (klt - 0.4) + 0.75 * klt * klt);
        //String[] temp = {"H200*200+贴板", "H250*250+贴板", "拼焊H216*200", "拼焊H266*250", "其它"};
        String[] temp = {"H200*200T-71", "H250*250T-99", "PH216*200-84.7", "PH266*250-128.1", "PH200*200-90.7", "PH220*170-82.6", "PH250*200-117.4", "PH250*250-138.8", "PH300*250-146.6", "PH300*300-168.1", "其它"};
        Double qlt;
        if (Arrays.binarySearch(temp, gdxh) > 0) {
            qlt = qlt2;
        } else {
            qlt = qlt1;
        }
        Double xlt = 1 / (qlt + sqrt(qlt * qlt - 0.75 * klt * klt));
        Double mbrd = xlt * gdss * gdwysel;
        Double a3 = myed / mbrd;
        Double b3 = myeds / mbrd;
        map.put("iw", iw);
        map.put("it", it);
        map.put("s", s);
        map.put("ccr", ccr);
        map.put("mcr", mcr);
        map.put("klt", klt);
        map.put("qlt1", qlt1);
        map.put("qlt2", qlt2);
        map.put("qlt", qlt);
        map.put("xlt", xlt);
        map.put("mbrd", mbrd);
        map.put("a3", a3);
        map.put("b3", b3);

        Double k1 = 6.93 * gdh * sqrt(gdss / 210000) / 3.14 / gdtw;
        Double q1 = 0.5 * (1 + 0.49 * (k1 - 0.2) + k1 * k1);
        Double xs1 = 1 / (q1 + sqrt(q1 * q1 - k1 * k1));
        Double bef1 = bef1x + bef1c + gdtfx * sqrt(gdb / gdtw);
        Double nwrd = xs1 * gdss * bef1 * gdtw;
        Double a4 = rzed / nwrd;
        Double b4 = rzed / nwrd;
        map.put("k1", k1);
        map.put("q1", q1);
        map.put("xs1", xs1);
        map.put("bef1", bef1);
        map.put("nwrd", nwrd);
        map.put("a4", a4);
        map.put("b4", b4);

        Double sx1ed = myed * gdz / gdiy;
        Double sx1eds = myeds * gdz / gdiy;
        Double d = 0.5 * 50 + gdhy;
        Double szed = fzed / 2 / gdtw / d;
        Double tled = szed * 0.2;
        Double a5 = Math.pow(sx1ed / gdss, 2) + Math.pow(szed / gdss, 2) - sx1ed * szed / gdss / gdss + 3 * Math.pow((ted + tled) / gdss, 2);
        Double b5 = pow(sx1eds / gdss, 2) + pow(szed / gdss, 2) - sx1eds * szed / gdss / gdss + 3 * pow((ted + tled) / gdss, 2);
        map.put("sx1ed", sx1ed);
        map.put("sx1eds", sx1eds);
        map.put("d", d);
        map.put("szed", szed);
        map.put("tled", tled);
        map.put("a5", a5);
        map.put("b5", b5);

        Double fzrd = 0.125 * gdtw * gdtw * sqrt(210000 * gdss) * sqrt(gdhy / gdtw);
        Double a6 = fzed / fzrd;
        Double b6 = fzed / fzrd;
        map.put("fzrd", fzrd);
        map.put("a6", a6);
        map.put("b6", b6);

        Double bef2d = 0 + 0.5 * gdh + bjb;
        Double bef2z = gdh;
        Double bef2;
        if (bef2d<bef2z) {
            bef2 = bef2d;
        } else {
            bef2 = bef2z;
        }
        Double ncrd = gdss * bef2 * gdtw;
        Double k2 = 3.46 * gdh * sqrt(gdss / 210000) / 3.14 / gdtw;
        Double q2 = 0.5 * (1 + 0.49 * (k2 - 0.2) + k2 * k2);
        Double xs2 = 1 / (q2 + sqrt(q2 * q2 - k2 * k2));
        Double a7 = fzed / xs2 / ncrd;
        Double b7 = fzed / xs2 / ncrd;
        map.put("bef2d", bef2d);
        map.put("bef2z", bef2z);
        map.put("bef2", bef2);
        map.put("ncrd", ncrd);
        map.put("k2", k2);
        map.put("q2", q2);
        map.put("xs2", xs2);
        map.put("a7", a7);
        map.put("b7", b7);

        Double fz1rd = gdss * bef1 * gdtw;
        Double a8 = rzed / fz1rd;
        Double b8 = rzed / fz1rd;
        map.put("fz1rd", fz1rd);
        map.put("a8", a8);
        map.put("b8", b8);

        Double fz2rd = 0.125 * gdtw * gdtw * sqrt(210000 * gdss) * (sqrt(gdtfx / gdtw) + 3 * gdtw * bef1c / gdtfx / gdhw);
        Double a9 = rzed / fz2rd;
        Double b9 = rzed / fz2rd;
        map.put("fz2rd", fz2rd);
        map.put("a9", a9);
        map.put("b9", b9);

        Double bef3 = bef1x + 0.5 * (bef1c + sqrt(gdh * gdh + bef1c * bef1c));
        Double nc1rd = gdss * bef3 * gdtw;
        Double a10 = fzed / xs2 / nc1rd;
        Double b10 = fzed / xs2 / nc1rd;
        map.put("bef3", bef3);
        map.put("nc1rd", nc1rd);
        map.put("a10", a10);
        map.put("b10", b10);

        Double shz = sqrt(0.35 * 210000 * fze / dcw / bcw);
        Double a11 = shz / gdshzr;
        Double b11 = shz / gdshzr;
        map.put("shz", shz);
        map.put("a11", a11);
        map.put("b11", b11);

        Double fz = vzed * lkj * lkj * lkj / 48 / 210000 / gdiy;
        Double fzs = 0.015 * vzed * lkj * lkj * lkj / 210000 / gdiy;
        Double fy = vyed * lkj * lkj * lkj / 48 / 210000 / gdiz;
        Double fys = 0.015 * vyed * lkj * lkj * lkj / 210000 / gdiz;
        map.put("fz", fz);
        map.put("fy", fy);
        map.put("fzs", fzs);
        map.put("fys", fys);

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
    private String takeEnStringByCompareNumber(Double a, Double b) {
        if (a > b) {
            return "doesn't meet";
        } else {
            return "meets";
        }
    }
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
        Double b1 = doubleMap.get("b1");
        Double a2 = doubleMap.get("a2");
        Double b2 = doubleMap.get("b2");
        String u1 = takeSignByCompareNumber(a1, 0.6);
        String v1 = takeSignByCompareNumber(b1, 0.6);
        String u2 = takeSignByCompareNumber(a2, 1.0);
        String v2 = takeSignByCompareNumber(b2, 1.0);
        String u3 = takeStringByCompareNumber(a2, 1.0);
        String v3 = takeStringByCompareNumber(b2, 1.0);
        map.put("u1", CommonFunc.convertDoubleToString(u1));
        map.put("v1", CommonFunc.convertDoubleToString(v1));
        map.put("u2", CommonFunc.convertDoubleToString(u2));
        map.put("v2", CommonFunc.convertDoubleToString(v2));
        map.put("u3", CommonFunc.convertDoubleToString(u3));
        map.put("v3", CommonFunc.convertDoubleToString(v3));

        Double a3 = doubleMap.get("a3");
        Double b3 = doubleMap.get("b3");
        String u4 = takeSignByCompareNumber(a3, 1.0);
        String v4 = takeSignByCompareNumber(b3, 1.0);
        String u5 = takeStringByCompareNumber(a3, 1.0);
        String v5 = takeStringByCompareNumber(b3, 1.0);
        map.put("u4", CommonFunc.convertDoubleToString(u4));
        map.put("v4", CommonFunc.convertDoubleToString(v4));
        map.put("u5", CommonFunc.convertDoubleToString(u5));
        map.put("v5", CommonFunc.convertDoubleToString(v5));

        Double a4 = doubleMap.get("a4");
        String u6 = takeSignByCompareNumber(a4, 1.0);
        String u7 = takeStringByCompareNumber(a4, 1.0);
        map.put("u6", CommonFunc.convertDoubleToString(u6));
        map.put("u7", CommonFunc.convertDoubleToString(u7));
        Double b4 = doubleMap.get("b4");
        String v6 = takeSignByCompareNumber(b4, 1.0);
        String v7 = takeStringByCompareNumber(b4, 1.0);
        map.put("v6", CommonFunc.convertDoubleToString(v6));
        map.put("v7", CommonFunc.convertDoubleToString(v7));

        Double a5 = doubleMap.get("a5");
        String u8 = takeSignByCompareNumber(a5, 1.0);
        String u9 = takeStringByCompareNumber(a5, 1.0);
        map.put("u8", CommonFunc.convertDoubleToString(u8));
        map.put("u9", CommonFunc.convertDoubleToString(u9));
        Double b5 = doubleMap.get("b5");
        String v8 = takeSignByCompareNumber(b5, 1.0);
        String v9 = takeStringByCompareNumber(b5, 1.0);
        map.put("v8", CommonFunc.convertDoubleToString(v8));
        map.put("v9", CommonFunc.convertDoubleToString(v9));

        Double a6 = doubleMap.get("a6");
        String u10 = takeSignByCompareNumber(a6, 1.0);
        String u11 = takeStringByCompareNumber(a6, 1.0);
        map.put("u10", CommonFunc.convertDoubleToString(u10));
        map.put("u11", CommonFunc.convertDoubleToString(u11));
        Double b6 = doubleMap.get("b6");
        String v10 = takeSignByCompareNumber(b6, 1.0);
        String v11 = takeStringByCompareNumber(b6, 1.0);
        map.put("v10", CommonFunc.convertDoubleToString(v10));
        map.put("v11", CommonFunc.convertDoubleToString(v11));

        Double a7 = doubleMap.get("a7");
        String u12 = takeSignByCompareNumber(a7, 1.0);
        String u13 = takeStringByCompareNumber(a7, 1.0);
        map.put("u12", CommonFunc.convertDoubleToString(u12));
        map.put("u13", CommonFunc.convertDoubleToString(u13));
        Double b7 = doubleMap.get("a7");
        String v12 = takeSignByCompareNumber(b7, 1.0);
        String v13 = takeStringByCompareNumber(b7, 1.0);
        map.put("v12", CommonFunc.convertDoubleToString(v12));
        map.put("v13", CommonFunc.convertDoubleToString(v13));


        Double a8 = doubleMap.get("a8");
        String u14 = takeSignByCompareNumber(a8, 1.0);
        String u15 = takeStringByCompareNumber(a8, 1.0);
        map.put("u14", CommonFunc.convertDoubleToString(u14));
        map.put("u15", CommonFunc.convertDoubleToString(u15));
        Double b8 = doubleMap.get("b8");
        String v14 = takeSignByCompareNumber(b8, 1.0);
        String v15 = takeStringByCompareNumber(b8, 1.0);
        map.put("v14", CommonFunc.convertDoubleToString(v14));
        map.put("v15", CommonFunc.convertDoubleToString(v15));

        Double a9 = doubleMap.get("a9");
        String u16 = takeSignByCompareNumber(a9, 1.0);
        String u17 = takeStringByCompareNumber(a9, 1.0);
        map.put("u16", CommonFunc.convertDoubleToString(u16));
        map.put("u17", CommonFunc.convertDoubleToString(u17));
        Double b9 = doubleMap.get("b9");
        String v16 = takeSignByCompareNumber(b9, 1.0);
        String v17 = takeStringByCompareNumber(b9, 1.0);
        map.put("v16", CommonFunc.convertDoubleToString(v16));
        map.put("v17", CommonFunc.convertDoubleToString(v17));


        Double a10 = doubleMap.get("a10");
        String u18 = takeSignByCompareNumber(a10, 1.0);
        String u19 = takeStringByCompareNumber(a10, 1.0);
        map.put("u18", CommonFunc.convertDoubleToString(u18));
        map.put("u19", CommonFunc.convertDoubleToString(u19));
        Double b10 = doubleMap.get("b10");
        String v18 = takeSignByCompareNumber(b10, 1.0);
        String v19 = takeStringByCompareNumber(b10, 1.0);
        map.put("v18", CommonFunc.convertDoubleToString(v18));
        map.put("v19", CommonFunc.convertDoubleToString(v19));

        Double a11 = doubleMap.get("a11");
        String u20 = takeSignByCompareNumber(a11, 1.0);
        String u21 = takeStringByCompareNumber(a11, 1.0);
        map.put("u20", CommonFunc.convertDoubleToString(u20));
        map.put("u21", CommonFunc.convertDoubleToString(u21));
        Double b11 = doubleMap.get("b11");
        String v20 = takeSignByCompareNumber(b11, 1.0);
        String v21 = takeStringByCompareNumber(b11, 1.0);
        map.put("v20", CommonFunc.convertDoubleToString(v20));
        map.put("v21", CommonFunc.convertDoubleToString(v21));

        Double fz = doubleMap.get("fz");
        Double fy = doubleMap.get("fy");
        String u22 = takeSignByCompareNumber(fz, lkj / 200);
        String u23 = takeSignByCompareNumber(fz, 30.0);
        String u24 = takeSignByCompareNumber(fy, lkj / 200);
        String u25 = takeSignByCompareNumber(fy, 30.0);
        String u26 = (fz > lkj / 200 || fz > 30.0 || fy > lkj / 200 || fy > 30.0) ? "不满足" : "满足";
        map.put("u22", CommonFunc.convertDoubleToString(u22));
        map.put("u23", CommonFunc.convertDoubleToString(u23));
        map.put("u24", CommonFunc.convertDoubleToString(u24));
        map.put("u25", CommonFunc.convertDoubleToString(u25));
        map.put("u26", CommonFunc.convertDoubleToString(u26));
        Double fzs = doubleMap.get("fzs");
        Double fys = doubleMap.get("fys");
        String v22 = takeSignByCompareNumber(fzs, lkj / 200);
        String v23 = takeSignByCompareNumber(fzs, 30.0);
        String v24 = takeSignByCompareNumber(fys, lkj / 200);
        String v25 = takeSignByCompareNumber(fys, 30.0);
        String v26 = (fzs > lkj / 200 || fzs > 30.0 || fys > lkj / 200 || fys > 30.0) ? "不满足" : "满足";
        map.put("v22", CommonFunc.convertDoubleToString(v22));
        map.put("v23", CommonFunc.convertDoubleToString(v23));
        map.put("v24", CommonFunc.convertDoubleToString(v24));
        map.put("v25", CommonFunc.convertDoubleToString(v25));
        map.put("v26", CommonFunc.convertDoubleToString(v26));
        String uu3 =  takeEnStringByCompareNumber(a2, 1.0);
        String uu5 =  takeEnStringByCompareNumber(a3, 1.0);
        String uu7 =  takeEnStringByCompareNumber(a4, 1.0);
        String uu9 =  takeEnStringByCompareNumber(a5, 1.0);
        String uu11 = takeEnStringByCompareNumber(a6, 1.0);
        String uu13 = takeEnStringByCompareNumber(a7, 1.0);
        String uu15 = takeEnStringByCompareNumber(a8, 1.0);
        String uu17 = takeEnStringByCompareNumber(a9, 1.0);
        String uu19 = takeEnStringByCompareNumber(a10, 1.0);
        String uu21 = takeEnStringByCompareNumber(a11, 1.0);
        String uu26 = (fz > lkj / 200 || fz > 30.0 || fy > lkj / 200 || fy > 30.0) ? "doesn't meet" : "meets";

        map.put("uu3" ,uu3 );
        map.put("uu5" ,uu5 );
        map.put("uu7" ,uu7 );
        map.put("uu9" ,uu9 );
        map.put("uu11",uu11);
        map.put("uu13",uu13);
        map.put("uu15",uu15);
        map.put("uu17",uu17);
        map.put("uu19",uu19);
        map.put("uu21",uu21);
        map.put("uu26",uu26);

        String vv3 =  takeEnStringByCompareNumber(b2, 1.0);
        String vv5 =  takeEnStringByCompareNumber(b3, 1.0);
        String vv7 =  takeEnStringByCompareNumber(b4, 1.0);
        String vv9 =  takeEnStringByCompareNumber(b5, 1.0);
        String vv11 = takeEnStringByCompareNumber(b6, 1.0);
        String vv13 = takeEnStringByCompareNumber(b7, 1.0);
        String vv15 = takeEnStringByCompareNumber(b8, 1.0);
        String vv17 = takeEnStringByCompareNumber(b9, 1.0);
        String vv19 = takeEnStringByCompareNumber(b10, 1.0);
        String vv21 = takeEnStringByCompareNumber(b11, 1.0);
        String vv26 = (fzs > lkj / 200 || fzs > 30.0 || fys > lkj / 200 || fys > 30.0) ? "doesn't meet" : "meets";

        map.put("vv3" ,vv3 );
        map.put("vv5" ,vv5 );
        map.put("vv7" ,vv7 );
        map.put("vv9" ,vv9 );
        map.put("vv11",vv11);
        map.put("vv13",vv13);
        map.put("vv15",vv15);
        map.put("vv17",vv17);
        map.put("vv19",vv19);
        map.put("vv21",vv21);
        map.put("vv26",vv26);

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
