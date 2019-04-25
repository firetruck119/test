package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class WireRopeEntity {
    private String bh ;
    private String bb ;
    private String xmmc ;
    private String jsr ;
    private String shr ;
    private String jsrq ;

    private Double h ;
    private Double swp ;
    private Double rl ;
    private Double d1 ;
    private Double c1;
    private Double f1 ;
    private Double hwll ;
    private Double d2 ;
    private Double c2 ;

    public Double getC2() {
        return c2;
    }

    public void setC2(Double c2) {
        this.c2 = c2;
    }

    private Double f2 ;

    public Double getC1() {
        return c1;
    }

    public void setC1(Double c1) {
        this.c1 = c1;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public void setBb(String bb) {
        this.bb = bb;
    }

    public void setXmmc(String xmmc) {
        this.xmmc = xmmc;
    }

    public void setJsr(String jsr) {
        this.jsr = jsr;
    }

    public void setShr(String shr) {
        this.shr = shr;
    }

    public void setJsrq(String jsrq) {
        this.jsrq = jsrq;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public void setSwp(Double swp) {
        this.swp = swp;
    }

    public void setRl(Double rl) {
        this.rl = rl;
    }

    public void setD1(Double d1) {
        this.d1 = d1;
    }

    public void setF1(Double f1) {
        this.f1 = f1;
    }

    public void setHwll(Double hwll) {
        this.hwll = hwll;
    }

    public void setD2(Double d2) {
        this.d2 = d2;
    }

    public void setF2(Double f2) {
        this.f2  = f2;
    }

    public String getBh() {
        return bh;
    }

    public String getBb() {
        return bb;
    }

    public String getXmmc() {
        return xmmc;
    }

    public String getJsr() {
        return jsr;
    }

    public String getShr() {
        return shr;
    }

    public String getJsrq() {
        return jsrq;
    }

    public Double getSwp() {
        return swp;
    }

    public Double getD1() {
        return d1;
    }

    public Double getD2() {
        return d2;
    }

    public Double getF1() {
        return f1;
    }

    public Double getF2() {
        return f2;
    }

    public Double getH() {
        return h;
    }

    public Double getHwll() {
        return hwll;
    }

    public Double getRl() {
        return rl;
    }



    private String getSign(Double temp,Double other){
        if(temp<other)
            return "<";
        else if(temp>other)
            return ">";
        else
            return "=";
    }


    private String getSatisfied(boolean flag){
        return flag?"满足":"不满足";
    }

    private String getYou(boolean flag){
        return flag ?"":"not";
    }
    public Map<String,String> getMapForPdf() {
        Map<String, String> result = new HashMap<>();
        Double mwr = 4 * h * c1;
        Double s1 = rl + swp + mwr;
        Double zp1 = f1 / s1;
        String pd1 = getSign(zp1,12.0);
        String jl1 = getSatisfied(zp1 >= 12);
        String yon1 = getYou(zp1 >= 12);
        Double hsw = h * c2;
        Double s2 = hwll + hsw;
        Double zp2 = f2 / s2;
        String pd2 = getSign(zp2 ,6.0);
        String jl2 = getSatisfied(zp2 >= 6);
        String yon2 = getYou(zp2 >= 6);


        result.put("bh", CommonFunc.convertDoubleToString(bh));
        result.put("bb", CommonFunc.convertDoubleToString(bb));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("jsrq", CommonFunc.convertDoubleToString(jsrq));
        result.put("h", CommonFunc.convertDoubleToString(h));
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("rl", CommonFunc.convertDoubleToString(rl));
        result.put("d1", CommonFunc.convertDoubleToString(d1));
        result.put("f1", CommonFunc.convertDoubleToString(f1));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("d2", CommonFunc.convertDoubleToString(d2));
        result.put("f2", CommonFunc.convertDoubleToString(f2));


        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("s1", CommonFunc.convertDoubleToString(s1));
        result.put("s2", CommonFunc.convertDoubleToString(s2));
        result.put("zp1", CommonFunc.convertDoubleToString(zp1));
        result.put("pd1", CommonFunc.convertDoubleToString(pd1));
        result.put("jl1", CommonFunc.convertDoubleToString(jl1));
        result.put("yon1", CommonFunc.convertDoubleToString(yon1));
        result.put("zp2", CommonFunc.convertDoubleToString(zp2));
        result.put("pd2", CommonFunc.convertDoubleToString(pd2));
        result.put("jl2", CommonFunc.convertDoubleToString(jl2));
        result.put("yon2", CommonFunc.convertDoubleToString(yon2));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        return result;

    }


}
