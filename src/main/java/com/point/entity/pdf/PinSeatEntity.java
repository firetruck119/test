package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.HashMap;
import java.util.Map;

public class PinSeatEntity {

    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private String clz;
    private String clh;
    private String xndj;

    private Double fx;
    private Double fv;
    private Double f02;
    private Double fd;
    private Double fvd;
    private Double f02d;
    private Double aa;
    private Double ab;
    private Double ac;
    private Double l1;
    private Double l2;
    private Double l3;
    private Double wa;
    private Double wb;
    private Double wc;
    private Double ad;

    private Double k;
    private Double l4;
    private Double r;
    private Double fwf;

    private Double r1;
    private Double r2;
    private Double lx;
    private Double as;
    private Double l5;
    private Double fbt;
    private Double fbv;
    private Double fbc;

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

    public String getClz() {
        return clz;
    }

    public void setClz(String clz) {
        this.clz = clz;
    }

    public String getClh() {
        return clh;
    }

    public void setClh(String clh) {
        this.clh = clh;
    }

    public String getXndj() {
        return xndj;
    }

    public void setXndj(String xndj) {
        this.xndj = xndj;
    }

    public Double getFx() {
        return fx;
    }

    public void setFx(Double fx) {
        this.fx = fx;
    }

    public Double getFv() {
        return fv;
    }

    public void setFv(Double fv) {
        this.fv = fv;
    }

    public Double getF02() {
        return f02;
    }

    public void setF02(Double f02) {
        this.f02 = f02;
    }

    public Double getFd() {
        return fd;
    }

    public void setFd(Double fd) {
        this.fd = fd;
    }

    public Double getFvd() {
        return fvd;
    }

    public void setFvd(Double fvd) {
        this.fvd = fvd;
    }

    public Double getF02d() {
        return f02d;
    }

    public void setF02d(Double f02d) {
        this.f02d = f02d;
    }

    public Double getAa() {
        return aa;
    }

    public void setAa(Double aa) {
        this.aa = aa;
    }

    public Double getAb() {
        return ab;
    }

    public void setAb(Double ab) {
        this.ab = ab;
    }

    public Double getAc() {
        return ac;
    }

    public void setAc(Double ac) {
        this.ac = ac;
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

    public Double getWa() {
        return wa;
    }

    public void setWa(Double wa) {
        this.wa = wa;
    }

    public Double getWb() {
        return wb;
    }

    public void setWb(Double wb) {
        this.wb = wb;
    }

    public Double getWc() {
        return wc;
    }

    public void setWc(Double wc) {
        this.wc = wc;
    }

    public Double getAd() {
        return ad;
    }

    public void setAd(Double ad) {
        this.ad = ad;
    }

    public Double getK() {
        return k;
    }

    public void setK(Double k) {
        this.k = k;
    }

    public Double getL4() {
        return l4;
    }

    public void setL4(Double l4) {
        this.l4 = l4;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

    public Double getFwf() {
        return fwf;
    }

    public void setFwf(Double fwf) {
        this.fwf = fwf;
    }

    public Double getR1() {
        return r1;
    }

    public void setR1(Double r1) {
        this.r1 = r1;
    }

    public Double getR2() {
        return r2;
    }

    public void setR2(Double r2) {
        this.r2 = r2;
    }

    public Double getLx() {
        return lx;
    }

    public void setLx(Double lx) {
        this.lx = lx;
    }

    public Double getAs() {
        return as;
    }

    public void setAs(Double as) {
        this.as = as;
    }

    public Double getL5() {
        return l5;
    }

    public void setL5(Double l5) {
        this.l5 = l5;
    }

    public Double getFbt() {
        return fbt;
    }

    public void setFbt(Double fbt) {
        this.fbt = fbt;
    }

    public Double getFbv() {
        return fbv;
    }

    public void setFbv(Double fbv) {
        this.fbv = fbv;
    }

    public Double getFbc() {
        return fbc;
    }

    public void setFbc(Double fbc) {
        this.fbc = fbc;
    }

    private Map<String,String> getStringMap(){
        Map<String,String> result =new HashMap<>();
        result.put("no",CommonFunc.convertDoubleToString(no));
        result.put("ver",CommonFunc.convertDoubleToString(ver));
        result.put("xmmc",CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh",CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr",CommonFunc.convertDoubleToString(jsr));
        result.put("shr",CommonFunc.convertDoubleToString(shr));
        result.put("pzr",CommonFunc.convertDoubleToString(pzr));
        result.put("date",CommonFunc.convertDoubleToString(date));
        result.put("clz",CommonFunc.convertDoubleToString(clz));
        result.put("clh",CommonFunc.convertDoubleToString(clh));
        result.put("xndj",CommonFunc.convertDoubleToString(xndj));
        result.put("fx",CommonFunc.convertDoubleToString(fx));
        result.put("fv",CommonFunc.convertDoubleToString(fv));
        result.put("f0.2",CommonFunc.convertDoubleToString(f02));
        result.put("fd",CommonFunc.convertDoubleToString(fd));
        result.put("fvd",CommonFunc.convertDoubleToString(fvd));
        result.put("f0.2d",CommonFunc.convertDoubleToString(f02d));
        result.put("aa",CommonFunc.convertDoubleToString(aa));
        result.put("ab",CommonFunc.convertDoubleToString(ab));
        result.put("ac",CommonFunc.convertDoubleToString(ac));
        result.put("l1",CommonFunc.convertDoubleToString(l1));
        result.put("l2",CommonFunc.convertDoubleToString(l2));
        result.put("l3",CommonFunc.convertDoubleToString(l3));
        result.put("wa",CommonFunc.convertDoubleToString(wa));
        result.put("wb",CommonFunc.convertDoubleToString(wb));
        result.put("wc",CommonFunc.convertDoubleToString(wc));
        result.put("ad",CommonFunc.convertDoubleToString(ad));
        result.put("k",CommonFunc.convertDoubleToString(k));
        result.put("l4",CommonFunc.convertDoubleToString(l4));
        result.put("r",CommonFunc.convertDoubleToString(r));
        result.put("fwf",CommonFunc.convertDoubleToString(fwf));
        result.put("r1",CommonFunc.convertDoubleToString(r1));
        result.put("r2",CommonFunc.convertDoubleToString(r2));
        result.put("lx",CommonFunc.convertDoubleToString(lx));
        result.put("as",CommonFunc.convertDoubleToString(as));
        result.put("l5",CommonFunc.convertDoubleToString(l5));
        result.put("fbt",CommonFunc.convertDoubleToString(fbt));
        result.put("fbv",CommonFunc.convertDoubleToString(fbv));
        result.put("fbc",CommonFunc.convertDoubleToString(fbc));
        return result;
    }
    private Map<String,Double> getDoubleMap(){
        Map<String,Double> result = new HashMap<>();
        Double ma =2700*l1;
        Double oa =ma/wa;
        Double ta =2700/aa;
        Double o4a=Math.sqrt(oa*oa+3*ta*ta);
        Double mb =2700*l2;
        Double ob =mb/wb;
        Double tb =2700/ab;
        Double o4b=Math.sqrt(ob*ob+3*tb*tb);
        Double mc =2700*l3;
        Double oc =mc/wc;
        Double tc =2700/ac;
        Double o4c=Math.sqrt(oc*oc+3*tc*tc);
        Double md =2700*l4;
        Double a  =0.7*k;
        Double t  =(4*md*(r+a))/(3.14*Math.pow(r+a,4)-Math.pow(r,4));
        Double od =2700/ad;
        Double td =2700/ad;
        Double o4d=Math.sqrt(od*od+3*td*td);
        Double m1 =2700*l5;
        Double f1 =(m1*r1)/(2*r1*r1+2*r2*r2);
        Double o1 =f1/as;
        Double t1 =2700/(4*as);
        Double o41=Math.sqrt(o1*o1+3*t1*t1);
        Double m2 =2700*l5;
        Double f2 =m2/(2*lx);
        Double o2 =f2/as;
        Double t2 =2700/(4*as);
        Double o42=Math.sqrt(o2*o2+3*t2*t2);
        Double o3 =2700/(4*as);

        result.put("ma",ma);
        result.put("oa",oa);
        result.put("ta",ta);
        result.put("o4a",o4a);
        result.put("mb",mb);
        result.put("ob",ob);
        result.put("tb",tb);
        result.put("o4b",o4b);
        result.put("mc",mc);
        result.put("oc",oc);
        result.put("tc",tc);
        result.put("o4c",o4c);
        result.put("md",md);
        result.put("a",a);
        result.put("t",t);
        result.put("od",od);
        result.put("td",td);
        result.put("o4d",o4d);
        result.put("m1",m1);
        result.put("f1",f1);
        result.put("o1",o1);
        result.put("t1",t1);
        result.put("o41",o41);
        result.put("m2",m2);
        result.put("f2",f2);
        result.put("o2",o2);
        result.put("t2",t2);
        result.put("o42",o42);
        result.put("o3",o3);

        return result;
    }
    private String getString(Boolean b){
        return b?"满足":"不满足";
    }
    private String getSign(Double a,Double b){
        if(a>b)
            return">";
        if(a==b)
            return"=";
        if(a<b)
            return"<";
        return null;
    }
    public Map<String,String> getMapForPdf1(){
        Map<String,String> result =new HashMap<>();
        Map<String,Double> map=getDoubleMap();
        Map<String,String> stringMap=getStringMap();
        Boolean boa  =map.get("oa")<=fx;
        Boolean man1 =map.get("oa")<=fx;
        Boolean bta  =map.get("ta")<=fv;
        Boolean man2 =map.get("ta")<=fv;
        Boolean b4a  =map.get("o4a")<=f02;
        Boolean man3 =map.get("o4a")<=f02;
        Boolean bob  =map.get("ob")<=fx;
        Boolean man5 =map.get("ob")<=fx;
        Boolean btb  =map.get("tb")<=fv;
        Boolean man6 =map.get("tb")<=fv;
        Boolean b4b  =map.get("o4b")<=f02;
        Boolean man7 =map.get("o4b")<=f02;
        Boolean boc  =map.get("oc")<=fx;
        Boolean man9 =map.get("oc")<=fx;
        Boolean btc  =map.get("tc")<=fv;
        Boolean man10=map.get("tc")<=fv;
        Boolean b4c  =map.get("o4c")<=f02;
        Boolean man11=map.get("o4c")<=f02;
        Boolean bt   =map.get("t")<=fwf;
        Boolean man13=map.get("t")<=fwf;
        Boolean bod  = map.get("od")<=fd;
        Boolean man14= map.get("od")<=fd;
        Boolean btd  = map.get("td")<=fvd;
        Boolean man15= map.get("td")<=fvd;
        Boolean b4d  = map.get("o4d")<=f02d;
        Boolean man16= map.get("o4d")<=f02d;
        Boolean bo1  = map.get("o1")<=fbt;
        Boolean man18= map.get("o1")<=fbt;
        Boolean bt1  = map.get("t1")<=fbv;
        Boolean man19= map.get("t1")<=fbv;
        Boolean b41  = map.get("o41")<=fbc;
        Boolean man20= map.get("o41")<=fbc;
        Boolean bo2  = map.get("o2")<=fbt;
        Boolean man22= map.get("o2")<=fbt;
        Boolean bt2  = map.get("t2")<=fbv;
        Boolean man23= map.get("t2")<=fbv;
        Boolean b42 = map.get("o42")<=fbc;
        Boolean man24= map.get("o42")<=fbc;
        Boolean bo3  =map.get("o3")<=fbt;
        Boolean man26=map.get("o3")<=fbt;
        Boolean man4 =man1&&man2&&man3;
        Boolean man8 =man5&&man6&&man7;
        Boolean man12=man9&&man10&&man11;
        Boolean man17= man14&&man15&&man16;
        Boolean man21= man18&&man19&&man20;
        Boolean man25= man22&&man23&&man24;
        Boolean man27=man26;
        for(Map.Entry<String,Double> e:map.entrySet()){
            result.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
        for(Map.Entry<String,String> e:stringMap.entrySet()){
            result.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
//        result.put("boa",CommonFunc.convertDoubleToString(getSign(boa)));
        result.put("man1",CommonFunc.convertDoubleToString(getString(man1)));
//        result.put("bta",CommonFunc.convertDoubleToString(getSign(bta)));
        result.put("man2",CommonFunc.convertDoubleToString(getString(man2)));
//        result.put("b4a",CommonFunc.convertDoubleToString(getSign(b4a)));
        result.put("man3",CommonFunc.convertDoubleToString(getString(man3)));
        result.put("man4",CommonFunc.convertDoubleToString(getString(man4)));
//        result.put("bob",CommonFunc.convertDoubleToString(getSign(bob)));
        result.put("man5",CommonFunc.convertDoubleToString(getString(man5)));
//        result.put("btb",CommonFunc.convertDoubleToString(getSign(btb)));
        result.put("man6",CommonFunc.convertDoubleToString(getString(man6)));
//        result.put("b4b",CommonFunc.convertDoubleToString(getSign(b4b)));
        result.put("man7",CommonFunc.convertDoubleToString(getString(man7)));
        result.put("man8",CommonFunc.convertDoubleToString(getString(man8)));
//        result.put("boc",CommonFunc.convertDoubleToString(getSign(boc)));
        result.put("man9",CommonFunc.convertDoubleToString(getString(man9)));
//        result.put("btc",CommonFunc.convertDoubleToString(getSign(btc)));
        result.put("man10",CommonFunc.convertDoubleToString(getString(man10)));
//        result.put("b4c",CommonFunc.convertDoubleToString(getSign(b4c)));
        result.put("man11",CommonFunc.convertDoubleToString(getString(man11)));
        result.put("man12",CommonFunc.convertDoubleToString(getString(man12)));
//        result.put("bt",CommonFunc.convertDoubleToString(getSign(bt)));
        result.put("man13",CommonFunc.convertDoubleToString(getString(man13)));
//        result.put("bod",CommonFunc.convertDoubleToString(getSign(bod)));
        result.put("man14",CommonFunc.convertDoubleToString(getString(man14)));
//        result.put("btd",CommonFunc.convertDoubleToString(getSign(btd)));
        result.put("man15",CommonFunc.convertDoubleToString(getString(man15)));
//        result.put("b4d",CommonFunc.convertDoubleToString(getSign(b4d)));
        result.put("man16",CommonFunc.convertDoubleToString(getString(man16)));
        result.put("man17",CommonFunc.convertDoubleToString(getString(man17)));
//        result.put("bo1",CommonFunc.convertDoubleToString(getSign(bo1)));
        result.put("man18",CommonFunc.convertDoubleToString(getString(man18)));
//        result.put("bt1",CommonFunc.convertDoubleToString(getSign(bt1)));
        result.put("man19",CommonFunc.convertDoubleToString(getString(man19)));
//        result.put("b41",CommonFunc.convertDoubleToString(getSign(b41)));
        result.put("man20",CommonFunc.convertDoubleToString(getString(man20)));
        result.put("man21",CommonFunc.convertDoubleToString(getString(man21)));
//        result.put("bo2",CommonFunc.convertDoubleToString(getSign(bo2)));
        result.put("man22",CommonFunc.convertDoubleToString(getString(man22)));
//        result.put("bt2",CommonFunc.convertDoubleToString(getSign(bt2)));
        result.put("man23",CommonFunc.convertDoubleToString(getString(man23)));
//        result.put("b42",CommonFunc.convertDoubleToString(getSign(b42)));
        result.put("man24",CommonFunc.convertDoubleToString(getString(man24)));
        result.put("man25",CommonFunc.convertDoubleToString(getString(man25)));
//        result.put("bo3",CommonFunc.convertDoubleToString(getSign(bo3)));
        result.put("man26",CommonFunc.convertDoubleToString(getString(man26)));
        result.put("man27",CommonFunc.convertDoubleToString(getString(man27)));
        result.put("boa",CommonFunc.convertDoubleToString(getSign(map.get("oa"),fx)));
        result.put("bta",CommonFunc.convertDoubleToString(getSign(map.get("ta"),fv)));
        result.put("b4a",CommonFunc.convertDoubleToString(getSign(map.get("o4a"),f02)));
        result.put("bob",CommonFunc.convertDoubleToString(getSign(map.get("ob"),fx)));
        result.put("btb",CommonFunc.convertDoubleToString(getSign(map.get("tb"),fv)));
        result.put("b4b",CommonFunc.convertDoubleToString(getSign(map.get("o4b"),f02)));
        result.put("boc",CommonFunc.convertDoubleToString(getSign(map.get("oc"),fx)));
        result.put("btc",CommonFunc.convertDoubleToString(getSign(map.get("tc"),fv)));
        result.put("b4c",CommonFunc.convertDoubleToString(getSign(map.get("o4c"),f02)));
        result.put("bt",CommonFunc.convertDoubleToString(getSign(map.get("t"),fwf)));
        result.put("bod",CommonFunc.convertDoubleToString(getSign( map.get("od"),fd)));
        result.put("btd",CommonFunc.convertDoubleToString(getSign( map.get("td"),fvd)));
        result.put("b4d",CommonFunc.convertDoubleToString(getSign( map.get("o4d"),f02d)));
        result.put("bo1",CommonFunc.convertDoubleToString(getSign( map.get("o1"),fbt)));
        result.put("bt1",CommonFunc.convertDoubleToString(getSign( map.get("t1"),fbv)));
        result.put("b41",CommonFunc.convertDoubleToString(getSign( map.get("o41"),fbc)));
        result.put("bo2",CommonFunc.convertDoubleToString(getSign( map.get("o2"),fbt)));
        result.put("bt2",CommonFunc.convertDoubleToString(getSign( map.get("t2"),fbv)));
        result.put("b42",CommonFunc.convertDoubleToString(getSign(map.get("o42"),fbc)));
        result.put("bo3",CommonFunc.convertDoubleToString(getSign(map.get("o3"),fbt)));
        return result;
    }

    public Map<String,String> getMapForPdf2(){
        Map<String,Double> map=getDoubleMap();
        Map<String,String> resultMap = new HashMap<>();
        Map<String,String> pdf1Map = getMapForPdf1();

        for(Map.Entry<String,Double> e:map.entrySet()){
            resultMap.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }
        for(Map.Entry<String,String> e:pdf1Map.entrySet()){
            resultMap.put(e.getKey(), CommonFunc.convertDoubleToString(e.getValue()));
        }

        Double  ft1  =wa*fx/l1;
        Double  ft2  =fv*aa;
        Double  ft3  =wc*fx/l3;
        Double  ft4  =fv*ac;
        Double  ft5  =(3.14*fwf*(Math.pow(r+0.7*k,4)-Math.pow(r,4)))/(4*l4*(r+0.7*k));
        Double  ft6  =385*ad;
        Double  ft7  =220*ad;
        Double  ft8  =(2*fbt*as*(Math.pow(r1,2)+Math.pow(r,2)))/(l5*r1);
        Double  ft9  =4*fbv*as;
        Double  ft10 =(2*fbt*as*lx)/l5;
        Double  ft11 =4*fbv*as;
        Double  ft12 =4*fbv*as;
        Boolean bf1 =ft1>=2700;
        Boolean mf1 =ft1>=2700;
        Boolean bf2 =ft2>=2700;
        Boolean mf2 =ft2>=2700;
        Boolean bf3 =ft3>=2700;
        Boolean mf3 =ft3>=2700;
        Boolean bf4 =ft4>=2700;
        Boolean mf4 =ft4>=2700;
        Boolean bf5 =ft5>=2700;
        Boolean mf5 =ft5>=2700;
        Boolean bf6 =ft6>=2700;
        Boolean mf6 =ft6>=2700;
        Boolean bf7 =ft7>=2700;
        Boolean mf7 =ft7>=2700;
        Boolean bf8 =ft8>=2700;
        Boolean mf8 =ft8>=2700;
        Boolean bf9 =ft9>=2700;
        Boolean mf9 =ft9>=2700;
        Boolean bf10=ft10>=2700;
        Boolean mf10=ft10>=2700;
        Boolean bf11=ft11>=2700;
        Boolean mf11=ft11>=2700;
        Boolean bf12=ft12>=2700;
        Boolean mf12=ft12>=2700;

        resultMap.put("ft1",CommonFunc.convertDoubleToString(ft1));
        resultMap.put("ft2",CommonFunc.convertDoubleToString(ft2));
        resultMap.put("ft3",CommonFunc.convertDoubleToString(ft3));
        resultMap.put("ft4",CommonFunc.convertDoubleToString(ft4));
        resultMap.put("ft5",CommonFunc.convertDoubleToString(ft5));
        resultMap.put("ft6",CommonFunc.convertDoubleToString(ft6));
        resultMap.put("ft7",CommonFunc.convertDoubleToString(ft7));
        resultMap.put("ft8",CommonFunc.convertDoubleToString(ft8));
        resultMap.put("ft9",CommonFunc.convertDoubleToString(ft9));
        resultMap.put("ft10",CommonFunc.convertDoubleToString(ft10));
        resultMap.put("ft11",CommonFunc.convertDoubleToString(ft11));
        resultMap.put("ft12",CommonFunc.convertDoubleToString(ft12));
//        resultMap.put("bf1",CommonFunc.convertDoubleToString(getreSign(bf1)));
        resultMap.put("mf1",CommonFunc.convertDoubleToString(getString(mf1)));
//        resultMap.put("bf2",CommonFunc.convertDoubleToString(getreSign(bf2)));
        resultMap.put("mf2",CommonFunc.convertDoubleToString(getString(mf2)));
//        resultMap.put("bf3",CommonFunc.convertDoubleToString(getreSign(bf3)));
        resultMap.put("mf3",CommonFunc.convertDoubleToString(getString(mf3)));
//        resultMap.put("bf4",CommonFunc.convertDoubleToString(getreSign(bf4)));
        resultMap.put("mf4",CommonFunc.convertDoubleToString(getString(mf4)));
//        resultMap.put("bf5",CommonFunc.convertDoubleToString(getreSign(bf5)));
        resultMap.put("mf5",CommonFunc.convertDoubleToString(getString(mf5)));
//        resultMap.put("bf6",CommonFunc.convertDoubleToString(getreSign(bf6)));
        resultMap.put("mf6",CommonFunc.convertDoubleToString(getString(mf6)));
//        resultMap.put("bf7",CommonFunc.convertDoubleToString(getreSign(bf7)));
        resultMap.put("mf7",CommonFunc.convertDoubleToString(getString(mf7)));
//        resultMap.put("bf8",CommonFunc.convertDoubleToString(getreSign(bf8)));
        resultMap.put("mf8",CommonFunc.convertDoubleToString(getString(mf8)));
//        resultMap.put("bf9",CommonFunc.convertDoubleToString(getreSign(bf9)));
        resultMap.put("mf9",CommonFunc.convertDoubleToString(getString(mf9)));
//        resultMap.put("bf10",CommonFunc.convertDoubleToString(getreSign(bf10)));
        resultMap.put("mf10",CommonFunc.convertDoubleToString(getString(mf10)));
//        resultMap.put("bf11",CommonFunc.convertDoubleToString(getreSign(bf11)));
        resultMap.put("mf11",CommonFunc.convertDoubleToString(getString(mf11)));
//        resultMap.put("bf12",CommonFunc.convertDoubleToString(getreSign(bf12)));
        resultMap.put("mf12",CommonFunc.convertDoubleToString(getString(mf12)));

        resultMap.put("bf1",CommonFunc.convertDoubleToString(getSign(ft1,2700.0)));
        resultMap.put("bf2",CommonFunc.convertDoubleToString(getSign(ft2,2700.0)));
        resultMap.put("bf3",CommonFunc.convertDoubleToString(getSign(ft3,2700.0)));
        resultMap.put("bf4",CommonFunc.convertDoubleToString(getSign(ft4,2700.0)));
        resultMap.put("bf5",CommonFunc.convertDoubleToString(getSign(ft5,2700.0)));
        resultMap.put("bf6",CommonFunc.convertDoubleToString(getSign(ft6,2700.0)));
        resultMap.put("bf7",CommonFunc.convertDoubleToString(getSign(ft7,2700.0)));
        resultMap.put("bf8",CommonFunc.convertDoubleToString(getSign(ft8,2700.0)));
        resultMap.put("bf9",CommonFunc.convertDoubleToString(getSign(ft9,2700.0)));
        resultMap.put("bf10",CommonFunc.convertDoubleToString(getSign(ft10,2700.0)));
        resultMap.put("bf11",CommonFunc.convertDoubleToString(getSign(ft11,2700.0)));
        resultMap.put("bf12",CommonFunc.convertDoubleToString(getSign(ft12,2700.0)));
        return resultMap;
    }


}
