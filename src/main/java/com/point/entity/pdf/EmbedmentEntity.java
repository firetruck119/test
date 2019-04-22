package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class EmbedmentEntity {
    private String no ;
    private String ver ;
    private String xmmc ;
    private String jsr ;
    private String shr ;
    private String date ;
    private Double h ;
    private Double v ;
    private Double n ;
    private String cz ;
    private Double d ;
    private String nr ;
    private Double by ;
    private Double bx ;
    private String pcz ;
    private Double t ;
    private String ccz ;
    private Double as ;
    private String bak ;
    private Double la ;
    private Double co ;
    private Double c10 ;
    private Double b ;
    private String ack;

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

    public Double getV() {
        return v;
    }

    public void setV(Double v) {
        this.v = v;
    }

    public Double getN() {
        return n;
    }

    public void setN(Double n) {
        this.n = n;
    }

    public String getCz() {
        return cz;
    }

    public void setCz(String cz) {
        this.cz = cz;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public Double getBy() {
        return by;
    }

    public void setBy(Double by) {
        this.by = by;
    }

    public Double getBx() {
        return bx;
    }

    public void setBx(Double bx) {
        this.bx = bx;
    }

    public String getPcz() {
        return pcz;
    }

    public void setPcz(String pcz) {
        this.pcz = pcz;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public String getCcz() {
        return ccz;
    }

    public void setCcz(String ccz) {
        this.ccz = ccz;
    }

    public Double getAs() {
        return as;
    }

    public void setAs(Double as) {
        this.as = as;
    }

    public String getBak() {
        return bak;
    }

    public void setBak(String bak) {
        this.bak = bak;
    }

    public Double getLa() {
        return la;
    }

    public void setLa(Double la) {
        this.la = la;
    }

    public Double getCo() {
        return co;
    }

    public void setCo(Double co) {
        this.co = co;
    }

    public Double getC10() {
        return c10;
    }

    public void setC10(Double c10) {
        this.c10 = c10;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public String getAck() {
        return ack;
    }

    public void setAck(String ack) {
        this.ack = ack;
    }

    private Double getFy(){
        Double fy = 0.0;
        if(cz.equals("Q235B"))fy=210.0;
        if(cz.equals("Q345B"))fy=295.0;
        if(cz.equals("HPB300"))fy=270.0;
        if(cz.equals("HRB335"))fy=300.0;
        if(cz.equals("HRB400"))fy=360.0;
        if(cz.equals("HRB500"))fy=435.0;
        return fy;
    }

    private Double getFc() {
        Double result = 0.0;
        if (ccz .equals( "C20")) result = 9.6;
        if (ccz .equals( "C25")) result = 11.9;
        if (ccz .equals( "C30")) result = 14.3;
        if (ccz .equals( "C35")) result = 16.7;
        if (ccz .equals( "C40")) result = 19.1;
        if (ccz .equals( "C45")) result = 21.1;
        return result;
    }

    private Double getFt() {
        Double result = 0.0;
        if (ccz .equals( "C20")) result = 1.1;
        if (ccz .equals( "C25")) result = 1.27;
        if (ccz .equals( "C30")) result = 1.43;
        if (ccz .equals( "C35")) result = 1.57;
        if (ccz .equals( "C40")) result = 1.71;
        if (ccz .equals( "C45")) result = 1.8;
        return result;
    }

    private Double getAr(){
        Double result = 0.0;
        if (nr .equals( "2")) result = 1.0;
        if (nr .equals( "3")) result = 0.9;
        if (nr .equals( "4")) result = 0.85;
        return result;
    }

    private Double getA() {
        Double result = 0.0;
        if (bak .equals( "光圆钢筋")) result = 0.16;
        if (bak .equals( "带肋钢筋")) result = 0.14;
        if (bak .equals( "螺旋类钢丝")) result = 0.13;
        if (bak .equals( "三股钢绞丝")) result = 0.16;
        if (bak .equals( "七股钢绞丝")) result = 0.17;
        return result;
    }





    public String getSatisfied(boolean flag){
        return flag?"满足":"不满足";
    }

    public Map<String,String> getMapForPdf(){
        Map<String,String> result = new HashMap<>();
        b=bx;
        Double m=v*h/1000;
        Double fy=getFy();
        Double fc=getFc();
        Double ft=getFt();
        Double ar =getAr();
        Double av =	(4-0.8*d)*Math.pow(fc/fy,0.5);
        Double ab =0.6+0.25*t/d;
        Double as2min=n*1000/(0.8*ab*fy)+m*1000/(0.4*ar*ab*fy*by);
        Double as1min=(v*1000)/(ar*av*fy)+(n*1000)/(0.8*ab*fy)+(m*1000)/(1.3*ar*ab*fy*by);
        Double asmin= Math.max(as2min,as1min) ;
        Double na=asmin/as;
        String c1 = getSatisfied( na<1);
        Double a = getA();
        Double lab=a*fy/ft*d;
        Double lamin=lab*0.6;
        Double nla=lamin/la;
        String c7=getSatisfied(nla<1);
        Double tmin=by/8;
        Double nt=tmin/t;
        String c2=getSatisfied(nt<1);
        Double comin=2d;
        Double nc=comin/co;
        String c3 = getSatisfied(nc<1);
        Double c1min=3d;
        Double nc1=c1min/c10;
        String c8 = getSatisfied(nc1<1);
        Double bmin=6d;
        Double nb=bmin/b;
        String c4 = getSatisfied(nb<1);
        String c5 = getSatisfied(c2.equals("满足")&&c3.equals("满足")&&c4.equals("满足")&&c7.equals("满足")&&c8.equals("满足"));


        result.put("no",CommonFunc.convertDoubleToString(no));
        result.put("ver",CommonFunc.convertDoubleToString(ver));
        result.put("xmmc",CommonFunc.convertDoubleToString(xmmc));
        result.put("jsr",CommonFunc.convertDoubleToString(jsr));
        result.put("shr",CommonFunc.convertDoubleToString(shr));
        result.put("date",CommonFunc.convertDoubleToString(date));
        result.put("h",CommonFunc.convertDoubleToString(h));
        result.put("v",CommonFunc.convertDoubleToString(v));
        result.put("n",CommonFunc.convertDoubleToString(n));
        result.put("cz",CommonFunc.convertDoubleToString(cz));
        result.put("d",CommonFunc.convertDoubleToString(d));
        result.put("nr",CommonFunc.convertDoubleToString(nr));
        result.put("nc",CommonFunc.convertDoubleToString(nc));
        result.put("by",CommonFunc.convertDoubleToString(by));
        result.put("bx",CommonFunc.convertDoubleToString(bx));
        result.put("pcz",CommonFunc.convertDoubleToString(pcz));
        result.put("t",CommonFunc.convertDoubleToString(t));
        result.put("ccz",CommonFunc.convertDoubleToString(ccz));
        result.put("as",CommonFunc.convertDoubleToString(as));
        result.put("bak",CommonFunc.convertDoubleToString(bak));
        result.put("la",CommonFunc.convertDoubleToString(la));
        result.put("co",CommonFunc.convertDoubleToString(co));
        result.put("c10",CommonFunc.convertDoubleToString(c10));
        result.put("b",CommonFunc.convertDoubleToString(b));
        result.put("ack",CommonFunc.convertDoubleToString(ack));

        result.put("m",CommonFunc.convertDoubleToString(m));
        result.put("fy",CommonFunc.convertDoubleToString(fy));
        result.put("fc",CommonFunc.convertDoubleToString(fc));
        result.put("ft",CommonFunc.convertDoubleToString(ft));
        result.put("ar",CommonFunc.convertDoubleToString(ar));
        result.put("av",CommonFunc.convertDoubleToString(av));
        result.put("ab",CommonFunc.convertDoubleToString(ab));
        result.put("asmin",CommonFunc.convertDoubleToString(asmin));
        result.put("na",CommonFunc.convertDoubleToString(na));
        result.put("c1",CommonFunc.convertDoubleToString(c1));
        result.put("a",CommonFunc.convertDoubleToString(a));
        result.put("lab",CommonFunc.convertDoubleToString(lab));
        result.put("lamin",CommonFunc.convertDoubleToString(lamin));
        result.put("nla",CommonFunc.convertDoubleToString(nla));
        result.put("c7",CommonFunc.convertDoubleToString(c7));
        result.put("tmin",CommonFunc.convertDoubleToString(tmin));
        result.put("nt",CommonFunc.convertDoubleToString(nt));
        result.put("c2",CommonFunc.convertDoubleToString(c2));
        result.put("comin",CommonFunc.convertDoubleToString(comin));
        result.put("nc",CommonFunc.convertDoubleToString(nc));
        result.put("c3",CommonFunc.convertDoubleToString(c3));
        result.put("c1min",CommonFunc.convertDoubleToString(c1min));
        result.put("nc1",CommonFunc.convertDoubleToString(nc1));
        result.put("c8",CommonFunc.convertDoubleToString(c8));
        result.put("bmin",CommonFunc.convertDoubleToString(bmin));
        result.put("nb",CommonFunc.convertDoubleToString(nb));
        result.put("c4",CommonFunc.convertDoubleToString(c4));
        result.put("c5",CommonFunc.convertDoubleToString(c5));
        return result;
    }


}
