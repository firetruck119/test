package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class AsXhzTSEntity {
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
    private Double lg;
    private Double ll;
    private Double gxh;
    private Double dbyj;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double nwd3;
    private Double umcxs;

//    提示提醒
    private String grutstx;

//    运行机构部分参数
    private String gdlsxh;
    private Double flsjl;
    private Double nwd1;
    private Double nwd2;

    //    埋件部分参数
    private String djlsxh;
    private Double lsgca;
    private Double fdjlsfb;
    private Double nwd4;
    private Double fdjlszfb;

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
    private Double m12;
    private Double m13;
    private Double m14;
    private Double m15;
    private Double m16;
    private Double m17;
    private Double m18;
    private Double m19;
    private Double m20;
    private Double m21;
    private Double mzj;
    private Double mzjf;

    //    其他
    private String qt1;
    private String qt2;

    //    工作重心至前轨距离
    private Double lslqg;
    private Double lshlqg;
    private Double lqg1;
    private Double lqg2;
    private Double lqg3;
    private Double lqg4;
    private Double lqg5;
    private Double lqg6;
    private Double lqg7;
    private Double lqg8;
    private Double lqg9;
    private Double lqg10;
    private Double lqg11;
    private Double lqg12;
    private Double lqg13;
    private Double lqg14;
    private Double lqg15;
    private Double lqg16;
    private Double lqg17;
    private Double lqg18;
    private Double lqg19;
    private Double lqg20;
    private Double lqg21;

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
    private Double lhz12;
    private Double lhz13;
    private Double lhz14;
    private Double lhz15;
    private Double lhz16;
    private Double lhz17;
    private Double lhz18;
    private Double lhz19;
    private Double lhz20;
    private Double lhz21;

    //    工作重心至前轮距离
    private Double lslql;
    private Double lshlql;
    private Double lql1;
    private Double lql2;
    private Double lql3;
    private Double lql4;
    private Double lql5;
    private Double lql6;
    private Double lql7;
    private Double lql8;
    private Double lql9;
    private Double lql10;
    private Double lql11;
    private Double lql12;
    private Double lql13;
    private Double lql14;
    private Double lql15;
    private Double lql16;
    private Double lql17;
    private Double lql18;
    private Double lql19;
    private Double lql20;
    private Double lql21;

    //    工作风载荷作用高度
    private Double hslg;
    private Double hshlg;
    private Double hg1;
    private Double hg2;
    private Double hg3;
    private Double hg4;
    private Double hg5;
    private Double hg6;
    private Double hg7;
    private Double hg8;
    private Double hg9;
    private Double hg10;
    private Double hg11;
    private Double hg12;
    private Double hg13;
    private Double hg14;
    private Double hg15;
    private Double hg16;
    private Double hg17;
    private Double hg18;
    private Double hg19;
    private Double hg20;
    private Double hg21;

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
    private Double lmz12;
    private Double lmz13;
    private Double lmz14;
    private Double lmz15;
    private Double lmz16;
    private Double lmz17;
    private Double lmz18;
    private Double lmz19;
    private Double lmz20;
    private Double lmz21;

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
    private Double acx12;
    private Double acx13;
    private Double acx14;
    private Double acx15;
    private Double acx16;
    private Double acx17;
    private Double acx18;
    private Double acx19;
    private Double acx20;
    private Double acx21;

    //    工作吊臂同向迎风面积
    private Double asltx;
    private Double ashltx;
    private Double atx1;
    private Double atx2;
    private Double atx3;
    private Double atx4;
    private Double atx5;
    private Double atx6;
    private Double atx7;
    private Double atx8;
    private Double atx9;
    private Double atx10;
    private Double atx11;
    private Double atx12;
    private Double atx13;
    private Double atx14;
    private Double atx15;
    private Double atx16;
    private Double atx17;
    private Double atx18;
    private Double atx19;
    private Double atx20;
    private Double atx21;

    //    非工作载荷
    private Double m5f;
    private Double m13f;

    //    非工作重心至后轮距离
    private Double lhl1;
    private Double lhl2;
    private Double lhl3;
    private Double lhl4;
    private Double lhl5;
    private Double lhl6;
    private Double lhl7;
    private Double lhl8;
    private Double lhl9;
    private Double lhl10;
    private Double lhl11;
    private Double lhl12;
    private Double lhl13;
    private Double lhl14;
    private Double lhl15;
    private Double lhl16;
    private Double lhl17;
    private Double lhl18;
    private Double lhl19;
    private Double lhl20;
    private Double lhl21;

    //    非工作风载荷作用高度
    private Double hgf1;
    private Double hgf2;
    private Double hgf3;
    private Double hgf4;
    private Double hgf5;
    private Double hgf6;
    private Double hgf7;
    private Double hgf8;
    private Double hgf9;
    private Double hgf10;
    private Double hgf11;
    private Double hgf12;
    private Double hgf13;
    private Double hgf14;
    private Double hgf15;
    private Double hgf16;
    private Double hgf17;
    private Double hgf18;
    private Double hgf19;
    private Double hgf20;
    private Double hgf21;

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
    private Double lmzf12;
    private Double lmzf13;
    private Double lmzf14;
    private Double lmzf15;
    private Double lmzf16;
    private Double lmzf17;
    private Double lmzf18;
    private Double lmzf19;
    private Double lmzf20;
    private Double lmzf21;

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
    private Double afcx12;
    private Double afcx13;
    private Double afcx14;
    private Double afcx15;
    private Double afcx16;
    private Double afcx17;
    private Double afcx18;
    private Double afcx19;
    private Double afcx20;
    private Double afcx21;

    //    非工作吊臂同向迎风面积
    private Double aftx1;
    private Double aftx2;
    private Double aftx3;
    private Double aftx4;
    private Double aftx5;
    private Double aftx6;
    private Double aftx7;
    private Double aftx8;
    private Double aftx9;
    private Double aftx10;
    private Double aftx11;
    private Double aftx12;
    private Double aftx13;
    private Double aftx14;
    private Double aftx15;
    private Double aftx16;
    private Double aftx17;
    private Double aftx18;
    private Double aftx19;
    private Double aftx20;
    private Double aftx21;

//    private String wdlyp3;//有无运行机构

    private String dcModel;
    private String dcgssModel;
    private String ffbbModel;
    private String btModel;
    private String gruModel;
    private String qsjgModel;
    private String dhzjgModel;
    private String yxjgModel;

    private String typeOfMachine;//机型
    private String haveOfMobileCounterweight;//移动配重选择

    private String yxjgazModel;//运行机构安装
    private String wdlydjlsModel;

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
        map.put("lg", CommonFunc.convertDoubleToString(lg));
        map.put("ll", CommonFunc.convertDoubleToString(ll));
        map.put("gxh", CommonFunc.convertDoubleToString(gxh));
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("nwd3", CommonFunc.convertDoubleToString(nwd3));
        map.put("umcxs", CommonFunc.convertDoubleToString(umcxs));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("gdlsxh", CommonFunc.convertDoubleToString(gdlsxh));
        map.put("flsjl", CommonFunc.convertDoubleToString(flsjl));
        map.put("nwd1", CommonFunc.convertDoubleToString(nwd1));
        map.put("nwd2", CommonFunc.convertDoubleToString(nwd2));

        map.put("djlsxh", CommonFunc.convertDoubleToString(djlsxh));
        map.put("lsgca", CommonFunc.convertDoubleToString(lsgca));
        map.put("fdjlsfb", CommonFunc.convertDoubleToString(fdjlsfb));
        map.put("nwd4", CommonFunc.convertDoubleToString(nwd4));
        map.put("fdjlszfb", CommonFunc.convertDoubleToString(fdjlszfb));

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
        map.put("m12", CommonFunc.convertDoubleToString(m12));
        map.put("m13", CommonFunc.convertDoubleToString(m13));
        map.put("m14", CommonFunc.convertDoubleToString(m14));
        map.put("m15", CommonFunc.convertDoubleToString(m15));
        map.put("m16", CommonFunc.convertDoubleToString(m16));
        map.put("m17", CommonFunc.convertDoubleToString(m17));
        map.put("m18", CommonFunc.convertDoubleToString(m18));
        map.put("m19", CommonFunc.convertDoubleToString(m19));
        map.put("m20", CommonFunc.convertDoubleToString(m20));
        map.put("m21", CommonFunc.convertDoubleToString(m21));
        map.put("mzj", CommonFunc.convertDoubleToString(mzj));
        map.put("mzjf", CommonFunc.convertDoubleToString(mzjf));

        map.put("qt1", CommonFunc.convertDoubleToString(qt1));
        map.put("qt2", CommonFunc.convertDoubleToString(qt2));

        map.put("lslqg", CommonFunc.convertDoubleToString(lslqg));
        map.put("lshlqg", CommonFunc.convertDoubleToString(lshlqg));
        map.put("lqg1", CommonFunc.convertDoubleToString(lqg1));
        map.put("lqg2", CommonFunc.convertDoubleToString(lqg2));
        map.put("lqg3", CommonFunc.convertDoubleToString(lqg3));
        map.put("lqg4", CommonFunc.convertDoubleToString(lqg4));
        map.put("lqg5", CommonFunc.convertDoubleToString(lqg5));
        map.put("lqg6", CommonFunc.convertDoubleToString(lqg6));
        map.put("lqg7", CommonFunc.convertDoubleToString(lqg7));
        map.put("lqg8", CommonFunc.convertDoubleToString(lqg8));
        map.put("lqg9", CommonFunc.convertDoubleToString(lqg9));
        map.put("lqg10", CommonFunc.convertDoubleToString(lqg10));
        map.put("lqg11", CommonFunc.convertDoubleToString(lqg11));
        map.put("lqg12", CommonFunc.convertDoubleToString(lqg12));
        map.put("lqg13", CommonFunc.convertDoubleToString(lqg13));
        map.put("lqg14", CommonFunc.convertDoubleToString(lqg14));
        map.put("lqg15", CommonFunc.convertDoubleToString(lqg15));
        map.put("lqg16", CommonFunc.convertDoubleToString(lqg16));
        map.put("lqg17", CommonFunc.convertDoubleToString(lqg17));
        map.put("lqg18", CommonFunc.convertDoubleToString(lqg18));
        map.put("lqg19", CommonFunc.convertDoubleToString(lqg19));
        map.put("lqg20", CommonFunc.convertDoubleToString(lqg20));
        map.put("lqg21", CommonFunc.convertDoubleToString(lqg21));

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
        map.put("lhz12", CommonFunc.convertDoubleToString(lhz12));
        map.put("lhz13", CommonFunc.convertDoubleToString(lhz13));
        map.put("lhz14", CommonFunc.convertDoubleToString(lhz14));
        map.put("lhz15", CommonFunc.convertDoubleToString(lhz15));
        map.put("lhz16", CommonFunc.convertDoubleToString(lhz16));
        map.put("lhz17", CommonFunc.convertDoubleToString(lhz17));
        map.put("lhz18", CommonFunc.convertDoubleToString(lhz18));
        map.put("lhz19", CommonFunc.convertDoubleToString(lhz19));
        map.put("lhz20", CommonFunc.convertDoubleToString(lhz20));
        map.put("lhz21", CommonFunc.convertDoubleToString(lhz21));

        map.put("lslql", CommonFunc.convertDoubleToString(lslql));
        map.put("lshlql", CommonFunc.convertDoubleToString(lshlql));
        map.put("lql1", CommonFunc.convertDoubleToString(lql1));
        map.put("lql2", CommonFunc.convertDoubleToString(lql2));
        map.put("lql3", CommonFunc.convertDoubleToString(lql3));
        map.put("lql4", CommonFunc.convertDoubleToString(lql4));
        map.put("lql5", CommonFunc.convertDoubleToString(lql5));
        map.put("lql6", CommonFunc.convertDoubleToString(lql6));
        map.put("lql7", CommonFunc.convertDoubleToString(lql7));
        map.put("lql8", CommonFunc.convertDoubleToString(lql8));
        map.put("lql9", CommonFunc.convertDoubleToString(lql9));
        map.put("lql10", CommonFunc.convertDoubleToString(lql10));
        map.put("lql11", CommonFunc.convertDoubleToString(lql11));
        map.put("lql12", CommonFunc.convertDoubleToString(lql12));
        map.put("lql13", CommonFunc.convertDoubleToString(lql13));
        map.put("lql14", CommonFunc.convertDoubleToString(lql14));
        map.put("lql15", CommonFunc.convertDoubleToString(lql15));
        map.put("lql16", CommonFunc.convertDoubleToString(lql16));
        map.put("lql17", CommonFunc.convertDoubleToString(lql17));
        map.put("lql18", CommonFunc.convertDoubleToString(lql18));
        map.put("lql19", CommonFunc.convertDoubleToString(lql19));
        map.put("lql20", CommonFunc.convertDoubleToString(lql20));
        map.put("lql21", CommonFunc.convertDoubleToString(lql21));

        map.put("hslg", CommonFunc.convertDoubleToString(hslg));
        map.put("hshlg", CommonFunc.convertDoubleToString(hshlg));
        map.put("hg1", CommonFunc.convertDoubleToString(hg1));
        map.put("hg2", CommonFunc.convertDoubleToString(hg2));
        map.put("hg3", CommonFunc.convertDoubleToString(hg3));
        map.put("hg4", CommonFunc.convertDoubleToString(hg4));
        map.put("hg5", CommonFunc.convertDoubleToString(hg5));
        map.put("hg6", CommonFunc.convertDoubleToString(hg6));
        map.put("hg7", CommonFunc.convertDoubleToString(hg7));
        map.put("hg8", CommonFunc.convertDoubleToString(hg8));
        map.put("hg9", CommonFunc.convertDoubleToString(hg9));
        map.put("hg10", CommonFunc.convertDoubleToString(hg10));
        map.put("hg11", CommonFunc.convertDoubleToString(hg11));
        map.put("hg12", CommonFunc.convertDoubleToString(hg12));
        map.put("hg13", CommonFunc.convertDoubleToString(hg13));
        map.put("hg14", CommonFunc.convertDoubleToString(hg14));
        map.put("hg15", CommonFunc.convertDoubleToString(hg15));
        map.put("hg16", CommonFunc.convertDoubleToString(hg16));
        map.put("hg17", CommonFunc.convertDoubleToString(hg17));
        map.put("hg18", CommonFunc.convertDoubleToString(hg18));
        map.put("hg19", CommonFunc.convertDoubleToString(hg19));
        map.put("hg20", CommonFunc.convertDoubleToString(hg20));
        map.put("hg21", CommonFunc.convertDoubleToString(hg21));

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
        map.put("lmz12", CommonFunc.convertDoubleToString(lmz12));
        map.put("lmz13", CommonFunc.convertDoubleToString(lmz13));
        map.put("lmz14", CommonFunc.convertDoubleToString(lmz14));
        map.put("lmz15", CommonFunc.convertDoubleToString(lmz15));
        map.put("lmz16", CommonFunc.convertDoubleToString(lmz16));
        map.put("lmz17", CommonFunc.convertDoubleToString(lmz17));
        map.put("lmz18", CommonFunc.convertDoubleToString(lmz18));
        map.put("lmz19", CommonFunc.convertDoubleToString(lmz19));
        map.put("lmz20", CommonFunc.convertDoubleToString(lmz20));
        map.put("lmz21", CommonFunc.convertDoubleToString(lmz21));

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
        map.put("acx12", CommonFunc.convertDoubleToString(acx12));
        map.put("acx13", CommonFunc.convertDoubleToString(acx13));
        map.put("acx14", CommonFunc.convertDoubleToString(acx14));
        map.put("acx15", CommonFunc.convertDoubleToString(acx15));
        map.put("acx16", CommonFunc.convertDoubleToString(acx16));
        map.put("acx17", CommonFunc.convertDoubleToString(acx17));
        map.put("acx18", CommonFunc.convertDoubleToString(acx18));
        map.put("acx19", CommonFunc.convertDoubleToString(acx19));
        map.put("acx20", CommonFunc.convertDoubleToString(acx20));
        map.put("acx21", CommonFunc.convertDoubleToString(acx21));

        map.put("asltx", CommonFunc.convertDoubleToString(asltx));
        map.put("ashltx", CommonFunc.convertDoubleToString(ashltx));
        map.put("atx1", CommonFunc.convertDoubleToString(atx1));
        map.put("atx2", CommonFunc.convertDoubleToString(atx2));
        map.put("atx3", CommonFunc.convertDoubleToString(atx3));
        map.put("atx4", CommonFunc.convertDoubleToString(atx4));
        map.put("atx5", CommonFunc.convertDoubleToString(atx5));
        map.put("atx6", CommonFunc.convertDoubleToString(atx6));
        map.put("atx7", CommonFunc.convertDoubleToString(atx7));
        map.put("atx8", CommonFunc.convertDoubleToString(atx8));
        map.put("atx9", CommonFunc.convertDoubleToString(atx9));
        map.put("atx10", CommonFunc.convertDoubleToString(atx10));
        map.put("atx11", CommonFunc.convertDoubleToString(atx11));
        map.put("atx12", CommonFunc.convertDoubleToString(atx12));
        map.put("atx13", CommonFunc.convertDoubleToString(atx13));
        map.put("atx14", CommonFunc.convertDoubleToString(atx14));
        map.put("atx15", CommonFunc.convertDoubleToString(atx15));
        map.put("atx16", CommonFunc.convertDoubleToString(atx16));
        map.put("atx17", CommonFunc.convertDoubleToString(atx17));
        map.put("atx18", CommonFunc.convertDoubleToString(atx18));
        map.put("atx19", CommonFunc.convertDoubleToString(atx19));
        map.put("atx20", CommonFunc.convertDoubleToString(atx20));
        map.put("atx21", CommonFunc.convertDoubleToString(atx21));

        map.put("m5f", CommonFunc.convertDoubleToString(m5f));
        map.put("m13f", CommonFunc.convertDoubleToString(m13f));

        map.put("lhl1", CommonFunc.convertDoubleToString(lhl1));
        map.put("lhl2", CommonFunc.convertDoubleToString(lhl2));
        map.put("lhl3", CommonFunc.convertDoubleToString(lhl3));
        map.put("lhl4", CommonFunc.convertDoubleToString(lhl4));
        map.put("lhl5", CommonFunc.convertDoubleToString(lhl5));
        map.put("lhl6", CommonFunc.convertDoubleToString(lhl6));
        map.put("lhl7", CommonFunc.convertDoubleToString(lhl7));
        map.put("lhl8", CommonFunc.convertDoubleToString(lhl8));
        map.put("lhl9", CommonFunc.convertDoubleToString(lhl9));
        map.put("lhl10", CommonFunc.convertDoubleToString(lhl10));
        map.put("lhl11", CommonFunc.convertDoubleToString(lhl11));
        map.put("lhl12", CommonFunc.convertDoubleToString(lhl12));
        map.put("lhl13", CommonFunc.convertDoubleToString(lhl13));
        map.put("lhl14", CommonFunc.convertDoubleToString(lhl14));
        map.put("lhl15", CommonFunc.convertDoubleToString(lhl15));
        map.put("lhl16", CommonFunc.convertDoubleToString(lhl16));
        map.put("lhl17", CommonFunc.convertDoubleToString(lhl17));
        map.put("lhl18", CommonFunc.convertDoubleToString(lhl18));
        map.put("lhl19", CommonFunc.convertDoubleToString(lhl19));
        map.put("lhl20", CommonFunc.convertDoubleToString(lhl20));
        map.put("lhl21", CommonFunc.convertDoubleToString(lhl21));

        map.put("hgf1", CommonFunc.convertDoubleToString(hgf1));
        map.put("hgf2", CommonFunc.convertDoubleToString(hgf2));
        map.put("hgf3", CommonFunc.convertDoubleToString(hgf3));
        map.put("hgf4", CommonFunc.convertDoubleToString(hgf4));
        map.put("hgf5", CommonFunc.convertDoubleToString(hgf5));
        map.put("hgf6", CommonFunc.convertDoubleToString(hgf6));
        map.put("hgf7", CommonFunc.convertDoubleToString(hgf7));
        map.put("hgf8", CommonFunc.convertDoubleToString(hgf8));
        map.put("hgf9", CommonFunc.convertDoubleToString(hgf9));
        map.put("hgf10", CommonFunc.convertDoubleToString(hgf10));
        map.put("hgf11", CommonFunc.convertDoubleToString(hgf11));
        map.put("hgf12", CommonFunc.convertDoubleToString(hgf12));
        map.put("hgf13", CommonFunc.convertDoubleToString(hgf13));
        map.put("hgf14", CommonFunc.convertDoubleToString(hgf14));
        map.put("hgf15", CommonFunc.convertDoubleToString(hgf15));
        map.put("hgf16", CommonFunc.convertDoubleToString(hgf16));
        map.put("hgf17", CommonFunc.convertDoubleToString(hgf17));
        map.put("hgf18", CommonFunc.convertDoubleToString(hgf18));
        map.put("hgf19", CommonFunc.convertDoubleToString(hgf19));
        map.put("hgf20", CommonFunc.convertDoubleToString(hgf20));
        map.put("hgf21", CommonFunc.convertDoubleToString(hgf21));

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
        map.put("lmzf12", CommonFunc.convertDoubleToString(lmzf12));
        map.put("lmzf13", CommonFunc.convertDoubleToString(lmzf13));
        map.put("lmzf14", CommonFunc.convertDoubleToString(lmzf14));
        map.put("lmzf15", CommonFunc.convertDoubleToString(lmzf15));
        map.put("lmzf16", CommonFunc.convertDoubleToString(lmzf16));
        map.put("lmzf17", CommonFunc.convertDoubleToString(lmzf17));
        map.put("lmzf18", CommonFunc.convertDoubleToString(lmzf18));
        map.put("lmzf19", CommonFunc.convertDoubleToString(lmzf19));
        map.put("lmzf20", CommonFunc.convertDoubleToString(lmzf20));
        map.put("lmzf21", CommonFunc.convertDoubleToString(lmzf21));

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
        map.put("afcx12", CommonFunc.convertDoubleToString(afcx12));
        map.put("afcx13", CommonFunc.convertDoubleToString(afcx13));
        map.put("afcx14", CommonFunc.convertDoubleToString(afcx14));
        map.put("afcx15", CommonFunc.convertDoubleToString(afcx15));
        map.put("afcx16", CommonFunc.convertDoubleToString(afcx16));
        map.put("afcx17", CommonFunc.convertDoubleToString(afcx17));
        map.put("afcx18", CommonFunc.convertDoubleToString(afcx18));
        map.put("afcx19", CommonFunc.convertDoubleToString(afcx19));
        map.put("afcx20", CommonFunc.convertDoubleToString(afcx20));
        map.put("afcx21", CommonFunc.convertDoubleToString(afcx21));

        map.put("aftx1", CommonFunc.convertDoubleToString(aftx1));
        map.put("aftx2", CommonFunc.convertDoubleToString(aftx2));
        map.put("aftx3", CommonFunc.convertDoubleToString(aftx3));
        map.put("aftx4", CommonFunc.convertDoubleToString(aftx4));
        map.put("aftx5", CommonFunc.convertDoubleToString(aftx5));
        map.put("aftx6", CommonFunc.convertDoubleToString(aftx6));
        map.put("aftx7", CommonFunc.convertDoubleToString(aftx7));
        map.put("aftx8", CommonFunc.convertDoubleToString(aftx8));
        map.put("aftx9", CommonFunc.convertDoubleToString(aftx9));
        map.put("aftx10", CommonFunc.convertDoubleToString(aftx10));
        map.put("aftx11", CommonFunc.convertDoubleToString(aftx11));
        map.put("aftx12", CommonFunc.convertDoubleToString(aftx12));
        map.put("aftx13", CommonFunc.convertDoubleToString(aftx13));
        map.put("aftx14", CommonFunc.convertDoubleToString(aftx14));
        map.put("aftx15", CommonFunc.convertDoubleToString(aftx15));
        map.put("aftx16", CommonFunc.convertDoubleToString(aftx16));
        map.put("aftx17", CommonFunc.convertDoubleToString(aftx17));
        map.put("aftx18", CommonFunc.convertDoubleToString(aftx18));
        map.put("aftx19", CommonFunc.convertDoubleToString(aftx19));
        map.put("aftx20", CommonFunc.convertDoubleToString(aftx20));
        map.put("aftx21", CommonFunc.convertDoubleToString(aftx21));

//        map.put("wdlyp3", CommonFunc.convertDoubleToString(wdlyp3));

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

//计算稳定性工作状态自重及载荷产生的倾覆力矩
        Double msla = tsl * lslqg * 10 ;
        Double mshla = tshl * lshlqg * 10 ;
        Double ma1 = m1 * lqg1 * 10 ;
        Double ma2 = m2 * lqg2 * 10 ;
        Double ma3 = m3 * lqg3 * 10 ;
        Double ma4 = m4 * lqg4 * 10 ;
        Double ma6 = m6 * lqg6 * 10 ;
        Double ma20 = m20 * lqg20 * 10 ;
        map.put("msla", msla);
        map.put("mshla", mshla);
        map.put("ma1", ma1);
        map.put("ma2", ma2);
        map.put("ma3", ma3);
        map.put("ma4", ma4);
        map.put("ma6", ma6);
        map.put("ma20", ma20);

        //计算稳定性工作状态自重产生的抗倾覆力矩
        Double ma5 = m5 * lqg5 * 10 ;
        Double ma7 = m7 * lqg7 * 10 ;
        Double ma8 = m8 * lqg8 * 10 ;
        Double ma9 = m9 * lqg9 * 10 ;
        Double ma10 = m10 * lqg10 * 10 ;
        Double ma11 = m11 * lqg11 * 10 ;
        Double ma12 = m12 * lqg12 * 10 ;
        Double ma13 = m13 * lqg13 * 10 ;
        Double ma14 = m14 * lqg14 * 10 ;
        Double ma15 = m15 * lqg15 * 10 ;
        Double ma16 = m16 * lqg16 * 10 ;
        Double ma17 = m17 * lqg17 * 10 ;
        Double ma18 = m18 * lqg18 * 10 ;
        Double ma19 = m19 * lqg19 * 10 ;
        Double ma21 = m21 * lqg21 * 10 ;
        map.put("ma5", ma5);
        map.put("ma7", ma7);
        map.put("ma8", ma8);
        map.put("ma9", ma9);
        map.put("ma10", ma10);
        map.put("ma11", ma11);
        map.put("ma12", ma12);
        map.put("ma13", ma13);
        map.put("ma14", ma14);
        map.put("ma15", ma15);
        map.put("ma16", ma16);
        map.put("ma17", ma17);
        map.put("ma18", ma18);
        map.put("ma19", ma19);
        map.put("ma21", ma21);

        //计算稳定性工作状态风载荷产生的倾覆力矩（吊臂同向）
        Double msltxw = p * asltx * hslg ;
        Double mshltxw = p * ashltx * hshlg ;
        Double mtxw1 = p * atx1 * hg1 ;
        Double mtxw2 = p * atx2 * hg2 ;
        Double mtxw3 = p * atx3 * hg3 ;
        Double mtxw4 = p * atx4 * hg4 ;
        Double mtxw5 = p * atx5 * hg5 ;
        Double mtxw6 = p * atx6 * hg6 ;
        Double mtxw7 = p * atx7 * hg7 ;
        Double mtxw8 = p * atx8 * hg8 ;
        Double mtxw9 = p * atx9 * hg9 ;
        Double mtxw10 = p * atx10 * hg10 ;
        Double mtxw11 = p * atx11 * hg11 ;
        Double mtxw12 = p * atx12 * hg12 ;
        Double mtxw13 = p * atx13 * hg13 ;
        Double mtxw14 = p * atx14 * hg14 ;
        Double mtxw15 = p * atx15 * hg15 ;
        Double mtxw16 = p * atx16 * hg16 ;
        Double mtxw17 = p * atx17 * hg17 ;
        Double mtxw18 = p * atx18 * hg18 ;
        Double mtxw19 = p * atx19 * hg19 ;
        Double mtxw20 = p * atx20 * hg20 ;
        Double mtxw21 = p * atx21 * hg21 ;
        map.put("msltxw", msltxw);
        map.put("mshltxw", mshltxw);
        map.put("mtxw1", mtxw1);
        map.put("mtxw2", mtxw2);
        map.put("mtxw3", mtxw3);
        map.put("mtxw4", mtxw4);
        map.put("mtxw5", mtxw5);
        map.put("mtxw6", mtxw6);
        map.put("mtxw7", mtxw7);
        map.put("mtxw8", mtxw8);
        map.put("mtxw9", mtxw9);
        map.put("mtxw10", mtxw10);
        map.put("mtxw11", mtxw11);
        map.put("mtxw12", mtxw12);
        map.put("mtxw13", mtxw13);
        map.put("mtxw14", mtxw14);
        map.put("mtxw15", mtxw15);
        map.put("mtxw16", mtxw16);
        map.put("mtxw17", mtxw17);
        map.put("mtxw18", mtxw18);
        map.put("mtxw19", mtxw19);
        map.put("mtxw20", mtxw20);
        map.put("mtxw21", mtxw21);

        //计算稳定性非工作状态自重产生的抗倾覆力矩
        Double mfhl1 = m1 * lhl1 * 10 ;
        Double mfhl2 = m2 * lhl2 * 10 ;
        Double mfhl3 = m3 * lhl3 * 10 ;
        Double mfhl4 = m4 * lhl4 * 10 ;
        Double mfhl5 = m5f * lhl5 * 10 ;
        Double mfhl6 = m6 * lhl6 * 10 ;
        Double mfhl7 = m7 * lhl7 * 10 ;
        Double mfhl8 = m8 * lhl8 * 10 ;
        Double mfhl9 = m9 * lhl9 * 10 ;
        Double mfhl12 = m12 * lhl12 * 10 ;
        Double mfhl13 = m13f * lhl13 * 10 ;
        Double mfhl14 = m14 * lhl14 * 10 ;
        Double mfhl15 = m15 * lhl15 * 10 ;
        Double mfhl16 = m16 * lhl16 * 10 ;
        Double mfhl17 = m17 * lhl17 * 10 ;
        Double mfhl18 = m18 * lhl18 * 10 ;
        Double mfhl19 = m19 * lhl19 * 10 ;
        Double mfhl20 = m20 * lhl20 * 10 ;
        map.put("mfhl1", mfhl1);
        map.put("mfhl2", mfhl2);
        map.put("mfhl3", mfhl3);
        map.put("mfhl4", mfhl4);
        map.put("mfhl5", mfhl5);
        map.put("mfhl6", mfhl6);
        map.put("mfhl7", mfhl7);
        map.put("mfhl8", mfhl8);
        map.put("mfhl9", mfhl9);
        map.put("mfhl12", mfhl12);
        map.put("mfhl13", mfhl13);
        map.put("mfhl14", mfhl14);
        map.put("mfhl15", mfhl15);
        map.put("mfhl16", mfhl16);
        map.put("mfhl17", mfhl17);
        map.put("mfhl18", mfhl18);
        map.put("mfhl19", mfhl19);
        map.put("mfhl20", mfhl20);

//        计算稳定性非工作状态自重产生的倾覆力矩
        Double mfhl10 = m10 * lhl10 * 10 ;
        Double mfhl11 = m11 * lhl11 * 10 ;
        Double mfhl21 = m21 * lhl21 * 10 ;
        map.put("mfhl10", mfhl10);
        map.put("mfhl11", mfhl11);
        map.put("mfhl21", mfhl21);

        //计算稳定性非工作状态风载荷产生的倾覆力矩（大臂同向）
        Double mftxw1 = pf * aftx1 * hgf1 ;
        Double mftxw2 = pf * aftx2 * hgf2 ;
        Double mftxw3 = pf * aftx3 * hgf3 ;
        Double mftxw4 = pf * aftx4 * hgf4 ;
        Double mftxw5 = pf * aftx5 * hgf5 ;
        Double mftxw6 = pf * aftx6 * hgf6 ;
        Double mftxw7 = pf * aftx7 * hgf7 ;
        Double mftxw8 = pf * aftx8 * hgf8 ;
        Double mftxw9 = pf * aftx9 * hgf9 ;
        Double mftxw10 = pf * aftx10 * hgf10 ;
        Double mftxw11 = pf * aftx11 * hgf11 ;
        Double mftxw12 = pf * aftx12 * hgf12 ;
        Double mftxw13 = pf * aftx13 * hgf13 ;
        Double mftxw14 = pf * aftx14 * hgf14 ;
        Double mftxw15 = pf * aftx15 * hgf15 ;
        Double mftxw16 = pf * aftx16 * hgf16 ;
        Double mftxw17 = pf * aftx17 * hgf17 ;
        Double mftxw18 = pf * aftx18 * hgf18 ;
        Double mftxw19 = pf * aftx19 * hgf19 ;
        Double mftxw20 = pf * aftx20 * hgf20 ;
        Double mftxw21 = pf * aftx21 * hgf21 ;
        map.put("mftxw1", mftxw1);
        map.put("mftxw2", mftxw2);
        map.put("mftxw3", mftxw3);
        map.put("mftxw4", mftxw4);
        map.put("mftxw5", mftxw5);
        map.put("mftxw6", mftxw6);
        map.put("mftxw7", mftxw7);
        map.put("mftxw8", mftxw8);
        map.put("mftxw9", mftxw9);
        map.put("mftxw10", mftxw10);
        map.put("mftxw11", mftxw11);
        map.put("mftxw12", mftxw12);
        map.put("mftxw13", mftxw13);
        map.put("mftxw14", mftxw14);
        map.put("mftxw15", mftxw15);
        map.put("mftxw16", mftxw16);
        map.put("mftxw17", mftxw17);
        map.put("mftxw18", mftxw18);
        map.put("mftxw19", mftxw19);
        map.put("mftxw20", mftxw20);
        map.put("mftxw21", mftxw21);

//        稳定性计算和结果
        Double mq = msla + mshla + ma1 + ma2 + ma3 + ma4 + ma6 + ma20 ;
        Double mm2 = ma5 + ma7 + ma8 + ma9 + ma10 + ma11 + ma12 + ma13 + ma14 + ma15 + ma16 + ma17 + ma18 + ma19 + ma21 ;
        Double mtxw = msltxw + mshltxw + mtxw1 + mtxw2 + mtxw3 + mtxw4 + mtxw5 + mtxw6 + mtxw7 + mtxw8 + mtxw9 + mtxw10 + mtxw11 + mtxw12 + mtxw13 + mtxw14 + mtxw15 + mtxw16 + mtxw17 + mtxw18 + mtxw19 + mtxw20 + mtxw21 ;
        Double mkhl = mfhl1 + mfhl2 + mfhl3 + mfhl4 + mfhl5 + mfhl6 + mfhl7 + mfhl8 + mfhl9 + mfhl12 + mfhl13 + mfhl14 + mfhl15 + mfhl16 + mfhl17 + mfhl18 + mfhl19 + mfhl20 ;
        Double mqhl = mfhl10 + mfhl11 + mfhl21 ;
        Double mftxw = mftxw1 + mftxw2 + mftxw3 + mftxw4 + mftxw5 + mftxw6 + mftxw7 + mftxw8 + mftxw9 + mftxw10 + mftxw11 + mftxw12 + mftxw13 + mftxw14 + mftxw15 + mftxw16 + mftxw17 + mftxw18 + mftxw19 + mftxw20 + mftxw21 ;
        Double ms = 1.4 * tsl * 10 * lslqg ;
        Double mo1 = 1.5 * ( mq + mtxw + ms );
        Double mg1 = 3 * mq ;
        Double mm1 = Math.max( mo1,mg1 ) ;
        Double mmx3 = nwd1 * nwd2 * flsjl * lg ;
        Double mmg3 = fdjlszfb * lg ;
        Double mm3 = yxjgModel == "无" ? mmg3 : Math.min(mmx3, mmg3) ;
        Double mmh1 = mm2 + mm3 ;
        Double mm1p = mqhl + mftxw ;
        Double mmh2 = mkhl + mm3 ;
        map.put("mq", mq);
        map.put("mm2", mm2);
        map.put("mtxw", mtxw);
        map.put("mkhl", mkhl);
        map.put("mqhl", mqhl);
        map.put("mftxw", mftxw);
        map.put("ms", ms);
        map.put("mo1", mo1);
        map.put("mg1", mg1);
        map.put("mm1", mm1);
        map.put("mmx3", mmx3);
        map.put("mmg3", mmg3);
        map.put("mm3", mm3);
        map.put("mmh1", mmh1);
        map.put("mm1p", mm1p);
        map.put("mmh2", mmh2);


        //0°工作状态自重及载荷产生的倾覆力矩
        Double mslqg = tsl * lslqg * 10 * 1.25 ;
        Double mshlqg = tshl * lshlqg * 10 * 1.25 ;
        Double mqg1 = m1 * lqg1 * 10 * 1.25 ;
        Double mqg2 = m2 * lqg2 * 10 * 1.25 ;
        Double mqg3 = m3 * lqg3 * 10 * 1.25 ;
        Double mqg4 = m4 * lqg4 * 10 * 1.25 ;
        Double mqg6 = m6 * lqg6 * 10 * 1.25 ;
        Double mqg20 = m20 * lqg20 * 10 * 1.25 ;
        map.put("mslqg", mslqg);
        map.put("mshlqg", mshlqg);
        map.put("mqg1", mqg1);
        map.put("mqg2", mqg2);
        map.put("mqg3", mqg3);
        map.put("mqg4", mqg4);
        map.put("mqg6", mqg6);
        map.put("mqg20", mqg20);

        //工作状态风载荷产生的水平倾覆力矩
        Double mqg5 = m5 * lqg5 * 10 * 1.25 ;
        Double mqg7 = m7 * lqg7 * 10 * 1.25 ;
        Double mqg8 = m8 * lqg8 * 10 * 1.25 ;
        Double mqg9 = m9 * lqg9 * 10 * 1.25 ;
        Double mqg10 = m10 * lqg10 * 10 * 1.25 ;
        Double mqg11 = m11 * lqg11 * 10 * 1.25 ;
        Double mqg12 = m12 * lqg12 * 10 * 1.25 ;
        Double mqg13 = m13 * lqg13 * 10 * 1.25 ;
        Double mqg14 = m14 * lqg14 * 10 * 1.25 ;
        Double mqg15 = m15 * lqg15 * 10 * 1.25 ;
        Double mqg16 = m16 * lqg16 * 10 * 1.25 ;
        Double mqg17 = m17 * lqg17 * 10 * 1.25 ;
        Double mqg18 = m18 * lqg18 * 10 * 1.25 ;
        Double mqg19 = m19 * lqg19 * 10 * 1.25 ;
        Double mqg21 = m21 * lqg21 * 10 * 1.25 ;
        map.put("mqg5", mqg5);
        map.put("mqg7", mqg7);
        map.put("mqg8", mqg8);
        map.put("mqg9", mqg9);
        map.put("mqg10", mqg10);
        map.put("mqg11", mqg11);
        map.put("mqg12", mqg12);
        map.put("mqg13", mqg13);
        map.put("mqg14", mqg14);
        map.put("mqg15", mqg15);
        map.put("mqg16", mqg16);
        map.put("mqg17", mqg17);
        map.put("mqg18", mqg18);
        map.put("mqg19", mqg19);
        map.put("mqg21", mqg21);

        //工作状态风载荷产生的水平倾覆力
        Double mwqsl = p * aslcx * hslg * 1.25 ;
        Double mwqshl = p * ashlcx * hshlg * 1.25 ;
        Double mwq1 = p * acx1 * hg1 * 1.25 ;
        Double mwq2 = p * acx2 * hg2 * 1.25 ;
        Double mwq3 = p * acx3 * hg3 * 1.25 ;
        Double mwq4 = p * acx4 * hg4 * 1.25 ;
        Double mwq5 = p * acx5 * hg5 * 1.25 ;
        Double mwq6 = p * acx6 * hg6 * 1.25 ;
        Double mwq7 = p * acx7 * hg7 * 1.25 ;
        Double mwq8 = p * acx8 * hg8 * 1.25 ;
        Double mwq9 = p * acx9 * hg9 * 1.25 ;
        Double mwq10 = p * acx10 * hg10 * 1.25 ;
        Double mwq11 = p * acx11 * hg11 * 1.25 ;
        Double mwq12 = p * acx12 * hg12 * 1.25 ;
        Double mwq13 = p * acx13 * hg13 * 1.25 ;
        Double mwq14 = p * acx14 * hg14 * 1.25 ;
        Double mwq15 = p * acx15 * hg15 * 1.25 ;
        Double mwq16 = p * acx16 * hg16 * 1.25 ;
        Double mwq17 = p * acx17 * hg17 * 1.25 ;
        Double mwq18 = p * acx18 * hg18 * 1.25 ;
        Double mwq19 = p * acx19 * hg19 * 1.25 ;
        Double mwq20 = p * acx20 * hg20 * 1.25 ;
        Double mwq21 = p * acx21 * hg21 * 1.25 ;
        map.put("mwqsl", mwqsl);
        map.put("mwqshl", mwqshl);
        map.put("mwq1", mwq1);
        map.put("mwq2", mwq2);
        map.put("mwq3", mwq3);
        map.put("mwq4", mwq4);
        map.put("mwq5", mwq5);
        map.put("mwq6", mwq6);
        map.put("mwq7", mwq7);
        map.put("mwq8", mwq8);
        map.put("mwq9", mwq9);
        map.put("mwq10", mwq10);
        map.put("mwq11", mwq11);
        map.put("mwq12", mwq12);
        map.put("mwq13", mwq13);
        map.put("mwq14", mwq14);
        map.put("mwq15", mwq15);
        map.put("mwq16", mwq16);
        map.put("mwq17", mwq17);
        map.put("mwq18", mwq18);
        map.put("mwq19", mwq19);
        map.put("mwq20", mwq20);
        map.put("mwq21", mwq21);

        //0°轮压值计算
        Double mqqg = mslqg + mshlqg + mqg1 + mqg2 + mqg3 + mqg4 + mqg6 + mqg20 ;
        Double mkqg = mqg5 + mqg7 + mqg8 + mqg9 + mqg10 + mqg11 + mqg12 + mqg13 + mqg14 + mqg15 + mqg16 + mqg17 + mqg18 + mqg19 + mqg20 + mqg21 ;
        Double mwq = mwqsl + mwqshl + mwq1 + mwq2 + mwq3 + mwq4 + mwq5 + mwq6 + mwq7 + mwq8 + mwq9 + mwq10 + mwq11 + mwq12 + mwq13 + mwq14 + mwq15 + mwq16 + mwq17 + mwq18 + mwq19 + mwq20 + mwq21 ;
        Double mfqg = mkqg - mqqg ;
        Double vcd = mfqg / lg / 2 ;
        Double vab = 1.25 * mzj * 10 / 2 - vcd ;
        Double mgq = 2 * 0.064 * mzj * gxh ;
        Double msq = mgq + mwq ;
        Double dtv1 = msq / ll / 2 ;
        Double av1 = vab - dtv1 ;
        Double bv1 = vab + dtv1 ;
        Double cv1 = vcd + dtv1 ;
        Double dv1 = vcd - dtv1 ;
        map.put("mqqg", mqqg);
        map.put("mkqg", mkqg);
        map.put("mwq", mwq);
        map.put("mfqg", mfqg);
        map.put("vcd", vcd);
        map.put("vab", vab);
        map.put("mgq", mgq);
        map.put("msq", msq);
        map.put("dtv1", dtv1);
        map.put("av1", av1);
        map.put("bv1", bv1);
        map.put("cv1", cv1);
        map.put("dv1", dv1);

        //0°摩擦力计算
        Double at1 = av1 * umcxs ;
        Double bt1 = bv1 * umcxs ;
        map.put("at1", at1);
        map.put("bt1", bt1);

        //工作状态擦窗机各部件风载荷
        Double fslcx = p * aslcx * 1.25 ;
        Double fshlcx = p * ashlcx * 1.25 ;
        Double fcx1 = p * acx1 * 1.25 ;
        Double fcx2 = p * acx2 * 1.25 ;
        Double fcx3 = p * acx3 * 1.25 ;
        Double fcx4 = p * acx4 * 1.25 ;
        Double fcx5 = p * acx5 * 1.25 ;
        Double fcx6 = p * acx6 * 1.25 ;
        Double fcx7 = p * acx7 * 1.25 ;
        Double fcx8 = p * acx8 * 1.25 ;
        Double fcx9 = p * acx9 * 1.25 ;
        Double fcx10 = p * acx10 * 1.25 ;
        Double fcx11 = p * acx11 * 1.25 ;
        Double fcx12 = p * acx12 * 1.25 ;
        Double fcx13 = p * acx13 * 1.25 ;
        Double fcx14 = p * acx14 * 1.25 ;
        Double fcx15 = p * acx15 * 1.25 ;
        Double fcx16 = p * acx16 * 1.25 ;
        Double fcx17 = p * acx17 * 1.25 ;
        Double fcx18 = p * acx18 * 1.25 ;
        Double fcx19 = p * acx19 * 1.25 ;
        Double fcx20 = p * acx20 * 1.25 ;
        Double fcx21 = p * acx21 * 1.25 ;
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
        map.put("fcx15", fcx15);
        map.put("fcx16", fcx16);
        map.put("fcx17", fcx17);
        map.put("fcx18", fcx18);
        map.put("fcx19", fcx19);
        map.put("fcx20", fcx20);
        map.put("fcx21", fcx21);

        //工作状态风载荷对擦窗机各部件产生的正向回转力矩
        Double mwhzsl = fslcx * lslmz ;
        Double mwhzshl = fshlcx * lshlmz ;
        Double mwhz1 = fcx1 * lmz1 ;
        Double mwhz2 = fcx2 * lmz2 ;
        Double mwhz3 = fcx3 * lmz3 ;
        Double mwhz4 = fcx4 * lmz4 ;
        Double mwhz5 = fcx5 * lmz5 ;
        Double mwhz6 = fcx6 * lmz6 ;
        Double mwhz7 = fcx7 * lmz7 ;
        Double mwhz8 = fcx8 * lmz8 ;
        Double mwhz20 = fcx20 * lmz20 ;
        map.put("mwhzsl", mwhzsl);
        map.put("mwhzshl", mwhzshl);
        map.put("mwhz1", mwhz1);
        map.put("mwhz2", mwhz2);
        map.put("mwhz3", mwhz3);
        map.put("mwhz4", mwhz4);
        map.put("mwhz5", mwhz5);
        map.put("mwhz6", mwhz6);
        map.put("mwhz7", mwhz7);
        map.put("mwhz8", mwhz8);
        map.put("mwhz20", mwhz20);

        //工作状态风载荷对擦窗机各部件产生的反向回转力矩
        Double mwhz9 = fcx9 * lmz9 ;
        Double mwhz10 = fcx10 * lmz10 ;
        Double mwhz11 = fcx11 * lmz11 ;
        Double mwhz12 = fcx12 * lmz12 ;
        Double mwhz13 = fcx13 * lmz13 ;
        Double mwhz14 = fcx14 * lmz14 ;
        Double mwhz15 = fcx15 * lmz15 ;
        Double mwhz16 = fcx16 * lmz16 ;
        Double mwhz17 = fcx17 * lmz17 ;
        Double mwhz18 = fcx18 * lmz18 ;
        Double mwhz19 = fcx19 * lmz19 ;
        Double mwhz21 = fcx21 * lmz21 ;
        map.put("mwhz9", mwhz9);
        map.put("mwhz10", mwhz10);
        map.put("mwhz11", mwhz11);
        map.put("mwhz12", mwhz12);
        map.put("mwhz13", mwhz13);
        map.put("mwhz14", mwhz14);
        map.put("mwhz15", mwhz15);
        map.put("mwhz16", mwhz16);
        map.put("mwhz17", mwhz17);
        map.put("mwhz18", mwhz18);
        map.put("mwhz19", mwhz19);
        map.put("mwhz21", mwhz21);

        //0°水平力计算
        Double fwcx = fslcx + fshlcx + fcx1 + fcx2 + fcx3 + fcx4 + fcx5 + fcx6 + fcx7 + fcx8 + fcx9 + fcx10 + fcx11 + fcx12 + fcx13 + fcx14 + fcx15 + fcx16 + fcx17 + fcx18 + fcx19 + fcx20 + fcx21 ;
        Double mwhza = mwhzsl + mwhzshl + mwhz1 + mwhz2 + mwhz3 + mwhz4 + mwhz5 + mwhz6 + mwhz7 + mwhz8 + mwhz20 ;
        Double mwhzb = mwhz9 + mwhz10 + mwhz11 + mwhz12 + mwhz13 + mwhz14 + mwhz15 + mwhz16 + mwhz17 + mwhz18 + mwhz19 + mwhz21 ;
        Double mwhz = mwhza - mwhzb ;
        Double dth1 = mwhz / ll ;
        Double ah1 = -dth1 ;
        Double bh1 = dth1 ;
        map.put("fwcx", fwcx);
        map.put("mwhza", mwhza);
        map.put("mwhzb", mwhzb);
        map.put("mwhz", mwhz);
        map.put("dth1", dth1);
        map.put("ah1", ah1);
        map.put("bh1", bh1);

        //45°工作状态自重及载荷产生的倾覆力矩
        Double mslhz = tsl * lslhz * 10 * 1.25 ;
        Double mshlhz = tshl * lshlhz * 10 * 1.25 ;
        Double mhz1 = m1 * lhz1 * 10 * 1.25 ;
        Double mhz2 = m2 * lhz2 * 10 * 1.25 ;
        Double mhz3 = m3 * lhz3 * 10 * 1.25 ;
        Double mhz4 = m4 * lhz4 * 10 * 1.25 ;
        Double mhz5 = m5 * lhz5 * 10 * 1.25 ;
        Double mhz6 = m6 * lhz6 * 10 * 1.25 ;
        Double mhz7 = m7 * lhz7 * 10 * 1.25 ;
        Double mhz8 = m8 * lhz8 * 10 * 1.25 ;
        Double mhz20 = m20 * lhz20 * 10 * 1.25 ;
        map.put("mslhz", mslhz);
        map.put("mshlhz", mshlhz);
        map.put("mhz1", mhz1);
        map.put("mhz2", mhz2);
        map.put("mhz3", mhz3);
        map.put("mhz4", mhz4);
        map.put("mhz5", mhz5);
        map.put("mhz6", mhz6);
        map.put("mhz7", mhz7);
        map.put("mhz8", mhz8);
        map.put("mhz20", mhz20);

        //45°工作状态自重产生的抗倾覆力矩
        Double mhz9 = m9 * lhz9 * 10 * 1.25 ;
        Double mhz10 = m10 * lhz10 * 10 * 1.25 ;
        Double mhz11 = m11 * lhz11 * 10 * 1.25 ;
        Double mhz12 = m12 * lhz12 * 10 * 1.25 ;
        Double mhz13 = m13 * lhz13 * 10 * 1.25 ;
        Double mhz14 = m14 * lhz14 * 10 * 1.25 ;
        Double mhz15 = m15 * lhz15 * 10 * 1.25 ;
        Double mhz16 = m16 * lhz16 * 10 * 1.25 ;
        Double mhz17 = m17 * lhz17 * 10 * 1.25 ;
        Double mhz18 = m18 * lhz18 * 10 * 1.25 ;
        Double mhz19 = m19 * lhz19 * 10 * 1.25 ;
        Double mhz21 = m21 * lhz21 * 10 * 1.25 ;
        map.put("mhz9", mhz9);
        map.put("mhz10", mhz10);
        map.put("mhz11", mhz11);
        map.put("mhz12", mhz12);
        map.put("mhz13", mhz13);
        map.put("mhz14", mhz14);
        map.put("mhz15", mhz15);
        map.put("mhz16", mhz16);
        map.put("mhz17", mhz17);
        map.put("mhz18", mhz18);
        map.put("mhz19", mhz19);
        map.put("mhz21", mhz21);

        //45°轮压值计算
        Double mqhz = mslhz + mshlhz + mhz1 + mhz2 + mhz3 + mhz4 + mhz5 + mhz6 + mhz7 + mhz8 + mhz20 ;
        Double mkhz = mhz9 + mhz10 + mhz11 + mhz12 + mhz13 + mhz14 + mhz15 + mhz16 + mhz17 + mhz18 + mhz19 + mhz21 ;
        Double vm = 1.25 * mzj * 10 / 4 ;
        Double mfhz = mqhz - mkhz ;
        Double mfhzx = mfhz * 0.707 ;
        Double mfhzy = mfhz * 0.707 ;
        Double dtvx = mfhzx / ll / 2 ;
        Double dtvy = mfhzy / lg / 2 ;
        Double dtv2 = msq / Math.sqrt(lg * lg + ll * ll) ;
        Double av2 = vm - dtvx + dtvy - dtv2 ;
        Double bv2 = vm + dtvx + dtvy ;
        Double cv2 = vm + dtvx - dtvy + dtv2 ;
        Double dv2 = vm - dtvx - dtvy ;
        map.put("mqhz", mqhz);
        map.put("mkhz", mkhz);
        map.put("vm", vm);
        map.put("mfhz", mfhz);
        map.put("mfhzx", mfhzx);
        map.put("mfhzy", mfhzy);
        map.put("dtvx", dtvx);
        map.put("dtvy", dtvy);
        map.put("dtv2", dtv2);
        map.put("av2", av2);
        map.put("bv2", bv2);
        map.put("cv2", cv2);
        map.put("dv2", dv2);

        //45°摩擦力计算
        Double at2 = av2 * umcxs ;
        Double bt2 = bv2 * umcxs ;
        map.put("at2", at2);
        map.put("bt2", bt2);

        //45°水平力计算
        Double dth2 = mwhz / ll ;
        Double ah2 = fwcx * 0.707 - dth2 ;
        Double bh2 = fwcx * 0.707 + dth2 ;
        map.put("dth2", dth2);
        map.put("ah2", ah2);
        map.put("bh2", bh2);

        //90°工作状态自重及载荷产生的倾覆力矩
        Double mslql = tsl * lslql * 10 * 1.25 ;
        Double mshlql = tshl * lshlql * 10 * 1.25 ;
        Double mql1 = m1 * lql1 * 10 * 1.25 ;
        Double mql2 = m2 * lql2 * 10 * 1.25 ;
        Double mql3 = m3 * lql3 * 10 * 1.25 ;
        Double mql4 = m4 * lql4 * 10 * 1.25 ;
        Double mql6 = m6 * lql6 * 10 * 1.25 ;
        Double mql20 = m20 * lql20 * 10 * 1.25 ;
        map.put("mslql", mslql);
        map.put("mshlql", mshlql);
        map.put("mql1", mql1);
        map.put("mql2", mql2);
        map.put("mql3", mql3);
        map.put("mql4", mql4);
        map.put("mql6", mql6);
        map.put("mql20", mql20);

        //90°工作状态自重产生的抗倾覆力矩
        Double mql5 = m5 * lql5 * 10 * 1.25 ;
        Double mql7 = m7 * lql7 * 10 * 1.25 ;
        Double mql8 = m8 * lql8 * 10 * 1.25 ;
        Double mql9 = m9 * lql9 * 10 * 1.25 ;
        Double mql10 = m10 * lql10 * 10 * 1.25 ;
        Double mql11 = m11 * lql11 * 10 * 1.25 ;
        Double mql12 = m12 * lql12 * 10 * 1.25 ;
        Double mql13 = m13 * lql13 * 10 * 1.25 ;
        Double mql14 = m14 * lql14 * 10 * 1.25 ;
        Double mql15 = m15 * lql15 * 10 * 1.25 ;
        Double mql16 = m16 * lql16 * 10 * 1.25 ;
        Double mql17 = m17 * lql17 * 10 * 1.25 ;
        Double mql18 = m18 * lql18 * 10 * 1.25 ;
        Double mql19 = m19 * lql19 * 10 * 1.25 ;
        Double mql21 = m21 * lql21 * 10 * 1.25 ;
        map.put("mql5", mql5);
        map.put("mql7", mql7);
        map.put("mql8", mql8);
        map.put("mql9", mql9);
        map.put("mql10", mql10);
        map.put("mql11", mql11);
        map.put("mql12", mql12);
        map.put("mql13", mql13);
        map.put("mql14", mql14);
        map.put("mql15", mql15);
        map.put("mql16", mql16);
        map.put("mql17", mql17);
        map.put("mql18", mql18);
        map.put("mql19", mql19);
        map.put("mql21", mql21);

        //90°轮压值计算
        Double mqql = mslql + mshlql + mql1 + mql2 + mql3 + mql4 + mql6 + mql20 ;
        Double mkql = mql5 + mql7 + mql8 + mql9 + mql10 + mql11 + mql12 + mql13 + mql14 + mql15 + mql16 + mql17 + mql18 + mql19 + mql21 ;
        Double mfql = mkql - mqql ;
        Double vad = mfql / ll / 2 ;
        Double vbc = 1.25 * mzj * 10 / 2 - vad ;
        Double dtv3 = msq / lg / 2 ;
        Double av3 = vad - dtv3 ;
        Double bv3 = vbc - dtv3 ;
        Double cv3 = vbc + dtv3 ;
        Double dv3 = vad + dtv3 ;
        map.put("mqql", mqql);
        map.put("mkql", mkql);
        map.put("mfql", mfql);
        map.put("vad", vad);
        map.put("vbc", vbc);
        map.put("dtv3", dtv3);
        map.put("av3", av3);
        map.put("bv3", bv3);
        map.put("cv3", cv3);
        map.put("dv3", dv3);

        //90°摩擦力计算
        Double at3 = av3 * umcxs ;
        Double bt3 = bv3 * umcxs ;
        map.put("at3", at3);
        map.put("bt3", bt3);

        //90°水平力计算
        Double dth3 = mwhz / ll ;
        Double ah3 = fwcx / 2 - dth3 ;
        Double bh3 = fwcx / 2 + dth3 ;
        map.put("dth3", dth3);
        map.put("ah3", ah3);
        map.put("bh3", bh3);

        //非工作状态风载荷产生的水平倾覆力矩
        Double mwqf1 = pf * afcx1 * hgf1 ;
        Double mwqf2 = pf * afcx2 * hgf2 ;
        Double mwqf3 = pf * afcx3 * hgf3 ;
        Double mwqf4 = pf * afcx4 * hgf4 ;
        Double mwqf5 = pf * afcx5 * hgf5 ;
        Double mwqf6 = pf * afcx6 * hgf6 ;
        Double mwqf7 = pf * afcx7 * hgf7 ;
        Double mwqf8 = pf * afcx8 * hgf8 ;
        Double mwqf9 = pf * afcx9 * hgf9 ;
        Double mwqf10 = pf * afcx10 * hgf10 ;
        Double mwqf11 = pf * afcx11 * hgf11 ;
        Double mwqf12 = pf * afcx12 * hgf12 ;
        Double mwqf13 = pf * afcx13 * hgf13 ;
        Double mwqf14 = pf * afcx14 * hgf14 ;
        Double mwqf15 = pf * afcx15 * hgf15 ;
        Double mwqf16 = pf * afcx16 * hgf16 ;
        Double mwqf17 = pf * afcx17 * hgf17 ;
        Double mwqf18 = pf * afcx18 * hgf18 ;
        Double mwqf19 = pf * afcx19 * hgf19 ;
        Double mwqf20 = pf * afcx20 * hgf20 ;
        Double mwqf21 = pf * afcx21 * hgf21 ;
        map.put("mwqf1", mwqf1);
        map.put("mwqf2", mwqf2);
        map.put("mwqf3", mwqf3);
        map.put("mwqf4", mwqf4);
        map.put("mwqf5", mwqf5);
        map.put("mwqf6", mwqf6);
        map.put("mwqf7", mwqf7);
        map.put("mwqf8", mwqf8);
        map.put("mwqf9", mwqf9);
        map.put("mwqf10", mwqf10);
        map.put("mwqf11", mwqf11);
        map.put("mwqf12", mwqf12);
        map.put("mwqf13", mwqf13);
        map.put("mwqf14", mwqf14);
        map.put("mwqf15", mwqf15);
        map.put("mwqf16", mwqf16);
        map.put("mwqf17", mwqf17);
        map.put("mwqf18", mwqf18);
        map.put("mwqf19", mwqf19);
        map.put("mwqf20", mwqf20);
        map.put("mwqf21", mwqf21);

        //非工作状态轮压值计算
        Double mfhl = mkhl - mqhl ;
        Double mwqf = mwqf1 + mwqf2 + mwqf3 + mwqf4 + mwqf5 + mwqf6 + mwqf7 + mwqf8 + mwqf9 + mwqf10 + mwqf11 + mwqf12 + mwqf13 + mwqf14 + mwqf15 + mwqf16 + mwqf17 + mwqf18 + mwqf19 + mwqf20 + mwqf21 ;
        Double vbcf = mfhl / ll / 2 ;
        Double vadf = mzjf * 10 / 2 - vbcf ;
        Double dtvf = mwqf / lg / 2 ;
        Double av4 = vadf - dtvf ;
        Double bv4 = vbcf - dtvf ;
        Double cv4 = vbcf + dtvf ;
        Double dv4 = vadf + dtvf ;
        map.put("mfhl", mfhl);
        map.put("mwqf", mwqf);
        map.put("vbcf", vbcf);
        map.put("vadf", vadf);
        map.put("dtvf", dtvf);
        map.put("av4", av4);
        map.put("bv4", bv4);
        map.put("cv4", cv4);
        map.put("dv4", dv4);

        //非工作状态擦窗机各部件风载荷
        Double ffcx1 = pf * afcx1 ;
        Double ffcx2 = pf * afcx2 ;
        Double ffcx3 = pf * afcx3 ;
        Double ffcx4 = pf * afcx4 ;
        Double ffcx5 = pf * afcx5 ;
        Double ffcx6 = pf * afcx6 ;
        Double ffcx7 = pf * afcx7 ;
        Double ffcx8 = pf * afcx8 ;
        Double ffcx9 = pf * afcx9 ;
        Double ffcx10 = pf * afcx10 ;
        Double ffcx11 = pf * afcx11 ;
        Double ffcx12 = pf * afcx12 ;
        Double ffcx13 = pf * afcx13 ;
        Double ffcx14 = pf * afcx14 ;
        Double ffcx15 = pf * afcx15 ;
        Double ffcx16 = pf * afcx16 ;
        Double ffcx17 = pf * afcx17 ;
        Double ffcx18 = pf * afcx18 ;
        Double ffcx19 = pf * afcx19 ;
        Double ffcx20 = pf * afcx20 ;
        Double ffcx21 = pf * afcx21 ;
        map.put("ffcx1", ffcx1);
        map.put("ffcx2", ffcx2);
        map.put("ffcx3", ffcx3);
        map.put("ffcx4", ffcx4);
        map.put("ffcx5", ffcx5);
        map.put("ffcx6", ffcx6);
        map.put("ffcx7", ffcx7);
        map.put("ffcx8", ffcx8);
        map.put("ffcx9", ffcx9);
        map.put("ffcx10", ffcx10);
        map.put("ffcx11", ffcx11);
        map.put("ffcx12", ffcx12);
        map.put("ffcx13", ffcx13);
        map.put("ffcx14", ffcx14);
        map.put("ffcx15", ffcx15);
        map.put("ffcx16", ffcx16);
        map.put("ffcx17", ffcx17);
        map.put("ffcx18", ffcx18);
        map.put("ffcx19", ffcx19);
        map.put("ffcx20", ffcx20);
        map.put("ffcx21", ffcx21);

        //非工作状态风载荷对擦窗机各部件产生的正向回转力矩
        Double mwhzf1 = ffcx1 * lmzf1 ;
        Double mwhzf2 = ffcx2 * lmzf2 ;
        Double mwhzf3 = ffcx3 * lmzf3 ;
        Double mwhzf4 = ffcx4 * lmzf4 ;
        Double mwhzf5 = ffcx5 * lmzf5 ;
        Double mwhzf6 = ffcx6 * lmzf6 ;
        Double mwhzf7 = ffcx7 * lmzf7 ;
        Double mwhzf8 = ffcx8 * lmzf8 ;
        Double mwhzf20 = ffcx20 * lmzf20 ;
        map.put("mwhzf1", mwhzf1);
        map.put("mwhzf2", mwhzf2);
        map.put("mwhzf3", mwhzf3);
        map.put("mwhzf4", mwhzf4);
        map.put("mwhzf5", mwhzf5);
        map.put("mwhzf6", mwhzf6);
        map.put("mwhzf7", mwhzf7);
        map.put("mwhzf8", mwhzf8);
        map.put("mwhzf20", mwhzf20);

        //非工作状态风载荷对擦窗机各部件产生的反向回转力矩
        Double mwhzf9 = ffcx9 * lmzf9 ;
        Double mwhzf10 = ffcx10 * lmzf10 ;
        Double mwhzf11 = ffcx11 * lmzf11 ;
        Double mwhzf12 = ffcx12 * lmzf12 ;
        Double mwhzf13 = ffcx13 * lmzf13 ;
        Double mwhzf14 = ffcx14 * lmzf14 ;
        Double mwhzf15 = ffcx15 * lmzf15 ;
        Double mwhzf16 = ffcx16 * lmzf16 ;
        Double mwhzf17 = ffcx17 * lmzf17 ;
        Double mwhzf18 = ffcx18 * lmzf18 ;
        Double mwhzf19 = ffcx19 * lmzf19 ;
        Double mwhzf21 = ffcx21 * lmzf21 ;
        map.put("mwhzf9", mwhzf9);
        map.put("mwhzf10", mwhzf10);
        map.put("mwhzf11", mwhzf11);
        map.put("mwhzf12", mwhzf12);
        map.put("mwhzf13", mwhzf13);
        map.put("mwhzf14", mwhzf14);
        map.put("mwhzf15", mwhzf15);
        map.put("mwhzf16", mwhzf16);
        map.put("mwhzf17", mwhzf17);
        map.put("mwhzf18", mwhzf18);
        map.put("mwhzf19", mwhzf19);
        map.put("mwhzf21", mwhzf21);

        //非工作状态水平力计算
        Double fwcxf = ffcx1 + ffcx2 + ffcx3 + ffcx4 + ffcx5 + ffcx6 + ffcx7 + ffcx8 + ffcx9 + ffcx10 + ffcx11 + ffcx12 + ffcx13 + ffcx14 + ffcx15 + ffcx16 + ffcx17 + ffcx18 + ffcx19 + ffcx20 + ffcx21 ;
        Double mwhzfa = mwhzf1 + mwhzf2 + mwhzf3 + mwhzf4 + mwhzf5 + mwhzf6 + mwhzf7 + mwhzf8 + mwhzf20 ;
        Double mwhzfb = mwhzf9 + mwhzf10 + mwhzf11 + mwhzf12 + mwhzf13 + mwhzf14 + mwhzf15 + mwhzf16 + mwhzf17 + mwhzf18 + mwhzf19 + mwhzf21 ;
        Double mwhzf = mwhzfa - mwhzfb ;
        Double dthf = mwhzf / ll ;
        Double ah4 = fwcxf / 2 - dthf ;
        Double bh4 = fwcxf / 2 + dthf ;
        map.put("fwcxf", fwcxf);
        map.put("mwhzfa", mwhzfa);
        map.put("mwhzfb", mwhzfb);
        map.put("mwhzf", mwhzf);
        map.put("dthf", dthf);
        map.put("ah4", ah4);
        map.put("bh4", bh4);

        Double av1k = av1 / 1000 ;
        Double bv1k = bv1 / 1000 ;
        Double cv1k = cv1 / 1000 ;
        Double dv1k = dv1 / 1000 ;
        Double at1k = at1 / 1000 ;
        Double bt1k = bt1 / 1000 ;
        Double ah1k = ah1 / 1000 ;
        Double bh1k = bh1 / 1000 ;
        map.put("av1k", av1k);
        map.put("bv1k", bv1k);
        map.put("cv1k", cv1k);
        map.put("dv1k", dv1k);
        map.put("at1k", at1k);
        map.put("bt1k", bt1k);
        map.put("ah1k", ah1k);
        map.put("bh1k", bh1k);

        Double av2k = av2 / 1000 ;
        Double bv2k = bv2 / 1000 ;
        Double cv2k = cv2 / 1000 ;
        Double dv2k = dv2 / 1000 ;
        Double at2k = at2 / 1000 ;
        Double bt2k = bt2 / 1000 ;
        Double ah2k = ah2 / 1000 ;
        Double bh2k = bh2 / 1000 ;
        map.put("av2k", av2k);
        map.put("bv2k", bv2k);
        map.put("cv2k", cv2k);
        map.put("dv2k", dv2k);
        map.put("at2k", at2k);
        map.put("bt2k", bt2k);
        map.put("ah2k", ah2k);
        map.put("bh2k", bh2k);

        Double av3k = av3 / 1000 ;
        Double bv3k = bv3 / 1000 ;
        Double cv3k = cv3 / 1000 ;
        Double dv3k = dv3 / 1000 ;
        Double at3k = at3 / 1000 ;
        Double bt3k = bt3 / 1000 ;
        Double ah3k = ah3 / 1000 ;
        Double bh3k = bh3 / 1000 ;
        map.put("av3k", av3k);
        map.put("bv3k", bv3k);
        map.put("cv3k", cv3k);
        map.put("dv3k", dv3k);
        map.put("at3k", at3k);
        map.put("bt3k", bt3k);
        map.put("ah3k", ah3k);
        map.put("bh3k", bh3k);

        Double av4k = av4 / 1000 ;
        Double bv4k = bv4 / 1000 ;
        Double cv4k = cv4 / 1000 ;
        Double dv4k = dv4 / 1000 ;
        Double ah4k = ah4 / 1000 ;
        Double bh4k = bh4 / 1000 ;
        map.put("av4k", av4k);
        map.put("bv4k", bv4k);
        map.put("cv4k", cv4k);
        map.put("dv4k", dv4k);
        map.put("ah4k", ah4k);
        map.put("bh4k", bh4k);

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

        Double mmh1 = doubleMap.get("mmh1");
        Double mm1 = doubleMap.get("mm1");
        String wdlyp1 ;
        if (mmh1 > mm1) {
            wdlyp1 = ">";
        } else if (mmh1 == mm1) {
            wdlyp1 ="=";
        } else {
            wdlyp1 ="<";
        }
        String wdlym1 ;
        if (mmh1 < mm1) {
            wdlym1 = "不满足";
        } else {
            wdlym1 ="满足";
        }
        map.put("wdlyp1", CommonFunc.convertDoubleToString(wdlyp1));
        map.put("wdlym1", CommonFunc.convertDoubleToString(wdlym1));

        Double mmh2 = doubleMap.get("mmh2");
        Double mm1p = doubleMap.get("mm1p");
        String wdlyp2 ;
        if (mmh2 > mm1p) {
            wdlyp2 = ">";
        } else if (mmh2 == mm1p) {
            wdlyp2 ="=";
        } else {
            wdlyp2 ="<";
        }
        String wdlym2 ;
        if (mmh2 < mm1p) {
            wdlym2 = "不满足";
        } else {
            wdlym2 ="满足";
        }
        map.put("wdlyp2", CommonFunc.convertDoubleToString(wdlyp2));
        map.put("wdlym2", CommonFunc.convertDoubleToString(wdlym2));

        String wdlym3 = (mmh2 >= mm1p && mmh1 >= mm1) ? "满足" : "不满足";
        map.put("wdlym3", CommonFunc.convertDoubleToString(wdlym3));

        String wdlyp3;
        if ( yxjgModel == "无" ){
            wdlyp3 = "无";
        }else {
            wdlyp3 = "有";
        }
        map.put("wdlyp3", CommonFunc.convertDoubleToString(wdlyp3));

        Double mo1 = doubleMap.get("mo1");
        Double mg1 = doubleMap.get("mg1");
        String wdlyp4;
        if ( mo1 < mg1 ) {
            wdlyp4 = "<" ;
        } else if ( mo1 == mg1 ) {
            wdlyp4 = "=";
        } else{
            wdlyp4 = ">";
        }
        map.put("wdlyp4", CommonFunc.convertDoubleToString(wdlyp4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
