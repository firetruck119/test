package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Getter;
import lombok.Setter;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PinSeatEntity {
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
    private String xzclz;
    @Getter
    @Setter
    private Double xzfx;
    @Getter
    @Setter
    private Double xzfv;

//    @Getter
//    @Setter
//    private Double xzf02;
    @Getter
    @Setter
    private Double xzfd;
    @Getter
    @Setter
    private Double xzfvd;
    @Getter
    @Setter
    private Double xzaa;
    @Getter
    @Setter
    private Double xzab;
    @Getter
    @Setter
    private Double xzac;
    @Getter
    @Setter
    private Double xzl1;
    @Getter
    @Setter
    private Double xzl2;
    @Getter
    @Setter
    private Double xzl3;
    @Getter
    @Setter
    private Double xzwa;
    @Getter
    @Setter
    private Double xzwb;
    @Getter
    @Setter
    private Double xzwc;
    @Getter
    @Setter
    private Double xzdd;
    @Getter
    @Setter
    private Double xzad;
    @Getter
    @Setter
    private Double xzf;
    @Getter
    @Setter
    private Double xzk;
    @Getter
    @Setter
    private Double xzkb;
    @Getter
    @Setter
    private Double xzl4;
    @Getter
    @Setter
    private Double xzah;
    @Getter
    @Setter
    private Double xzwh;
    @Getter
    @Setter
    private String xzclh;

    @Getter
    @Setter
    private Double xzfwf;
    @Getter
    @Setter
    private Double xzr1;
    @Getter
    @Setter
    private Double xzr2;
    @Getter
    @Setter
    private Double xzlx;
    @Getter
    @Setter
    private String xzgg;
    @Getter
    @Setter
    private Double xzas;
    @Getter
    @Setter
    private Double xzdb;
    @Getter
    @Setter
    private Double xzl5;
    @Getter
    @Setter
    private String xzxndj;
    @Getter
    @Setter
    private Double xzfbt;
    @Getter @Setter private Double xzfbv;
    @Getter @Setter private Double xzfbc;
    @Getter @Setter private Double xzd1;
    @Getter @Setter private Double xzd2;
    @Getter @Setter private Double xzd3;
//    @Getter @Setter private Double xzd4;
    //Select
    @Getter @Setter private String pinDiameter;
    @Getter @Setter private String boltPerformanceGrade;
    @Getter @Setter private String materialOfElectrode;
    @Getter @Setter private String materialOfPinSeat;
    @Getter @Setter private String hfysModel;
    private String xzosa;

    private Double xzma;
    private Double xzoa;
    private String xzp1;
    private String xzm1;
    private Double xzta;
    private String xzp2;
    private String xzm2;
    private Double xzo4a;
    private String xzp3;
    private String xzm3;
    private String xzm4;
    private Double xzmb;
    private Double xzob;
    private String xzp4;
    private String xzm5;
    private Double xztb;
    private String xzp5;
    private String xzm6;
    private Double xzo4b;
    private String xzp6;
    private String xzm7;
    private String xzm8;
    private Double xzmc;
    private Double xzoc;
    private String xzp7;
    private String xzm9;
    private Double xztc;
    private String xzp8;
    private String xzm10;
    private Double xzo4c;
    private String xzp9;
    private String xzm11;
    private String xzm12;
    private Double xzmh;
    private Double xzoh;
    private String xzp10;
    private String xzm13;
    private Double xzth;
    private String xzp11;
    private String xzm14;
    private Double xzo4h;
    private String xzp12;
    private String xzm15;
    private String xzm16;
    private Double xzod;
    private String xzp13;
    private String xzm17;
    private Double xztd;
    private String xzp14;
    private String xzm18;
    private String xzm19;
    private Double xzma1;
    private Double xzf1;
    private Double xzo1;
    private String xzp15;
    private String xzm20;
    private Double xzt1;
    private String xzp16;
    private String xzm21;
    private Double xzo41;
    private String xzp17;
    private String xzm22;
    private String xzm23;
    private Double xzma2;
    private Double xzf2;
    private Double xzo2;
    private String xzp18;
    private String xzm24;
    private Double xzt2;
    private String xzp19;
    private String xzm25;
    private Double xzo42;
    private String xzp20;
    private String xzm26;
    private String xzm27;
    private Double xzo3;
    private String xzp21;
    private String xzm28;
    private String xzm29;


    private Double xzyft1;
    private Double xzyft2;
    private String xzyp1;
    private String xzym1;
    private String xzyp2;
    private String xzym2;

    private Double xzyft3;
    private Double xzyft4;
    private String xzyp3;
    private String xzym3;
    private String xzyp4;
    private String xzym4;

    private Double xzyft6;
    private Double xzyft7;
    private String xzyp6;
    private String xzym6;
    private String xzyp7;
    private String xzym7;

    private Double xzyft8;
    private Double xzyft9;
    private String xzyp8;
    private String xzym8;
    private String xzyp9;
    private String xzym9;

    private Double xzyft10;
    private Double xzyft11;
    private String xzyp10;
    private String xzym10;
    private String xzyp11;
    private String xzym11;

    private Double xzyft12;
    private String xzyp12;
    private String xzym12;


    public Map<String, String> takeMapForPDF() {
        calculateFun();
        Map<String, String> result = new HashMap<>();
        result.put("no",CommonFunc.convertDoubleToString(no));
        result.put("ver",CommonFunc.convertDoubleToString(ver));
        result.put("xmmc",CommonFunc.convertDoubleToString(xmmc));
        result.put("zjxh",CommonFunc.convertDoubleToString(zjxh));
        result.put("jsr",CommonFunc.convertDoubleToString(jsr));
        result.put("shr",CommonFunc.convertDoubleToString(shr));
        result.put("pzr",CommonFunc.convertDoubleToString(pzr));
        result.put("date",CommonFunc.convertDoubleToString(date));
        result.put("xzclz",CommonFunc.convertDoubleToString(xzclz));
        result.put("xzfx",CommonFunc.convertDoubleToString(xzfx));
        result.put("xzfv",CommonFunc.convertDoubleToString(xzfv));
//        result.put("xzf0.2",CommonFunc.convertDoubleToString(xzf02));
        result.put("xzfd",CommonFunc.convertDoubleToString(xzfd));
        result.put("xzfvd",CommonFunc.convertDoubleToString(xzfvd));
        result.put("xzaa",CommonFunc.convertDoubleToString(xzaa));
        result.put("xzab",CommonFunc.convertDoubleToString(xzab));
        result.put("xzac",CommonFunc.convertDoubleToString(xzac));
        result.put("xzl1",CommonFunc.convertDoubleToString(xzl1));
        result.put("xzl2",CommonFunc.convertDoubleToString(xzl2));
        result.put("xzl3",CommonFunc.convertDoubleToString(xzl3));
        result.put("xzwa",CommonFunc.convertDoubleToString(xzwa));
        result.put("xzwb",CommonFunc.convertDoubleToString(xzwb));
        result.put("xzwc",CommonFunc.convertDoubleToString(xzwc));
        result.put("xzdd",CommonFunc.convertDoubleToString(xzdd));
        result.put("xzad",CommonFunc.convertDoubleToString(xzad));
        result.put("xzf",CommonFunc.convertDoubleToString(xzf));
        result.put("xzk",CommonFunc.convertDoubleToString(xzk));
        result.put("xzkb",CommonFunc.convertDoubleToString(xzkb));
        result.put("xzl4",CommonFunc.convertDoubleToString(xzl4));
        result.put("xzah",CommonFunc.convertDoubleToString(xzah));
        result.put("xzwh",CommonFunc.convertDoubleToString(xzwh));
        result.put("xzclh",CommonFunc.convertDoubleToString(xzclh));
        result.put("xzfwf",CommonFunc.convertDoubleToString(xzfwf));
        result.put("xzr1",CommonFunc.convertDoubleToString(xzr1));
        result.put("xzr2",CommonFunc.convertDoubleToString(xzr2));
        result.put("xzlx",CommonFunc.convertDoubleToString(xzlx));
        result.put("xzgg",CommonFunc.convertDoubleToString(xzgg));
        result.put("xzas",CommonFunc.convertDoubleToString(xzas));
        result.put("xzdb",CommonFunc.convertDoubleToString(xzdb));
        result.put("xzl5",CommonFunc.convertDoubleToString(xzl5));
        result.put("xzxndj",CommonFunc.convertDoubleToString(xzxndj));
        result.put("xzfbt",CommonFunc.convertDoubleToString(xzfbt));
        result.put("xzfbv",CommonFunc.convertDoubleToString(xzfbv));
        result.put("xzfbc",CommonFunc.convertDoubleToString(xzfbc));
        result.put("xzosa",CommonFunc.convertDoubleToString(xzosa));

        result.put("xzma",CommonFunc.convertDoubleToString(xzma));
        result.put("xzoa",CommonFunc.convertDoubleToString(xzoa));
        result.put("xzp1",CommonFunc.convertDoubleToString(xzp1));
        result.put("xzm1",CommonFunc.convertDoubleToString(xzm1));
        result.put("xzta",CommonFunc.convertDoubleToString(xzta));
        result.put("xzp2",CommonFunc.convertDoubleToString(xzp2));
        result.put("xzm2",CommonFunc.convertDoubleToString(xzm2));
        result.put("xzo4a",CommonFunc.convertDoubleToString(xzo4a));
        result.put("xzp3",CommonFunc.convertDoubleToString(xzp3));
        result.put("xzm3",CommonFunc.convertDoubleToString(xzm3));
        result.put("xzm4",CommonFunc.convertDoubleToString(xzm4));
        result.put("xzmb",CommonFunc.convertDoubleToString(xzmb));
        result.put("xzob",CommonFunc.convertDoubleToString(xzob));
        result.put("xzp4",CommonFunc.convertDoubleToString(xzp4));
        result.put("xzm5",CommonFunc.convertDoubleToString(xzm5));
        result.put("xztb",CommonFunc.convertDoubleToString(xztb));
        result.put("xzp5",CommonFunc.convertDoubleToString(xzp5));
        result.put("xzm6",CommonFunc.convertDoubleToString(xzm6));
        result.put("xzo4b",CommonFunc.convertDoubleToString(xzo4b));
        result.put("xzp6",CommonFunc.convertDoubleToString(xzp6));
        result.put("xzm7",CommonFunc.convertDoubleToString(xzm7));
        result.put("xzm8",CommonFunc.convertDoubleToString(xzm8));
        result.put("xzmc",CommonFunc.convertDoubleToString(xzmc));
        result.put("xzoc",CommonFunc.convertDoubleToString(xzoc));
        result.put("xzp7",CommonFunc.convertDoubleToString(xzp7));
        result.put("xzm9",CommonFunc.convertDoubleToString(xzm9));
        result.put("xztc",CommonFunc.convertDoubleToString(xztc));
        result.put("xzp8",CommonFunc.convertDoubleToString(xzp8));
        result.put("xzm10",CommonFunc.convertDoubleToString(xzm10));
        result.put("xzo4c",CommonFunc.convertDoubleToString(xzo4c));
        result.put("xzp9",CommonFunc.convertDoubleToString(xzp9));
        result.put("xzm11",CommonFunc.convertDoubleToString(xzm11));
        result.put("xzm12",CommonFunc.convertDoubleToString(xzm12));
        result.put("xzmh",CommonFunc.convertDoubleToString(xzmh));
        result.put("xzoh",CommonFunc.convertDoubleToString(xzoh));
        result.put("xzp10",CommonFunc.convertDoubleToString(xzp10));
        result.put("xzm13",CommonFunc.convertDoubleToString(xzm13));
        result.put("xzth",CommonFunc.convertDoubleToString(xzth));
        result.put("xzp11",CommonFunc.convertDoubleToString(xzp11));
        result.put("xzm14",CommonFunc.convertDoubleToString(xzm14));
        result.put("xzo4h",CommonFunc.convertDoubleToString(xzo4h));
        result.put("xzp12",CommonFunc.convertDoubleToString(xzp12));
        result.put("xzm15",CommonFunc.convertDoubleToString(xzm15));
        result.put("xzm16",CommonFunc.convertDoubleToString(xzm16));
        result.put("xzod",CommonFunc.convertDoubleToString(xzod));
        result.put("xzp13",CommonFunc.convertDoubleToString(xzp13));
        result.put("xzm17",CommonFunc.convertDoubleToString(xzm17));
        result.put("xztd",CommonFunc.convertDoubleToString(xztd));
        result.put("xzp14",CommonFunc.convertDoubleToString(xzp14));
        result.put("xzm18",CommonFunc.convertDoubleToString(xzm18));
        result.put("xzm19",CommonFunc.convertDoubleToString(xzm19));
        result.put("xzma1",CommonFunc.convertDoubleToString(xzma1));
        result.put("xzf1",CommonFunc.convertDoubleToString(xzf1));
        result.put("xzo1",CommonFunc.convertDoubleToString(xzo1));
        result.put("xzp15",CommonFunc.convertDoubleToString(xzp15));
        result.put("xzm20",CommonFunc.convertDoubleToString(xzm20));
        result.put("xzt1",CommonFunc.convertDoubleToString(xzt1));
        result.put("xzp16",CommonFunc.convertDoubleToString(xzp16));
        result.put("xzm21",CommonFunc.convertDoubleToString(xzm21));
        result.put("xzo41",CommonFunc.convertDoubleToString(xzo41));
        result.put("xzp17",CommonFunc.convertDoubleToString(xzp17));
        result.put("xzm22",CommonFunc.convertDoubleToString(xzm22));
        result.put("xzm23",CommonFunc.convertDoubleToString(xzm23));
        result.put("xzma2",CommonFunc.convertDoubleToString(xzma2));
        result.put("xzf2",CommonFunc.convertDoubleToString(xzf2));
        result.put("xzo2",CommonFunc.convertDoubleToString(xzo2));
        result.put("xzp18",CommonFunc.convertDoubleToString(xzp18));
        result.put("xzm24",CommonFunc.convertDoubleToString(xzm24));
        result.put("xzt2",CommonFunc.convertDoubleToString(xzt2));
        result.put("xzp19",CommonFunc.convertDoubleToString(xzp19));
        result.put("xzm25",CommonFunc.convertDoubleToString(xzm25));
        result.put("xzo42",CommonFunc.convertDoubleToString(xzo42));
        result.put("xzp20",CommonFunc.convertDoubleToString(xzp20));
        result.put("xzm26",CommonFunc.convertDoubleToString(xzm26));
        result.put("xzm27",CommonFunc.convertDoubleToString(xzm27));
        result.put("xzo3",CommonFunc.convertDoubleToString(xzo3));
        result.put("xzp21",CommonFunc.convertDoubleToString(xzp21));
        result.put("xzm28",CommonFunc.convertDoubleToString(xzm28));
        result.put("xzm29",CommonFunc.convertDoubleToString(xzm29));

        return result;
    }


    private void calculateFun() {
        xzma = xzf * xzl1;
        xzoa = xzma / xzwa;
        xzp1 = takeSign(xzoa,xzfx);
        xzm1 = takeString(xzoa<=xzfx);
        xzta = xzf / xzaa;
        xzp2 = takeSign(xzta,xzfv);
        xzm2 = takeString(xzta<=xzfv);
        xzo4a=sqrt(pow(xzoa,2)+3*pow(xzta,2));
        xzp3=takeSign(xzo4a,xzfx);
        xzm3=takeString(xzo4a<=xzfx);
        xzm4=takeString(xzm1,xzm2,xzm3);
        xzmb=xzf*xzl2;
        xzob=xzmb/xzwb;
        xzp4=takeSign(xzob,xzfx);
        xzm5=takeString(xzob<=xzfx);
        xztb=xzf/xzab;
        xzp5=takeSign(xztb,xzfv);
        xzm6=takeString(xztb<=xzfv);
        xzo4b=sqrt(pow(xzob,2)+3*pow(xztb,2));
        xzp6=takeSign(xzo4b,xzfx);
        xzm7=takeString(xzo4b<=xzfx);
        xzm8=takeString(xzm5,xzm7,xzm6);
        xzmc=xzf*xzl3;
        xzoc=xzmc/xzwc;
        xzp7=takeSign(xzoc,xzfx);
        xzm9=takeString(xzoc<=xzfx);
        xztc=xzf/xzac;
        xzp8=takeSign(xztc,xzfv);
        xzm10=takeString(xztc<=xzfv);
        xzo4c=sqrt(pow(xzoc,2)+3*pow(xztc,2));
        xzp9=takeSign(xzo4c,xzfx);
        xzm11=takeString(xzo4c<=xzfx);
        xzm12=takeString(xzm9,xzm10,xzm11);
        xzmh=xzf*xzl4;
        xzoh=xzmh/xzwh;
        xzp10=takeSign(xzoh,xzfwf);
        xzm13=takeString(xzoh<=xzfwf);
        xzth=xzf/xzah;
        xzp11=takeSign(xzth,xzfwf);
        xzm14=takeString(xzth<=xzfwf);
        xzo4h=sqrt(pow(xzoh,2)+3*pow(xzth,2));
        xzp12=takeSign(xzo4h,xzfwf);
        xzm15=takeString(xzo4h<=xzfwf);
        xzm16=takeString(xzm15,xzm14,xzm13);
        xzod=xzf/xzad;
        xzp13=takeSign(xzod,xzfd);
        xzm17=takeString(xzod<=xzfd);
        xztd=xzf/xzad;
        xzp14=takeSign(xztd,xzfvd);
        xzm18=takeString(xztd<=xzfvd);
        xzm19=takeString(xzm18,xzm17);
        xzma1=xzf*xzl5;
        xzf1=(xzma1*xzr1)/(2*pow(xzr1,2)+2*pow(xzr2,2));
        xzo1=xzf1/xzas;
        xzp15=takeSign(xzo1,xzfbt);
        xzm20=takeString(xzo1<=xzfbt);
        xzt1=xzf/(4*xzas);
        xzp16=takeSign(xzt1,xzfbv);
        xzm21=takeString(xzt1<=xzfbv);
        xzo41=sqrt(pow(xzo1/xzfbt,2)+pow(xzt1/xzfbv,2));
        xzp17=takeSign(xzo41,1);
        xzm22=takeString(xzo41<=1);
        xzm23=takeString(xzm22,xzm21,xzm20);
        xzma2=xzf*xzl5;
        xzf2=xzma2/(2*xzlx);
        xzo2=xzf2/xzas;
        xzp18=takeSign(xzo2,xzfbt);
        xzm24=takeString(xzo2<=xzfbt);
        xzt2=xzf/(4*xzas);
        xzp19=takeSign(xzt2,xzfbv);
        xzm25=takeString(xzt2<=xzfbv);
        xzo42=sqrt(pow(xzo2/xzfbt,2)+pow(xzt2/xzfbv,2));
        xzp20=takeSign(xzo42,1);
        xzm26=takeString(xzo42<=1);
        xzm27=takeString(xzm26,xzm25,xzm24);
        xzo3=xzf/(4*xzas);
        xzp21=takeSign(xzo3,xzfbt);
        xzm28=takeString(xzo3<=xzfbt);
        xzm29=takeString(xzm28);

        xzyft1=xzwa*xzfx/xzl1;
        xzyft2=xzfv*xzaa;
        xzyp1=takeSign(xzyft1,xzf);
        xzym1=takeString(xzyft1>=xzf);
        xzyp2=takeSign(xzyft2,xzf);
        xzym2=takeString(xzyft2>=xzf);
        xzyft3=xzwc*xzfx/xzl3;
        xzyft4=xzfv*xzac;
        xzyp3=takeSign(xzyft3,xzf);
        xzym3=takeString(xzyft3>=xzf);
        xzyp4=takeSign(xzyft4,xzf);
        xzym4=takeString(xzyft4>=xzf);
        xzyft6=385*xzad;
        xzyft7=220*xzad;
        xzyp6=takeSign(xzyft6,xzf);
        xzym6=takeString(xzyft6>=xzf);
        xzyp7=takeSign(xzyft7,xzf);
        xzym7=takeString(xzyft7>=xzf);
        xzyft8=(2*xzfbt*xzas*(pow(xzr1,2)+pow(xzr2,2)))/(xzl5*xzr1);
        xzyft9=4*xzfbv*xzas;
        xzyp8=takeSign(xzyft8,xzf);
        xzym8=takeString(xzyft8>=xzf);
        xzyp9=takeSign(xzyft9,xzf);
        xzym9=takeString(xzyft9>=xzf);
        xzyft10=(2*xzfbt*xzas*xzlx)/xzl5;
        xzyft11=4*xzfbv*xzas;
        xzyp10=takeSign(xzyft10,xzf);
        xzym10=takeString(xzyft10>=xzf);
        xzyp11=takeSign(xzyft11,xzf);
        xzym11=takeString(xzyft11>=xzf);
        xzyft12=4*xzfbt*xzas;
        xzyp12=takeSign(xzyft12,xzf);
        xzym12=takeString(xzyft12>=xzf);
        xzosa=xzf==2700?"OSHA STD1-3.3防风销标准":"";
    }

    private String takeSign(double a, double b) {
        return a < b ? "<" : a > b ? ">" : "=";
    }

    private String takeString(boolean a) {
        return a ? "满足" : "不满足";
    }

    private String takeString(String ... a) {
        Boolean b=true;
        for (String i: a) {
            b=b&(i.equals("满足"));
        }
        return b? "满足" : "不满足";

    }

    public Map<String, String> takeMapForCheck() {
        calculateFun();
        Map<String,String> map=new HashMap<>();
        map.put("xzf",CommonFunc.convertDoubleToString(xzf));
        map.put("xzclz",CommonFunc.convertDoubleToString(xzclz));
        map.put("xzfx",CommonFunc.convertDoubleToString(xzfx));
        map.put("xzwa",CommonFunc.convertDoubleToString(xzwa));
        map.put("xzl1",CommonFunc.convertDoubleToString(xzl1));
        map.put("xzfv",CommonFunc.convertDoubleToString(xzfv));
        map.put("xzaa",CommonFunc.convertDoubleToString(xzaa));
        map.put("xzwc",CommonFunc.convertDoubleToString(xzwc));
        map.put("xzl3",CommonFunc.convertDoubleToString(xzl3));
        map.put("xzac",CommonFunc.convertDoubleToString(xzac));
        map.put("xzad",CommonFunc.convertDoubleToString(xzad));
        map.put("xzxndj",CommonFunc.convertDoubleToString(xzxndj));
        map.put("xzfbt",CommonFunc.convertDoubleToString(xzfbt));
        map.put("xzfbv",CommonFunc.convertDoubleToString(xzfbv));
        map.put("xzas",CommonFunc.convertDoubleToString(xzas));
        map.put("xzr1",CommonFunc.convertDoubleToString(xzr1));
        map.put("xzr2",CommonFunc.convertDoubleToString(xzr2));
        map.put("xzl5",CommonFunc.convertDoubleToString(xzl5));
        map.put("xzlx",CommonFunc.convertDoubleToString(xzlx));

        map.put("xzyft1",CommonFunc.convertDoubleToString(xzyft1));
        map.put("xzyft2",CommonFunc.convertDoubleToString(xzyft2));
        map.put("xzyp1",CommonFunc.convertDoubleToString(xzyp1));
        map.put("xzym1",CommonFunc.convertDoubleToString(xzym1));
        map.put("xzyp2",CommonFunc.convertDoubleToString(xzyp2));
        map.put("xzym2",CommonFunc.convertDoubleToString(xzym2));
        map.put("xzyft3",CommonFunc.convertDoubleToString(xzyft3));
        map.put("xzyft4",CommonFunc.convertDoubleToString(xzyft4));
        map.put("xzyp3",CommonFunc.convertDoubleToString(xzyp3));
        map.put("xzym3",CommonFunc.convertDoubleToString(xzym3));
        map.put("xzyp4",CommonFunc.convertDoubleToString(xzyp4));
        map.put("xzym4",CommonFunc.convertDoubleToString(xzym4));
        map.put("xzyft6",CommonFunc.convertDoubleToString(xzyft6));
        map.put("xzyft7",CommonFunc.convertDoubleToString(xzyft7));
        map.put("xzyp6",CommonFunc.convertDoubleToString(xzyp6));
        map.put("xzym6",CommonFunc.convertDoubleToString(xzym6));
        map.put("xzyp7",CommonFunc.convertDoubleToString(xzyp7));
        map.put("xzym7",CommonFunc.convertDoubleToString(xzym7));
        map.put("xzyft8",CommonFunc.convertDoubleToString(xzyft8));
        map.put("xzyft9",CommonFunc.convertDoubleToString(xzyft9));
        map.put("xzyp8",CommonFunc.convertDoubleToString(xzyp8));
        map.put("xzym8",CommonFunc.convertDoubleToString(xzym8));
        map.put("xzyp9",CommonFunc.convertDoubleToString(xzyp9));
        map.put("xzym9",CommonFunc.convertDoubleToString(xzym9));
        map.put("xzyft10",CommonFunc.convertDoubleToString(xzyft10));
        map.put("xzyft11",CommonFunc.convertDoubleToString(xzyft11));
        map.put("xzyp10",CommonFunc.convertDoubleToString(xzyp10));
        map.put("xzym10",CommonFunc.convertDoubleToString(xzym10));
        map.put("xzyp11",CommonFunc.convertDoubleToString(xzyp11));
        map.put("xzym11",CommonFunc.convertDoubleToString(xzym11));
        map.put("xzyft12",CommonFunc.convertDoubleToString(xzyft12));
        map.put("xzyp12",CommonFunc.convertDoubleToString(xzyp12));
        map.put("xzym12",CommonFunc.convertDoubleToString(xzym12));
        return map;
    }

    public Map<String,String> check(){
        Map<String,String> resultmap=new HashMap<>();
        calculateFun();
        resultmap.put("xzo4a",CommonFunc.convertDoubleToString( xzo4a));
        resultmap.put("xzo4b",CommonFunc.convertDoubleToString( xzo4b));
        resultmap.put("xzo4c",CommonFunc.convertDoubleToString( xzo4c));
        resultmap.put("xzo4h",CommonFunc.convertDoubleToString( xzo4h));
        resultmap.put("xzod",CommonFunc.convertDoubleToString( xzod));
        resultmap.put("xztd",CommonFunc.convertDoubleToString( xztd));
        resultmap.put("xzo41",CommonFunc.convertDoubleToString( xzo41));
        resultmap.put("xzo42",CommonFunc.convertDoubleToString( xzo42));
        resultmap.put("xzo3",CommonFunc.convertDoubleToString( xzo3));

        resultmap.put("xzfx",CommonFunc.convertDoubleToString(xzfx));
// resultmap.put("xzf02",CommonFunc.convertDoubleToString(xzf02));
        resultmap.put("xzfwf",CommonFunc.convertDoubleToString(xzfwf));
        resultmap.put("xzfbt",CommonFunc.convertDoubleToString(xzfbt));
        resultmap.put("xzfbc",CommonFunc.convertDoubleToString(xzfbc));

        resultmap.put("xzm4",CommonFunc.convertDoubleToString(xzm4));
        resultmap.put("xzm8",CommonFunc.convertDoubleToString(xzm8));
        resultmap.put("xzm12",CommonFunc.convertDoubleToString(xzm12));
        resultmap.put("Xzm16",CommonFunc.convertDoubleToString(xzm16));
        resultmap.put("xzm17",CommonFunc.convertDoubleToString(xzm17));
        resultmap.put("xzm18",CommonFunc.convertDoubleToString(xzm18));
        resultmap.put("xzm23",CommonFunc.convertDoubleToString(xzm23));
        resultmap.put("xzm27",CommonFunc.convertDoubleToString(xzm27));
        resultmap.put("xzm29",CommonFunc.convertDoubleToString(xzm29));
        return resultmap;
    }

}
