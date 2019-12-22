package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class TensileEnity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double vk;
    private Double nk;
    private Double mk;
    private Double z;
    private Double d;
    private Double t;
    private Double a;
    private Double b;
    private Double b1;
    private Double c;
    private Double c1;
    private Double l;
    private String hdj;
    private Double fc;
    private Double ft;
    private Double r;
    private Double ar;
    private Double ns;
    private Double as;
    private String mjlx;
    private Double aw;


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

    public Double getVk() {
        return vk;
    }

    public void setVk(Double vk) {
        this.vk = vk;
    }

    public Double getNk() {
        return nk;
    }

    public void setNk(Double nk) {
        this.nk = nk;
    }

    public Double getMk() {
        return mk;
    }

    public void setMk(Double mk) {
        this.mk = mk;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getD() {
        return d;
    }

    public void setD(Double d) {
        this.d = d;
    }

    public Double getT() {
        return t;
    }

    public void setT(Double t) {
        this.t = t;
    }

    public Double getA() {
        return a;
    }

    public void setA(Double a) {
        this.a = a;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getB1() {
        return b1;
    }

    public void setB1(Double b1) {
        this.b1 = b1;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public Double getC1() {
        return c1;
    }

    public void setC1(Double c1) {
        this.c1 = c1;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public String getHdj() {
        return hdj;
    }

    public void setHdj(String hdj) {
        this.hdj = hdj;
    }

    public Double getFc() {
        return fc;
    }

    public void setFc(Double fc) {
        this.fc = fc;
    }

    public Double getFt() {
        return ft;
    }

    public void setFt(Double ft) {
        this.ft = ft;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getAr() {
        return ar;
    }

    public void setAr(Double ar) {
        this.ar = ar;
    }

    public Double getNs() {
        return ns;
    }

    public void setNs(Double ns) {
        this.ns = ns;
    }

    public Double getAs() {
        return as;
    }

    public void setAs(Double as) {
        this.as = as;
    }

    public String getMjlx() {
        return mjlx;
    }

    public void setMjlx(String mjlx) {
        this.mjlx = mjlx;
    }

    public Double getAw() {
        return aw;
    }

    public void setAw(Double aw) {
        this.aw = aw;
    }

    private Map<String,String> getMap(){
        Double v=1000*vk;
        Double n=1000*nk;
        Double m=1000*1000*mk;

        Map<String,String> result=new HashMap<>();
        result.put("no", CommonFunc.convertDoubleToString(no));
        result.put("ver", CommonFunc.convertDoubleToString(ver));
        result.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr", CommonFunc.convertDoubleToString(jsr));
        result.put("shr", CommonFunc.convertDoubleToString(shr));
        result.put("pzr", CommonFunc.convertDoubleToString(pzr));
        result.put("date", CommonFunc.convertDoubleToString(date));

        result.put("v",CommonFunc.convertDoubleToString(v));
        result.put("n",CommonFunc.convertDoubleToString(n));
        result.put("m",CommonFunc.convertDoubleToString(m));
        result.put("z",CommonFunc.convertDoubleToString(z));
        result.put("d",CommonFunc.convertDoubleToString(d));
        result.put("t",CommonFunc.convertDoubleToString(t));
        result.put("a",CommonFunc.convertDoubleToString(a));
        result.put("b",CommonFunc.convertDoubleToString(b));
        result.put("b1",CommonFunc.convertDoubleToString(b1));
        result.put("c",CommonFunc.convertDoubleToString(c));
        result.put("c1",CommonFunc.convertDoubleToString(c1));
        result.put("l",CommonFunc.convertDoubleToString(l));
        result.put("hdj",CommonFunc.convertDoubleToString(hdj));
        result.put("fc",CommonFunc.convertDoubleToString(fc));
        result.put("ft",CommonFunc.convertDoubleToString(ft));
        result.put("r",CommonFunc.convertDoubleToString(r));
        result.put("ar",CommonFunc.convertDoubleToString(ar));
        result.put("ns",CommonFunc.convertDoubleToString(ns));
        result.put("as",CommonFunc.convertDoubleToString(as));
        result.put("mjlx",CommonFunc.convertDoubleToString(mjlx));
        result.put("l",CommonFunc.convertDoubleToString(l));
        result.put("aw",CommonFunc.convertDoubleToString(aw));

        return result;
    }

    private Map<String,Double> getDoublePDF(String ss){
        Double v=1000*vk;
        Double n=1000*nk;
        Double m=1000*1000*mk;
        Map<String,Double> result=new HashMap();
        Double _2d =2*d;
        Double _3d =3*d;
        Double _6d =6*d;
        Double _6dd=6*d;

        result.put("2d"  ,_2d );
        result.put("3d"  ,_3d );
        result.put("6d"  ,_6d );
        result.put("6dd" ,_6dd);

        Double av =(4-0.08*d)*Math.sqrt(fc/270);
        Double ab =0.6+0.25*t/d;
        Double as1=(v/(ar*av*270))+(n/(0.8*ab*270))+(m/(1.3*ar*ab*270*z));
        Double as2=(n/(0.8*ab*270))+(m/(0.4*ar*ab*270*z));

        result.put("av" ,av );
        result.put("ab" ,ab );
        result.put("as1",as1);
        result.put("as2",as2);

        Double lab=aw*270/ft*d;
        Double la =0.6*lab;

        result.put("lab",lab);
        result.put("la",la  );
        return  result;
    }

    private String getSign(double a,double b){
        return a<b?"<":a>b?">":"=";
    }
    private String getString(boolean a){
        return a?"满足":"不满足";
    }
    public Map<String,String> getMapForPDF1(){
        Double v=1000*vk;
        Double n=1000*nk;
        Double m=1000*1000*mk;
        Map<String,Double> doubleMap=getDoublePDF("CN");
        Map<String,String> map=getMap();

        String  ba   =getSign(a,2*d);
        String  b20  =getSign(a,20);
        boolean man2 =a>=2*d&&a>=20;
        String  bb   = getSign(b,3*d);
        String  b45  = getSign(45,b);
        String  b300 =getSign(b,300);
        boolean man3 =b>=3*d&&b>=45&&b<=300;
        String  bb1  =getSign(b1,6*d);
        String  b170 =getSign(70,b1);
        String  b1300=getSign(b1,300);
        boolean man4 = b1>=3*d&&45<=b&&b<=300;
        boolean man5 =man4&&man3;
        String  bc   =getSign(c,3*d);
        String  c45  =getSign(c,45);
        boolean man6 = c>=3*d&&c>=45;
        String  bc1  =getSign(c1,3*d);
        String  c145 =getSign(c1,45);
        boolean man7 = c1>=3*d&&c1>=45;
        boolean man8 =man6&&man7;
        Double  as1  =doubleMap.get("as1");
        Double  as2  =doubleMap.get("as2");
        String  bas1 =getSign(as,as1);
        String  bas2 =getSign(as,as2);

        boolean man9 = as>=as1&&as>=as2;
        Double  la   =doubleMap.get("la");
        String  lla  =getSign(l ,la);
        String  l200 =getSign(l,200);
        boolean man10= l>=200&&l>=200;
        
        Map<String,String> resultMap = new HashMap<>();
        for (Map.Entry<String,Double> e:doubleMap.entrySet()) {
            resultMap.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
        for (Map.Entry<String,String> e:map.entrySet()) {
            resultMap.put(e.getKey(), e.getValue());
        }

        resultMap.put("ba",ba   );
        resultMap.put("b20",b20  );
        resultMap.put("man2",getString(man2));
        resultMap.put("bb",bb   );
        resultMap.put("b45",b45  );
        resultMap.put("b300",b300 );
        resultMap.put("man3",getString(man3));
        resultMap.put("bb1",bb1  );
        resultMap.put("b170",b170 );
        resultMap.put("b1300",b1300);
        resultMap.put("man4",getString(man4));
        resultMap.put("man5",getString(man5));
        resultMap.put("bc",bc );
        resultMap.put("c45",c45);
        resultMap.put("man6",getString(man6));
        resultMap.put("bc1",bc1);
        resultMap.put("c145",c145);
        resultMap.put("man7",getString(man7));
        resultMap.put("man8",getString(man8));
        resultMap.put("bas1",bas1);
        resultMap.put("bas2",bas2);
        resultMap.put("man9",getString(man9));
       resultMap.put("lla",lla);
        resultMap.put("l200",l200);
        resultMap.put("man10",getString(man10));
        return resultMap;
    }


    public Map<String,String> getMapForPDF2(){
        Double v=1000*vk;
        Double n=1000*nk;
        Double m=1000*1000*mk;
        Map<String,Double> doubleMap=getDoublePDF("CN");
        Double s=n/172.8;
        Double dj=2*Math.sqrt(s/3.14);
        Map<String,String> map=new HashMap<>();

        String bj=getSign(dj,d);
        boolean man =dj<=d;

        map.put("d",CommonFunc.convertDoubleToString(d));
        map.put("n",CommonFunc.convertDoubleToString(n));
        map.put("s",CommonFunc.convertDoubleToString(s));
        map.put("dj",CommonFunc.convertDoubleToString(dj));
        map.put("bj",bj);
        map.put("man",getString(man));
        return map;
    }

    public Map<String,String> checkCN(){
        Map<String ,String> map=getMapForPDF1();
        Map<String ,String> result=new HashMap<>();

        result.put("jyt",t+">"+map.get("bc8"));

        String bc8=map.get("bc8");
        String _2d=map.get("2d");
        String _3d=map.get("3d");
        String _6d=map.get("6d");
        String as1=map.get("as1");
        String as2=map.get("as2");
        String la=map.get("la");

        result.put("man2",map.get("man2"));
        result.put("man3",map.get("man3"));
        result.put("man4",map.get("man4"));
        result.put("man6",map.get("man6"));
        result.put("man7",map.get("man7"));
        result.put("man9",map.get("man9"));
        result.put("man10",map.get("man10"));

        result.put("jyt","t "+"> "+bc8);
        result.put("jya","a "+"≥ "+_2d+
                "<br/><br/>"+"a "+"≥ 20");
        result.put("jyb","b "+"≥ "+_3d+
                "<br/><br/>"+"45 ≤ "+"b"+" ≤ 300");
        result.put("jyb1","b1 "+" ≥ "+_6d+
                "<br/><br/>"+"70 ≤ "+"b1"+" ≤ 300");
        result.put("jyc","c "+" ≥ "+_3d+
                "<br/><br/>"+"c"+" ≥ 45");
        result.put("jyc1","c1 "+" ≥ "+_3d+
                "<br/><br/>"+"c1"+" ≥ 45");
        result.put("jyas","As"+" ≥ "+as1+
                "<br/><br/>"+"As"+" ≥ "+as2);
        result.put("jyl","l"+" ≥ "+la+
                "<br/><br/>"+"l"+" ≥ "+"200");


        return result;
    }

}
