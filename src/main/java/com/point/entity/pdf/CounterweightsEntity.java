package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.*;

@Data
public class CounterweightsEntity {

    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    private Double h;
    private Double lbd;
    private Double lbx;
//    private Double ltjbpz;
    private Double dbyj;
    private Double lbp;
    private Double lbpx;
    private Double ljbzc;
    private Double llzgd;
    private Double llzgdn;
    private Double llzgdw;
    private Double lg;
    private Double ll;
    private Double npz;

    //    提示提醒
    private String grutstx;

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

    private String qt1;
    private String qt2;

    //    非界面
    private String yxjgaz;
    private Double dcgssp;
    private Double grugssp;
    private Double lbtzh;
    private Double ldcgh;
    private Double ldslzh;
//    private Double lxtz;
//    private Double lxtm;
//    private Double ldjm;
//    private Double ldbm;

    private String hzzcxh;

//    非界面--重心至回转中心
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

    private String ydpz;

    private String dbType;
    private String dbModel;
    private String lzType;
    private String lzModel;
    private String dcModel;
    private String dhzjgModel;
    private String gruModel;
    private String btModel;
    private String qsjgModel;
    private String trippingModel;
    private String dcgssModel;
    private String yxjgazModel;
    private String ffbbModel;
    private String ydpzModel;

    private Double ma1;
    private Double ma2;
    private Double ma3;
    private Double ma4;
    private Double ma6;
    private Double ma20;

    private Double ma5;
    private Double ma7;
    private Double ma8;
    private Double ma9;
    private Double ma10;
    private Double ma12;
    private Double ma13;
    private Double ma14;
    private Double ma15;
    private Double ma16;
    private Double ma17;
    private Double ma18;
    private Double ma19;
    private Double ma21;

    private Double tsljz;
    private Double tshljz;
    private Double mslajz;
    private Double mshlajz;
    private Double mqyz;
    private Double ma11;
    private Double mkpzyz;
    private String pzyzy1;
    private String pzyzm1;

    private Double msla;
    private Double mshla;

    private Double mq;
    private Double mkpz;
    private Double m11s;
    private Double mz;

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
    private Double mfhl1;
    private Double mfhl2;
    private Double mfhl3;
    private Double mfhl4;
    private Double mfhl5;
    private Double mfhl6;
    private Double mfhl7;
    private Double mfhl8;
    private Double mfhl9;
    private Double mfhl12;
    private Double mfhl13;
    private Double mfhl14;
    private Double mfhl15;
    private Double mfhl16;
    private Double mfhl17;
    private Double mfhl18;
    private Double mfhl19;
    private Double mfhl20;
    private Double mfhl10;
    private Double mfhl11;
    private Double mfhl21;
    private Double mqhl;
    private Double mkhl;


    private String pzyzy2;
    private String pzyzm2;
    private String pzyzm;

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

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
//        map.put("ltjbpz", CommonFunc.convertDoubleToString(ltjbpz));
        map.put("lbp", CommonFunc.convertDoubleToString(lbp));
        map.put("lbpx", CommonFunc.convertDoubleToString(lbpx));
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));
        map.put("lg", CommonFunc.convertDoubleToString(lg));
        map.put("ll", CommonFunc.convertDoubleToString(ll));
        map.put("npz", CommonFunc.convertDoubleToString(npz));
        map.put("ljbzc", CommonFunc.convertDoubleToString(ljbzc));

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

        map.put("ydpz", CommonFunc.convertDoubleToString(ydpz));

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

        map.put("yxjgaz", CommonFunc.convertDoubleToString(yxjgaz));
        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("hzzcxh", CommonFunc.convertDoubleToString(hzzcxh));
//        map.put("mz", CommonFunc.convertDoubleToString(mz));

        map.put("qt1", CommonFunc.convertDoubleToString(qt1));
        map.put("qt2", CommonFunc.convertDoubleToString(qt2));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> check() {
        Map<String, String> map = new HashMap<>();
        takeMapForCheckPDF();
        takeMapForPDF("");
        map.put("m11s", CommonFunc.convertDoubleToString(m11s));

        if (m11 == null) {
            return map;
        }
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("pzyzy1", CommonFunc.convertDoubleToString(pzyzy1));
        map.put("pzyzy2", CommonFunc.convertDoubleToString(pzyzy2));
        map.put("pzyzm", CommonFunc.convertDoubleToString(pzyzm));
        return map;

    }

    /*
          验证部分
           */
    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        if (m11 == null) {
            return null;
        }

        tsljz = swp + 1.5 * r1 + mwr + mffbb;
        tshljz = 1.25 * hwll + hsw;
        mslajz = tsljz * lslqg * 10;
        mshlajz = tshljz * lshlqg * 10;
        mqyz = mslajz + mshlajz + ma1 + ma2 + ma3 + ma4 + ma6 + ma20;
        ma11 = m11 * lqg11 * 10;
        mkpzyz = ma5 + ma7 + ma8 + ma9 + ma10 + ma11 + ma12 + ma13 + ma14 + ma15 + ma16 + ma17 + ma18 + ma19 + ma21;

        pzyzy1 = (mqyz <= mkpzyz) ? "没有" : "有";
        pzyzm1 = (mqyz <= mkpzyz) ? "符合" : "不符合";

        lhl1 = lbx - (ldcgh - lbtzh) + ll / 2;
        lhl2 = lbx - (ldcgh - ldslzh) + ll / 2;
        lhl3 = lhl1;
        if (lzType.indexOf("固定立柱") > -1) lhl4 = lqg4 + lg / 2 + ll / 2;
        else if (lzType.indexOf("仰臂固定立柱") > -1) lhl4 = lqg4 + lg / 2 / cos(dbyj) + ll / 2;
        else if (lzType.indexOf("1+1顶升立柱") > -1) lhl4 = lqg4 + lg / 2 + ll / 2;
        else if (lzType.indexOf("仰柱机构") > -1) lhl4 = (lqg4 + lg / 2) / cos(dbyj) + ll / 2;

        if (lzType.indexOf("固定立柱") > -1) lhl5 = lg / 2 - lqg5 + ll / 2;
        else if (lzType.indexOf("仰臂固定立柱") > -1) lhl5 = (lg / 2 - lqg5) / cos(dbyj) + ll / 2;
        else if (lzType.indexOf("1+1顶升立柱") > -1) lhl5 = lg / 2 - lqg5 + ll / 2;
        else if (lzType.indexOf("仰柱机构") > -1) lhl5 = (lg / 2 - lqg5) / cos(dbyj) + ll / 2;

        lhl6 = lg / 2 - lqg6 + ll / 2;
        lhl7 = lg / 2 - lqg7 + ll / 2;
        lhl8 = lg / 2 - lqg8 + ll / 2;
        lhl9 = ll / 2;
        if (m10 == 0) lhl10 = 0.0;
        else lhl10 = lqg10 - lg / 2 - ll / 2;
        lhl11 = lbp - ll / 2;
        lhl12 = ll / 2;
        lhl13 = ll / 2 - lqg13 - lg / 2;
        if (m14 == 0) lhl14 = 0.0;
        else lhl14 = ll / 2 - lqg14 - lg / 2;
        lhl15 = ll / 2;
        if (trippingModel.equals("无")) lhl16 = 0.0;
        else lhl16 = ll;
        if (trippingModel.equals("无")) lhl17 = 0.0;
        else lhl17 = 0.0;
        if (trippingModel.equals("无")) lhl18 = 0.0;
        else lhl18 = ll;
        if (trippingModel.equals("无")) lhl19 = 0.0;
        else lhl19 = 0.0;

        if (m20 == 0) lhl20 = 0.0;
        else lhl20 = lqg20 + lg / 2 + ll / 2;
        if (m21 == 0) lhl21 = 0.0;
        else lhl21 = lqg21 - lg / 2 - ll / 2;

        mfhl1 = m1 * lhl1 * 10;
        mfhl2 = m2 * lhl2 * 10;
        mfhl3 = m3 * lhl3 * 10;
        mfhl4 = m4 * lhl4 * 10;
        mfhl5 = m5 * lhl5 * 10;
        mfhl6 = m6 * lhl6 * 10;
        mfhl7 = m7 * lhl7 * 10;
        mfhl8 = m8 * lhl8 * 10;
        mfhl9 = m9 * lhl9 * 10;
        mfhl12 = m12 * lhl12 * 10;
        mfhl13 = m13 * lhl13 * 10;
        mfhl14 = m14 * lhl14 * 10;
        mfhl15 = m15 * lhl15 * 10;
        mfhl16 = m16 * lhl16 * 10;
        mfhl17 = m17 * lhl17 * 10;
        mfhl18 = m18 * lhl18 * 10;
        mfhl19 = m19 * lhl19 * 10;
        mfhl20 = m20 * lhl20 * 10;
        mfhl10 = m10 * lhl10 * 10;
        mfhl11 = m11 * lhl11 * 10;
        mfhl21 = m21 * lhl21 * 10;
        mqhl = mfhl10 + mfhl11 + mfhl21;
        mkhl = mfhl1 + mfhl2 + mfhl3 + mfhl4 + mfhl5 + mfhl6 + mfhl7 + mfhl8 + mfhl9
                + mfhl12 + mfhl13 + mfhl14 + mfhl15 + mfhl16 + mfhl17 + mfhl18 + mfhl19
                + mfhl20;


        if (mqhl <= mkhl) pzyzy2 = "没有";
        else pzyzy2 = "有";
        if (mqhl <= mkhl) pzyzm2 = "满足";
        else pzyzm2 = "不满足";
        if (pzyzy1.equals("没有") && pzyzy2.equals("没有") && m11s <= m11)
            pzyzm = "满足";
        else
            pzyzm = "不满足";

        Map<String, String> result = new HashMap<>();
        result.put("swp", CommonFunc.convertDoubleToString(swp));
        result.put("r1", CommonFunc.convertDoubleToString(r1));
        result.put("mwr", CommonFunc.convertDoubleToString(mwr));
        result.put("mffbb", CommonFunc.convertDoubleToString(mffbb));
        result.put("hwll", CommonFunc.convertDoubleToString(hwll));
        result.put("hsw", CommonFunc.convertDoubleToString(hsw));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m4", CommonFunc.convertDoubleToString(m4));
        result.put("m6", CommonFunc.convertDoubleToString(m6));
        result.put("m20", CommonFunc.convertDoubleToString(m20));
        result.put("qt1", CommonFunc.convertDoubleToString(qt1));
        result.put("qt2", CommonFunc.convertDoubleToString(qt2));

        result.put("lslqg", CommonFunc.convertDoubleToString(lslqg));
        result.put("lshlqg", CommonFunc.convertDoubleToString(lshlqg));
        result.put("lqg1", CommonFunc.convertDoubleToString(lqg1));
        result.put("lqg2", CommonFunc.convertDoubleToString(lqg2));
        result.put("lqg3", CommonFunc.convertDoubleToString(lqg3));
        result.put("lqg4", CommonFunc.convertDoubleToString(lqg4));
        result.put("lqg6", CommonFunc.convertDoubleToString(lqg6));
        result.put("lqg20", CommonFunc.convertDoubleToString(lqg20));

        result.put("ma1", CommonFunc.convertDoubleToString(ma1));
        result.put("ma2", CommonFunc.convertDoubleToString(ma2));
        result.put("ma3", CommonFunc.convertDoubleToString(ma3));
        result.put("ma4", CommonFunc.convertDoubleToString(ma4));
        result.put("ma6", CommonFunc.convertDoubleToString(ma6));
        result.put("ma20", CommonFunc.convertDoubleToString(ma20));

        result.put("m5", CommonFunc.convertDoubleToString(m5));
        result.put("m7", CommonFunc.convertDoubleToString(m7));
        result.put("m8", CommonFunc.convertDoubleToString(m8));
        result.put("m9", CommonFunc.convertDoubleToString(m9));
        result.put("m10", CommonFunc.convertDoubleToString(m10));
        result.put("m11", CommonFunc.convertDoubleToString(m11));
        result.put("m12", CommonFunc.convertDoubleToString(m12));
        result.put("m13", CommonFunc.convertDoubleToString(m13));
        result.put("m14", CommonFunc.convertDoubleToString(m14));
        result.put("m15", CommonFunc.convertDoubleToString(m15));
        result.put("m16", CommonFunc.convertDoubleToString(m16));
        result.put("m17", CommonFunc.convertDoubleToString(m17));
        result.put("m18", CommonFunc.convertDoubleToString(m18));
        result.put("m19", CommonFunc.convertDoubleToString(m19));
        result.put("m21", CommonFunc.convertDoubleToString(m21));

        result.put("lqg5", CommonFunc.convertDoubleToString(lqg5));
        result.put("lqg7", CommonFunc.convertDoubleToString(lqg7));
        result.put("lqg8", CommonFunc.convertDoubleToString(lqg8));
        result.put("lqg9", CommonFunc.convertDoubleToString(lqg9));
        result.put("lqg10", CommonFunc.convertDoubleToString(lqg10));
        result.put("lqg11", CommonFunc.convertDoubleToString(lqg11));
        result.put("lqg12", CommonFunc.convertDoubleToString(lqg12));
        result.put("lqg13", CommonFunc.convertDoubleToString(lqg13));
        result.put("lqg14", CommonFunc.convertDoubleToString(lqg14));
        result.put("lqg15", CommonFunc.convertDoubleToString(lqg15));
        result.put("lqg16", CommonFunc.convertDoubleToString(lqg16));
        result.put("lqg17", CommonFunc.convertDoubleToString(lqg17));
        result.put("lqg18", CommonFunc.convertDoubleToString(lqg18));
        result.put("lqg19", CommonFunc.convertDoubleToString(lqg19));
        result.put("lqg21", CommonFunc.convertDoubleToString(lqg21));

        result.put("ma5", CommonFunc.convertDoubleToString(ma5));
        result.put("ma7", CommonFunc.convertDoubleToString(ma7));
        result.put("ma8", CommonFunc.convertDoubleToString(ma8));
        result.put("ma9", CommonFunc.convertDoubleToString(ma9));
        result.put("ma10", CommonFunc.convertDoubleToString(ma10));
        result.put("ma12", CommonFunc.convertDoubleToString(ma12));
        result.put("ma13", CommonFunc.convertDoubleToString(ma13));
        result.put("ma14", CommonFunc.convertDoubleToString(ma14));
        result.put("ma15", CommonFunc.convertDoubleToString(ma15));
        result.put("ma16", CommonFunc.convertDoubleToString(ma16));
        result.put("ma17", CommonFunc.convertDoubleToString(ma17));
        result.put("ma18", CommonFunc.convertDoubleToString(ma18));
        result.put("ma19", CommonFunc.convertDoubleToString(ma19));
        result.put("ma21", CommonFunc.convertDoubleToString(ma21));

        result.put("tsljz", CommonFunc.convertDoubleToString(tsljz));
        result.put("tshljz", CommonFunc.convertDoubleToString(tshljz));
        result.put("mslajz", CommonFunc.convertDoubleToString(mslajz));
        result.put("mshlajz", CommonFunc.convertDoubleToString(mshlajz));
        result.put("mqyz", CommonFunc.convertDoubleToString(mqyz));
        result.put("ma11", CommonFunc.convertDoubleToString(ma11));
        result.put("mkpzyz", CommonFunc.convertDoubleToString(mkpzyz));
        result.put("pzyzy1", CommonFunc.convertDoubleToString(pzyzy1));
        result.put("pzyzm1", CommonFunc.convertDoubleToString(pzyzm1));
        result.put("m11", CommonFunc.convertDoubleToString(m11));
        result.put("lqg11", CommonFunc.convertDoubleToString(lqg11));

        result.put("lhl1", CommonFunc.convertDoubleToString(lhl1));
        result.put("lhl2", CommonFunc.convertDoubleToString(lhl2));
        result.put("lhl3", CommonFunc.convertDoubleToString(lhl3));
        result.put("lhl4", CommonFunc.convertDoubleToString(lhl4));
        result.put("lhl5", CommonFunc.convertDoubleToString(lhl5));
        result.put("lhl6", CommonFunc.convertDoubleToString(lhl6));
        result.put("lhl7", CommonFunc.convertDoubleToString(lhl7));
        result.put("lhl8", CommonFunc.convertDoubleToString(lhl8));
        result.put("lhl9", CommonFunc.convertDoubleToString(lhl9));
        result.put("lhl10", CommonFunc.convertDoubleToString(lhl10));
        result.put("lhl11", CommonFunc.convertDoubleToString(lhl11));
        result.put("lhl12", CommonFunc.convertDoubleToString(lhl12));
        result.put("lhl13", CommonFunc.convertDoubleToString(lhl13));
        result.put("lhl14", CommonFunc.convertDoubleToString(lhl14));
        result.put("lhl15", CommonFunc.convertDoubleToString(lhl15));
        result.put("lhl16", CommonFunc.convertDoubleToString(lhl16));
        result.put("lhl17", CommonFunc.convertDoubleToString(lhl17));
        result.put("lhl18", CommonFunc.convertDoubleToString(lhl18));
        result.put("lhl19", CommonFunc.convertDoubleToString(lhl19));
        result.put("lhl20", CommonFunc.convertDoubleToString(lhl20));
        result.put("lhl21", CommonFunc.convertDoubleToString(lhl21));
        result.put("mfhl1", CommonFunc.convertDoubleToString(mfhl1));
        result.put("mfhl2", CommonFunc.convertDoubleToString(mfhl2));
        result.put("mfhl3", CommonFunc.convertDoubleToString(mfhl3));
        result.put("mfhl4", CommonFunc.convertDoubleToString(mfhl4));
        result.put("mfhl5", CommonFunc.convertDoubleToString(mfhl5));
        result.put("mfhl6", CommonFunc.convertDoubleToString(mfhl6));
        result.put("mfhl7", CommonFunc.convertDoubleToString(mfhl7));
        result.put("mfhl8", CommonFunc.convertDoubleToString(mfhl8));
        result.put("mfhl9", CommonFunc.convertDoubleToString(mfhl9));
        result.put("mfhl12", CommonFunc.convertDoubleToString(mfhl12));
        result.put("mfhl13", CommonFunc.convertDoubleToString(mfhl13));
        result.put("mfhl14", CommonFunc.convertDoubleToString(mfhl14));
        result.put("mfhl15", CommonFunc.convertDoubleToString(mfhl15));
        result.put("mfhl16", CommonFunc.convertDoubleToString(mfhl16));
        result.put("mfhl17", CommonFunc.convertDoubleToString(mfhl17));
        result.put("mfhl18", CommonFunc.convertDoubleToString(mfhl18));
        result.put("mfhl19", CommonFunc.convertDoubleToString(mfhl19));
        result.put("mfhl20", CommonFunc.convertDoubleToString(mfhl20));
        result.put("mfhl10", CommonFunc.convertDoubleToString(mfhl10));
        result.put("mfhl11", CommonFunc.convertDoubleToString(mfhl11));
        result.put("mfhl21", CommonFunc.convertDoubleToString(mfhl21));
        result.put("mqhl", CommonFunc.convertDoubleToString(mqhl));
        result.put("mkhl", CommonFunc.convertDoubleToString(mkhl));
        result.put("pzyzy2", CommonFunc.convertDoubleToString(pzyzy2));
        result.put("pzyzm2", CommonFunc.convertDoubleToString(pzyzm2));
        result.put("pzyzm", CommonFunc.convertDoubleToString(pzyzm));


        return result;
    }

    /*
            正文部分程序
             */
    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

         /*
        倾覆力矩和抗倾覆力矩
         */
        msla = tsl * lslqg * 10;
        mshla = tshl * lshlqg * 10;
        ma1 = m1 * lqg1 * 10;
        ma2 = m2 * lqg2 * 10;
        ma3 = m3 * lqg3 * 10;
        ma4 = m4 * lqg4 * 10;
        ma5 = m5 * lqg5 * 10;
        ma6 = m6 * lqg6 * 10;
        ma7 = m7 * lqg7 * 10;
        ma8 = m8 * lqg8 * 10;
        ma9 = m9 * lqg9 * 10;
        ma10 = m10 * lqg10 * 10;
        ma12 = m12 * lqg12 * 10;
        ma13 = m13 * lqg13 * 10;
        ma14 = m14 * lqg14 * 10;
        ma15 = m15 * lqg15 * 10;
        ma16 = m16 * lqg16 * 10;
        ma17 = m17 * lqg17 * 10;
        ma18 = m18 * lqg18 * 10;
        ma19 = m19 * lqg19 * 10;
        ma20 = m20 * lqg20 * 10;
        ma21 = m21 * lqg21 * 10;

        mq = msla + mshla + ma1 + ma2 + ma3 + ma4 + ma6 + ma20;
        mkpz = ma5 + ma7 + ma8 + ma9 + ma10 + ma12 + ma13 + ma14 + ma15 + ma16 + ma17 + ma18 + ma19 + ma21;
        m11s = (npz * mq - mkpz) / (lqg11 * 10);
        if( m11 != null ){
         mz = swp + mwr + hwll + m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12 + m13 + m14 + m15 + m16 + m17 + m18 + m19 + m20 + m21;
        };
        map.put("msla", msla);
        map.put("mshla", mshla);
        map.put("ma1", ma1);
        map.put("ma2", ma2);
        map.put("ma3", ma3);
        map.put("ma4", ma4);
        map.put("ma5", ma5);
        map.put("ma6", ma6);
        map.put("ma7", ma7);
        map.put("ma8", ma8);
        map.put("ma9", ma9);
        map.put("ma10", ma10);
//        map.put("ma11", ma11);
        map.put("ma12", ma12);
        map.put("ma13", ma13);
        map.put("ma14", ma14);
        map.put("ma15", ma15);
        map.put("ma16", ma16);
        map.put("ma17", ma17);
        map.put("ma18", ma18);
        map.put("ma19", ma19);
        map.put("ma20", ma20);
        map.put("ma21", ma21);

        map.put("mq", mq);
        map.put("mkpz", mkpz);
        map.put("m11s", m11s);
        map.put("mz", mz);

        /*
        计算公式
         */

        return map;
    }

    public Map<String, String> takeStringMapForPdf(String type) {
        Map map = new HashMap();
        Map<String, Double> doubleMap = takeDoubleMapForPdf(type);
        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
