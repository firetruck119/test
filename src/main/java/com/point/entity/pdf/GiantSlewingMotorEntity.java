package com.point.entity.pdf;


import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class GiantSlewingMotorEntity {
    /*
     *封面内容
     */
    private String no ;
    private String ver ;
    private String xmmc ;
    private String zjxh ;
    private String jsr ;
    private String shr ;
    private String pzr ;
    private String date ;
    /*
     * 输入参数
     */
    //设备安装高度及导致的非工作风压
    private Double h ;
    private Double pf ;
    //擦窗机各部件载荷
    private Double tsl ;
    private Double tshl;
    private Double m1 ;
    private Double m2 ;
    private Double m3 ;
    private Double m4 ;
    private Double m5 ;
    private Double m6 ;
    private Double m7 ;
    private Double m8 ;
    private Double m9 ;
    private Double m10 ;
    private Double m11 ;
    private Double m12 ;
    private Double m13 ;
    //擦窗机各部件重心至回转中心距离
    private Double lsl ;
    private Double lshl ;
    private Double l1 ;
    private Double l2 ;
    private Double l3 ;
    private Double l4 ;
    private Double l5 ;
    private Double l6 ;
    private Double l7 ;
    private Double l8 ;
    private Double l9 ;
    private Double l10 ;
    private Double l11 ;
    private Double l12 ;
    private Double l13 ;
        //非工作
    private Double lw1 ;
    private Double lw2 ;
    private Double lw3 ;
    private Double lw4 ;
    private Double lw5 ;
    private Double lw6 ;
    private Double lw7 ;
    private Double lw8 ;
    private Double lw9 ;
    private Double lw10 ;
    private Double lw11 ;
    private Double lw12 ;
    private Double lw13 ;
    //擦窗机各部件迎风面积
    private Double asl ;
    private Double ashl ;
    private Double a1 ;
    private Double a2  ;
    private Double a3 ;
    private Double a4 ;
    private Double a5 ;
    private Double a6 ;
    private Double a7 ;
    private Double a8 ;
    private Double a9 ;
    private Double a10 ;
    private Double a11 ;
    private Double a12 ;
    private Double a13 ;
        //非工作状态
    private Double aw1;
    private Double aw2 ;
    private Double aw3;
    private Double aw4 ;
    private Double aw5 ;
    private Double aw6 ;
    private Double aw7;
    private Double aw8;
    private Double aw9 ;
    private Double aw10;
    private Double aw11;
    private Double aw12 ;
    private Double aw13 ;
    //回转支撑型号
    private String zcxh ;
    private Double ms1 ;
    private Double z1 ;
    private Double d ;
    //回转电机型号
    private String djxh ;
    private Double p1 ;
    private Double tn1 ;
    private Double t1 ;
    private Double na ;
    private Double ta ;
    private Double i1 ;
    //小齿轮参数
    private Double ms2 ;
    private Double z2 ;






    public Double getLw7() {
        return lw7;
    }

    public void setLw7(Double lw7) {
        this.lw7 = lw7;
    }

    public Double getLw8() {
        return lw8;
    }

    public void setLw8(Double lw8) {
        this.lw8 = lw8;
    }

    public Double getLw9() {
        return lw9;
    }

    public void setLw9(Double lw9) {
        this.lw9 = lw9;
    }

    public Double getLw10() {
        return lw10;
    }

    public void setLw10(Double lw10) {
        this.lw10 = lw10;
    }

    public Double getLw11() {
        return lw11;
    }

    public void setLw11(Double lw11) {
        this.lw11 = lw11;
    }

    public Double getAw1() {
        return aw1;
    }

    public void setAw1(Double aw1) {
        this.aw1 = aw1;
    }

    public Double getAw3() {
        return aw3;
    }

    public void setAw3(Double aw3) {
        this.aw3 = aw3;
    }

    public Double getAw7() {
        return aw7;
    }

    public void setAw7(Double aw7) {
        this.aw7 = aw7;
    }

    public Double getAw8() {
        return aw8;
    }

    public void setAw8(Double aw8) {
        this.aw8 = aw8;
    }

    public Double getAw10() {
        return aw10;
    }

    public void setAw10(Double aw10) {
        this.aw10 = aw10;
    }

    public Double getAw11() {
        return aw11;
    }

    public void setAw11(Double aw11) {
        this.aw11 = aw11;
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

    public Double getTsl() {
        return tsl;
    }

    public void setTsl(Double tsl) {
        this.tsl = tsl;
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

    public Double getLsl() {
        return lsl;
    }

    public void setLsl(Double lsl) {
        this.lsl = lsl;
    }

    public Double getLshl() {
        return lshl;
    }

    public void setLshl(Double lshl) {
        this.lshl = lshl;
    }

    public Double getL1() {
        return l1;
    }

    public void setL1(Double l1) {
        this.l1 = l1;
    }

    public Double getL2() {
        return l2;
    }

    public void setL2(Double l2) {
        this.l2 = l2;
    }

    public Double getL3() {
        return l3;
    }

    public void setL3(Double l3) {
        this.l3 = l3;
    }

    public Double getL4() {
        return l4;
    }

    public void setL4(Double l4) {
        this.l4 = l4;
    }

    public Double getL5() {
        return l5;
    }

    public void setL5(Double l5) {
        this.l5 = l5;
    }

    public Double getL6() {
        return l6;
    }

    public void setL6(Double l6) {
        this.l6 = l6;
    }

    public Double getL7() {
        return l7;
    }

    public void setL7(Double l7) {
        this.l7 = l7;
    }

    public Double getL8() {
        return l8;
    }

    public void setL8(Double l8) {
        this.l8 = l8;
    }

    public Double getL9() {
        return l9;
    }

    public void setL9(Double l9) {
        this.l9 = l9;
    }

    public Double getL10() {
        return l10;
    }

    public void setL10(Double l10) {
        this.l10 = l10;
    }

    public Double getL11() {
        return l11;
    }

    public void setL11(Double l11) {
        this.l11 = l11;
    }

    public Double getL12() {
        return l12;
    }

    public void setL12(Double l12) {
        this.l12 = l12;
    }

    public Double getL13() {
        return l13;
    }

    public void setL13(Double l13) {
        this.l13 = l13;
    }

    public Double getLw1() {
        return lw1;
    }

    public void setLw1(Double lw1) {
        this.lw1 = lw1;
    }

    public Double getLw2() {
        return lw2;
    }

    public void setLw2(Double lw2) {
        this.lw2 = lw2;
    }

    public Double getLw3() {
        return lw3;
    }

    public void setLw3(Double lw3) {
        this.lw3 = lw3;
    }

    public Double getLw4() {
        return lw4;
    }

    public void setLw4(Double lw4) {
        this.lw4 = lw4;
    }

    public Double getLw5() {
        return lw5;
    }

    public void setLw5(Double lw5) {
        this.lw5 = lw5;
    }

    public Double getLw6() {
        return lw6;
    }

    public void setLw6(Double lw6) {
        this.lw6 = lw6;
    }

    public Double getLw12() {
        return lw12;
    }

    public void setLw12(Double lw12) {
        this.lw12 = lw12;
    }

    public Double getLw13() {
        return lw13;
    }

    public void setLw13(Double lw13) {
        this.lw13 = lw13;
    }

    public Double getAsl() {
        return asl;
    }

    public void setAsl(Double asl) {
        this.asl = asl;
    }

    public Double getAshl() {
        return ashl;
    }

    public void setAshl(Double ashl) {
        this.ashl = ashl;
    }

    public Double getA1() {
        return a1;
    }

    public void setA1(Double a1) {
        this.a1 = a1;
    }

    public Double getA2() {
        return a2;
    }

    public void setA2(Double a2) {
        this.a2 = a2;
    }

    public Double getA3() {
        return a3;
    }

    public void setA3(Double a3) {
        this.a3 = a3;
    }

    public Double getA4() {
        return a4;
    }

    public void setA4(Double a4) {
        this.a4 = a4;
    }

    public Double getA5() {
        return a5;
    }

    public void setA5(Double a5) {
        this.a5 = a5;
    }

    public Double getA6() {
        return a6;
    }

    public void setA6(Double a6) {
        this.a6 = a6;
    }

    public Double getA7() {
        return a7;
    }

    public void setA7(Double a7) {
        this.a7 = a7;
    }

    public Double getA8() {
        return a8;
    }

    public void setA8(Double a8) {
        this.a8 = a8;
    }

    public Double getA9() {
        return a9;
    }

    public void setA9(Double a9) {
        this.a9 = a9;
    }

    public Double getA10() {
        return a10;
    }

    public void setA10(Double a10) {
        this.a10 = a10;
    }

    public Double getA11() {
        return a11;
    }

    public void setA11(Double a11) {
        this.a11 = a11;
    }

    public Double getA12() {
        return a12;
    }

    public void setA12(Double a12) {
        this.a12 = a12;
    }

    public Double getA13() {
        return a13;
    }

    public void setA13(Double a13) {
        this.a13 = a13;
    }

    public Double getAw2() {
        return aw2;
    }

    public void setAw2(Double aw2) {
        this.aw2 = aw2;
    }

    public Double getAw4() {
        return aw4;
    }

    public void setAw4(Double aw4) {
        this.aw4 = aw4;
    }

    public Double getAw5() {
        return aw5;
    }

    public void setAw5(Double aw5) {
        this.aw5 = aw5;
    }

    public Double getAw6() {
        return aw6;
    }

    public void setAw6(Double aw6) {
        this.aw6 = aw6;
    }

    public Double getAw9() {
        return aw9;
    }

    public void setAw9(Double aw9) {
        this.aw9 = aw9;
    }

    public Double getAw12() {
        return aw12;
    }

    public void setAw12(Double aw12) {
        this.aw12 = aw12;
    }

    public Double getAw13() {
        return aw13;
    }

    public void setAw13(Double aw13) {
        this.aw13 = aw13;
    }

    public String getZcxh() {
        return zcxh;
    }

    public void setZcxh(String zcxh) {
        this.zcxh = zcxh;
    }

    public Double getMs1() {
        return ms1;
    }

    public void setMs1(Double ms1) {
        this.ms1 = ms1;
    }

    public Double getZ1() {
        return z1;
    }

    public void setZ1(Double z1) {
        this.z1 = z1;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public String getDjxh() {
        return djxh;
    }

    public void setDjxh(String djxh) {
        this.djxh = djxh;
    }

    public Double getP1() {
        return p1;
    }

    public void setP1(Double p1) {
        this.p1 = p1;
    }

    public Double getTn1() {
        return tn1;
    }

    public void setTn1(Double tn1) {
        this.tn1 = tn1;
    }

    public Double getT1() {
        return t1;
    }

    public void setT1(Double t1) {
        this.t1 = t1;
    }

    public Double getNa() {
        return na;
    }

    public void setNa(Double na) {
        this.na = na;
    }

    public Double getTa() {
        return ta;
    }

    public void setTa(Double ta) {
        this.ta = ta;
    }

    public Double getI1() {
        return i1;
    }

    public void setI1(Double i1) {
        this.i1 = i1;
    }

    public Double getMs2() {
        return ms2;
    }

    public void setMs2(Double ms2) {
        this.ms2 = ms2;
    }

    public Double getZ2() {
        return z2;
    }

    public void setZ2(Double z2) {
        this.z2 = z2;
    }
    public Map<String,String> getMapForPdf1(){
        Map<String,String> result =new HashMap<>();
        Map<String,Double> map=getDoubleMap();
        Boolean x1 = map.get("t")<=tn1;
        Boolean x2 =  map.get("pa")<=p1;
        Boolean x3 = x1 && x2;
        Boolean x4 =  map.get("tz")<=t1;
        Boolean x5 =  map.get("tz")<=t1;
        Boolean x6 = x1 && x2 && x4;
        for(Map.Entry<String,Double> e:map.entrySet()){
            result.put(e.getKey(),CommonFunc.convertDoubleToString(e.getValue()));
        }
        result.put("zcxh", CommonFunc.convertDoubleToString(zcxh));
        result.put("djxh", CommonFunc.convertDoubleToString(djxh));
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh",CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));
        result.put("x1", getConclusionMark(x1));
        result.put("x2", getConclusionMark(x2));
        result.put("x3", getConclusionStr(x3));
        result.put("x4", getConclusionMark(x4));
        result.put("x5", getConclusionStr(x5));
        result.put("x6", getConclusionStr(x6));
        return result;
    }
    public Map<String,Double> getDoubleMap(){
        Map<String,Double> result = new HashMap<>();

        /*
         * 备注计算
         */
        Double i2=1+z1/z2;
        Double n=na/i2;

        /*
         * 工作状态擦窗机各部件风载阻力矩
         */
        Double twsl=250*asl*lsl;
        Double twshl=250*ashl*lshl;
        Double tw1=250*a1*l1;
        Double tw2=250*a2*l2;
        Double tw3=250*a3*l3;
        Double tw4=250*a4*l4;
        Double tw5=250*a5*l5;
        Double tw6=250*a6*l6;
        Double tw7=250*a7*l7;
        Double tw8=250*a8*l8;
        Double tw9=250*a9*l9;
        Double tw10=250*a10*l10;
        Double tw11=250*a11*l11;
        Double tw12=250*a12*l12;
        Double tw13=250*a13*l13;

        /*
         *工作状态擦窗机各部件倾覆力矩
         */
        Double mqasl=tsl*lsl*10;
        Double mqashl=tshl*lshl*10;
        Double mqa1=m1*l1*10;
        Double mqa2=m2*l2*10;
        Double mqa3=m3*l3*10;
        Double mqa4=m4*l4*10;
        Double mqa5=m5*l5*10;
        Double mqa6=m6*l6*10;

        /*
         * 工作状态擦窗机各部件抗倾覆力矩
         */
        Double mqa7=m7*l7*10;
        Double mqa8=m8*l8*10;
        Double mqa9=m9*l9*10;
        Double mqa10=m10*l10*10;
        Double mqa11=m11*l11*10;
        Double mqa12=m12*l12*10;
        Double mqa13=m13*l13*10;

        /*
         * 工作状态擦窗机各部件风载荷
         */
        Double fsl=250*asl;
        Double fshl=250*ashl;
        Double f1=250*a1;
        Double f2=250*a2;
        Double f3=250*a3;
        Double  f4=250*a4;
        Double f5=250*a5;
        Double f6=250*a6;
        Double f7=250*a7;
        Double f8=250*a8;
        Double f9=250*a9;
        Double  f10=250*a10;
        Double f11=250*a11;
        Double f12=250*a12;
        Double f13=250*a13;

        /*
         * 非工作状态擦窗机各部件风载阻力矩
         */
        Double twa1=pf*a1*lw1;
        Double twa2=pf*aw2*lw2;
        Double twa3=pf*a3*lw3;
        Double twa4=pf*aw4*lw4;
        Double twa5=pf*aw5*lw5;
        Double twa6=pf*aw6*lw6;
        Double twa7=pf*a7*l7;
        Double twa8=pf*a8*lw8;
        Double twa9=pf*aw9*l9;
        Double twa10=pf*a10*l10;
        Double twa11=pf*a11*l11;
        Double twa12=pf*aw12*lw12;
        Double twa13=pf*aw13*lw13;

        /*
         * 非工作状态擦窗机各部件倾覆力矩
         */
        Double mfa1=m1*lw1*10;
        Double mfa2=m2*lw2*10;
        Double mfa3=m3*lw3*10;
        Double mfa4=m4*lw4*10;
        Double mfa5=m5*lw5*10;
        Double mfa6=m6*lw6*10;

        /*
         * 非工作状态擦窗机各部件抗倾覆力矩
         */
        Double mfa7=m7*l7*10;
        Double mfa8=m8*lw8*10;
        Double mfa9=m9*l9*10;
        Double mfa10=m10*l10*10;
        Double mfa11=m11*l11*10;
        Double mfa12=m12*lw12*10;
        Double mfa13=m13*lw13*10;

        /*
         * 非工作状态擦窗机各部件风载荷
         */
        Double ff1=pf*a1;
        Double ff2=pf*aw2;
        Double ff3=pf*a3;
        Double ff4=pf*aw4;
        Double ff5=pf*aw5;
        Double ff6=pf*aw6;
        Double ff7=pf*a7;
        Double ff8=pf*a8;
        Double ff9=pf*aw9;
        Double ff10=pf*a10;
        Double ff11=pf*a11;
        Double ff12=pf*aw12;
        Double ff13=pf*aw13;

        /*
         * 工作状态摩擦阻力矩计算条件
         */
        Double mq1=mqasl+mqashl+mqa1+mqa2+mqa3+mqa4+mqa5+mqa6;
        Double mq2=mqa7+mqa8+mqa9+mqa10+mqa11+mqa12+mqa13;
        Double mq=mq1-mq2;
        Double fa=(tsl+tshl+m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12+m13)*10;
        Double fr=fsl+fshl+f1+f2+f3+f4+f5+f6+f7+f8+f9+f10+f11+f12+f13;
        Double e=acos(d*fa/4.5/mq);
        Double n1=(fa/0.707*(1-2*e/3.14))+(2*4.5*mq/3.14/d)+(4*fr/3.14/0.707);

        /*
         * 工作状态惯性阻力矩计算条件
         */
        Double ja1=tsl*lsl*lsl;
        Double ja2=tshl*lshl*lshl;
        Double ma1=mqa1+mqa2+mqa3+mqa4+mqa5+mqa6;
        Double ma2=mqa7+mqa8+mqa9+mqa10+mqa11+mqa12+mqa13;
        Double  ma=ma1-ma2;
        Double g0=(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12+m13)*10;
        Double lp=ma/g0;
        Double ja3=4*(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12+m13)*lp*lp/3;

        /*
         * 工作状态各阻力矩和输出扭矩及功率计算
         */
        Double tw=twsl+twshl+tw1+tw2+tw3+tw4+tw5+tw6-tw7-tw8-tw9-tw10-tw11-tw12-tw13;
        Double tm=0.5*d*0.01*n1;
        Double tg=(ja1+ja2+ja3)*n/9.55/ta;
        Double tna=tw+tm+tg+0;
        Double t=tna/i2/0.94;
        Double pa=(tw+tm+tg+0)*n/9550/0.8/0.94;

        /*
         * 非工作状态摩擦阻力矩计算条件
         */
        Double mf1=mfa1+mfa2+mfa3+mfa4+mfa5+mfa6;
        Double mf2=mfa7+mfa8+mfa9+mfa10+mfa11+mfa12+mfa13;
        Double mf=mf2-mf1;
        Double faf=(m1+m2+m3+m4+m5+m6+m7+m8+m9+m10+m11+m12+m13)*10;
        Double frf=ff1+ff2+ff3+ff4+ff5+ff6+ff7+ff8+ff9+ff10+ff11+ff12+ff13;
        Double e1=acos(d*faf/4.5/mf);
        Double n2=(faf/0.707*(1-2*e1/3.14))+(2*4.5*mf/3.14/d)+(4*frf/3.14/0.707);

        /*
         * 非工作状态各阻力矩和所需制动力矩计算
         */
        Double twa=twa1+twa2+twa3+twa4+twa5+twa6-twa7-twa8-twa9-twa10-twa11-twa12-twa13;
        Double tmf=0.5*d*0.01*n2;
        Double tz=(twa-tmf)/i1/i2;

        /*
         * 结论判断
         */




        result.put("h", h);
        result.put("pf", pf);

        result.put("tsl", tsl);
        result.put("tshl", tshl);
        result.put("m1", m1);
        result.put("m2", m2);
        result.put("m3", m3);
        result.put("m4", m4);
        result.put("m5", m5);
        result.put("m6", m6);
        result.put("m7", m7);
        result.put("m8", m8);
        result.put("m9", m9);
        result.put("m10", m10);
        result.put("m11", m11);
        result.put("m12", m12);
        result.put("m13", m13);

        result.put("lsl", lsl);
        result.put("lshl", lshl);
        result.put("l1", l1);
        result.put("l2", l2);
        result.put("l3", l3);
        result.put("l4", l4);
        result.put("l5", l5);
        result.put("l6", l6);
        result.put("l7", l7);
        result.put("l8", l8);
        result.put("l9", l9);
        result.put("l10", l10);
        result.put("l11", l11);
        result.put("l12", l12);
        result.put("l13", l13);

        result.put("asl", asl);
        result.put("ashl", ashl);
        result.put("a1", a1);
        result.put("a2", a2);
        result.put("a3", a3);
        result.put("a4", a4);
        result.put("a5", a5);
        result.put("a6", a6);
        result.put("a7", a7);
        result.put("a8", a8);
        result.put("a9", a9);
        result.put("a10", a10);
        result.put("a11", a11);
        result.put("a12", a12);
        result.put("a13", a13);

        result.put("lw1", lw1);
        result.put("lw2", lw2);
        result.put("lw3", lw3);
        result.put("lw4", lw4);
        result.put("lw5", lw5);
        result.put("lw6", lw6);
        result.put("lw8", lw8);
        result.put("lw12", lw12);
        result.put("lw13", lw13);

        result.put("aw2", aw2);
        result.put("aw4", aw4);
        result.put("aw5", aw5);
        result.put("aw6", aw6);
        result.put("aw9", aw9);
        result.put("aw12", aw12);
        result.put("aw13", aw13);

        result.put("ms1", ms1);
        result.put("z1", z1);
        result.put("d", d);

        result.put("p1", p1);
        result.put("tn1", tn1);
        result.put("t1", t1);
        result.put("na", na);
        result.put("ta", ta);
        result.put("i1", i1);

        result.put("ms2", ms2);
        result.put("z2", z2);

        result.put("i2", i2);
        result.put("n", n);

        result.put("twsl", twsl);
        result.put("twshl", twshl);
        result.put("tw1", tw1);
        result.put("tw2", tw2);
        result.put("tw3", tw3);
        result.put("tw4", tw4);
        result.put("tw5", tw5);
        result.put("tw6", tw6);
        result.put("tw7", tw7);
        result.put("tw8", tw8);
        result.put("tw9", tw9);
        result.put("tw10", tw10);
        result.put("tw11", tw11);
        result.put("tw12", tw12);
        result.put("tw13", tw13);

        result.put("mqasl", mqasl);
        result.put("mqashl", mqashl);
        result.put("mqa1", mqa1);
        result.put("mqa2", mqa2);
        result.put("mqa3", mqa3);
        result.put("mqa4", mqa4);
        result.put("mqa5", mqa5);
        result.put("mqa6", mqa6);

        result.put("mqa7", mqa7);
        result.put("mqa8", mqa8);
        result.put("mqa9", mqa9);
        result.put("mqa10", mqa10);
        result.put("mqa11", mqa11);
        result.put("mqa12", mqa12);
        result.put("mqa13", mqa13);

        result.put("fsl", fsl);
        result.put("fshl", fshl);
        result.put("f1", f1);
        result.put("f2", f2);
        result.put("f3", f3);
        result.put("f4", f4);
        result.put("f5", f5);
        result.put("f6", f6);
        result.put("f7", f7);
        result.put("f8", f8);
        result.put("f9", f9);
        result.put("f10", f10);
        result.put("f11", f11);
        result.put("f12", f12);
        result.put("f13", f13);

        result.put("twa1", twa1);
        result.put("twa2", twa2);
        result.put("twa3", twa3);
        result.put("twa4", twa4);
        result.put("twa5", twa5);
        result.put("twa6", twa6);
        result.put("twa7", twa7);
        result.put("twa8", twa8);
        result.put("twa9", twa9);
        result.put("twa10", twa10);
        result.put("twa11", twa11);
        result.put("twa12", twa12);
        result.put("twa13", twa13);

        result.put("mfa1", mfa1);
        result.put("mfa2", mfa2);
        result.put("mfa3", mfa3);
        result.put("mfa4", mfa4);
        result.put("mfa5", mfa5);
        result.put("mfa6", mfa6);

        result.put("mfa7", mfa7);
        result.put("mfa8", mfa8);
        result.put("mfa9", mfa9);
        result.put("mfa10", mfa10);
        result.put("mfa11", mfa11);
        result.put("mfa12", mfa12);
        result.put("mfa13", mfa13);

        result.put("ff1", ff1);
        result.put("ff2", ff2);
        result.put("ff3", ff3);
        result.put("ff4", ff4);
        result.put("ff5", ff5);
        result.put("ff6", ff6);
        result.put("ff7", ff7);
        result.put("ff8", ff8);
        result.put("ff9", ff9);
        result.put("ff10", ff10);
        result.put("ff11", ff11);
        result.put("ff12", ff12);
        result.put("ff13", ff13);

        result.put("mq1", mq1);
        result.put("mq2", mq2);
        result.put("mq", mq);
        result.put("fa", fa);
        result.put("fr", fr);
        result.put("e", e);
        result.put("n1", n1);

        result.put("ja1", ja1);
        result.put("ja2", ja2);
        result.put("ja3", ja3);
        result.put("ma1", ma1);
        result.put("ma2", ma2);
        result.put("ma", ma);
        result.put("g0", g0);
        result.put("lp", lp);

        result.put("tw", tw);
        result.put("tm", tm);
        result.put("tg", tg);
        result.put("tna", tna);
        result.put("t", t);
        result.put("pa", pa);

        result.put("mf1", mf1);
        result.put("mf2", mf2);
        result.put("mf", mf);
        result.put("faf", faf);
        result.put("frf", frf);
        result.put("e1", e1);
        result.put("n2", n2);

        result.put("twa", twa);
        result.put("tmf", tmf);
        result.put("tz", tz);
        return result;
    }
    public Map<String,String> getMapForPdf2(){
        Map<String,Double> map=getDoubleMap();
        Map<String,String> resultMap = new HashMap<>();
        Double p1=map.get("p1");
        Double tn1=map.get("tn1");
        Double t1=map.get("t1");
        Double i1=map.get("i1");
        Double i2=map.get("i2");
        Double n=map.get("n");
        Double tna=map.get("tna");
        Double twa=map.get("twa");
        Double tmf=map.get("tmf");

        Double td=p1*9550*0.8*0.94/n;
        Double tyc=t1*i2*i1;
        Double tjc=twa-tmf;

        String y1= td>=tna? "≥":"<";
        String y2= td>=tna? "符合":"不符合";
        String y3= tyc>=tjc?"≥":"<";
        String y4= tyc>=tjc?"符合":"不符合";

        resultMap.put("djxh",CommonFunc.convertDoubleToString(djxh));
        resultMap.put("p1",CommonFunc.convertDoubleToString(p1));
        resultMap.put("tn1",CommonFunc.convertDoubleToString(tn1));
        resultMap.put("t1",CommonFunc.convertDoubleToString(t1));
        resultMap.put("i1",CommonFunc.convertDoubleToString(i1));
        resultMap.put("i2",CommonFunc.convertDoubleToString(i2));
        resultMap.put("n",CommonFunc.convertDoubleToString(n));
        resultMap.put("tna",CommonFunc.convertDoubleToString(tna));
        resultMap.put("twa",CommonFunc.convertDoubleToString(twa));
        resultMap.put("tmf",CommonFunc.convertDoubleToString(tmf));
        resultMap.put("td",CommonFunc.convertDoubleToString(td));
        resultMap.put("tyc",CommonFunc.convertDoubleToString(tyc));
        resultMap.put("tjc",CommonFunc.convertDoubleToString(tjc));
        resultMap.put("y1",CommonFunc.convertDoubleToString(y1));
        resultMap.put("y2",CommonFunc.convertDoubleToString(y2));
        resultMap.put("y3",CommonFunc.convertDoubleToString(y3));
        resultMap.put("y4",CommonFunc.convertDoubleToString(y4));
        return resultMap;
    }
    public Map<String,String> getCheck(){
        Map<String,String> map=getMapForPdf1();
        Map<String,String> resultMap=new HashMap<>();
        resultMap.put("x3",map.get("x3"));
        resultMap.put("x5",map.get("x5"));
        return resultMap;
    }
    private String getConclusionMark(Boolean x){
        return x?"≤":"＞";
    }
    private String getConclusionStr(Boolean x){
        return x?"满足":"不满足";
    }
    //反三角函数
    private Double acos(Double temp){
        return Math.acos(temp);
    }


}
