package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

public class ResistantEnity {
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
    private Double mjky;
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
    private Double mjd;
    @Getter
    @Setter
    private Double mjt;
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
    private String ConcreteStrength;

    private Double mjy;
    private Double mjv;
    private Double mjjl;
    private Double mjm;

    private Double kymj2d;
    private String kymjp1;
    private String kymjp2;
    private String kymjm1;
    private Double kymj3d;
    private Double kymj6d;
    private String kymjp3;
    private String kymjp4;
    private String kymjp5;
    private String kymjm2;
    private String kymjp6;
    private String kymjp7;
    private String kymjp8;
    private String kymjm3;
    private String kymjm4;
    private String kymjp9;
    private String kymjp10;
    private String kymjm5;
    private String kymjp11;
    private String kymjp12;
    private String kymjm6;
    private String kymjm7;

    private Double kymjav;
    private Double kymjab;
    private Double _04nz;
    private String kymjp13;
    private Double kymjmq;
    private Double _05fca;
    private String kymjp14;
    private String kymjm8;
    private Double kymjas1;
    private Double kymjas2;
    private String kymjp15;
    private String kymjp16;
    private String kymjm9;

    private Double kymj15d;
    private String kymjp17;
    private String kymjm10;

    private Double mjn;
    private Double s;
    private Double dj;
    private String bj;
    private String man;

    public void calculateFun() {
        mjy = 1000 * mjky;
        mjv = 1000 * mjkv;
        mjjl = 1000 * mjkjl;
        mjm = mjjl * mjv;
        kymj2d = 2 * mjd;
        kymjp1 = takeSign(mja, kymj2d);
        kymjp2 = takeSign(mja, 20);
        kymjm1 = takeString(mja >= kymj2d && mja >= 20);
        kymj3d = 3 * mjd;
        kymj6d = 6 * mjd;
        kymjp3 = takeSign(mjb, kymj3d);
        kymjp4 = takeSign(45, mjb);
        kymjp5 = takeSign(mjb, 300);
        kymjm2 = takeString(mjb >= kymj3d && 45 <= mjb && mjb <= 300);
        kymjp6 = takeSign(mjb1, kymj6d);
        kymjp7 = takeSign(70, mjb1);
        kymjp8 = takeSign(mjb1, 300);
        kymjm3 = takeString(mjb1 >= kymj6d && 40 <= mjb1 && mjb1 <= 300);
        kymjm4 = takeString((mjb1 >= kymj6d && 40 <= mjb1 && mjb1 <= 300) && (mjb >= kymj3d && 45 <= mjb && mjb <= 300));
        kymjp9 = takeSign(mjc, kymj3d);
        kymjp10 = takeSign(mjc, 45);
        kymjm5 = takeString(mjc >= kymj3d && mjc >= 45);
        kymjp11 = takeSign(mjc1, kymj3d);
        kymjp12 = takeSign(mjc1, 45);
        kymjm6 = takeString(mjc1 >= kymj3d && mjc1 >= 45);
        kymjm7 = takeString((mjc1 >= kymj3d && mjc1 >= 45) && (mjc >= kymj3d && mjc >= 45));

        Double temp = (4 - 0.08 * mjd) * sqrt(mjfc / 270);
        kymjav = temp > 0.7 ? temp : 0.7;
        kymjab = 0.6 + 0.25 * mjt / mjd;
        _04nz = 0.4 * mjy * mjz;
        kymjp13 = takeSign(abs(mjm), abs(_04nz));
        kymjmq = abs(mjm) <= abs(_04nz) ? abs(_04nz) : abs(mjm);
        _05fca = 0.5 * mjfc * mjmj;
        kymjp14 = takeSign(abs(mjy), _05fca);
        kymjm8 = takeString(abs(mjy) >= _05fca);
        temp = mjm - _04nz;
        kymjas1 = temp > 0 ? ((mjv - 0.3 * mjy) / (mjar * kymjav * 270)) + ((kymjmq - _04nz) / (1.3 * mjar * kymjab * 270 * mjz)) : 0;
        kymjas2 = temp > 0 ? ((mjm - _04nz) / (0.4 * mjar * kymjab * 270 * mjz)) : 0;
        kymjp15 = takeSign(mjas, kymjas1);
        kymjp16 = takeSign(mjas, kymjas2);
        kymjm9 = takeString(mjas >= kymjas1 && mjas >= kymjas2);

        kymj15d = 15 * mjd;
        kymjp17 = takeSign(mjl, kymj15d);
        kymjm10 = takeString(mjl >= kymj15d);

        mjn = mjy;
        s = mjn / 172.8;
        dj = 2 * sqrt(s / 3.14);
        bj = takeSign(dj, mjd);
        man = takeString(dj >= mjd);

    }

    public Map<String, String> takePDF() {
        Map<String, String> result = new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));

        result.put("mjky", CommonFunc.convertDoubleToString(mjky));
        result.put("mjy", CommonFunc.convertDoubleToString(mjy));
        result.put("mjkv", CommonFunc.convertDoubleToString(mjkv));
        result.put("mjv", CommonFunc.convertDoubleToString(mjv));
        result.put("mjkjl", CommonFunc.convertDoubleToString(mjkjl));
        result.put("mjjl", CommonFunc.convertDoubleToString(mjjl));
        result.put("mjkm", CommonFunc.convertDoubleToString(mjkm));
        result.put("mjm", CommonFunc.convertDoubleToString(mjm));
        result.put("mjz", CommonFunc.convertDoubleToString(mjz));
        result.put("mjd", CommonFunc.convertDoubleToString(mjd));
        result.put("mjt", CommonFunc.convertDoubleToString(mjt));
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

        result.put("kymj2d", CommonFunc.convertDoubleToString(kymj2d));
        result.put("kymjp1", CommonFunc.convertDoubleToString(kymjp1));
        result.put("kymjp2", CommonFunc.convertDoubleToString(kymjp2));
        result.put("kymjm1", CommonFunc.convertDoubleToString(kymjm1));
        result.put("kymj3d", CommonFunc.convertDoubleToString(kymj3d));
        result.put("kymj6d", CommonFunc.convertDoubleToString(kymj6d));
        result.put("kymjp3", CommonFunc.convertDoubleToString(kymjp3));
        result.put("kymjp4", CommonFunc.convertDoubleToString(kymjp4));
        result.put("kymjp5", CommonFunc.convertDoubleToString(kymjp5));
        result.put("kymjm2", CommonFunc.convertDoubleToString(kymjm2));
        result.put("kymjp6", CommonFunc.convertDoubleToString(kymjp6));
        result.put("kymjp7", CommonFunc.convertDoubleToString(kymjp7));
        result.put("kymjp8", CommonFunc.convertDoubleToString(kymjp8));
        result.put("kymjm3", CommonFunc.convertDoubleToString(kymjm3));
        result.put("kymjm4", CommonFunc.convertDoubleToString(kymjm4));
        result.put("kymjp9", CommonFunc.convertDoubleToString(kymjp9));
        result.put("kymjp10", CommonFunc.convertDoubleToString(kymjp10));
        result.put("kymjm5", CommonFunc.convertDoubleToString(kymjm5));
        result.put("kymjp11", CommonFunc.convertDoubleToString(kymjp11));
        result.put("kymjp12", CommonFunc.convertDoubleToString(kymjp12));
        result.put("kymjm6", CommonFunc.convertDoubleToString(kymjm6));
        result.put("kymjm7", CommonFunc.convertDoubleToString(kymjm7));

        result.put("kymjav", CommonFunc.convertDoubleToString(kymjav));
        result.put("kymjab", CommonFunc.convertDoubleToString(kymjab));
        result.put("04nz", CommonFunc.convertDoubleToString(_04nz));
        result.put("kymjp13", CommonFunc.convertDoubleToString(kymjp13));
        result.put("kymjmq", CommonFunc.convertDoubleToString(kymjmq));
        result.put("05fca", CommonFunc.convertDoubleToString(_05fca));
        result.put("kymjp14", CommonFunc.convertDoubleToString(kymjp14));
        result.put("kymjm8", CommonFunc.convertDoubleToString(kymjm8));
        result.put("kymjas", CommonFunc.convertDoubleToString(mjas));
        result.put("kymjas1", CommonFunc.convertDoubleToString(kymjas1));
        result.put("kymjas2", CommonFunc.convertDoubleToString(kymjas2));
        result.put("kymjp15", CommonFunc.convertDoubleToString(kymjp15));
        result.put("kymjp16", CommonFunc.convertDoubleToString(kymjp16));
        result.put("kymjm9", CommonFunc.convertDoubleToString(kymjm9));

        result.put("kymj15d", CommonFunc.convertDoubleToString(kymj15d));
        result.put("kymjp17", CommonFunc.convertDoubleToString(kymjp17));
        result.put("kymjm10", CommonFunc.convertDoubleToString(kymjm10));
        return result;
    }

    private String takeSign(double a, double b) {
        return a < b ? "<" : a > b ? ">" : "=";
    }

    private String takeString(boolean a) {
        return a ? "满足" : "不满足";
    }


    public Map<String, String> checkCN() {
        Map<String, String> result = new HashMap<>();

        result.put("sja", CommonFunc.convertDoubleToString(mja));
        result.put("sjb", CommonFunc.convertDoubleToString(mjb));
        result.put("sjb1", CommonFunc.convertDoubleToString(mjb1));
        result.put("sjc", CommonFunc.convertDoubleToString(mjc));
        result.put("sjc1", CommonFunc.convertDoubleToString(mjc1));
        result.put("sjas", CommonFunc.convertDoubleToString(mjas));
        result.put("sjl", CommonFunc.convertDoubleToString(mjl));
        result.put("mjmj", CommonFunc.convertDoubleToString(mjmj));

       result.put("kymjm1",CommonFunc.convertDoubleToString(kymjm1));
       result.put("kymjm2",CommonFunc.convertDoubleToString(kymjm2));
       result.put("kymjm3",CommonFunc.convertDoubleToString(kymjm3));
       result.put("kymjm5",CommonFunc.convertDoubleToString(kymjm5));
       result.put("kymjm6",CommonFunc.convertDoubleToString(kymjm6));
       result.put("kymjm9",CommonFunc.convertDoubleToString(kymjm9));
       result.put("kymjm10",CommonFunc.convertDoubleToString(kymjm10));
       result.put("kymjm8",CommonFunc.convertDoubleToString(kymjm8));

        result.put("jya", "a" + "≥" + CommonFunc.convertDoubleToString(kymj2d) +
                "<br/><br/>" + "a" + "≥ 20");
        result.put("jyb", "b" + "≥" + CommonFunc.convertDoubleToString(kymj3d )+
                "<br/><br/>" + "45 ≤" + "b" + " ≤ 300");
        result.put("jyb1", "b1" + " ≥" + CommonFunc.convertDoubleToString(kymj6d )+
                "<br/><br/>" + "70 ≤" + "b1" + " ≤ 300");
        result.put("jyc", "c" + " ≥" + CommonFunc.convertDoubleToString(kymj3d )+
                "<br/><br/>" + "c" + " ≥ 45");
        result.put("jyc1", "c1" + " ≥" + CommonFunc.convertDoubleToString(kymj3d )+
                "<br/><br/>" + "c1" + " ≥ 45");
        result.put("jyas", "As" + " ≥" + CommonFunc.convertDoubleToString(kymjas1) +
                "<br/><br/>" + "As" + " ≥" + CommonFunc.convertDoubleToString(kymjas2));
        result.put("jyl", "l" + " ≥" + CommonFunc.convertDoubleToString(kymj15d) +
                "<br/><br/>" + "l" + " ≥" + "200");
        result.put("jyn", "N" + " ≥ 0.5f<sub>c</sub>A" +
                "<br/><br/>" + " =" + CommonFunc.convertDoubleToString(_05fca));

        return result;
    }

    public Map<String, String> takeCheckMapForCheck() {
        Map<String, String> map = new HashMap<>();
        map.put("mjd", CommonFunc.convertDoubleToString(mjd));
        map.put("mjn", CommonFunc.convertDoubleToString(mjn));
        map.put("s", CommonFunc.convertDoubleToString(s));
        map.put("dj", CommonFunc.convertDoubleToString(dj));
        map.put("bj", CommonFunc.convertDoubleToString(bj));
        map.put("man", CommonFunc.convertDoubleToString(man));
        return map;
    }
}
