package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class TensileEnity {
    @Getter
    @Setter
    private String no;
    @Getter
    @Setter
    private String ver;
    @Getter
    @Setter
    private String xmmc;
    @Getter
    @Setter
    private String zjxh;
    @Getter
    @Setter
    private String jsr;
    @Getter
    @Setter
    private String shr;
    @Getter
    @Setter
    private String pzr;
    @Getter
    @Setter
    private String date;
    @Getter
    @Setter
    private Double mjkn;
    @Getter
    @Setter
    private Double mjkv;
    @Getter
    @Setter
    private Double mjkjl;
    @Getter
    @Setter
    private Double mjkm;
    @Getter
    @Setter
    private Double mjz;
    @Getter
    @Setter
    private String mjmjph;
    @Getter
    @Setter
    private Double mjmjfy;
    @Getter
    @Setter
    private Double mjd;
    @Getter
    @Setter
    private Double mjt;
    @Getter
    @Setter
    private Double mjcd;
    @Getter
    @Setter
    private Double mjkd;
    @Getter
    @Setter
    private Double mjmj;
    @Getter
    @Setter
    private Double mja;
    @Getter
    @Setter
    private Double mjb;
    @Getter
    @Setter
    private Double mjb1;
    @Getter
    @Setter
    private Double mjc;
    @Getter
    @Setter
    private Double mjc1;
    @Getter
    @Setter
    private Double mjl;
    @Getter
    @Setter
    private String mjhdj;
    @Getter
    @Setter
    private Double mjfc;
    @Getter
    @Setter
    private Double mjft;
    @Getter
    @Setter
    private Double mjr;
    @Getter
    @Setter
    private Double mjar;
    @Getter
    @Setter
    private Double mjns;
    @Getter
    @Setter
    private Double mjas;
    @Getter
    @Setter
    private String mjlx;
    @Getter
    @Setter
    private Double mjaw;
    @Getter
    @Setter
    private String ConcreteStrength;
    @Getter
    @Setter
    private String TypeOfAnchorBars;
    @Getter
    @Setter
    private String mjphxzModel;



    private Double mjn;
    private Double mjv;
    private Double mjjl;
    private Double mjm;

    public Map<String, String> takePDFMap() {
        mjn = 1000 * mjkn;
        mjv = 1000 * mjkv;
        mjjl = 1000 * mjkjl;
        mjm = mjjl * mjv;
        Map<String, String> result = new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));
        result.put("mjkn", CommonFunc.convertDoubleToString(mjkn));
        result.put("mjn", CommonFunc.convertDoubleToString(mjn));
        result.put("mjkv", CommonFunc.convertDoubleToString(mjkv));
        result.put("mjv", CommonFunc.convertDoubleToString(mjv));
        result.put("mjkjl", CommonFunc.convertDoubleToString(mjkjl));
        result.put("mjjl", CommonFunc.convertDoubleToString(mjjl));
        result.put("mjkm", CommonFunc.convertDoubleToString(mjkm));
        result.put("mjm", CommonFunc.convertDoubleToString(mjm));
        result.put("mjmjph", CommonFunc.convertDoubleToString(mjmjph));
        result.put("mjmjfy", CommonFunc.convertDoubleToString(mjmjfy));
        result.put("mjz", CommonFunc.convertDoubleToString(mjz));
        result.put("mjd", CommonFunc.convertDoubleToString(mjd));
        result.put("mjt", CommonFunc.convertDoubleToString(mjt));
        result.put("mjcd", CommonFunc.convertDoubleToString(mjcd));
        result.put("mjkd", CommonFunc.convertDoubleToString(mjkd));
        result.put("mjmj", CommonFunc.convertDoubleToString(mjmj));
        result.put("mja", CommonFunc.convertDoubleToString(mja));
        result.put("mjb", CommonFunc.convertDoubleToString(mjb));
        result.put("mjb1", CommonFunc.convertDoubleToString(mjb1));
        result.put("mjc", CommonFunc.convertDoubleToString(mjc));
        result.put("mjc1", CommonFunc.convertDoubleToString(mjc1));
        result.put("mjl", CommonFunc.convertDoubleToString(mjl));
        result.put("mjhdj", CommonFunc.convertDoubleToString(mjhdj));
        result.put("mjfc", CommonFunc.convertDoubleToString(mjfc));
        result.put("mjft", CommonFunc.convertDoubleToString(mjft));
        result.put("mjr", CommonFunc.convertDoubleToString(mjr));
        result.put("mjar", CommonFunc.convertDoubleToString(mjar));
        result.put("mjns", CommonFunc.convertDoubleToString(mjns));
        result.put("mjas", CommonFunc.convertDoubleToString(mjas));
        result.put("mjlx", CommonFunc.convertDoubleToString(mjlx));
        result.put("mjaw", CommonFunc.convertDoubleToString(mjaw));
        takeStringMapForPDF().forEach((key, val) -> {
            result.put(key, CommonFunc.convertDoubleToString(val));
        });
        return result;
    }

    private Map<String, Double> takeDoublePDF() {
        Double klmj2d = 2 * mjd;
        Double klmj3d = 3 * mjd;
        Double klmj6d = 6 * mjd;
        Double _05fca = 0.5 * mjfc * mjmj;
        Double klmjav = (4 - 0.08 * mjd) * sqrt(mjfc / mjmjfy);
        Double klmjab = 0.6 + 0.25 * mjt / mjd;
        Double klmjas1 = (mjv / (mjar * klmjav * mjmjfy)) + (mjn / (0.8 * klmjab * mjmjfy)) + (mjm / (1.3 * mjar * klmjab * mjmjfy * mjz));
        Double klmjas2 = (mjn / (0.8 * klmjab * mjmjfy)) + (mjm / (0.4 * mjar * klmjab * mjmjfy * mjz));
        Double klmjlab = mjaw * mjmjfy / mjft * mjd;
        Double klmjla = 0.6 * klmjlab;
        Map<String, Double> result = new HashMap<>();
        result.put("klmj2d", klmj2d);
        result.put("klmj3d", klmj3d);
        result.put("klmj6d", klmj6d);
        result.put("05fca", _05fca);
        result.put("klmjav", klmjav);
        result.put("klmjab", klmjab);
        result.put("klmjas1", klmjas1);
        result.put("klmjas2", klmjas2);
        result.put("klmjlab", klmjlab);
        result.put("klmjla", klmjla);
        return result;
    }

    private String takeSign(double a, double b) {
        return a < b ? "<" : a > b ? ">" : "=";
    }

    private String takeString(boolean a) {
        return a ? "满足" : "不满足";
    }

    private Map<String, String> takeStringMapForPDF() {
        Map<String, Double> doubleMap = takeDoublePDF();
        Double klmj2d = doubleMap.get("klmj2d");
        Double klmj3d = doubleMap.get("klmj3d");
        Double klmj6d = doubleMap.get("klmj6d");
        Double _05fca = doubleMap.get("05fca");
        Double klmjas1 = doubleMap.get("klmjas1");
        Double klmjas2 = doubleMap.get("klmjas2");
        String klmjp1 = takeSign(mja, klmj2d);
        String klmjp2 = takeSign(mja, 20);
        String klmjm1 = takeString(mja >= klmj2d && mja >= 20);
        String klmjp3 = takeSign(mjb, klmj3d);
        String klmjp4 = takeSign(45, mjb);
        String klmjp5 = takeSign(mjb, 300);
        String klmjm2 = takeString(mjb >= klmj3d && 45 <= mjb && mjb <= 300);
        String klmjp6 = takeSign(mjb1, klmj6d);
        String klmjp7 = takeSign(70, mjb1);
        String klmjp8 = takeSign(mjb1, 300);
        String klmjm3 = takeString(mjb1 >= klmj6d && 40 <= mjb1 && mjb1 <= 300);
        String klmjm4 = takeString((mjb1 >= klmj6d && 40 <= mjb1 && mjb1 <= 300) && (mjb >= klmj3d && 45 <= mjb && mjb <= 300));
        String klmjp9 = takeSign(mjc, klmj3d);
        String klmjp10 = takeSign(mjc, 45);
        String klmjm5 = takeString(mjc >= klmj3d && mjc >= 45);
        String klmjp11 = takeSign(mjc1, klmj3d);
        String klmjp12 = takeSign(mjc1, 45);
        String klmjm6 = takeString(mjc1 >= klmj3d && mjc1 >= 45);
        String klmjm7 = takeString((mjc >= klmj3d && mjc >= 45) && (mjc1 >= klmj3d && mjc1 >= 45));
        String klmjp13 = takeSign(mjn, _05fca);
        String klmjm8 = takeString(mjn <= _05fca);
        String klmjp14 = takeSign(mjas, klmjas1);
        String klmjp15 = takeSign(mjas, klmjas2);
        String klmjm9 = takeString(mjas >= klmjas1 && mjas >= klmjas2);

        Double klmjla = doubleMap.get("klmjla");
        String klmjp16 = takeSign(mjl, klmjla);
        String klmjp17 = takeSign(mjl, 120);
        String klmjm10 = takeString(mjl >= 120 && mjl >= klmjla);


        Map<String, String> result = new HashMap<>();
        result.put("klmjp1", CommonFunc.convertDoubleToString(klmjp1));
        result.put("klmjp2", CommonFunc.convertDoubleToString(klmjp2));
        result.put("klmjm1", CommonFunc.convertDoubleToString(klmjm1));
        result.put("klmjp3", CommonFunc.convertDoubleToString(klmjp3));
        result.put("klmjp4", CommonFunc.convertDoubleToString(klmjp4));
        result.put("klmjp5", CommonFunc.convertDoubleToString(klmjp5));
        result.put("klmjm2", CommonFunc.convertDoubleToString(klmjm2));
        result.put("klmjp6", CommonFunc.convertDoubleToString(klmjp6));
        result.put("klmjp7", CommonFunc.convertDoubleToString(klmjp7));
        result.put("klmjp8", CommonFunc.convertDoubleToString(klmjp8));
        result.put("klmjm3", CommonFunc.convertDoubleToString(klmjm3));
        result.put("klmjm4", CommonFunc.convertDoubleToString(klmjm4));
        result.put("klmjp9", CommonFunc.convertDoubleToString(klmjp9));
        result.put("klmjp10", CommonFunc.convertDoubleToString(klmjp10));
        result.put("klmjm5", CommonFunc.convertDoubleToString(klmjm5));
        result.put("klmjp11", CommonFunc.convertDoubleToString(klmjp11));
        result.put("klmjp12", CommonFunc.convertDoubleToString(klmjp12));
        result.put("klmjm6", CommonFunc.convertDoubleToString(klmjm6));
        result.put("klmjm7", CommonFunc.convertDoubleToString(klmjm7));

        result.put("klmjp13", CommonFunc.convertDoubleToString(klmjp13));
        result.put("klmjm8", CommonFunc.convertDoubleToString(klmjm8));
        result.put("klmjas1", CommonFunc.convertDoubleToString(klmjas1));
        result.put("klmjas2", CommonFunc.convertDoubleToString(klmjas2));
        result.put("klmjp14", CommonFunc.convertDoubleToString(klmjp14));
        result.put("klmjp15", CommonFunc.convertDoubleToString(klmjp15));
        result.put("klmjm9", CommonFunc.convertDoubleToString(klmjm9));
        result.put("klmjp16", CommonFunc.convertDoubleToString(klmjp16));
        result.put("klmjp17", CommonFunc.convertDoubleToString(klmjp17));
        result.put("klmjm10", CommonFunc.convertDoubleToString(klmjm10));

        doubleMap.forEach((key, val) -> {
            result.put(key, CommonFunc.convertDoubleToString(val));
        });
        return result;
    }

    public Map<String, String> checkCN() {
        Map<String, String> map = takePDFMap();
        Map<String, String> result = new HashMap<>();


        result.put("sja", CommonFunc.convertDoubleToString(mja));
        result.put("sjb", CommonFunc.convertDoubleToString(mjb));
        result.put("sjb1", CommonFunc.convertDoubleToString(mjb1));
        result.put("sjc", CommonFunc.convertDoubleToString(mjc));
        result.put("sjc1", CommonFunc.convertDoubleToString(mjc1));
        result.put("sjas", CommonFunc.convertDoubleToString(mjas));
        result.put("sjl", CommonFunc.convertDoubleToString(mjl));
        result.put("mjmj", CommonFunc.convertDoubleToString(mjn));

        String klmj2d = map.get("klmj2d");
        String klmj3d = map.get("klmj3d");
        String klmj6d = map.get("klmj6d");
        String klmjas1 = map.get("klmjas1");
        String klmjas2 = map.get("klmjas2");
        String klmjla = map.get("klmjla");
        String _05fca = map.get("05fca");

        result.put("klmjm1", map.get("klmjm1"));
        result.put("klmjm2", map.get("klmjm2"));
        result.put("klmjm3", map.get("klmjm3"));
        result.put("klmjm5", map.get("klmjm5"));
        result.put("klmjm6", map.get("klmjm6"));
        result.put("klmjm9", map.get("klmjm9"));
        result.put("klmjm10", map.get("klmjm10"));
        result.put("klmjm8", map.get("klmjm8"));

        result.put("jya", "a" + "≥" + klmj2d +
                "<br/><br/>" + "a" + "≥ 20");
        result.put("jyb", "b" + "≥" + klmj3d +
                "<br/><br/>" + "45 ≤" + "b" + " ≤ 300");
        result.put("jyb1", "b1" + " ≥" + klmj6d +
                "<br/><br/>" + "70 ≤" + "b1" + " ≤ 300");
        result.put("jyc", "c" + " ≥" + klmj3d +
                "<br/><br/>" + "c" + " ≥ 45");
        result.put("jyc1", "c1" + " ≥" + klmj3d +
                "<br/><br/>" + "c1" + " ≥ 45");
        result.put("jyas", "As" + " ≥" + klmjas1 +
                "<br/><br/>" + "As" + " ≥" + klmjas2);
        result.put("jyl", "l" + " ≥" + klmjla +
                "<br/><br/>" + "l" + " ≥" + "120");
        result.put("jyn", "N" + " ≤ 0.5f<sub>c</sub>A" +
                "<br/><br/>" + " =" + _05fca);

        return result;
    }

    public Map<String, String> takeCheckMapForCheck() {
        Map<String, String> map = new HashMap<>();
        Double s = mjn / 135;
        Double dj = 2 * sqrt(s / 3.14) / mjns;
        String bj = takeSign(dj, mjd);
        String man = takeString(dj <= mjd);
        map.put("mjd", CommonFunc.convertDoubleToString(mjd));
        map.put("mjn", CommonFunc.convertDoubleToString(mjn));
        map.put("mjns", CommonFunc.convertDoubleToString(mjns));
        map.put("s", CommonFunc.convertDoubleToString(s));
        map.put("dj", CommonFunc.convertDoubleToString(dj));
        map.put("bj", CommonFunc.convertDoubleToString(bj));
        map.put("man", CommonFunc.convertDoubleToString(man));
        return map;
    }
}
