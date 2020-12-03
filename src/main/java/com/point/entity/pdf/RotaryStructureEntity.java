package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class RotaryStructureEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double p;
    private Double pf;
    private Double lbd;
    private Double lbx;
    private Double lbp;
    private Double lbpx;
    private Double dbyj;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;

    private Double m12;
    private Double m13;
    private Double m14;
    private Double lhz13;
    private Double lhz14;
    private Double acx12;
    private Double acx13;
    private Double acx14;

    private Double hzzchzgdd;
    private Double i12x;
    private Double ndbhz;
    private Double flsp;
    private Double tls;
    private Double nlsr;

//    提示提醒
    private String grutstx;

//    回转电机参数
    private String hzdjxh;
    private Double hzdjp;
    private Double hzdjtn;
    private Double hzdjzd;
    private Double hzdjna;
    private Double hzdji;
    private Double hzdjta;

    //    回转支承参数
    private String hzzcxh;
    private Double hzzcms;
    private Double hzzccs;
    private Double hzzchzgddk;

    //    回转小齿轮参数
    private Double hzxclms;
    private Double hzxclcs;

    //    回转螺栓参数
    private String hzlsxh;
    private Double hzlsgczj;
    private Double hzlsgca;
    private String hzlsxndj;
    private Double hzlsss;
    private Double nlsyjlxs;

    //    回转机构螺栓距离参数
    private Double hzlslhz1;
    private Double hzlslhz2;
    private Double hzlslhz3;
    private Double hzlslhz4;
    private Double hzlslhz5;
    private Double hzlslhz6;
    private Double hzlslhz7;
    private Double hzlslhz8;
    private Double hzlslhz9;
    private Double hzlslhz10;

//    工作载荷
    private Double swp;
    private Double r1;
    private Double mwr;
    private Double mffbb;
    private Double tsl;
    private Double hwll;
    private Double hsw;
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
    private Double m12hz;
    private Double m13hz;
    private Double m14hz;
    private Double mhz;
    private Double mhzf;

//    工作重心至回转中心距离
    private Double lslhz;
    private Double lshlhz;
    private Double lhz1;
    private Double lhz2;
    private Double lhz3;
    private Double lhz4;
    private Double lhz5;
    private Double lhz6;
    private Double lhz7;
    private Double lhz8;
    private Double lhz9;
    private Double lhz10;
    private Double lhz11;
    private Double lhz12hz;
    private Double lhz13hz;
    private Double lhz14hz;

    //    工作面心至回转中心距离
    private Double lslmz;
    private Double lshlmz;
    private Double lmz1;
    private Double lmz2;
    private Double lmz3;
    private Double lmz4;
    private Double lmz5;
    private Double lmz6;
    private Double lmz7;
    private Double lmz8;
    private Double lmz9;
    private Double lmz10;
    private Double lmz11;
    private Double lmz12hz;
    private Double lmz13hz;
    private Double lmz14hz;

    //    工作吊臂侧向迎风面积
    private Double aslcx;
    private Double ashlcx;
    private Double acx1;
    private Double acx2;
    private Double acx3;
    private Double acx4;
    private Double acx5;
    private Double acx6;
    private Double acx7;
    private Double acx8;
    private Double acx9;
    private Double acx10;
    private Double acx11;
    private Double acx12hz;
    private Double acx13hz;
    private Double acx14hz;

//    工作风载荷作用高度
    private Double hslm;
    private Double hshlm;
    private Double hm1;
    private Double hm2;
    private Double hm3;
    private Double hm4;
    private Double hm5;
    private Double hm6;
    private Double hm7;
    private Double hm8;
    private Double hm9;
    private Double hm10;
    private Double hm11;
    private Double hm12;
    private Double hm13;
    private Double hm14;

    //    非工作载荷
    private Double m5f;
    private Double m13hzf;

    //    非工作重心至回转中心距离
    private Double lhzf1;
    private Double lhzf2;
    private Double lhzf3;
    private Double lhzf4;
    private Double lhzf5;
    private Double lhzf6;
    private Double lhzf7;
    private Double lhzf8;
    private Double lhzf9;
    private Double lhzf10;
    private Double lhzf11;
    private Double lhzf12hz;
    private Double lhzf13hz;
    private Double lhzf14hz;

    //    非工作面心至回转中心距离
    private Double lmzf1;
    private Double lmzf2;
    private Double lmzf3;
    private Double lmzf4;
    private Double lmzf5;
    private Double lmzf6;
    private Double lmzf7;
    private Double lmzf8;
    private Double lmzf9;
    private Double lmzf10;
    private Double lmzf11;
    private Double lmzf12hz;
    private Double lmzf13hz;
    private Double lmzf14hz;

    //    非工作吊臂侧向迎风面积
    private Double afcx1;
    private Double afcx2;
    private Double afcx3;
    private Double afcx4;
    private Double afcx5;
    private Double afcx6;
    private Double afcx7;
    private Double afcx8;
    private Double afcx9;
    private Double afcx10;
    private Double afcx11;
    private Double afcx12hz;
    private Double afcx13hz;
    private Double afcx14hz;

    //    非工作风载荷作用高度
    private Double hmf1;
    private Double hmf2;
    private Double hmf3;
    private Double hmf4;
    private Double hmf5;
    private Double hmf6;
    private Double hmf7;
    private Double hmf8;
    private Double hmf9;
    private Double hmf10;
    private Double hmf11;
    private Double hmf12;
    private Double hmf13;
    private Double hmf14;

    private String hzzcm1;
    private String hzzcm2;
    private String hzzcm3;
    private String hzzcmzj;

    private String ccjjxModel;
    private String dcModel;
    private String dcgssModel;
    private String ffbbModel;
    private String btModel;
    private String gruModel;
    private String qsjgModel;
    private String dhzjgModel;
    private String haveOfMobileCounterweight;//移动配重选择

    private String hzzcjtgkmzModel;
    private String hzzcdtgkmzModel;
    private String hzzclsqdmzModel;

    private String hzlsljgkModel;
    private String hzlsxndjModel;


    public Map<String, String> takeMapForPDF(String type) {
        Map map = new HashMap();
        map.put("no", CommonFunc.convertDoubleToString(no));
        map.put("ver", CommonFunc.convertDoubleToString(ver));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("zjxh", CommonFunc.convertDoubleToString(zjxh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("shr", CommonFunc.convertDoubleToString(shr));
        map.put("pzr", CommonFunc.convertDoubleToString(pzr));
        map.put("date", CommonFunc.convertDoubleToString(date));

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("p", CommonFunc.convertDoubleToString(p));
        map.put("pf", CommonFunc.convertDoubleToString(pf));
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("lbp", CommonFunc.convertDoubleToString(lbp));
        map.put("lbpx", CommonFunc.convertDoubleToString(lbpx));
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("m12", CommonFunc.convertDoubleToString(m12));
        map.put("m13", CommonFunc.convertDoubleToString(m13));
        map.put("m14", CommonFunc.convertDoubleToString(m14));
        map.put("lhz13", CommonFunc.convertDoubleToString(lhz13));
        map.put("lhz14", CommonFunc.convertDoubleToString(lhz14));
        map.put("acx12", CommonFunc.convertDoubleToString(acx12));
        map.put("acx13", CommonFunc.convertDoubleToString(acx13));
        map.put("acx14", CommonFunc.convertDoubleToString(acx14));
        map.put("hzzchzgdd", CommonFunc.convertDoubleToString(hzzchzgdd));
        map.put("i12x", CommonFunc.convertDoubleToString(i12x));
        map.put("ndbhz", CommonFunc.convertDoubleToString(ndbhz));
        map.put("flsp", CommonFunc.convertDoubleToString(flsp));
        map.put("tls", CommonFunc.convertDoubleToString(tls));
        map.put("nlsr", CommonFunc.convertDoubleToString(nlsr));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("hzdjxh", CommonFunc.convertDoubleToString(hzdjxh));
        map.put("hzdjp", CommonFunc.convertDoubleToString(hzdjp));
        map.put("hzdjtn", CommonFunc.convertDoubleToString(hzdjtn));
        map.put("hzdjzd", CommonFunc.convertDoubleToString(hzdjzd));
        map.put("hzdjna", CommonFunc.convertDoubleToString(hzdjna));
        map.put("hzdji", CommonFunc.convertDoubleToString(hzdji));
        map.put("hzdjta", CommonFunc.convertDoubleToString(hzdjta));

        map.put("hzzcxh", CommonFunc.convertDoubleToString(hzzcxh));
        map.put("hzzcms", CommonFunc.convertDoubleToString(hzzcms));
        map.put("hzzccs", CommonFunc.convertDoubleToString(hzzccs));
        map.put("hzzchzgddk", CommonFunc.convertDoubleToString(hzzchzgddk));

        map.put("hzxclms", CommonFunc.convertDoubleToString(hzxclms));
        map.put("hzxclcs", CommonFunc.convertDoubleToString(hzxclcs));

        map.put("hzlsxh", CommonFunc.convertDoubleToString(hzlsxh));
        map.put("hzlsgczj", CommonFunc.convertDoubleToString(hzlsgczj));
        map.put("hzlsgca", CommonFunc.convertDoubleToString(hzlsgca));
        map.put("hzlsxndj", CommonFunc.convertDoubleToString(hzlsxndj));
        map.put("hzlsss", CommonFunc.convertDoubleToString(hzlsss));
        map.put("nlsyjlxs", CommonFunc.convertDoubleToString(nlsyjlxs));

        map.put("hzlslhz1", CommonFunc.convertDoubleToString3(hzlslhz1));
        map.put("hzlslhz2", CommonFunc.convertDoubleToString3(hzlslhz2));
        map.put("hzlslhz3", CommonFunc.convertDoubleToString3(hzlslhz3));
        map.put("hzlslhz4", CommonFunc.convertDoubleToString3(hzlslhz4));
        map.put("hzlslhz5", CommonFunc.convertDoubleToString3(hzlslhz5));
        map.put("hzlslhz6", CommonFunc.convertDoubleToString3(hzlslhz6));
        map.put("hzlslhz7", CommonFunc.convertDoubleToString3(hzlslhz7));
        map.put("hzlslhz8", CommonFunc.convertDoubleToString3(hzlslhz8));
        map.put("hzlslhz9", CommonFunc.convertDoubleToString3(hzlslhz9));
        map.put("hzlslhz10", CommonFunc.convertDoubleToString3(hzlslhz10));

        map.put("swp", CommonFunc.convertDoubleToString(swp));
        map.put("r1", CommonFunc.convertDoubleToString(r1));
        map.put("mwr", CommonFunc.convertDoubleToString(mwr));
        map.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        map.put("tsl", CommonFunc.convertDoubleToString(tsl));
        map.put("hwll", CommonFunc.convertDoubleToString(hwll));
        map.put("hsw", CommonFunc.convertDoubleToString(hsw));
        map.put("tshl", CommonFunc.convertDoubleToString(tshl));
        map.put("m1", CommonFunc.convertDoubleToString(m1));
        map.put("m2", CommonFunc.convertDoubleToString(m2));
        map.put("m3", CommonFunc.convertDoubleToString(m3));
        map.put("m4", CommonFunc.convertDoubleToString(m4));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("m6", CommonFunc.convertDoubleToString(m6));
        map.put("m7", CommonFunc.convertDoubleToString(m7));
        map.put("m8", CommonFunc.convertDoubleToString(m8));
        map.put("m9", CommonFunc.convertDoubleToString(m9));
        map.put("m10", CommonFunc.convertDoubleToString(m10));
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("m12hz", CommonFunc.convertDoubleToString(m12hz));
        map.put("m13hz", CommonFunc.convertDoubleToString(m13hz));
        map.put("m14hz", CommonFunc.convertDoubleToString(m14hz));
        map.put("mhz", CommonFunc.convertDoubleToString(mhz));
        map.put("mhzf", CommonFunc.convertDoubleToString(mhzf));

        map.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        map.put("lshlhz", CommonFunc.convertDoubleToString(lshlhz));
        map.put("lhz1", CommonFunc.convertDoubleToString(lhz1));
        map.put("lhz2", CommonFunc.convertDoubleToString(lhz2));
        map.put("lhz3", CommonFunc.convertDoubleToString(lhz3));
        map.put("lhz4", CommonFunc.convertDoubleToString(lhz4));
        map.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        map.put("lhz6", CommonFunc.convertDoubleToString(lhz6));
        map.put("lhz7", CommonFunc.convertDoubleToString(lhz7));
        map.put("lhz8", CommonFunc.convertDoubleToString(lhz8));
        map.put("lhz9", CommonFunc.convertDoubleToString(lhz9));
        map.put("lhz10", CommonFunc.convertDoubleToString(lhz10));
        map.put("lhz11", CommonFunc.convertDoubleToString(lhz11));
        map.put("lhz12hz", CommonFunc.convertDoubleToString(lhz12hz));
        map.put("lhz13hz", CommonFunc.convertDoubleToString(lhz13hz));
        map.put("lhz14hz", CommonFunc.convertDoubleToString(lhz14hz));

        map.put("lslmz", CommonFunc.convertDoubleToString(lslmz));
        map.put("lshlmz", CommonFunc.convertDoubleToString(lshlmz));
        map.put("lmz1", CommonFunc.convertDoubleToString(lmz1));
        map.put("lmz2", CommonFunc.convertDoubleToString(lmz2));
        map.put("lmz3", CommonFunc.convertDoubleToString(lmz3));
        map.put("lmz4", CommonFunc.convertDoubleToString(lmz4));
        map.put("lmz5", CommonFunc.convertDoubleToString(lmz5));
        map.put("lmz6", CommonFunc.convertDoubleToString(lmz6));
        map.put("lmz7", CommonFunc.convertDoubleToString(lmz7));
        map.put("lmz8", CommonFunc.convertDoubleToString(lmz8));
        map.put("lmz9", CommonFunc.convertDoubleToString(lmz9));
        map.put("lmz10", CommonFunc.convertDoubleToString(lmz10));
        map.put("lmz11", CommonFunc.convertDoubleToString(lmz11));
        map.put("lmz12hz", CommonFunc.convertDoubleToString(lmz12hz));
        map.put("lmz13hz", CommonFunc.convertDoubleToString(lmz13hz));
        map.put("lmz14hz", CommonFunc.convertDoubleToString(lmz14hz));

        map.put("aslcx", CommonFunc.convertDoubleToString(aslcx));
        map.put("ashlcx", CommonFunc.convertDoubleToString(ashlcx));
        map.put("acx1", CommonFunc.convertDoubleToString(acx1));
        map.put("acx2", CommonFunc.convertDoubleToString(acx2));
        map.put("acx3", CommonFunc.convertDoubleToString(acx3));
        map.put("acx4", CommonFunc.convertDoubleToString(acx4));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("acx6", CommonFunc.convertDoubleToString(acx6));
        map.put("acx7", CommonFunc.convertDoubleToString(acx7));
        map.put("acx8", CommonFunc.convertDoubleToString(acx8));
        map.put("acx9", CommonFunc.convertDoubleToString(acx9));
        map.put("acx10", CommonFunc.convertDoubleToString(acx10));
        map.put("acx11", CommonFunc.convertDoubleToString(acx11));
        map.put("acx12hz", CommonFunc.convertDoubleToString(acx12hz));
        map.put("acx13hz", CommonFunc.convertDoubleToString(acx13hz));
        map.put("acx14hz", CommonFunc.convertDoubleToString(acx14hz));

        map.put("hslm", CommonFunc.convertDoubleToString(hslm));
        map.put("hshlm", CommonFunc.convertDoubleToString(hshlm));
        map.put("hm1", CommonFunc.convertDoubleToString(hm1));
        map.put("hm2", CommonFunc.convertDoubleToString(hm2));
        map.put("hm3", CommonFunc.convertDoubleToString(hm3));
        map.put("hm4", CommonFunc.convertDoubleToString(hm4));
        map.put("hm5", CommonFunc.convertDoubleToString(hm5));
        map.put("hm6", CommonFunc.convertDoubleToString(hm6));
        map.put("hm7", CommonFunc.convertDoubleToString(hm7));
        map.put("hm8", CommonFunc.convertDoubleToString(hm8));
        map.put("hm9", CommonFunc.convertDoubleToString(hm9));
        map.put("hm10", CommonFunc.convertDoubleToString(hm10));
        map.put("hm11", CommonFunc.convertDoubleToString(hm11));
        map.put("hm12", CommonFunc.convertDoubleToString(hm12));
        map.put("hm13", CommonFunc.convertDoubleToString(hm13));
        map.put("hm14", CommonFunc.convertDoubleToString(hm14));

        map.put("m5f", CommonFunc.convertDoubleToString(m5f));
        map.put("m13hzf", CommonFunc.convertDoubleToString(m13hzf));

        map.put("lhzf1", CommonFunc.convertDoubleToString(lhzf1));
        map.put("lhzf2", CommonFunc.convertDoubleToString(lhzf2));
        map.put("lhzf3", CommonFunc.convertDoubleToString(lhzf3));
        map.put("lhzf4", CommonFunc.convertDoubleToString(lhzf4));
        map.put("lhzf5", CommonFunc.convertDoubleToString(lhzf5));
        map.put("lhzf6", CommonFunc.convertDoubleToString(lhzf6));
        map.put("lhzf7", CommonFunc.convertDoubleToString(lhzf7));
        map.put("lhzf8", CommonFunc.convertDoubleToString(lhzf8));
        map.put("lhzf9", CommonFunc.convertDoubleToString(lhzf9));
        map.put("lhzf10", CommonFunc.convertDoubleToString(lhzf10));
        map.put("lhzf11", CommonFunc.convertDoubleToString(lhzf11));
        map.put("lhzf12hz", CommonFunc.convertDoubleToString(lhzf12hz));
        map.put("lhzf13hz", CommonFunc.convertDoubleToString(lhzf13hz));
        map.put("lhzf14hz", CommonFunc.convertDoubleToString(lhzf14hz));

        map.put("lmzf1", CommonFunc.convertDoubleToString(lmzf1));
        map.put("lmzf2", CommonFunc.convertDoubleToString(lmzf2));
        map.put("lmzf3", CommonFunc.convertDoubleToString(lmzf3));
        map.put("lmzf4", CommonFunc.convertDoubleToString(lmzf4));
        map.put("lmzf5", CommonFunc.convertDoubleToString(lmzf5));
        map.put("lmzf6", CommonFunc.convertDoubleToString(lmzf6));
        map.put("lmzf7", CommonFunc.convertDoubleToString(lmzf7));
        map.put("lmzf8", CommonFunc.convertDoubleToString(lmzf8));
        map.put("lmzf9", CommonFunc.convertDoubleToString(lmzf9));
        map.put("lmzf10", CommonFunc.convertDoubleToString(lmzf10));
        map.put("lmzf11", CommonFunc.convertDoubleToString(lmzf11));
        map.put("lmzf12hz", CommonFunc.convertDoubleToString(lmzf12hz));
        map.put("lmzf13hz", CommonFunc.convertDoubleToString(lmzf13hz));
        map.put("lmzf14hz", CommonFunc.convertDoubleToString(lmzf14hz));

        map.put("afcx1", CommonFunc.convertDoubleToString(afcx1));
        map.put("afcx2", CommonFunc.convertDoubleToString(afcx2));
        map.put("afcx3", CommonFunc.convertDoubleToString(afcx3));
        map.put("afcx4", CommonFunc.convertDoubleToString(afcx4));
        map.put("afcx5", CommonFunc.convertDoubleToString(afcx5));
        map.put("afcx6", CommonFunc.convertDoubleToString(afcx6));
        map.put("afcx7", CommonFunc.convertDoubleToString(afcx7));
        map.put("afcx8", CommonFunc.convertDoubleToString(afcx8));
        map.put("afcx9", CommonFunc.convertDoubleToString(afcx9));
        map.put("afcx10", CommonFunc.convertDoubleToString(afcx10));
        map.put("afcx11", CommonFunc.convertDoubleToString(afcx11));
        map.put("afcx12hz", CommonFunc.convertDoubleToString(afcx12hz));
        map.put("afcx13hz", CommonFunc.convertDoubleToString(afcx13hz));
        map.put("afcx14hz", CommonFunc.convertDoubleToString(afcx14hz));

        map.put("hmf1", CommonFunc.convertDoubleToString(hmf1));
        map.put("hmf2", CommonFunc.convertDoubleToString(hmf2));
        map.put("hmf3", CommonFunc.convertDoubleToString(hmf3));
        map.put("hmf4", CommonFunc.convertDoubleToString(hmf4));
        map.put("hmf5", CommonFunc.convertDoubleToString(hmf5));
        map.put("hmf6", CommonFunc.convertDoubleToString(hmf6));
        map.put("hmf7", CommonFunc.convertDoubleToString(hmf7));
        map.put("hmf8", CommonFunc.convertDoubleToString(hmf8));
        map.put("hmf9", CommonFunc.convertDoubleToString(hmf9));
        map.put("hmf10", CommonFunc.convertDoubleToString(hmf10));
        map.put("hmf11", CommonFunc.convertDoubleToString(hmf11));
        map.put("hmf12", CommonFunc.convertDoubleToString(hmf12));
        map.put("hmf13", CommonFunc.convertDoubleToString(hmf13));
        map.put("hmf14", CommonFunc.convertDoubleToString(hmf14));

        map.put("hzzcm1", CommonFunc.convertDoubleToString(hzzcm1));
        map.put("hzzcm2", CommonFunc.convertDoubleToString(hzzcm2));
        map.put("hzzcm3", CommonFunc.convertDoubleToString(hzzcm3));
        map.put("hzzcmzj", CommonFunc.convertDoubleToString(hzzcmzj));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    //验证部分
    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }

    //正文部分
    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

//        回转减速电机校核
//        风载荷回转力矩
        Double twsl = p * aslcx * lslmz ;
        Double twshl = p * ashlcx * lshlmz ;
        Double tw1 = p * acx1 * lmz1 ;
        Double tw2 = p * acx2 * lmz2 ;
        Double tw3 = p * acx3 * lmz3 ;
        Double tw4 = p * acx4 * lmz4 ;
        Double tw5 = p * acx5 * lmz5 ;
        Double tw6 = p * acx6 * lmz6 ;
        Double tw7 = p * acx7 * lmz7 ;
        Double tw8 = p * acx8 * lmz8 ;
        map.put("twsl", twsl);
        map.put("twshl", twshl);
        map.put("tw1", tw1);
        map.put("tw2", tw2);
        map.put("tw3", tw3);
        map.put("tw4", tw4);
        map.put("tw5", tw5);
        map.put("tw6", tw6);
        map.put("tw7", tw7);
        map.put("tw8", tw8);

        Double tw9 = p * acx9 * lmz9 ;
        Double tw10 = p * acx10 * lmz10 ;
        Double tw11 = p * acx11 * lmz11 ;
        Double tw12 = p * acx12hz * lmz12hz ;
        Double tw13 = p * acx13hz * lmz13hz ;
        Double tw14 = p * acx14hz * lmz14hz ;
        map.put("tw9", tw9);
        map.put("tw10", tw10);
        map.put("tw11", tw11);
        map.put("tw12", tw12);
        map.put("tw13", tw13);
        map.put("tw14", tw14);

//        载荷倾覆力矩
        Double mslz = 10 * tsl * lslhz ;
        Double mshlz = 10 * tshl * lshlhz ;
        Double mz1 = 10 * m1 * lhz1 ;
        Double mz2 = 10 * m2 * lhz2 ;
        Double mz3 = 10 * m3 * lhz3 ;
        Double mz4 = 10 * m4 * lhz4 ;
        Double mz5 = 10 * m5 * lhz5 ;
        Double mz6 = 10 * m6 * lhz6 ;
        Double mz7 = 10 * m7 * lhz7 ;
        Double mz8 = 10 * m8 * lhz8 ;
        map.put("mslz", mslz);
        map.put("mshlz", mshlz);
        map.put("mz1", mz1);
        map.put("mz2", mz2);
        map.put("mz3", mz3);
        map.put("mz4", mz4);
        map.put("mz5", mz5);
        map.put("mz6", mz6);
        map.put("mz7", mz7);
        map.put("mz8", mz8);

        Double mz9 = 10 * m9 * lhz9 ;
        Double mz10 = 10 * m10 * lhz10 ;
        Double mz11 = 10 * m11 * lhz11 ;
        Double mz12 = 10 * m12hz * lhz12hz ;
        Double mz13 = 10 * m13hz * lhz13hz ;
        Double mz14 = 10 * m14hz * lhz14hz ;
        map.put("mz9", mz9);
        map.put("mz10", mz10);
        map.put("mz11", mz11);
        map.put("mz12", mz12);
        map.put("mz13", mz13);
        map.put("mz14", mz14);

//        风载荷倾覆力矩
        Double mslw = p * aslcx * hslm ;
        Double mshlw = p * ashlcx * hshlm ;
        Double mw1 = p * acx1 * hm1 ;
        Double mw2 = p * acx2 * hm2 ;
        Double mw3 = p * acx3 * hm3 ;
        Double mw4 = p * acx4 * hm4 ;
        Double mw5 = p * acx5 * hm5 ;
        Double mw6 = p * acx6 * hm6 ;
        Double mw7 = p * acx7 * hm7 ;
        Double mw8 = p * acx8 * hm8 ;
        Double mw9 = p * acx9 * hm9 ;
        Double mw10 = p * acx10 * hm10 ;
        Double mw11 = p * acx11 * hm11 ;
        Double mw12 = p * acx12hz * hm12 ;
        Double mw13 = p * acx13hz * hm13 ;
        Double mw14 = p * acx14hz * hm14 ;
        map.put("mslw", mslw);
        map.put("mshlw", mshlw);
        map.put("mw1", mw1);
        map.put("mw2", mw2);
        map.put("mw3", mw3);
        map.put("mw4", mw4);
        map.put("mw5", mw5);
        map.put("mw6", mw6);
        map.put("mw7", mw7);
        map.put("mw8", mw8);
        map.put("mw9", mw9);
        map.put("mw10", mw10);
        map.put("mw11", mw11);
        map.put("mw12", mw12);
        map.put("mw13", mw13);
        map.put("mw14", mw14);

        //        风载荷
        Double fslcx = p * aslcx ;
        Double fshlcx = p * ashlcx ;
        Double fcx1 = p * acx1 ;
        Double fcx2 = p * acx2 ;
        Double fcx3 = p * acx3 ;
        Double fcx4 = p * acx4 ;
        Double fcx5 = p * acx5 ;
        Double fcx6 = p * acx6 ;
        Double fcx7 = p * acx7 ;
        Double fcx8 = p * acx8 ;
        Double fcx9 = p * acx9 ;
        Double fcx10 = p * acx10 ;
        Double fcx11 = p * acx11 ;
        Double fcx12 = p * acx12hz ;
        Double fcx13 = p * acx13hz ;
        Double fcx14 = p * acx14hz ;
        map.put("fslcx", fslcx);
        map.put("fshlcx", fshlcx);
        map.put("fcx1", fcx1);
        map.put("fcx2", fcx2);
        map.put("fcx3", fcx3);
        map.put("fcx4", fcx4);
        map.put("fcx5", fcx5);
        map.put("fcx6", fcx6);
        map.put("fcx7", fcx7);
        map.put("fcx8", fcx8);
        map.put("fcx9", fcx9);
        map.put("fcx10", fcx10);
        map.put("fcx11", fcx11);
        map.put("fcx12", fcx12);
        map.put("fcx13", fcx13);
        map.put("fcx14", fcx14);

        Double twa = twsl + twshl + tw1 + tw2 + tw3 + tw4 + tw5 + tw6 + tw7 + tw8 ;
        Double twb =  tw9 + tw10 + tw11 + tw12 + tw13 + tw14 ;
        Double tw = twa - twb ;
        map.put("twa", twa);
        map.put("twb", twb);
        map.put("tw", tw);

        Double mqz = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 + mz6 + mz7 + mz8 ;
        Double mkz = mz9 + mz10 + mz11 + mz12 + mz13 + mz14 ;
        Double mqm = mqz - mkz ;
        Double mqw = mslw + mshlw + mw1 + mw2 + mw3 + mw4 + mw5 + mw6 + mw7 + mw8 + mw9 + mw10 + mw11 + mw12 + mw13 + mw14 ;
        Double fr = fslcx + fshlcx + fcx1 + fcx2 + fcx3 + fcx4 + fcx5 + fcx6 + fcx7 + fcx8 + fcx9 + fcx10 + fcx11 + fcx12 + fcx13 + fcx14 ;
        Double fa = 10 * mhz ;
        Double mq = Math.sqrt( mqm * mqm + mqw * mqw ) ;
        Double e = Math.acos( hzzchzgddk * fa / 4.5 / mq ) ;
        Double nzy = fa * ( 1 - 2 * e / Math.PI ) / Math.sin( Math.PI / 4 ) + 2 * 4.5 * mq / Math.PI / hzzchzgddk + 4 * fr / Math.PI / Math.cos( Math.PI / 4 ) ;
        Double tm = 0.5 * hzzchzgddk * 0.01 * nzy ;
        map.put("mqz", mqz);
        map.put("mkz", mkz);
        map.put("mqm", mqm);
        map.put("mqw", mqw);
        map.put("fr", fr);
        map.put("fa", fa);
        map.put("mq", mq);
        map.put("e", e);
        map.put("nzy", nzy);
        map.put("tm", tm);

        Double ja1 = tsl * lslhz * lslhz ;
        Double ja2 = tshl * lshlhz * lshlhz ;
        Double mhzp = mhz - tsl - tshl ;
        Double ma = Math.abs( mqz - mslz - mshlz - mkz );
        Double lp = ma / mhzp /10 ;
        Double ja3 = 4 * mhzp * lp * lp / 3 ;
        Double tg = ( ja1 + ja2 + ja3 ) * ndbhz / 9.55 / hzdjta ;
        map.put("ja1", ja1);
        map.put("ja2", ja2);
        map.put("mhzp", mhzp);
        map.put("ma", ma);
        map.put("lp", lp);
        map.put("ja3", ja3);
        map.put("tg", tg);

        Double ta = tw + tm + tg ;
        Double t = ta / i12x ;
        map.put("ta", ta);
        map.put("t", t);

        Double pa = ( tw + tm +tg ) * ndbhz / 9550 / 0.8 / 0.94 ;
        map.put("pa", pa);

//回转电机制动力矩
        //        风载荷回转力矩
        Double twf1 = pf * afcx1 * lmzf1 ;
        Double twf2 = pf * afcx2 * lmzf2 ;
        Double twf3 = pf * afcx3 * lmzf3 ;
        Double twf4 = pf * afcx4 * lmzf4 ;
        Double twf5 = pf * afcx5 * lmzf5 ;
        Double twf6 = pf * afcx6 * lmzf6 ;
        Double twf7 = pf * afcx7 * lmzf7 ;
        Double twf8 = pf * afcx8 * lmzf8 ;
        map.put("twf1", twf1);
        map.put("twf2", twf2);
        map.put("twf3", twf3);
        map.put("twf4", twf4);
        map.put("twf5", twf5);
        map.put("twf6", twf6);
        map.put("twf7", twf7);
        map.put("twf8", twf8);

        Double twf9 = pf * afcx9 * lmzf9 ;
        Double twf10 = pf * afcx10 * lmzf10 ;
        Double twf11 = pf * afcx11 * lmzf11 ;
        Double twf12 = pf * afcx12hz * lmzf12hz ;
        Double twf13 = pf * afcx13hz * lmzf13hz ;
        Double twf14 = pf * afcx14hz * lmzf14hz ;
        map.put("twf9", twf9);
        map.put("twf10", twf10);
        map.put("twf11", twf11);
        map.put("twf12", twf12);
        map.put("twf13", twf13);
        map.put("twf14", twf14);

//        载荷倾覆力矩
        Double mfz1 = 10 * m1 * lhzf1 ;
        Double mfz2 = 10 * m2 * lhzf2 ;
        Double mfz3 = 10 * m3 * lhzf3 ;
        Double mfz4 = 10 * m4 * lhzf4 ;
        Double mfz5 = 10 * m5f * lhzf5 ;
        Double mfz6 = 10 * m6 * lhzf6 ;
        Double mfz7 = 10 * m7 * lhzf7 ;
        Double mfz8 = 10 * m8 * lhzf8 ;
        map.put("mfz1", mfz1);
        map.put("mfz2", mfz2);
        map.put("mfz3", mfz3);
        map.put("mfz4", mfz4);
        map.put("mfz5", mfz5);
        map.put("mfz6", mfz6);
        map.put("mfz7", mfz7);
        map.put("mfz8", mfz8);

        Double mfz9 = 10 * m9 * lhzf9 ;
        Double mfz10 = 10 * m10 * lhzf10 ;
        Double mfz11 = 10 * m11 * lhzf11 ;
        Double mfz12 = 10 * m12hz * lhzf12hz ;
        Double mfz13 = 10 * m13hzf * lhzf13hz ;
        Double mfz14 = 10 * m14hz * lhzf14hz ;
        map.put("mfz9", mfz9);
        map.put("mfz10", mfz10);
        map.put("mfz11", mfz11);
        map.put("mfz12", mfz12);
        map.put("mfz13", mfz13);
        map.put("mfz14", mfz14);

//        风载荷倾覆力矩
        Double mfw1 = pf * afcx1 * hmf1 ;
        Double mfw2 = pf * afcx2 * hmf2 ;
        Double mfw3 = pf * afcx3 * hmf3 ;
        Double mfw4 = pf * afcx4 * hmf4 ;
        Double mfw5 = pf * afcx5 * hmf5 ;
        Double mfw6 = pf * afcx6 * hmf6 ;
        Double mfw7 = pf * afcx7 * hmf7 ;
        Double mfw8 = pf * afcx8 * hmf8 ;
        Double mfw9 = pf * afcx9 * hmf9 ;
        Double mfw10 = pf * afcx10 * hmf10 ;
        Double mfw11 = pf * afcx11 * hmf11 ;
        Double mfw12 = pf * afcx12hz * hmf12 ;
        Double mfw13 = pf * afcx13hz * hmf13 ;
        Double mfw14 = pf * afcx14hz * hmf14 ;
        map.put("mfw1", mfw1);
        map.put("mfw2", mfw2);
        map.put("mfw3", mfw3);
        map.put("mfw4", mfw4);
        map.put("mfw5", mfw5);
        map.put("mfw6", mfw6);
        map.put("mfw7", mfw7);
        map.put("mfw8", mfw8);
        map.put("mfw9", mfw9);
        map.put("mfw10", mfw10);
        map.put("mfw11", mfw11);
        map.put("mfw12", mfw12);
        map.put("mfw13", mfw13);
        map.put("mfw14", mfw14);

        //        风载荷
        Double fcxf1 = pf * afcx1 ;
        Double fcxf2 = pf * afcx2 ;
        Double fcxf3 = pf * afcx3 ;
        Double fcxf4 = pf * afcx4 ;
        Double fcxf5 = pf * afcx5 ;
        Double fcxf6 = pf * afcx6 ;
        Double fcxf7 = pf * afcx7 ;
        Double fcxf8 = pf * afcx8 ;
        Double fcxf9 = pf * afcx9 ;
        Double fcxf10 = pf * afcx10 ;
        Double fcxf11 = pf * afcx11 ;
        Double fcxf12 = pf * afcx12hz ;
        Double fcxf13 = pf * afcx13hz ;
        Double fcxf14 = pf * afcx14hz ;
        map.put("fcxf1", fcxf1);
        map.put("fcxf2", fcxf2);
        map.put("fcxf3", fcxf3);
        map.put("fcxf4", fcxf4);
        map.put("fcxf5", fcxf5);
        map.put("fcxf6", fcxf6);
        map.put("fcxf7", fcxf7);
        map.put("fcxf8", fcxf8);
        map.put("fcxf9", fcxf9);
        map.put("fcxf10", fcxf10);
        map.put("fcxf11", fcxf11);
        map.put("fcxf12", fcxf12);
        map.put("fcxf13", fcxf13);
        map.put("fcxf14", fcxf14);

        Double twfa = twf1 + twf2 + twf3 + twf4 + twf5 + twf6 + twf7 + twf8 ;
        Double twfb = twf9 + twf10 + twf11 + twf12 + twf13 + twf14 ;
        Double twf = Math.abs( twfa - twfb );
        Double faf = 10 * mhzf ;
        Double mf1 = mfz1 + mfz2 + mfz3 + mfz4 + mfz5 + mfz6 + mfz7 + mfz8 ;
        Double mf2 = mfz9 + mfz10 + mfz11 + mfz12 + mfz13 + mfz14 ;
        Double mqmf = mf2 - mf1 ;
        Double mqwf = mfw1 + mfw2 + mfw3 + mfw4 + mfw5 + mfw6 + mfw7 + mfw8 + mfw9 + mfw10 + mfw11 + mfw12 + mfw13 + mfw14 ;
        Double mf = Math.sqrt( mqmf * mqmf + mqwf * mqwf ) ;
        Double frf = fcxf1 + fcxf2 + fcxf3 + fcxf4 + fcxf5 + fcxf6 + fcxf7 + fcxf8 + fcxf9 + fcxf10 + fcxf11 + fcxf12 + fcxf13 + fcxf14 ;
        Double e1 = Math.acos( hzzchzgddk * faf / 4.5 / mf ) ;
        Double nzyf = faf * ( 1 - 2 * e1 / Math.PI ) / Math.sin( Math.PI / 4 ) + 2 * 4.5 * mf / Math.PI / hzzchzgddk + 4 * frf / Math.PI / Math.cos( Math.PI / 4 ) ;
        Double tmf = 0.5 * hzzchzgddk * 0.01 * nzyf ;
        Double tz = ( twf - tmf ) / i12x / hzdji ;
        map.put("twfa", twfa);
        map.put("twfb", twfb);
        map.put("twf", twf);
        map.put("faf", faf);
        map.put("mf1", mf1);
        map.put("mf2", mf2);
        map.put("mqmf", mqmf);
        map.put("mqwf", mqwf);
        map.put("mf", mf);
        map.put("frf", frf);
        map.put("e1", e1);
        map.put("nzyf", nzyf);
        map.put("tmf", tmf);
        map.put("tz", tz);

//回转支承计算
        Double faj = 10 * ( mhzp + 1.5 * r1 + swp + 1.25 * hwll + hsw ) ;
        Double fajw = faj / 10000 ;
        Double fa1p = 1.225 * fajw * 1.25 ;
        Double mqj = mqm - mslz - mshlz + ( 1.5 * r1 + swp ) * 10 * lslhz + ( 1.25 * hwll + hsw ) * 10 * lshlhz ;
        Double mqjw = mqj / 10000 ;
        Double m1p = 1.225 * mqjw * 1.25 ;
        Double fa1pls = fa1p ;
        Double m1pls = m1p ;
        map.put("faj", faj);
        map.put("fajw", fajw);
        map.put("fa1p", fa1p);
        map.put("mqj", mqj);
        map.put("mqjw", mqjw);
        map.put("m1p", m1p);
        map.put("fa1pls", fa1pls);
        map.put("m1pls", m1pls);

        Double faw = fa / 10000 ;
        Double fad = 1.25 * faw ;
        Double frw = fr / 10000 ;
        Double frd = 1.25 * frw + 2 * mhz * 0.064 / 10000 ;
        Double fa2p = ( 1.225 * fad + 2.676 * frd ) * 1.55 ;
        Double mqwd = mq / 10000 ;
        Double m2p = 1.225 * 1.25 * mqwd * 1.55 ;
        map.put("faw", faw);
        map.put("fad", fad);
        map.put("frw", frw);
        map.put("frd", frd);
        map.put("fa2p", fa2p);
        map.put("mqwd", mqwd);
        map.put("m2p", m2p);

        //回转螺栓计算
        Double fs = mq * hzlslhz1 / ( nlsr * hzlslhz1 * hzlslhz1 + 4 * ( hzlslhz2 * hzlslhz2 + hzlslhz3 * hzlslhz3 + hzlslhz4 * hzlslhz4 + hzlslhz5 * hzlslhz5 + hzlslhz6 * hzlslhz6 + hzlslhz7 * hzlslhz7 + hzlslhz8 * hzlslhz8 + hzlslhz9 * hzlslhz9 + hzlslhz10 * hzlslhz10 ) ) ;
        Double flss = nlsyjlxs * fs ;
        Double tlss = 0.18 * flss * hzlsgczj / 1000 ;
        map.put("fs", fs);
        map.put("flss", flss);
        map.put("tlss", tlss);

        return map;
    }


    private String takeSignByCompareNumber(Double a, Double b) {
        if (a > b) {
            return ">";
        } else if (a == b) {
            return "=";
        } else {
            return "<";
        }
    }

    private String takeStringByCompareNumber(Double a, Double b) {
        if (a > b) {
            return "不满足";
        } else {
            return "满足";
        }
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);

        Double t = doubleMap.get("t");
        String hzb1 = takeSignByCompareNumber(t,hzdjtn);
        String hzm1 = takeStringByCompareNumber(t,hzdjtn);
        map.put("hzb1", CommonFunc.convertDoubleToString(hzb1));
        map.put("hzm1", CommonFunc.convertDoubleToString(hzm1));

        Double pa = doubleMap.get("pa");
        String hzb2 = takeSignByCompareNumber(pa,hzdjp);
        String hzm2 = takeStringByCompareNumber(pa,hzdjp);
        map.put("hzb2", CommonFunc.convertDoubleToString(hzb2));
        map.put("hzm2", CommonFunc.convertDoubleToString(hzm2));

        Double tz = doubleMap.get("tz");
        String hzb3 = takeSignByCompareNumber(tz,hzdjzd);
        String hzm3 = takeStringByCompareNumber(tz,hzdjzd);
        map.put("hzb3", CommonFunc.convertDoubleToString(hzb3));
        map.put("hzm3", CommonFunc.convertDoubleToString(hzm3));

        Double tlss = doubleMap.get("tlss");
        String hzb4 = takeSignByCompareNumber(tlss,tls);
        String hzm4 = takeStringByCompareNumber(tlss,tls);
        map.put("hzb4", CommonFunc.convertDoubleToString(hzb4));
        map.put("hzm4", CommonFunc.convertDoubleToString(hzm4));

//        String hzzcmzj = (hzzcm1=="满足" && hzzcm2=="满足" && hzzcm3=="满足") ? "满足" : "不满足";
//        map.put("hzzcmzj", CommonFunc.convertDoubleToString(hzzcmzj));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
