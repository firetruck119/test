package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class WireRopeEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double swp;
    private Double r1;
    private Double mwr;
    private Double tsl;
    private Double hwll;
    private Double hsw;
    private Double tshl;

    private String xh1;
    private Double d1;
    private Double n1;
    private Double f1;
    private Double p1;
    private String xh2;
    private Double d2;
    private Double n2;
    private Double f2;
    private Double p2;

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

    public Double getSwp() {
        return swp;
    }

    public void setSwp(Double swp) {
        this.swp = swp;
    }

    public Double getR1() {
        return r1;
    }

    public void setR1(Double r1) {
        this.r1 = r1;
    }

    public Double getMwr() {
        return mwr;
    }

    public void setMwr(Double mwr) {
        this.mwr = mwr;
    }

    public Double getTsl() {
        return tsl;
    }

    public void setTsl(Double tsl) {
        this.tsl = tsl;
    }

    public Double getHwll() {
        return hwll;
    }

    public void setHwll(Double hwll) {
        this.hwll = hwll;
    }

    public Double getHsw() {
        return hsw;
    }

    public void setHsw(Double hsw) {
        this.hsw = hsw;
    }

    public Double getTshl() {
        return tshl;
    }

    public void setTshl(Double tshl) {
        this.tshl = tshl;
    }

    public String getXh1() {
        return xh1;
    }

    public void setXh1(String xh1) {
        this.xh1 = xh1;
    }

    public Double getD1() {
        return d1;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public Double getN1() {
        return n1;
    }

    public void setN1(Double n1) {
        this.n1 = n1;
    }

    public Double getF1() {
        return f1;
    }

    public void setF1(Double f1) {
        this.f1 = f1;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public String getXh2() {
        return xh2;
    }

    public void setXh2(String xh2) {
        this.xh2 = xh2;
    }

    public Double getD2() {
        return d2;
    }

    public void setD2(Double d2) {
        this.d2 = d2;
    }

    public Double getN2() {
        return n2;
    }

    public void setN2(Double n2) {
        this.n2 = n2;
    }

    public Double getF2() {
        return f2;
    }

    public void setF2(Double f2) {
        this.f2 = f2;
    }

    public Double getP2() {
        return p2;
    }

    public void setP2(Double p2) {
        this.p2 = p2;
    }

    private String getSatisfied(double v1, double v2) {
        return v1 >= v2 ? "满足" : "不满足";
    }

    private String getSign(double v1, double v2) {
        if (v1 > v2) return ">";
        else if (v1 == v2) return "=";
        else return "<";
    }


    public Map<String, String> getMapForPdf() {
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
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("xh1", CommonFunc.convertDoubleToString(xh1));
        result.put("d1", CommonFunc.convertDoubleToString(d1));
        result.put("n1", CommonFunc.convertDoubleToString(n1));
        result.put("f1", CommonFunc.convertDoubleToString(f1));
        result.put("p1", CommonFunc.convertDoubleToString3(p1));
        result.put("xh2", CommonFunc.convertDoubleToString(xh2));
        result.put("d2", CommonFunc.convertDoubleToString(d2));
        result.put("n2", CommonFunc.convertDoubleToString(n2));
        result.put("f2", CommonFunc.convertDoubleToString(f2));
        result.put("p2", CommonFunc.convertDoubleToString3(p2));
        if (xh1 != null) {
            Double s1 = tsl / 100 / n1;
            Double zp1p = f1 / s1;
            String x1 = getSign(zp1p, 12);
            String x2 = getSatisfied(zp1p, 12);
            result.put("s1", CommonFunc.convertDoubleToString(s1));
            result.put("zp1p", CommonFunc.convertDoubleToString(zp1p));
            result.put("x1", CommonFunc.convertDoubleToString(x1));
            result.put("x2", CommonFunc.convertDoubleToString(x2));
        }
        if (xh2 != null) {
            Double s2 = tshl / 100 / n2;
            Double zp2p = f2 / s2;
            String x3 = getSign(zp2p, 6);
            String x4 = getSatisfied(zp2p, 6);
            result.put("s2", CommonFunc.convertDoubleToString(s2));
            result.put("zp2p", CommonFunc.convertDoubleToString(zp2p));
            result.put("x3", CommonFunc.convertDoubleToString(x3));
            result.put("x4", CommonFunc.convertDoubleToString(x4));
        }
        return result;
    }

    public Map<String, String> getMapForPdf2() {
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
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("xh1", CommonFunc.convertDoubleToString(xh1));
        result.put("d1", CommonFunc.convertDoubleToString(d1));
        result.put("n1", CommonFunc.convertDoubleToString(n1));
        result.put("f1", CommonFunc.convertDoubleToString(f1));
        result.put("p1", CommonFunc.convertDoubleToString(p1));
        result.put("xh2", CommonFunc.convertDoubleToString(xh2));
        result.put("d2", CommonFunc.convertDoubleToString(d2));
        result.put("n2", CommonFunc.convertDoubleToString(n2));
        result.put("f2", CommonFunc.convertDoubleToString(f2));
        result.put("p2", CommonFunc.convertDoubleToString(p2));
        if (xh1 != null) {
            Double s1 = tsl / 100 / n1;
            Double zp1p = f1 / s1;
            String x1 = getSign(zp1p, 12);
            String x2 = getSatisfied(zp1p, 12);
            Double s1p=f1/12;
            String y1=getSign(s1p,s1);
            String y2=getSatisfied(s1p,s1);
            result.put("s1", CommonFunc.convertDoubleToString(s1));
            result.put("zp1p", CommonFunc.convertDoubleToString(zp1p));
            result.put("x1", CommonFunc.convertDoubleToString(x1));
            result.put("x2", CommonFunc.convertDoubleToString(x2));
            result.put("s1p", CommonFunc.convertDoubleToString(s1p));
            result.put("y1", CommonFunc.convertDoubleToString(y1));
            result.put("y2", CommonFunc.convertDoubleToString(y2));
        }
        if (xh2 != null) {
            Double s2 = tshl / 100 / n2;
            Double zp2p = f2 / s2;
            String x3 = getSign(zp2p, 6);
            String x4 = getSatisfied(zp2p, 6);
            Double s2p=f2/6;
            String y3=getSign(s2p,s2);
            String y4=getSatisfied(s2p,s2);
            result.put("s2", CommonFunc.convertDoubleToString(s2));
            result.put("zp2p", CommonFunc.convertDoubleToString(zp2p));
            result.put("x3", CommonFunc.convertDoubleToString(x3));
            result.put("x4", CommonFunc.convertDoubleToString(x4));
            result.put("s2p", CommonFunc.convertDoubleToString(s2p));
            result.put("y3", CommonFunc.convertDoubleToString(y3));
            result.put("y4", CommonFunc.convertDoubleToString(y4));
        }
        return result;
    }
    public Map<String,String>getCheck(){
        Map<String,String> result=new HashMap<>();
        Map<String,String> map=getMapForPdf();
        result.put("zp1p",map.get("zp1p"));
        result.put("x2",map.get("x2"));
        result.put("zp2p",map.get("zp2p"));
        result.put("x4",map.get("x4"));
        return result;
    }
}