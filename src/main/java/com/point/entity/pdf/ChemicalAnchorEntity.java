package com.point.entity.pdf;

import com.point.common.CommonFunc;

import javax.print.DocFlavor;
import java.util.HashMap;
import java.util.Map;

public class ChemicalAnchorEntity {
    //封面内容
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;
    //起升高度及非工作时风压
    private Double h;
    private Double pf;
    //擦窗机各部件载荷
    private String s1;
    private String s2;
    private String s3;
    private Double tsl;
    private Double s4;
    private Double s5;
    private Double tshl;
    private Double m1;
    private Double m2;
    private Double m3;
    private Double m4;
    private Double m5;
    private Double m6;
    private Double m7;
    private Double m8;
    private Double m9;
    private Double m10;
    private Double m11;
    private Double m12;
    private Double m13;
    private Double m14;
    private Double m15;
    //工作状态擦窗机各部件重心至前轨道距离
    private Double lslq;
    private Double lshlq;
    private Double lq1;
    private Double lq2;
    private Double lq3;
    private Double lq4;
    private Double lq5;
    private Double lq6;
    private Double lq7;
    private Double lq8;
    private Double lq9;
    private Double lq10;
    private Double lq11;
    private Double lq12;
    private Double lq13;
    private Double lq14;
    private Double lq15;
    //工作状态风载荷作用高度
    private Double hsl;
    private Double hshl;
    private Double h1;
    private Double h2;
    private Double h3;
    private Double h4;
    private Double h5;
    private Double h6;
    private Double h7;
    private Double h8;
    private Double h9;
    private Double h10;
    private Double h11;
    private Double h12;
    private Double h13;
    private Double h14;
    private Double h15;
    //    //工作状态擦窗机各部件迎风面积（大臂侧向）
//    private Double asl;
//    private Double ashl;
//    private Double a1;
//    private Double a2;
//    private Double a3;
//    private Double a4;
//    private Double a5;
//    private Double a6;
//    private Double a7;
//    private Double a8;
//    private Double a9;
//    private Double a10;
//    private Double a11;
//    private Double a12;
//    private Double a13;
    //工作状态擦窗机各部件迎风面积（大臂同向）
    private Double asltx;
    private Double ashltx;
    private Double atx1;
    private Double atx2;
    private Double atx3;
    private Double atx4;
    private Double atx5;
    private Double atx6;
    private Double atx7;
    private Double atx8;
    private Double atx9;
    private Double atx10;
    private Double atx11;
    private Double atx12;
    private Double atx13;
    private Double atx14;
    private Double atx15;
    //非工作状态擦窗机各部5件重心至后轮距离
    private Double lh1;
    private Double lh2;
    private Double lh3;
    private Double lh4;
    private Double lh5;
    private Double lh6;
    private Double lh7;
    private Double lh8;
    private Double lh9;
    private Double lh10;
    private Double lh11;
    private Double lh12;
    private Double lh13;
    private Double lh14;
    private Double lh15;
    //非工作状态风载荷作用高度
    private Double hf1;
    private Double hf2;
    private Double hf3;
    private Double hf4;
    private Double hf5;
    private Double hf6;
    private Double hf7;
    private Double hf8;
    private Double hf9;
    private Double hf10;
    private Double hf11;
    private Double hf12;
    private Double hf13;
    private Double hf14;
    private Double hf15;
    //    非工作状态擦窗机各部件迎风面积（大臂同向）
    private Double aft1;
    private Double aft2;
    private Double aft3;
    private Double aft4;
    private Double aft5;
    private Double aft6;
    private Double aft7;
    private Double aft8;
    private Double aft9;
    private Double aft10;
    private Double aft11;
    private Double aft12;
    private Double aft13;
    private Double aft14;
    private Double aft15;
    //化学锚栓拉力计算相关参数
    private Double n2;
    private Double ll;
    private Double lg;
    private String msgg;
    private Double fs;

    public Double getLg() {
        return lg;
    }

    public void setLg(Double lg) {
        this.lg = lg;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getVer() {
        return ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getXmmc() {
        return xmmc;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public String getZjxh() {
        return zjxh;
    }

    public void setZjxh(String zjxh) {
        this.zjxh = zjxh;
    }

    public String getJsr() {
        return jsr;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public String getShr() {
        return shr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public String getPzr() {
        return pzr;
    }

    public void setPzr(String pzr) {
        this.pzr = pzr;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getPf() {
        return pf;
    }

    public void setPf(Double pf) {
        this.pf = pf;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public Double getTsl() {
        return tsl;
    }

    public void setTsl(Double tsl) {
        this.tsl = tsl;
    }

    public Double getS4() {
        return s4;
    }

    public void setS4(Double s4) {
        this.s4 = s4;
    }

    public Double getS5() {
        return s5;
    }

    public void setS5(Double s5) {
        this.s5 = s5;
    }

    public Double getTshl() {
        return tshl;
    }

    public void setTshl(Double tshl) {
        this.tshl = tshl;
    }

    public Double getM1() {
        return m1;
    }

    public void setM1(Double m1) {
        this.m1 = m1;
    }

    public Double getM2() {
        return m2;
    }

    public void setM2(Double m2) {
        this.m2 = m2;
    }

    public Double getM3() {
        return m3;
    }

    public void setM3(Double m3) {
        this.m3 = m3;
    }

    public Double getM4() {
        return m4;
    }

    public void setM4(Double m4) {
        this.m4 = m4;
    }

    public Double getM5() {
        return m5;
    }

    public void setM5(Double m5) {
        this.m5 = m5;
    }

    public Double getM6() {
        return m6;
    }

    public void setM6(Double m6) {
        this.m6 = m6;
    }

    public Double getM7() {
        return m7;
    }

    public void setM7(Double m7) {
        this.m7 = m7;
    }

    public Double getM8() {
        return m8;
    }

    public void setM8(Double m8) {
        this.m8 = m8;
    }

    public Double getM9() {
        return m9;
    }

    public void setM9(Double m9) {
        this.m9 = m9;
    }

    public Double getM10() {
        return m10;
    }

    public void setM10(Double m10) {
        this.m10 = m10;
    }

    public Double getM11() {
        return m11;
    }

    public void setM11(Double m11) {
        this.m11 = m11;
    }

    public Double getM12() {
        return m12;
    }

    public void setM12(Double m12) {
        this.m12 = m12;
    }

    public Double getM13() {
        return m13;
    }

    public void setM13(Double m13) {
        this.m13 = m13;
    }

    public Double getM14() {
        return m14;
    }

    public void setM14(Double m14) {
        this.m14 = m14;
    }

    public Double getM15() {
        return m15;
    }

    public void setM15(Double m15) {
        this.m15 = m15;
    }

    public Double getLslq() {
        return lslq;
    }

    public void setLslq(Double lslq) {
        this.lslq = lslq;
    }

    public Double getLshlq() {
        return lshlq;
    }

    public void setLshlq(Double lshlq) {
        this.lshlq = lshlq;
    }

    public Double getLq1() {
        return lq1;
    }

    public void setLq1(Double lq1) {
        this.lq1 = lq1;
    }

    public Double getLq2() {
        return lq2;
    }

    public void setLq2(Double lq2) {
        this.lq2 = lq2;
    }

    public Double getLq3() {
        return lq3;
    }

    public void setLq3(Double lq3) {
        this.lq3 = lq3;
    }

    public Double getLq4() {
        return lq4;
    }

    public void setLq4(Double lq4) {
        this.lq4 = lq4;
    }

    public Double getLq5() {
        return lq5;
    }

    public void setLq5(Double lq5) {
        this.lq5 = lq5;
    }

    public Double getLq6() {
        return lq6;
    }

    public void setLq6(Double lq6) {
        this.lq6 = lq6;
    }

    public Double getLq7() {
        return lq7;
    }

    public void setLq7(Double lq7) {
        this.lq7 = lq7;
    }

    public Double getLq8() {
        return lq8;
    }

    public void setLq8(Double lq8) {
        this.lq8 = lq8;
    }

    public Double getLq9() {
        return lq9;
    }

    public void setLq9(Double lq9) {
        this.lq9 = lq9;
    }

    public Double getLq10() {
        return lq10;
    }

    public void setLq10(Double lq10) {
        this.lq10 = lq10;
    }

    public Double getLq11() {
        return lq11;
    }

    public void setLq11(Double lq11) {
        this.lq11 = lq11;
    }

    public Double getLq12() {
        return lq12;
    }

    public void setLq12(Double lq12) {
        this.lq12 = lq12;
    }

    public Double getLq13() {
        return lq13;
    }

    public void setLq13(Double lq13) {
        this.lq13 = lq13;
    }

    public Double getLq14() {
        return lq14;
    }

    public void setLq14(Double lq14) {
        this.lq14 = lq14;
    }

    public Double getLq15() {
        return lq15;
    }

    public void setLq15(Double lq15) {
        this.lq15 = lq15;
    }

    public Double getHsl() {
        return hsl;
    }

    public void setHsl(Double hsl) {
        this.hsl = hsl;
    }

    public Double getHshl() {
        return hshl;
    }

    public void setHshl(Double hshl) {
        this.hshl = hshl;
    }

    public Double getH1() {
        return h1;
    }

    public void setH1(Double h1) {
        this.h1 = h1;
    }

    public Double getH2() {
        return h2;
    }

    public void setH2(Double h2) {
        this.h2 = h2;
    }

    public Double getH3() {
        return h3;
    }

    public void setH3(Double h3) {
        this.h3 = h3;
    }

    public Double getH4() {
        return h4;
    }

    public void setH4(Double h4) {
        this.h4 = h4;
    }

    public Double getH5() {
        return h5;
    }

    public void setH5(Double h5) {
        this.h5 = h5;
    }

    public Double getH6() {
        return h6;
    }

    public void setH6(Double h6) {
        this.h6 = h6;
    }

    public Double getH7() {
        return h7;
    }

    public void setH7(Double h7) {
        this.h7 = h7;
    }

    public Double getH8() {
        return h8;
    }

    public void setH8(Double h8) {
        this.h8 = h8;
    }

    public Double getH9() {
        return h9;
    }

    public void setH9(Double h9) {
        this.h9 = h9;
    }

    public Double getH10() {
        return h10;
    }

    public void setH10(Double h10) {
        this.h10 = h10;
    }

    public Double getH11() {
        return h11;
    }

    public void setH11(Double h11) {
        this.h11 = h11;
    }

    public Double getH12() {
        return h12;
    }

    public void setH12(Double h12) {
        this.h12 = h12;
    }

    public Double getH13() {
        return h13;
    }

    public void setH13(Double h13) {
        this.h13 = h13;
    }

    public Double getH14() {
        return h14;
    }

    public void setH14(Double h14) {
        this.h14 = h14;
    }

    public Double getH15() {
        return h15;
    }

    public void setH15(Double h15) {
        this.h15 = h15;
    }

    public Double getAsltx() {
        return asltx;
    }

    public void setAsltx(Double asltx) {
        this.asltx = asltx;
    }

    public Double getAshltx() {
        return ashltx;
    }

    public void setAshltx(Double ashltx) {
        this.ashltx = ashltx;
    }

    public Double getAtx1() {
        return atx1;
    }

    public void setAtx1(Double atx1) {
        this.atx1 = atx1;
    }

    public Double getAtx2() {
        return atx2;
    }

    public void setAtx2(Double atx2) {
        this.atx2 = atx2;
    }

    public Double getAtx3() {
        return atx3;
    }

    public void setAtx3(Double atx3) {
        this.atx3 = atx3;
    }

    public Double getAtx4() {
        return atx4;
    }

    public void setAtx4(Double atx4) {
        this.atx4 = atx4;
    }

    public Double getAtx5() {
        return atx5;
    }

    public void setAtx5(Double atx5) {
        this.atx5 = atx5;
    }

    public Double getAtx6() {
        return atx6;
    }

    public void setAtx6(Double atx6) {
        this.atx6 = atx6;
    }

    public Double getAtx7() {
        return atx7;
    }

    public void setAtx7(Double atx7) {
        this.atx7 = atx7;
    }

    public Double getAtx8() {
        return atx8;
    }

    public void setAtx8(Double atx8) {
        this.atx8 = atx8;
    }

    public Double getAtx9() {
        return atx9;
    }

    public void setAtx9(Double atx9) {
        this.atx9 = atx9;
    }

    public Double getAtx10() {
        return atx10;
    }

    public void setAtx10(Double atx10) {
        this.atx10 = atx10;
    }

    public Double getAtx11() {
        return atx11;
    }

    public void setAtx11(Double atx11) {
        this.atx11 = atx11;
    }

    public Double getAtx12() {
        return atx12;
    }

    public void setAtx12(Double atx12) {
        this.atx12 = atx12;
    }

    public Double getAtx13() {
        return atx13;
    }

    public void setAtx13(Double atx13) {
        this.atx13 = atx13;
    }

    public Double getAtx14() {
        return atx14;
    }

    public void setAtx14(Double atx14) {
        this.atx14 = atx14;
    }

    public Double getAtx15() {
        return atx15;
    }

    public void setAtx15(Double atx15) {
        this.atx15 = atx15;
    }

    public Double getLh1() {
        return lh1;
    }

    public void setLh1(Double lh1) {
        this.lh1 = lh1;
    }

    public Double getLh2() {
        return lh2;
    }

    public void setLh2(Double lh2) {
        this.lh2 = lh2;
    }

    public Double getLh3() {
        return lh3;
    }

    public void setLh3(Double lh3) {
        this.lh3 = lh3;
    }

    public Double getLh4() {
        return lh4;
    }

    public void setLh4(Double lh4) {
        this.lh4 = lh4;
    }

    public Double getLh5() {
        return lh5;
    }

    public void setLh5(Double lh5) {
        this.lh5 = lh5;
    }

    public Double getLh6() {
        return lh6;
    }

    public void setLh6(Double lh6) {
        this.lh6 = lh6;
    }

    public Double getLh7() {
        return lh7;
    }

    public void setLh7(Double lh7) {
        this.lh7 = lh7;
    }

    public Double getLh8() {
        return lh8;
    }

    public void setLh8(Double lh8) {
        this.lh8 = lh8;
    }

    public Double getLh9() {
        return lh9;
    }

    public void setLh9(Double lh9) {
        this.lh9 = lh9;
    }

    public Double getLh10() {
        return lh10;
    }

    public void setLh10(Double lh10) {
        this.lh10 = lh10;
    }

    public Double getLh11() {
        return lh11;
    }

    public void setLh11(Double lh11) {
        this.lh11 = lh11;
    }

    public Double getLh12() {
        return lh12;
    }

    public void setLh12(Double lh12) {
        this.lh12 = lh12;
    }

    public Double getLh13() {
        return lh13;
    }

    public void setLh13(Double lh13) {
        this.lh13 = lh13;
    }

    public Double getLh14() {
        return lh14;
    }

    public void setLh14(Double lh14) {
        this.lh14 = lh14;
    }

    public Double getLh15() {
        return lh15;
    }

    public void setLh15(Double lh15) {
        this.lh15 = lh15;
    }

    public Double getHf1() {
        return hf1;
    }

    public void setHf1(Double hf1) {
        this.hf1 = hf1;
    }

    public Double getHf2() {
        return hf2;
    }

    public void setHf2(Double hf2) {
        this.hf2 = hf2;
    }

    public Double getHf3() {
        return hf3;
    }

    public void setHf3(Double hf3) {
        this.hf3 = hf3;
    }

    public Double getHf4() {
        return hf4;
    }

    public void setHf4(Double hf4) {
        this.hf4 = hf4;
    }

    public Double getHf5() {
        return hf5;
    }

    public void setHf5(Double hf5) {
        this.hf5 = hf5;
    }

    public Double getHf6() {
        return hf6;
    }

    public void setHf6(Double hf6) {
        this.hf6 = hf6;
    }

    public Double getHf7() {
        return hf7;
    }

    public void setHf7(Double hf7) {
        this.hf7 = hf7;
    }

    public Double getHf8() {
        return hf8;
    }

    public void setHf8(Double hf8) {
        this.hf8 = hf8;
    }

    public Double getHf9() {
        return hf9;
    }

    public void setHf9(Double hf9) {
        this.hf9 = hf9;
    }

    public Double getHf10() {
        return hf10;
    }

    public void setHf10(Double hf10) {
        this.hf10 = hf10;
    }

    public Double getHf11() {
        return hf11;
    }

    public void setHf11(Double hf11) {
        this.hf11 = hf11;
    }

    public Double getHf12() {
        return hf12;
    }

    public void setHf12(Double hf12) {
        this.hf12 = hf12;
    }

    public Double getHf13() {
        return hf13;
    }

    public void setHf13(Double hf13) {
        this.hf13 = hf13;
    }

    public Double getAft1() {
        return aft1;
    }

    public void setAft1(Double aft1) {
        this.aft1 = aft1;
    }

    public Double getAft2() {
        return aft2;
    }

    public void setAft2(Double aft2) {
        this.aft2 = aft2;
    }

    public Double getAft3() {
        return aft3;
    }

    public void setAft3(Double aft3) {
        this.aft3 = aft3;
    }

    public Double getAft4() {
        return aft4;
    }

    public void setAft4(Double aft4) {
        this.aft4 = aft4;
    }

    public Double getAft5() {
        return aft5;
    }

    public void setAft5(Double aft5) {
        this.aft5 = aft5;
    }

    public Double getAft6() {
        return aft6;
    }

    public void setAft6(Double aft6) {
        this.aft6 = aft6;
    }

    public Double getAft7() {
        return aft7;
    }

    public void setAft7(Double aft7) {
        this.aft7 = aft7;
    }

    public Double getAft8() {
        return aft8;
    }

    public void setAft8(Double aft8) {
        this.aft8 = aft8;
    }

    public Double getAft9() {
        return aft9;
    }

    public void setAft9(Double aft9) {
        this.aft9 = aft9;
    }

    public Double getAft10() {
        return aft10;
    }

    public void setAft10(Double aft10) {
        this.aft10 = aft10;
    }

    public Double getAft11() {
        return aft11;
    }

    public void setAft11(Double aft11) {
        this.aft11 = aft11;
    }

    public Double getAft12() {
        return aft12;
    }

    public void setAft12(Double aft12) {
        this.aft12 = aft12;
    }

    public Double getAft13() {
        return aft13;
    }

    public void setAft13(Double aft13) {
        this.aft13 = aft13;
    }

    public Double getAft14() {
        return aft14;
    }

    public void setAft14(Double aft14) {
        this.aft14 = aft14;
    }

    public Double getAft15() {
        return aft15;
    }

    public void setAft15(Double aft15) {
        this.aft15 = aft15;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getLl() {
        return ll;
    }

    public void setLl(Double ll) {
        this.ll = ll;
    }

    public String getMsgg() {
        return msgg;
    }

    public void setMsgg(String msgg) {
        this.msgg = msgg;
    }

    public Double getFs() {
        return fs;
    }

    public void setFs(Double fs) {
        this.fs = fs;
    }

    public Double getHf14() {
        return hf14;
    }

    public void setHf14(Double hf14) {
        this.hf14 = hf14;
    }

    public Double getHf15() {
        return hf15;
    }

    public void setHf15(Double hf15) {
        this.hf15 = hf15;
    }

    public Map<String, String> getInputMap() {
        Map<String, String> result = new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));
        result.put("h", CommonFunc.convertDoubleToString(h));
        result.put("pf", CommonFunc.convertDoubleToString(pf));
        result.put("s1", CommonFunc.convertDoubleToString(s1));
        result.put("s2", CommonFunc.convertDoubleToString(s2));
        result.put("s3", CommonFunc.convertDoubleToString(s3));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("s4", CommonFunc.convertDoubleToString(s4));
        result.put("s5", CommonFunc.convertDoubleToString(s5));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m4", CommonFunc.convertDoubleToString(m4));
        result.put("m5", CommonFunc.convertDoubleToString(m5));
        result.put("m6", CommonFunc.convertDoubleToString(m6));
        result.put("m7", CommonFunc.convertDoubleToString(m7));
        result.put("m8", CommonFunc.convertDoubleToString(m8));
        result.put("m9", CommonFunc.convertDoubleToString(m9));
        result.put("m10", CommonFunc.convertDoubleToString(m10));
        result.put("m11", CommonFunc.convertDoubleToString(m11));
        result.put("m12", CommonFunc.convertDoubleToString(m12));
        result.put("m13", CommonFunc.convertDoubleToString(m13));
        result.put("m14", CommonFunc.convertDoubleToString(m14));
        result.put("m15", CommonFunc.convertDoubleToString(m15));
        result.put("lslq", CommonFunc.convertDoubleToString(lslq));
        result.put("lshlq", CommonFunc.convertDoubleToString(lshlq));
        result.put("lq1", CommonFunc.convertDoubleToString(lq1));
        result.put("lq2", CommonFunc.convertDoubleToString(lq2));
        result.put("lq3", CommonFunc.convertDoubleToString(lq3));
        result.put("lq4", CommonFunc.convertDoubleToString(lq4));
        result.put("lq5", CommonFunc.convertDoubleToString(lq5));
        result.put("lq6", CommonFunc.convertDoubleToString(lq6));
        result.put("lq7", CommonFunc.convertDoubleToString(lq7));
        result.put("lq8", CommonFunc.convertDoubleToString(lq8));
        result.put("lq9", CommonFunc.convertDoubleToString(lq9));
        result.put("lq10", CommonFunc.convertDoubleToString(lq10));
        result.put("lq11", CommonFunc.convertDoubleToString(lq11));
        result.put("lq12", CommonFunc.convertDoubleToString(lq12));
        result.put("lq13", CommonFunc.convertDoubleToString(lq13));
        result.put("lq14", CommonFunc.convertDoubleToString(lq14));
        result.put("lq15", CommonFunc.convertDoubleToString(lq15));
        result.put("hsl", CommonFunc.convertDoubleToString(hsl));
        result.put("hshl", CommonFunc.convertDoubleToString(hshl));
        result.put("h1", CommonFunc.convertDoubleToString(h1));
        result.put("h2", CommonFunc.convertDoubleToString(h2));
        result.put("h3", CommonFunc.convertDoubleToString(h3));
        result.put("h4", CommonFunc.convertDoubleToString(h4));
        result.put("h5", CommonFunc.convertDoubleToString(h5));
        result.put("h6", CommonFunc.convertDoubleToString(h6));
        result.put("h7", CommonFunc.convertDoubleToString(h7));
        result.put("h8", CommonFunc.convertDoubleToString(h8));
        result.put("h9", CommonFunc.convertDoubleToString(h9));
        result.put("h10", CommonFunc.convertDoubleToString(h10));
        result.put("h11", CommonFunc.convertDoubleToString(h11));
        result.put("h12", CommonFunc.convertDoubleToString(h12));
        result.put("h13", CommonFunc.convertDoubleToString(h13));
        result.put("h14", CommonFunc.convertDoubleToString(h14));
        result.put("h15", CommonFunc.convertDoubleToString(h15));
        result.put("asltx", CommonFunc.convertDoubleToString(asltx));
        result.put("ashltx", CommonFunc.convertDoubleToString(ashltx));
        result.put("atx1", CommonFunc.convertDoubleToString(atx1));
        result.put("atx2", CommonFunc.convertDoubleToString(atx2));
        result.put("atx3", CommonFunc.convertDoubleToString(atx3));
        result.put("atx4", CommonFunc.convertDoubleToString(atx4));
        result.put("atx5", CommonFunc.convertDoubleToString(atx5));
        result.put("atx6", CommonFunc.convertDoubleToString(atx6));
        result.put("atx7", CommonFunc.convertDoubleToString(atx7));
        result.put("atx8", CommonFunc.convertDoubleToString(atx8));
        result.put("atx9", CommonFunc.convertDoubleToString(atx9));
        result.put("atx10", CommonFunc.convertDoubleToString(atx10));
        result.put("atx11", CommonFunc.convertDoubleToString(atx11));
        result.put("atx12", CommonFunc.convertDoubleToString(atx12));
        result.put("atx13", CommonFunc.convertDoubleToString(atx13));
        result.put("atx14", CommonFunc.convertDoubleToString(atx14));
        result.put("atx15", CommonFunc.convertDoubleToString(atx15));
        result.put("lh1", CommonFunc.convertDoubleToString(lh1));
        result.put("lh2", CommonFunc.convertDoubleToString(lh2));
        result.put("lh3", CommonFunc.convertDoubleToString(lh3));
        result.put("lh4", CommonFunc.convertDoubleToString(lh4));
        result.put("lh5", CommonFunc.convertDoubleToString(lh5));
        result.put("lh6", CommonFunc.convertDoubleToString(lh6));
        result.put("lh7", CommonFunc.convertDoubleToString(lh7));
        result.put("lh8", CommonFunc.convertDoubleToString(lh8));
        result.put("lh9", CommonFunc.convertDoubleToString(lh9));
        result.put("lh10", CommonFunc.convertDoubleToString(lh10));
        result.put("lh11", CommonFunc.convertDoubleToString(lh11));
        result.put("lh12", CommonFunc.convertDoubleToString(lh12));
        result.put("lh13", CommonFunc.convertDoubleToString(lh13));
        result.put("lh14", CommonFunc.convertDoubleToString(lh14));
        result.put("lh15", CommonFunc.convertDoubleToString(lh15));
        result.put("hf1", CommonFunc.convertDoubleToString(hf1));
        result.put("hf2", CommonFunc.convertDoubleToString(hf2));
        result.put("hf3", CommonFunc.convertDoubleToString(hf3));
        result.put("hf4", CommonFunc.convertDoubleToString(hf4));
        result.put("hf5", CommonFunc.convertDoubleToString(hf5));
        result.put("hf6", CommonFunc.convertDoubleToString(hf6));
        result.put("hf7", CommonFunc.convertDoubleToString(hf7));
        result.put("hf8", CommonFunc.convertDoubleToString(hf8));
        result.put("hf9", CommonFunc.convertDoubleToString(hf9));
        result.put("hf10", CommonFunc.convertDoubleToString(hf10));
        result.put("hf11", CommonFunc.convertDoubleToString(hf11));
        result.put("hf12", CommonFunc.convertDoubleToString(hf12));
        result.put("hf13", CommonFunc.convertDoubleToString(hf13));
        result.put("hf14", CommonFunc.convertDoubleToString(hf14));
        result.put("hf15", CommonFunc.convertDoubleToString(hf15));
        result.put("aft1", CommonFunc.convertDoubleToString(aft1));
        result.put("aft2", CommonFunc.convertDoubleToString(aft2));
        result.put("aft3", CommonFunc.convertDoubleToString(aft3));
        result.put("aft4", CommonFunc.convertDoubleToString(aft4));
        result.put("aft5", CommonFunc.convertDoubleToString(aft5));
        result.put("aft6", CommonFunc.convertDoubleToString(aft6));
        result.put("aft7", CommonFunc.convertDoubleToString(aft7));
        result.put("aft8", CommonFunc.convertDoubleToString(aft8));
        result.put("aft9", CommonFunc.convertDoubleToString(aft9));
        result.put("aft10", CommonFunc.convertDoubleToString(aft10));
        result.put("aft11", CommonFunc.convertDoubleToString(aft11));
        result.put("aft12", CommonFunc.convertDoubleToString(aft12));
        result.put("aft13", CommonFunc.convertDoubleToString(aft13));
        result.put("aft14", CommonFunc.convertDoubleToString(aft14));
        result.put("aft15", CommonFunc.convertDoubleToString(aft15));
        result.put("n2", CommonFunc.convertDoubleToString(n2));
        result.put("lg", CommonFunc.convertDoubleToString(lg));
        result.put("ll", CommonFunc.convertDoubleToString(ll));
        result.put("msgg", CommonFunc.convertDoubleToString(msgg));
        result.put("fs", CommonFunc.convertDoubleToString(fs));
        return result;
    }

    private String getSatisfied(double v1, double v2) {
        return v1 >= v2 ?"满足" :"不满足";
    }

    private String getSign(double v1, double v2) {
        if (v1 > v2) return">";
        else if (v1 == v2) return"=";
        else return"<";
    }

    public Map<String, Double> getDoubleMap() {

//        计算工作状态自重及载荷产生的倾覆力矩
        Map<String, Double> result = new HashMap<>();
        Double msla = tsl * lslq * 10 * 2;
        Double mshla = tshl * lshlq * 10 * 1.4;
        Double ma1 = m1 * lq1 * 10 * 1.25;
        Double ma2 = m2 * lq2 * 10 * 1.25;
        Double ma14 = m14 * lq14 * 10 * 1.25;
        result.put("msla", msla);
        result.put("mshla", mshla);
        result.put("ma1", ma1);
        result.put("ma2", ma2);
        result.put("ma14", ma14);
//        计算工作状态风载荷产生的倾覆力矩（大臂同向）
        Double msltw = 250 * asltx * hsl * 1.25;
        Double mshltw = 250 * ashltx * hshl * 1.25;
        Double mtw1 = 250 * atx1 * h1 * 1.25;
        Double mtw2 = 250 * atx2 * h2 * 1.25;
        Double mtw3 = 250 * atx3 * h3 * 1.25;
        Double mtw4 = 250 * atx4 * h4 * 1.25;
        Double mtw5 = 250 * atx5 * h5 * 1.25;
        Double mtw6 = 250 * atx6 * h6 * 1.25;
        Double mtw7 = 250 * atx7 * h7 * 1.25;
        Double mtw8 = 250 * atx8 * h8 * 1.25;
        Double mtw9 = 250 * atx9 * h9 * 1.25;
        Double mtw10 = 250 * atx10 * h10 * 1.25;
        Double mtw11 = 250 * atx11 * h11 * 1.25;
        Double mtw12 = 250 * atx12 * h12 * 1.25;
        Double mtw13 = 250 * atx13 * h13 * 1.25;
        Double mtw14 = 250 * atx14 * h14 * 1.25;
        Double mtw15 = 250 * atx15 * h15 * 1.25;
        result.put("msltw", msltw);
        result.put("mshltw", mshltw);
        result.put("mtw1", mtw1);
        result.put("mtw2", mtw2);
        result.put("mtw3", mtw3);
        result.put("mtw4", mtw4);
        result.put("mtw5", mtw5);
        result.put("mtw6", mtw6);
        result.put("mtw7", mtw7);
        result.put("mtw8", mtw8);
        result.put("mtw9", mtw9);
        result.put("mtw10", mtw10);
        result.put("mtw11", mtw11);
        result.put("mtw12", mtw12);
        result.put("mtw13", mtw13);
        result.put("mtw14", mtw14);
        result.put("mtw15", mtw15);
//        计算工作状态自重产生的抗倾覆力矩
        Double ma3 = m3 * lq3 * 10;
        Double ma4 = m4 * lq4 * 10;
        Double ma5 = m5 * lq5 * 11;
        Double ma6 = m6 * lq6 * 10;
        Double ma7 = m7 * lq7 * 10;
        Double ma8 = m8 * lq8 * 10;
        Double ma9 = m9 * lq9 * 10;
        Double ma10 = m10 * lq10 * 10;
        Double ma11 = m11 * lq11 * 10;
        Double ma12 = m12 * lq12 * 10;
        Double ma13 = m13 * lq13 * 10;
        Double ma15 = m15 * lq15 * 10;
        result.put("ma3", ma3);
        result.put("ma4", ma4);
        result.put("ma5", ma5);
        result.put("ma6", ma6);
        result.put("ma7", ma7);
        result.put("ma8", ma8);
        result.put("ma9", ma9);
        result.put("ma10", ma10);
        result.put("ma11", ma11);
        result.put("ma12", ma12);
        result.put("ma13", ma13);
        result.put("ma15", ma15);

//        计算稳定性非工作状态自重产生的倾覆力矩
        Double mh7 = m7 * lh7 * 10;
        Double mh8 = m8 * lh8 * 10;
        Double mh15 = m15 * lh15 * 10;
        result.put("mh7", mh7);
        result.put("mh8", mh8);
        result.put("mh15", mh15);

//        计算稳定性非工作状态风载荷产生的倾覆力矩（大臂同向）
        Double mftw1 = pf * aft1 * hf1;
        Double mftw2 = pf * aft2 * hf2;
        Double mftw3 = pf * aft3 * hf3;
        Double mftw4 = pf * aft4 * hf4;
        Double mftw5 = pf * aft5 * hf5;
        Double mftw6 = pf * aft6 * hf6;
        Double mftw7 = pf * aft7 * hf7;
        Double mftw8 = pf * aft8 * hf8;
        Double mftw9 = pf * aft9 * hf9;
        Double mftw10 = pf * aft10 * hf10;
        Double mftw11 = pf * aft11 * hf11;
        Double mftw12 = pf * aft12 * hf12;
        Double mftw13 = pf * aft13 * hf13;
        Double mftw14 = pf * aft14 * hf14;
        Double mftw15 = pf * aft15 * hf15;
        result.put("mftw1", mftw1);
        result.put("mftw2", mftw2);
        result.put("mftw3", mftw3);
        result.put("mftw4", mftw4);
        result.put("mftw5", mftw5);
        result.put("mftw6", mftw6);
        result.put("mftw7", mftw7);
        result.put("mftw8", mftw8);
        result.put("mftw9", mftw9);
        result.put("mftw10", mftw10);
        result.put("mftw11", mftw11);
        result.put("mftw12", mftw12);
        result.put("mftw13", mftw13);
        result.put("mftw14", mftw14);
        result.put("mftw15", mftw15);
//        非工作状态擦窗机各部件抗倾覆力矩
        Double mh1 = m1 * lh1 * 10;
        Double mh2 = m2 * lh2 * 10;
        Double mh3 = m3 * lh3 * 10;
        Double mh4 = m4 * lh4 * 10;
        Double mh5 = m5 * lh5 * 10;
        Double mh6 = m6 * lh6 * 10;
        Double mh9 = m9 * lh9 * 10;
        Double mh10 = m10 * lh10 * 10;
        Double mh11 = m11 * lh11 * 10;
        Double mh12 = m12 * lh12 * 10;
        Double mh13 = m13 * lh13 * 10;
        Double mh14 = m14 * lh14 * 10;
        result.put("mh1", mh1);
        result.put("mh2", mh2);
        result.put("mh3", mh3);
        result.put("mh4", mh4);
        result.put("mh5", mh5);
        result.put("mh6", mh6);
        result.put("mh9", mh9);
        result.put("mh10", mh10);
        result.put("mh11", mh11);
        result.put("mh12", mh12);
        result.put("mh13", mh13);
        result.put("mh14", mh14);
//        稳定性计算和结果
        Double mq = msla + mshla + ma1 + ma2 + ma14;
        Double mm2 = ma3 + ma4 + ma6 + ma7 + ma8 + ma9 + ma10 + ma11 + ma12 + ma13 + ma15;
        Double mtw = msltw + mshltw + mtw1 + mtw2 + mtw3 + mtw4 + mtw5 + mtw6 + mtw7 + mtw8 + mtw9 + mtw10 + mtw11 + mtw12 + mtw13 + mtw14 + mtw15;
        Double mqh = mh7 + mh8 + mh15;
        Double mftw = mftw1 + mftw2 + mftw3 + mftw4 + mftw5 + mftw6 + mftw7 + mftw8 + mftw9 + mftw10 + mftw11 + mftw12 + mftw13 + mftw14 + mftw15;
        Double mkh = mh1 + mh2 + mh3 + mh4 + mh5 + mh6 + mh9 + mh10 + mh11 + mh12 + mh13 + mh14;
        Double mm1 = mq + mtw;
        Double f1 = (mm1 - mm2) / (2 * n2 * lg);
        Double f1k = f1 / 1000;
        result.put("mq", mq);
        result.put("mm2", mm2);
        result.put("mtw", mtw);
        result.put("mqh", mqh);
        result.put("mftw", mftw);
        result.put("mkh", mkh);
        result.put("mm1", mm1);
        result.put("f1", f1);
        result.put("f1k", f1k);
        Double mm1p = mqh + mftw;
        Double f2 = (mm1p - mkh) / (2 * n2 * ll);
        Double f2k = f2 / 1000;
        result.put("mm1p", mm1p);
        result.put("f2", f2);
        result.put("f2k", f2k);
        return result;
    }

    public Map<String, String> getStringMap(Map<String, Double> doubleMap) {
        Map<String, String> result = new HashMap<>();
        Double f1k = doubleMap.get("f1k");
        String f1fs = getSign(f1k, fs);
        String man1 = getSatisfied(fs, f1k);
        result.put("f1fs", f1fs);
        result.put("man1", man1);
        Double f2k = doubleMap.get("f2k");
        String f2fs = getSign(f2k, fs);
        String man2 = getSatisfied(fs, f2k);
        result.put("f2fs", f2fs);
        result.put("man2", man2);
        return result;
    }

    public Map<String, String> getMapForPDF() {
        Map<String, String> result = new HashMap<>();
        Map<String, Double> doubleMap = getDoubleMap();
        for (Map.Entry<String, Double> e : doubleMap.entrySet()) {
            result.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
        result.putAll(getStringMap(doubleMap));
        result.putAll(getInputMap());
        return result;
    }

    public Map<String, String> getMapForInspectionPDF() {
        Map<String, String> result = new HashMap<>();
        Map<String, Double> doubleMap = getDoubleMap();
        Double mm1 = doubleMap.get("mm1");
        Double mm2 = doubleMap.get("mm2");
        Double f1 = doubleMap.get("f1");
        Double mg = 2 * n2 * f1 * lg;
        Double mkg = mm2 + mg;
        String mang = mkg >= mm1 ?"满足" :"不满足";
        Double mm1p = doubleMap.get("mm1p");
        Double mkh = doubleMap.get("mkh");
        Double f2 = doubleMap.get("f2");
        Double mf = 2 * n2 * f2 * lg;
        Double mkf = mkh + mf;
        String manf = mkf >= mm1p ?"满足" :"不满足";
        result.put("n2",CommonFunc.convertDoubleToString(n2 ));
        result.put("lg",CommonFunc.convertDoubleToString(lg))   ;

        result.put("mm1",CommonFunc.convertDoubleToString(mm1 ));
        result.put("mm2",CommonFunc.convertDoubleToString(mm2 ));
        result.put("f1",CommonFunc.convertDoubleToString(f1  ));
        result.put("mg",CommonFunc.convertDoubleToString(mg  ));
        result.put("mkg",CommonFunc.convertDoubleToString(mkg ));
        result.put("mang",CommonFunc.convertDoubleToString(mang));
        result.put("mm1p",CommonFunc.convertDoubleToString(mm1p));
        result.put("mkh",CommonFunc.convertDoubleToString(mkh ));
        result.put("f2",CommonFunc.convertDoubleToString(f2  ));
        result.put("mf",CommonFunc.convertDoubleToString(mf  ));
        result.put("mkf",CommonFunc.convertDoubleToString(mkf ));
        result.put("manf",CommonFunc.convertDoubleToString(manf));
        return result;
    }

    public Map<String, String> getMapForJY() {
        Map<String, String> pdfMap = getMapForPDF();
        Map<String, String> result = new HashMap<>();
        result.put("sjf1k", pdfMap.get("f1k"));
        result.put("sjf2k", pdfMap.get("f2k"));
        result.put("sjfs", pdfMap.get("fs"));
        result.put("f2fs", pdfMap.get("f2fs"));
        result.put("f1fs", pdfMap.get("f1fs"));
        result.put("man1", pdfMap.get("man1"));
        result.put("man2", pdfMap.get("man2"));
        return result;
    }
}
