package com.point.entity.pdf;

import com.point.common.CommonFunc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

public class HorizontalTracksEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;
    private Double ld;
    private Double l;
    private Double dcw;
    private Double bcw;
    private Double fzed;
    private Double fze;
    private Double vzed;
    private Double vyed;
    private Double rzed;
    private Double x;
    private Double c;
    private String gdxh;
    private String gdxhen;
    private String gcph;
    private Double h;
    private Double b;
    private Double tw;
    private Double tfs;
    private Double tfx;
    private Double hw;
    private Double hy;
    private Double sy;
    private Double iy;
    private Double iz;
    private Double wysel;
    private Double wyxel;
    private Double wzel;
    private Double z;
    private Double y;
    private Double ss;
    private Double shzr;

    public String getGdxhen() {
        return gdxhen;
    }

    public void setGdxhen(String gdxhen) {
        this.gdxhen = gdxhen;
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

    public Double getLd() {
        return ld;
    }

    public void setLd(Double ld) {
        this.ld = ld;
    }

    public Double getL() {
        return l;
    }

    public void setL(Double l) {
        this.l = l;
    }

    public Double getDcw() {
        return dcw;
    }

    public void setDcw(Double dcw) {
        this.dcw = dcw;
    }

    public Double getBcw() {
        return bcw;
    }

    public void setBcw(Double bcw) {
        this.bcw = bcw;
    }

    public Double getFzed() {
        return fzed;
    }

    public void setFzed(Double fzed) {
        this.fzed = fzed;
    }

    public Double getFze() {
        return fze;
    }

    public void setFze(Double fze) {
        this.fze = fze;
    }

    public Double getVzed() {
        return vzed;
    }

    public void setVzed(Double vzed) {
        this.vzed = vzed;
    }

    public Double getVyed() {
        return vyed;
    }

    public void setVyed(Double vyed) {
        this.vyed = vyed;
    }

    public Double getRzed() {
        return rzed;
    }

    public void setRzed(Double rzed) {
        this.rzed = rzed;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getC() {
        return c;
    }

    public void setC(Double c) {
        this.c = c;
    }

    public String getGdxh() {
        return gdxh;
    }

    public void setGdxh(String gdxh) {
        this.gdxh = gdxh;
    }

    public String getGcph() {
        return gcph;
    }

    public void setGcph(String gcph) {
        this.gcph = gcph;
    }

    public Double getH() {
        return h;
    }

    public void setH(Double h) {
        this.h = h;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getTw() {
        return tw;
    }

    public void setTw(Double tw) {
        this.tw = tw;
    }

    public Double getTfs() {
        return tfs;
    }

    public void setTfs(Double tfs) {
        this.tfs = tfs;
    }

    public Double getTfx() {
        return tfx;
    }

    public void setTfx(Double tfx) {
        this.tfx = tfx;
    }

    public Double getHw() {
        return hw;
    }

    public void setHw(Double hw) {
        this.hw = hw;
    }

    public Double getHy() {
        return hy;
    }

    public void setHy(Double hy) {
        this.hy = hy;
    }

    public Double getSy() {
        return sy;
    }

    public void setSy(Double sy) {
        this.sy = sy;
    }

    public Double getIy() {
        return iy;
    }

    public void setIy(Double iy) {
        this.iy = iy;
    }

    public Double getIz() {
        return iz;
    }

    public void setIz(Double iz) {
        this.iz = iz;
    }

    public Double getWysel() {
        return wysel;
    }

    public void setWysel(Double wysel) {
        this.wysel = wysel;
    }

    public Double getWyxel() {
        return wyxel;
    }

    public void setWyxel(Double wyxel) {
        this.wyxel = wyxel;
    }

    public Double getWzel() {
        return wzel;
    }

    public void setWzel(Double wzel) {
        this.wzel = wzel;
    }

    public Double getZ() {
        return z;
    }

    public void setZ(Double z) {
        this.z = z;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }

    public Double getSs() {
        return ss;
    }

    public void setSs(Double ss) {
        this.ss = ss;
    }

    public Double getShzr() {
        return shzr;
    }

    public void setShzr(Double shzr) {
        this.shzr = shzr;
    }

    private String getQlt(){
        switch (gdxh){
            case "I20b":
            case "I22b":
            case "I25b":
            case "I28b":
            case "I32b":
            case "H175":
            case "H200":
            case "H250":
                return "qlt1";
            default:
                return "qlt2";
        }
    }
    public Map<String,String> calculationPDF1(){
        Map<String,Double> map=getDoubleMapForpdf1();
        Map<String,String> paraMap=new HashMap<>();

        String u1=  map.get("a1")>=0.6 ? "≥":"<";
        String u2=  map.get("a2")<=1?"≤":">";
        String u3=  map.get("a2")<=1?"满足":"不满足";
        String u4=  map.get("a3")<=1?"≤":">";
        String u5=  map.get("a3")<=1?"满足":"不满足";
        String u6=  map.get("a4") <= 1 ?"≤":">";
        String u7=  map.get("a4") <= 1 ?"满足":"不满足";
        String u8 = map.get("a5") <= 1 ?"≤":">";
        String u9 = map.get("a5") <= 1 ?"满足":"不满足";
        String u10 =map.get("a6") <= 1 ?"≤":">";
        String u11 =map.get("a6") <= 1 ?"满足":"不满足";
        String u12 =map.get("a7") <= 1 ?"≤":">";
        String u13 =map.get("a7") <= 1 ?"满足":"不满足";
        String u14 =map.get("a8") <= 1 ?"≤":">";
        String u15 =map.get("a8") <= 1 ?"满足":"不满足";
        String u16 =map.get("a9") <= 1 ?"≤":">";
        String u17 =map.get("a9") <= 1 ?"满足":"不满足";
        String u18 =map.get("a10") <= 1 ?"≤":">";
        String u19 =map.get("a10") <= 1 ?"满足":"不满足";
        String u20 =map.get("a11") <= 1 ?"≤":">";
        String u21 =map.get("a11") <= 1 ?"满足":"不满足";
        String u22 =map.get("fz")<=ld/200?"≤":">";
        String u23 =map.get("fz")<=30?"≤":">";
        String u24 =map.get("fy")<=ld/200?"≤":">";
        String u25 =map.get("fy")<=30?"≤":">";
        String u26 =u22=="≤"&&u23=="≤"&&u24=="≤"&&u25=="≤"?"满足":"不满足";
        for(Map.Entry<String,Double> e:map.entrySet())
            paraMap.put(e.getKey(),CommonFunc.convertDoubleToString(e.getValue()));
        paraMap.put("u1",u1);
        paraMap.put("u2",u2);
        paraMap.put("u3",u3);
        paraMap.put("u4",u4);
        paraMap.put("u5",u5);
        paraMap.put("u6",u6);
        paraMap.put("u7",u7);
        paraMap.put("u8",u8);
        paraMap.put("u9",u9);
        paraMap.put("u10",u10);
        paraMap.put("u11",u11);
        paraMap.put("u12",u12);
        paraMap.put("u13",u13);
        paraMap.put("u14",u14);
        paraMap.put("u15",u15);
        paraMap.put("u16",u16);
        paraMap.put("u17",u17);
        paraMap.put("u18",u18);
        paraMap.put("u19",u19);
        paraMap.put("u20",u20);
        paraMap.put("u21",u21);
        paraMap.put("u22",u22);
        paraMap.put("u23",u23);
        paraMap.put("u24",u24);
        paraMap.put("u25",u25);
        paraMap.put("u26",u26);
        paraMap.put("no",no);
        paraMap.put("uer",ver);
        paraMap.put("xmmc",xmmc);
        paraMap.put("zjxh",zjxh);
        paraMap.put("jsr",jsr);
        paraMap.put("shr",shr);
        paraMap.put("pzr",pzr);
        paraMap.put("date",date);
        paraMap.put("gdxh",gdxh);
        paraMap.put("gcph",gcph);
        return paraMap;
    }
    private Map<String,Double> getDoubleMapForpdf1(){
        /**
         *表2数据
         */
        Arrays.sort(gdxhs);
        boolean blm = Arrays.binarySearch(gdxhs,gdxh)<0;
        Arrays.sort(gcphs);
        boolean bls = Arrays.binarySearch(gcphs,gcph)<0;
        Double iiy  = blm?iy/10000:null;
        Double iiz  = blm?iz/10000:null;
        Double wys  = blm?wysel/1000:null;
        Double wyx  = blm?wyxel/1000:null;
        Double wz   =  blm?wzel/1000:null;
        /**
         *表3数据
         */
        Double ss1=bls?ss:null;
        Double shzr1=bls?shzr:null;

        /*
        轨道截面强度校核计算
         */
        Double myed=vzed*ld/4;
        Double mzed=vyed*ld/4;
        Double sxed=(myed*z/iy)+(mzed*y/iz);
        Double a1=b*hy/tw/hw;
        Double ted1=vzed*sy/tw/iy;
        Double ted2=vzed/tw/hw;
        Double ted=a1>=0.6 ? ted2:ted1;
        Double a2= Math.pow(sxed/ss,2)+3* Math.pow(ted/ss,2);

        /*
        立柱屈曲失稳临界力矩校核计算
         */
        Double iw=iz*h*h/4;
        Double it=0.4*(b*tfx*tfx*tfx+h*tw*tw*tw+b*hy*hy*hy);
        Double s= sqrt(210000)*sqrt(iw)/sqrt(81000)/sqrt(it);
        Double ccr=1.35*3.14*(sqrt(1+ Math.pow(3.14*s/ld,2)*(1+0.55*0.55))+0.55*3.14*s/ld);
        Double mcr=ccr* sqrt(210000)*sqrt(iz)*sqrt(81000)*sqrt(it)/ld;
        Double klt= sqrt(ss*wysel/mcr);
        Double qlt1=0.5*(1+0.34*(klt-0.4)+0.75*klt*klt);
        Double qlt2=0.5*(1+0.49*(klt-0.4)+0.75*klt*klt);
        Double qlt=getQlt()=="qlt1"?qlt1:qlt2;
        Double xlt=1/(qlt+ sqrt(qlt*qlt-0.75*klt*klt));
        Double mbrd=xlt*ss*wysel;
        Double a3=myed/mbrd;

        /*
        支承处轨道腹板屈曲失稳临界力矩校核计算
         */
        Double k1=6.93*h* sqrt(ss/210000)/3.14/tw;
        Double q1=0.5*(1+0.49*(k1-0.2)+k1*k1);
        Double xs1=1/(q1+sqrt(q1*q1-k1*k1));
        Double bef1=x+c+tfx*sqrt(b/tw);
        Double nwrd=xs1*ss*bef1*tw;
        Double a4=rzed/nwrd;

        /*
        竖向轮载的复合应力校核计算
         */
        Double sx1ed=myed*z/iy;
        Double d=0.5*50+hy;
        Double szed=fzed/2/tw/d;
        Double tled=szed*0.2;
        Double a5=Math.pow(sx1ed/ss,2)+Math.pow(szed/ss,2)-sx1ed*szed/ss/ss+3*Math.pow((ted+tled)/ss,2);

        /*
        竖向轮载校核计算
         */
        Double fzrd=0.125*tw*tw*sqrt(210000*ss)*sqrt(hy/tw);
        Double a6=fzed/fzrd;

        /*
        竖向轮载引起的腹板屈曲失稳校核计算
         */
        Double bef2=0+0.5*h;
        Double ncrd=ss*bef2*tw;
        Double k2=3.46*h*sqrt(ss/210000)/3.14/tw;
        Double q2=0.5*(1+0.49*(k2-0.2)+k2*k2);
        Double xs2=1/(q2+sqrt(q2*q2-k2*k2));
        Double a7=fzed/xs2/ncrd;

        /*\
        腹板受压校核计算
         */
        Double fz1rd=ss*bef1*tw;
        Double a8=rzed/fz1rd;

        /*
        支承反力校核计算
         */
        Double fz2rd=0.125*tw*tw*sqrt(210000*ss)*(sqrt(tfx/tw)+3*tw*c/tfx/hw);
        Double a9=rzed/fz2rd;

        /*
        支承反力引起的腹板屈曲失稳校核计算
         */
        Double bef3=x+0.5*(c+sqrt(h*h+c*c));
        Double nc1rd=ss*bef3*tw;
        Double a10=fzed/xs2/nc1rd;

        Double shz=sqrt(0.35*210000*fze/dcw/bcw);
        Double a11=shz/shzr;

        /*
        正常使用极限状态校核计算
         */
        Double fz=vzed*ld*ld*ld/48/210000/iy;
        Double fy=vyed*ld*ld*ld/48/210000/iz;

        Map<String,Double> paraMap=new HashMap<>();
        paraMap.put("iiy",iiy);
        paraMap.put("iiz",iiz);
        paraMap.put("wys",wys);
        paraMap.put("wyx",wyx);
        paraMap.put("wz",wz);
        paraMap.put("ss1",ss1);
        paraMap.put("shzr1",shzr1);
        paraMap.put("myed",myed);
        paraMap.put("mzed",mzed);
        paraMap.put("sxed",sxed);
        paraMap.put("a1",a1);
        paraMap.put("ted1",ted1);
        paraMap.put("ted2",ted2);
        paraMap.put("ted",ted);
        paraMap.put("a2",a2);
        paraMap.put("iw", iw);
        paraMap.put("it",it);
        paraMap.put("s",s);
        paraMap.put("ccr",ccr);
        paraMap.put("mcr",mcr);
        paraMap.put("klt",klt);
        paraMap.put("qlt1",qlt1);
        paraMap.put("qlt2",qlt2);
        paraMap.put("qlt",qlt);
        paraMap.put("xlt",xlt);
        paraMap.put("mbrd",mbrd);
        paraMap.put("a3",a3);
        paraMap.put("k1",k1);
        paraMap.put("q1",q1);
        paraMap.put("xs1",xs1);
        paraMap.put("bef1",bef1);
        paraMap.put("nwrd",nwrd);
        paraMap.put("a4",a4);
        paraMap.put("sx1ed",sx1ed);
        paraMap.put("d",d);
        paraMap.put("szed",szed);
        paraMap.put("tled",tled);
        paraMap.put("a5",a5);
        paraMap.put("fzrd",fzrd);
        paraMap.put("a6",a6);
        paraMap.put("bef2",bef2);
        paraMap.put("ncrd",ncrd);
        paraMap.put("k2",k2);
        paraMap.put("q2",q2);
        paraMap.put("xs2",xs2);
        paraMap.put("a7",a7);
        paraMap.put("fz1rd",fz1rd);
        paraMap.put("a8",a8);
        paraMap.put("fz2rd",fz2rd);
        paraMap.put("a9",a9);
        paraMap.put("bef3",bef3);
        paraMap.put("nc1rd",nc1rd);
        paraMap.put("a10",a10);
        paraMap.put("shz",shz);
        paraMap.put("a11",a11);
        paraMap.put("fz",fz);
        paraMap.put("fy",fy);
        paraMap.put("ld",ld);
        paraMap.put("l",l);
        paraMap.put("dcw",dcw);
        paraMap.put("acw",bcw);
        paraMap.put("fzed",fzed);
        paraMap.put("fze",fze);
        paraMap.put("uzed",vzed);
        paraMap.put("uyed",vyed);
        paraMap.put("rzed",rzed);
        paraMap.put("x",x);
        paraMap.put("c",c);
        paraMap.put("h",h);
        paraMap.put("b",b);
        paraMap.put("tw",tw);
        paraMap.put("tfs",tfs);
        paraMap.put("tfx",tfx);
        paraMap.put("hw",hw);
        paraMap.put("hy",hy);
        paraMap.put("sy",sy);
        paraMap.put("iy",iy);
        paraMap.put("iz",iz);
        paraMap.put("wysel",wysel);
        paraMap.put("wyxel",wyxel);
        paraMap.put("wzel",wzel);
        paraMap.put("z",z);
        paraMap.put("y",y);
        paraMap.put("ss",ss);
        paraMap.put("shzr",shzr);
        return paraMap;
    }
    private String[] gdxhs={"I20b","I22b","I25b","I28b","I32b","H175","H200","H250","H200+贴板","H250+贴板","拼焊H200*216","拼焊H250*266"};
    private String[] gcphs={"Q235","Q275","Q345"};

    public Map<String,String> calculationPDF2(){
        Map<String,Double> map=getDoubleMapForpdf2();
        Map<String,String> paraMap=new HashMap<>();
        String v1=map.get("b1")>=0.6 ? "≥":"<";
        String v2=map.get("b2")<=1?"≤":">";
        String v3=map.get("b2")<=1?"满足":"不满足";
        String v4=map.get("b3")<=1?"≤":">";
        String v5=map.get("b3")<=1?"满足":"不满足";
        String v6=map.get("b4")<=1 ?"≤":">";
        String v7=map.get("b4")<=1 ?"满足":"不满足";
        String v8=map.get("b5")<=1?"≤":">";
        String v9=map.get("b5")<=1?"满足":"不满足";
        String v10=map.get("b6")<=1?"≤":">";
        String v11=map.get("b6")<=1?"满足":"不满足";
        String v12=map.get("b7")<=1?"≤":">";
        String v13=map.get("b7")<=1?"满足":"不满足";
        String v14=map.get("b8")<=1?"≤":">";
        String v15=map.get("b8")<=1?"满足":"不满足";
        String v16 =map.get("b9") <= 1 ?"≤":">";
        String v17 =map.get("b9") <= 1 ?"满足":"不满足";
        String v18 =map.get("b10") <= 1 ?"≤":">";
        String v19 =map.get("b10") <= 1 ?"满足":"不满足";
        String v20 =map.get("b11") <= 1 ?"≤":">";
        String v21 =map.get("b11") <= 1 ?"满足":"不满足";
        String v22 =map.get("fzs")<=ld/200?"≤":">";
        String v23 =map.get("fzs")<=30?"≤":">";
        String v24 =map.get("fys")<=ld/200?"≤":">";
        String v25 =map.get("fys")<=30?"≤":">";
        String v26 =v22=="≤"&&v23=="≤"&&v24=="≤"&&v25=="≤"?"满足":"不满足";
        for(Map.Entry<String,Double> e:map.entrySet())
            paraMap.put(e.getKey(),CommonFunc.convertDoubleToString(e.getValue()));
        paraMap.put("v1",v1);
        paraMap.put("v2",v2);
        paraMap.put("v3",v3);
        paraMap.put("v4",v4);
        paraMap.put("v5",v5);
        paraMap.put("v6",v6);
        paraMap.put("v7",v7);
        paraMap.put("v8",v8);
        paraMap.put("v9",v9);
        paraMap.put("v10",v10);
        paraMap.put("v11",v11);
        paraMap.put("v12",v12);
        paraMap.put("v13",v13);
        paraMap.put("v14",v14);
        paraMap.put("v15",v15);
        paraMap.put("v16",v16);
        paraMap.put("v17",v17);
        paraMap.put("v18",v18);
        paraMap.put("v19",v19);
        paraMap.put("v20",v20);
        paraMap.put("v21",v21);
        paraMap.put("v22",v22);
        paraMap.put("v23",v23);
        paraMap.put("v24",v24);
        paraMap.put("v25",v25);
        paraMap.put("v26",v26);
        paraMap.put("no",no);
        paraMap.put("ver",ver);
        paraMap.put("xmmc",xmmc);
        paraMap.put("zjxh",zjxh);
        paraMap.put("jsr",jsr);
        paraMap.put("shr",shr);
        paraMap.put("pzr",pzr);
        paraMap.put("date",date);
        paraMap.put("gdxh",gdxh);
        paraMap.put("gcph",gcph);
        return paraMap;
    }
    private Map<String,Double> getDoubleMapForpdf2(){
        /*
         表2数据
         */
        Arrays.sort(gdxhs);
        boolean blm= Arrays.binarySearch(gdxhs,gdxh)<0;
        Arrays.sort(gcphs);
        boolean bls= Arrays.binarySearch(gcphs,gcph)<0;
        Double iiy= blm?iy/10000:null;
        Double iiz= blm?iz/10000:null;
        Double wys= blm?wysel/1000:null;
        Double wyx= blm?wyxel/1000:null;
        Double wz=  blm?wzel/1000:null;

        /*
         表3数据
         */
        Double ss1=bls?ss:null;
        Double shzr1=bls?shzr:null;

        /*
        轨道截面强度校核计算
        */
        Double myeds=13*vzed*ld/64;
        Double mzeds=13*vyed*ld/64;
        Double sxeds=(myeds*z/iy)+(mzeds*y/iz);
        Double b1=b*hy/tw/hw;
        Double ted1=vzed*sy/tw/iy;
        Double ted2=vzed/tw/hw;
        Double ted=b1>=0.6 ? ted2:ted1;
        Double b2=Math.pow(sxeds/ss,2)+3*Math.pow(ted/ss,2);

        /*
        立柱屈曲失稳临界力矩校核计算
        */
        Double iw=iz*h*h/4;
        Double it=0.4*(b*tfx*tfx*tfx+h*tw*tw*tw+b*hy*hy*hy);
        Double s=sqrt(210000*iw/81000/it);
        Double ccr=1.35*3.14*(sqrt(1+Math.pow(3.14*s/ld,2)*(1+0.55*0.55))+0.55*3.14*s/ld);
        Double mcr=ccr*sqrt(210000*iz*81000*it)/ld;
        Double klt=sqrt(ss*wysel/mcr);
        Double qlt1=0.5*(1+0.34*(klt-0.4)+0.75*klt*klt);
        Double qlt2=0.5*(1+0.49*(klt-0.4)+0.75*klt*klt);
        Double qlt=getQlt()=="qlt1"?qlt1:qlt2;
        Double xlt=1/(qlt+sqrt(qlt*qlt-0.75*klt*klt));
        Double mbrd=xlt*ss*wysel;
        Double b3=myeds/mbrd;

        /*
        支承处轨道腹板屈曲失稳临界力矩校核计算
         */
        Double k1=6.93*h*sqrt(ss/210000)/3.14/tw;
        Double q1=0.5*(1+0.49*(k1-0.2)+k1*k1);
        Double xs1=1/(q1+sqrt(q1*q1-k1*k1));
        Double bef1=x+c+tfx*sqrt(b/tw);
        Double nwrd=xs1*ss*bef1*tw;
        Double b4=rzed/nwrd;

        /*
        竖向轮载的复合应力校核计算
         */
        Double sx1eds=myeds*z/iy;
        Double d=0.5*50+hy;
        Double szed=fzed/2/tw/d;
        Double tled=szed*0.2;
        Double b5=Math.pow(sx1eds/ss,2)+Math.pow(szed/ss,2)-sx1eds*szed/ss/ss+3*Math.pow((ted+tled)/ss,2);

        /*
        竖向轮载校核计算
         */
        Double fzrd=0.125*tw*tw*sqrt(210000*ss)*sqrt(hy/tw);
        Double b6=fzed/fzrd;

         /*
        竖向轮载引起的腹板屈曲失稳校核计算
         */
        Double bef2=0+0.5*h;
        Double ncrd=ss*bef2*tw;
        Double k2=3.46*h*sqrt(ss/210000)/3.14/tw;
        Double q2=0.5*(1+0.49*(k2-0.2)+k2*k2);
        Double xs2=1/(q2+sqrt(q2*q2-k2*k2));
        Double b7=fzed/xs2/ncrd;

         /*
        腹板受压校核计算
        */
        Double fz1rd=ss*bef1*tw;
        Double b8=rzed/fz1rd;

        /*
        支承反力校核计算
        */
        Double fz2rd=0.125*tw*tw*sqrt(210000*ss)*(sqrt(tfx/tw)+3*tw*c/tfx/hw);
        Double b9=rzed/fz2rd;

        /*
        支承反力引起的腹板屈曲失稳校核计算
         */
        Double bef3=x+0.5*(c+sqrt(h*h+c*c));
        Double nc1rd=ss*bef3*tw;
        Double b10 =fzed/xs2/nc1rd;

        /*
        接触应力校核计算
         */
        Double shz =sqrt(0.35*210000*fze/dcw/bcw);
        Double b11 =shz/shzr;

        /*
        正常使用极限状态校核计算
         */
        Double fzs =0.015*vzed*ld*ld*ld/210000/iy;
        Double fys =0.015*vyed*ld*ld*ld/210000/iz;

        Map<String,Double> paraMap=new HashMap<>();
        paraMap.put("iiy",iiy);
        paraMap.put("iiz",iiz);
        paraMap.put("wys",wys);
        paraMap.put("wyx",wyx);
        paraMap.put("wz",wz);
        paraMap.put("ss1",ss1);
        paraMap.put("shzr1",shzr1);
        paraMap.put("myeds",myeds);
        paraMap.put("mzeds",mzeds);
        paraMap.put("sxeds",sxeds);
        paraMap.put("b1",b1);
        paraMap.put("ted1",ted1);
        paraMap.put("ted2",ted2);
        paraMap.put("ted",ted);
        paraMap.put("b2",b2);
        paraMap.put("iw",iw);
        paraMap.put("it",it);
        paraMap.put("s",s);
        paraMap.put("ccr",ccr);
        paraMap.put("mcr",mcr);
        paraMap.put("klt",klt);
        paraMap.put("qlt1",qlt1);
        paraMap.put("qlt2",qlt2);
        paraMap.put("qlt",qlt);
        paraMap.put("xlt",xlt);
        paraMap.put("mbrd",mbrd);
        paraMap.put("b3",b3);
        paraMap.put("k1",k1);
        paraMap.put("q1",q1);
        paraMap.put("xs1",xs1);
        paraMap.put("bef1",bef1);
        paraMap.put("nwrd",nwrd);
        paraMap.put("b4",b4);
        paraMap.put("sx1eds",sx1eds);
        paraMap.put("d",d);
        paraMap.put("szed",szed);
        paraMap.put("tled",tled);
        paraMap.put("b5",b5);
        paraMap.put("fzrd",fzrd);
        paraMap.put("b6",b6);
        paraMap.put("bef2",bef2);
        paraMap.put("ncrd",ncrd);
        paraMap.put("k2",k2);
        paraMap.put("q2",q2);
        paraMap.put("xs2",xs2);
        paraMap.put("b7",b7);
        paraMap.put("fz1rd",fz1rd);
        paraMap.put("b8",b8);
        paraMap.put("fz2rd",fz2rd);
        paraMap.put("b9",b9);
        paraMap.put("bef3",bef3);
        paraMap.put("nc1rd",nc1rd);
        paraMap.put("b10",b10);
        paraMap.put("shz",shz);
        paraMap.put("b11",b11);
        paraMap.put("fzs",fzs);
        paraMap.put("fys",fys);
        paraMap.put("ld",ld);
        paraMap.put("l",l);
        paraMap.put("dcw",dcw);
        paraMap.put("bcw",bcw);
        paraMap.put("fzed",fzed);
        paraMap.put("fze",fze);
        paraMap.put("vzed",vzed);
        paraMap.put("vyed",vyed);
        paraMap.put("rzed",rzed);
        paraMap.put("x",x);
        paraMap.put("c",c);
        paraMap.put("h",h);
        paraMap.put("b",b);
        paraMap.put("tw",tw);
        paraMap.put("tfs",tfs);
        paraMap.put("tfx",tfx);
        paraMap.put("hw",hw);
        paraMap.put("hy",hy);
        paraMap.put("sy",sy);
        paraMap.put("iy",iy);
        paraMap.put("iz",iz);
        paraMap.put("wysel",wysel);
        paraMap.put("wyxel",wyxel);
        paraMap.put("wzel",wzel);
        paraMap.put("z",z);
        paraMap.put("y",y);
        paraMap.put("ss",ss);
        paraMap.put("shzr",shzr);
        return paraMap;
    }
    private Map<String,String> calculationPDF3(Map<String,Double> pdf1map,Map<String,Double> pdf2map){
        Double myeds =pdf2map.get("myeds");
        Double mzeds =pdf2map.get("mzeds");
        Double b2    =pdf2map.get("b2");
        Double b3    =pdf2map.get("b3");
        Double b4    =pdf2map.get("b4");
        Double b5    =pdf2map.get("b5");
        Double b6    =pdf2map.get("b6");
        Double b7    =pdf2map.get("b7");
        Double b8    =pdf2map.get("b8");
        Double b9    =pdf2map.get("b9");
        Double b10   =pdf2map.get("b10");
        Double b11   =pdf2map.get("b11");
        Double fzs   =pdf2map.get("fzs");
        Double fys   =pdf2map.get("fys");

        Double myed =pdf1map.get("myed");
        Double mzed =pdf1map.get("mzed");
        Double a2   =pdf1map.get("a2");
        Double a3   =pdf1map.get("a3");
        Double a4   =pdf1map.get("a4");
        Double a5   =pdf1map.get("a5");
        Double a6   =pdf1map.get("a6");
        Double a7   =pdf1map.get("a7");
        Double a8   =pdf1map.get("a8");
        Double a9   =pdf1map.get("a9");
        Double a10  =pdf1map.get("a10");
        Double a11  =pdf1map.get("a11");
        Double fz   =pdf1map.get("fz");
        Double fy   =pdf1map.get("fy");

        Double o1 =myeds/myed;
        Double o2 =mzeds/mzed;
        Double o3 =b2/a2;
        Double o4 =b3/a3;
        Double o5 =b4/a4;
        Double o6 =b5/a5;
        Double o7 =b6/a6;
        Double o8 =b7/a7;
        Double o9 =b8/a8;
        Double o10=b9/a9;
        Double o11=b10/a10;
        Double o12=b11/a11;
        Double o13=fzs/fz;
        Double o14=fys/fy;

        String g1 =0.77<=o1 && o1<=0.85?"符合":"不符合";
        String g2 =0.77<=o2 && o2<=0.85?"符合":"不符合";
        String g3 =0.66<=o3 && o3<=0.9?"符合":"不符合";
        String g4 =0.75<=o4 && o4<=0.85?"符合":"不符合";
        String g5 =0.95<=o5 && o5<=1?"符合":"不符合";
        String g6 =0.79 <=o6 && o6<=1?"符合":"不符合";
        String g7 =0.95<=o7 && o7<=1?"符合":"不符合";
        String g8 =0.95<=o8 && o8<=1?"符合":"不符合";
        String g9 =0.95<=o9 && o9<=1?"符合":"不符合";
        String g10=0.95<=o10&&o10<=1?"符合":"不符合";
        String g11=0.95<=o11&&o11<=1?"符合":"不符合";
        String g12=0.95<=o12&&o12<=1?"符合":"不符合";
        String g13=0.68<=o13&&o13<=0.75?"符合":"不符合";
        String g14=0.68<=o14&&o14<=0.75?"符合":"不符合";

        Map<String,String> map=new HashMap<>();
        map.put("myeds",CommonFunc.convertDoubleToString(myeds));
        map.put("mzeds",CommonFunc.convertDoubleToString(mzeds));
        map.put("b2",CommonFunc.convertDoubleToString(b2));
        map.put("b3",CommonFunc.convertDoubleToString(b3));
        map.put("b4",CommonFunc.convertDoubleToString(b4));
        map.put("b5",CommonFunc.convertDoubleToString(b5));
        map.put("b6",CommonFunc.convertDoubleToString(b6));
        map.put("b7",CommonFunc.convertDoubleToString(b7));
        map.put("b8",CommonFunc.convertDoubleToString(b8));
        map.put("b9",CommonFunc.convertDoubleToString(b9));
        map.put("b10",CommonFunc.convertDoubleToString(b10));
        map.put("b11",CommonFunc.convertDoubleToString(b11));
        map.put("fzs",CommonFunc.convertDoubleToString(fzs));
        map.put("fys",CommonFunc.convertDoubleToString(fys));
        map.put("myed",CommonFunc.convertDoubleToString(myed));
        map.put("mzed",CommonFunc.convertDoubleToString(mzed));
        map.put("a2",CommonFunc.convertDoubleToString(a2));
        map.put("a3",CommonFunc.convertDoubleToString(a3));
        map.put("a4",CommonFunc.convertDoubleToString(a4));
        map.put("a5",CommonFunc.convertDoubleToString(a5));
        map.put("a6",CommonFunc.convertDoubleToString(a6));
        map.put("a7",CommonFunc.convertDoubleToString(a7));
        map.put("a8",CommonFunc.convertDoubleToString(a8));
        map.put("a9",CommonFunc.convertDoubleToString(a9));
        map.put("a10",CommonFunc.convertDoubleToString(a10));
        map.put("a11",CommonFunc.convertDoubleToString(a11));
        map.put("fz",CommonFunc.convertDoubleToString(fz));
        map.put("fy",CommonFunc.convertDoubleToString(fy));
        map.put("o1",CommonFunc.convertDoubleToString(o1));
        map.put("o2",CommonFunc.convertDoubleToString(o2));
        map.put("o3",CommonFunc.convertDoubleToString(o3));
        map.put("o4",CommonFunc.convertDoubleToString(o4));
        map.put("o5",CommonFunc.convertDoubleToString(o5));
        map.put("o6",CommonFunc.convertDoubleToString(o6));
        map.put("o7",CommonFunc.convertDoubleToString(o7));
        map.put("o8",CommonFunc.convertDoubleToString(o8));
        map.put("o9",CommonFunc.convertDoubleToString(o9));
        map.put("o10",CommonFunc.convertDoubleToString(o10));
        map.put("o11",CommonFunc.convertDoubleToString(o11));
        map.put("o12",CommonFunc.convertDoubleToString(o12));
        map.put("o13",CommonFunc.convertDoubleToString(o13));
        map.put("o14",CommonFunc.convertDoubleToString(o14));
        map.put("g1",CommonFunc.convertDoubleToString(g1));
        map.put("g2",CommonFunc.convertDoubleToString(g2));
        map.put("g3",CommonFunc.convertDoubleToString(g3));
        map.put("g4",CommonFunc.convertDoubleToString(g4));
        map.put("g5",CommonFunc.convertDoubleToString(g5));
        map.put("g6",CommonFunc.convertDoubleToString(g6));
        map.put("g7",CommonFunc.convertDoubleToString(g7));
        map.put("g8",CommonFunc.convertDoubleToString(g8));
        map.put("g9",CommonFunc.convertDoubleToString(g9));
        map.put("g10",CommonFunc.convertDoubleToString(g10));
        map.put("g11",CommonFunc.convertDoubleToString(g11));
        map.put("g12",CommonFunc.convertDoubleToString(g12));
        map.put("g13",CommonFunc.convertDoubleToString(g13));
        map.put("g14",CommonFunc.convertDoubleToString(g14));
        return map;
    }

    private Map<String,String> getMap(){
        Map<String,String>map=new HashMap<>();
        map.put("no",CommonFunc.convertDoubleToString(no));
        map.put("ver",CommonFunc.convertDoubleToString(ver));
        map.put("xmmc",CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh",CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr",CommonFunc.convertDoubleToString(jsr));
        map.put("shr",CommonFunc.convertDoubleToString(shr));
        map.put("pzr",CommonFunc.convertDoubleToString(pzr));
        map.put("date",CommonFunc.convertDoubleToString(date));
        map.put("ld",CommonFunc.convertDoubleToString(ld));
        map.put("l",CommonFunc.convertDoubleToString(l));
        map.put("dcw",CommonFunc.convertDoubleToString(dcw));
        map.put("bcw",CommonFunc.convertDoubleToString(bcw));
        map.put("fzed",CommonFunc.convertDoubleToString(fzed));
        map.put("fze",CommonFunc.convertDoubleToString(fze));
        map.put("vzed",CommonFunc.convertDoubleToString(vzed));
        map.put("vyed",CommonFunc.convertDoubleToString(vyed));
        map.put("rzed",CommonFunc.convertDoubleToString(rzed));
        map.put("x",CommonFunc.convertDoubleToString(x));
        map.put("c",CommonFunc.convertDoubleToString(c));
        map.put("gdxh",CommonFunc.convertDoubleToString(gdxh));
        map.put("gcph",CommonFunc.convertDoubleToString(gcph));
        map.put("h",CommonFunc.convertDoubleToString(h));
        map.put("b",CommonFunc.convertDoubleToString(b));
        map.put("tw",CommonFunc.convertDoubleToString(tw));
        map.put("tfs",CommonFunc.convertDoubleToString(tfs));
        map.put("tfx",CommonFunc.convertDoubleToString(tfx));
        map.put("hw",CommonFunc.convertDoubleToString(hw));
        map.put("hy",CommonFunc.convertDoubleToString(hy));
        map.put("sy",CommonFunc.convertDoubleToString(sy));
        map.put("iy",CommonFunc.convertDoubleToString(iy));
        map.put("iz",CommonFunc.convertDoubleToString(iz));
        map.put("wysel",CommonFunc.convertDoubleToString(wysel));
        map.put("wyxel",CommonFunc.convertDoubleToString(wyxel));
        map.put("wzel",CommonFunc.convertDoubleToString(wzel));
        map.put("z",CommonFunc.convertDoubleToString(z));
        map.put("y",CommonFunc.convertDoubleToString(y));
        map.put("ss",CommonFunc.convertDoubleToString(ss));
        map.put("shzr",String.valueOf(shzr));
        Arrays.sort(gdxhs);
        boolean blm = Arrays.binarySearch(gdxhs,gdxh)<0;
        Arrays.sort(gcphs);
        boolean bls = Arrays.binarySearch(gcphs,gcph)<0;
        map.put("h1",CommonFunc.convertDoubleToString(blm?h:null));
        map.put("b0",CommonFunc.convertDoubleToString(blm?b:null));
        map.put("tw1",CommonFunc.convertDoubleToString(blm?tw:null));
        map.put("tfs1",CommonFunc.convertDoubleToString(blm?tfs:null));
        map.put("tfx1",CommonFunc.convertDoubleToString(blm?tfx:null));
        map.put("z1",CommonFunc.convertDoubleToString(blm?z:null));
        map.put("sy1",CommonFunc.convertDoubleToString(blm?sy:null));
        return map;
    }
    public Map<String,String> getMapForPdf1(){
        Map<String,String> map=getMap();
        map.putAll(calculationPDF1());
        return map;
    }
    public Map<String,String> getMapForPdf2(){
        Map<String,String> map=getMap();
        map.putAll(calculationPDF2());
        return map;
    }
    public String getEnlishString(String chinese){
        if(chinese.equals("H200+贴板"))
            return "H200 add plate";
        if(chinese.equals("H250+贴板"))
            return "H250 add plate";
        if(chinese.equals("拼焊H200*216"))
            return "Tailor-welded H200*216";
        if(chinese.equals("拼焊H250*266"))
            return "Tailor-welded H200*266";
        if(chinese.equals("满足"))
            return "meets";
        if(chinese.equals("不满足"))
            return "doesn't meet";
        return null;
    }
    public Map<String,String> getMapForPdf2en(){
        Map<String,String> map=getMap();
        map.putAll(calculationPDF2());
        map.put("gdxhy",gdxhen);
        map.put("vv3", getEnlishString(map.get("v3")));
        map.put("vv5", getEnlishString(map.get("v5")));
        map.put("vv7", getEnlishString(map.get("v7")));
        map.put("vv9", getEnlishString(map.get("v9")));
        map.put("vv11",getEnlishString(map.get("v11")));
        map.put("vv13",getEnlishString(map.get("v13")));
        map.put("vv15",getEnlishString(map.get("v15")));
        map.put("vv17",getEnlishString(map.get("v17")));
        map.put("vv19",getEnlishString(map.get("v19")));
        map.put("vv21",getEnlishString(map.get("v21")));
        map.put("vv26",getEnlishString(map.get("v26")));
        return map;
    }
    public Map<String,String> getMapForPdf1en(){
        Map<String,String> map=getMap();
        map.putAll(calculationPDF1());
        map.put("gdxhy",gdxhen);
        map.put("uu3",getEnlishString(map.get("u3")));
        map.put("uu5",getEnlishString(map.get("u5")));
        map.put("uu7",getEnlishString(map.get("u7")));
        map.put("uu9",getEnlishString(map.get("u9")));
        map.put("uu11",getEnlishString(map.get("u11")));
        map.put("uu13",getEnlishString(map.get("u13")));
        map.put("uu15",getEnlishString(map.get("u15")));
        map.put("uu17",getEnlishString(map.get("u17")));
        map.put("uu19",getEnlishString(map.get("u19")));
        map.put("uu21",getEnlishString(map.get("u21")));
        map.put("uu26",getEnlishString(map.get("u26")));
        return map;
    }
    public Map<String,String> getMapForPdf3(){
        Map<String,String> map=getMap();
        map.putAll(calculationPDF3(getDoubleMapForpdf1(),getDoubleMapForpdf2()));
        return map;
    }
    public Map<String,String> getCheck(){
        Map<String,String> map=getMapForPdf1();
        map.putAll(getMapForPdf2());
        Map<String,String> rest=new HashMap<>();
        for (HashMap.Entry<String,String> e: map.entrySet()) {
            String key=e.getKey();
            if(key!=null&&key!=""&&(key.charAt(0)=='v'||key.charAt(0)=='u'))
                rest.put(e.getKey(),e.getValue());
        }
        return rest;
    }
}
