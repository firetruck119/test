package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class QxzqEntity {
    private	String	no;
    private	String	ver;
    private	String	xmmc;
    private	String	zjxh;
    private	String	jsr;
    private	String	shr;
    private	String	pzr;
    private	String	date;
    private	String	csmc;
    private	String	cslx;
    private	Double	h;
    private	Double	lc;
    private	Double	nxz;
    private	Double	nsb;
    private	Double	ldc;
    private	Double	wcd;
    private	Double	vdc;
    private	Double	vqx;
    private	Double	tzh;
    private	Double	txd;
    private	Double	tmr;
    private	Double	oyx;
    private	Double	ozh;
    private	Double	osj;
    private	Double	n3;
    private	Double	smj;
    private	Double	t2;
    private	Double	t3;
    private	Double	t4;
    private	Double	tz;
    private	Double	tll;
    private	Double	ttq;

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

    public String getCsmc() {
        return csmc;
    }

    public void setCsmc(String csmc) {
        this.csmc = csmc;
    }

    public String getCslx() {
        return cslx;
    }

    public void setCslx(String cslx) {
        this.cslx = cslx;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getLc() {
        return lc;
    }

    public void setLc(Double lc) {
        this.lc = lc;
    }

    public Double getNxz() {
        return nxz;
    }

    public void setNxz(Double nxz) {
        this.nxz = nxz;
    }

    public Double getNsb() {
        return nsb;
    }

    public void setNsb(Double nsb) {
        this.nsb = nsb;
    }

    public Double getLdc() {
        return ldc;
    }

    public void setLdc(Double ldc) {
        this.ldc = ldc;
    }

    public Double getWcd() {
        return wcd;
    }

    public void setWcd(Double wcd) {
        this.wcd = wcd;
    }

    public Double getVdc() {
        return vdc;
    }

    public void setVdc(Double vdc) {
        this.vdc = vdc;
    }

    public Double getVqx() {
        return vqx;
    }

    public void setVqx(Double vqx) {
        this.vqx = vqx;
    }

    public Double getTzh() {
        return tzh;
    }

    public void setTzh(Double tzh) {
        this.tzh = tzh;
    }

    public Double getTxd() {
        return txd;
    }

    public void setTxd(Double txd) {
        this.txd = txd;
    }

    public Double getTmr() {
        return tmr;
    }

    public void setTmr(Double tmr) {
        this.tmr = tmr;
    }

    public Double getOyx() {
        return oyx;
    }

    public void setOyx(Double oyx) {
        this.oyx = oyx;
    }

    public Double getOzh() {
        return ozh;
    }

    public void setOzh(Double ozh) {
        this.ozh = ozh;
    }

    public Double getOsj() {
        return osj;
    }

    public void setOsj(Double osj) {
        this.osj = osj;
    }

    public Double getN3() {
        return n3;
    }

    public void setN3(Double n3) {
        this.n3 = n3;
    }

    public Double getSmj() {
        return smj;
    }

    public void setSmj(Double smj) {
        this.smj = smj;
    }

    public Double getT2() {
        return t2;
    }

    public void setT2(Double t2) {
        this.t2 = t2;
    }

    public Double getT3() {
        return t3;
    }

    public void setT3(Double t3) {
        this.t3 = t3;
    }

    public Double getT4() {
        return t4;
    }

    public void setT4(Double t4) {
        this.t4 = t4;
    }

    public Double getTz() {
        return tz;
    }

    public void setTz(Double tz) {
        this.tz = tz;
    }

    public Double getTll() {
        return tll;
    }

    public void setTll(Double tll) {
        this.tll = tll;
    }

    public Double getTtq() {
        return ttq;
    }

    public void setTtq(Double ttq) {
        this.ttq = ttq;
    }
    public Map<String,String> getMapForPdf(){
        Map<String,String> result = new HashMap<>();
        result.put("no",no);
        result.put("ver",ver);
        result.put("xmmc",xmmc);
        result.put("zjxh",zjxh);
        result.put("jsr", jsr);
        result.put("shr", shr);
        result.put("pzr", pzr);
        result.put("date",date);
        result.put("csmc",csmc);
        result.put("cslx",cslx);
        Map<String, Double> paramMap = new HashMap<>();
        paramMap.put("h",h)	;
        paramMap.put("lc",lc);
        paramMap.put("nxz"	,nxz);
        paramMap.put("nsb"	,nsb);
        paramMap.put("ldc"	,ldc);
        paramMap.put("wcd"	,wcd);
        paramMap.put("vdc"	,vdc);
        paramMap.put("vqx"	,vqx);
        paramMap.put("tzh"	,tzh);
        paramMap.put("txd"	,txd);
        paramMap.put("tmr"	,tmr);
        paramMap.put("oyx"	,oyx);
        paramMap.put("ozh",ozh);
        paramMap.put("osj",osj);
        Double n3=lc/wcd;
        Double smj=h*wcd;
        Double t2=smj/vqx;
        Double t3=osj*h/vdc;
        Double t4 = nxz*txd;
        Double tz=tzh+t2+2*t3+t4;
        Double tll=ozh*n3*tz/nsb/60/tmr;
        Double ttq=100*tll/oyx;
        paramMap.put("n3",n3);
        paramMap.put("smj",smj);
        paramMap.put("t2",t2);
        paramMap.put("t3",t3);
        paramMap.put("t4",t4);
        paramMap.put("tz",tz);
        paramMap.put("tll",tll);
        paramMap.put("ttq",ttq);

        for(Map.Entry<String, Double> entry : paramMap.entrySet()){
            result.put(entry.getKey(),CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return result;
    }

    public Map<String,String> check(){
        Map<String,String> map=getMapForPdf();
        Map<String,String> result=new HashMap<>();
        result.put("理论全区域清洗周期",map.get("tll"));
        result.put("考虑天气因素后的全区域清洗周期",map.get("ttq"));
        return result;
    }
}
