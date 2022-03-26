package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ColumnCheckEntity {
    private String no;
    private String ver;
    private String xmmc;
    private String zjxh;
    private String jsr;
    private String shr;
    private String pzr;
    private String date;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double grudsxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;

    private Double acx5;
    private Double hslg;
    private Double hshlg;
    private Double hg1;
    private Double hg2;
    private Double hg3;
    private Double hg4;
    private Double hg5;
    private Double hg6;
    private Double hg7;
    private Double hg10;
    private Double hg11;

    private Double lbggd;

    private Double h;
    private Double p;
    private Double pf;
    private Double lbd;
    private Double lbx;


    private String wlzclxh;
    private Double wlzss;
    private Double wlzsp;
    private Double wlza;
    private Double wlzwx;
    private Double wlzwy;
    private Double wlzix;
    private Double wlzimin;
    private Double wlzl;
    private Double wlzbggd;

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
    private Double m5ds;
    private Double m6;
    private Double m7;
    private Double m10;
    private Double m11;
    private Double m12n;

    private Double mwlz;
    private Double lhzwlz;
    private Double m5dsp;
    private Double mwlzf;
    private Double lhzwlzf;

    private Double lslhz;
    private Double lshlhz;
    private Double lhz1;
    private Double lhz2;
    private Double lhz3;
    private Double lhz4;
    private Double lhz5;
    private Double lhz6;
    private Double lhz7;
    private Double lhz10;
    private Double lhz11;
    private Double lhz12n;

    private Double aslcx;
    private Double ashlcx;
    private Double acx1;
    private Double acx2;
    private Double acx3;
    private Double acx4;
    private Double acx5ds;
    private Double acx6;
    private Double acx7;
    private Double acx10;
    private Double acx11;
    private Double acx12n;

    private Double hslb;
    private Double hshlb;
    private Double hb1;
    private Double hb2;
    private Double hb3;
    private Double hb4;
    private Double hb5;
    private Double hb6;
    private Double hb7;
    private Double hb10;
    private Double hb11;
    private Double hb12n;

    private Double lhz1f;
    private Double lhz2f;
    private Double lhz3f;
    private Double lhz4f;
    private Double lhz5f;
    private Double lhz6f;
    private Double lhz7f;
    private Double lhz10f;
    private Double lhz11f;
    private Double lhz12nf;

    private Double acx1f;
    private Double acx2f;
    private Double acx3f;
    private Double acx4f;
    private Double acx5dsf;
    private Double acx6f;
    private Double acx7f;
    private Double acx10f;
    private Double acx11f;
    private Double acx12nf;

    private Double hb1f;
    private Double hb2f;
    private Double hb3f;
    private Double hb4f;
    private Double hb5f;
    private Double hb6f;
    private Double hb7f;
    private Double hb10f;
    private Double hb11f;
    private Double hb12nf;

    private Double eg1;
    private Double rg1;
    private Double fe1;

    private Double egf;
    private Double rgf;
    private Double fef;

    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;
    private String grudsModel;

    private String lzysxzModel;

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

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("grudsxs", CommonFunc.convertDoubleToString(grudsxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));

        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("hslg", CommonFunc.convertDoubleToString(hslg));
        map.put("hshlg", CommonFunc.convertDoubleToString(hshlg));
        map.put("hg1", CommonFunc.convertDoubleToString(hg1));
        map.put("hg2", CommonFunc.convertDoubleToString(hg2));
        map.put("hg3", CommonFunc.convertDoubleToString(hg3));
        map.put("hg4", CommonFunc.convertDoubleToString(hg4));
        map.put("hg5", CommonFunc.convertDoubleToString(hg5));
        map.put("hg6", CommonFunc.convertDoubleToString(hg6));
        map.put("hg7", CommonFunc.convertDoubleToString(hg7));
        map.put("hg10", CommonFunc.convertDoubleToString(hg10));
        map.put("hg11", CommonFunc.convertDoubleToString(hg11));
        map.put("lbggd", CommonFunc.convertDoubleToString(lbggd));

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("p", CommonFunc.convertDoubleToString(p));
        map.put("pf", CommonFunc.convertDoubleToString(pf));
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));

        map.put("wlzclxh", CommonFunc.convertDoubleToString(wlzclxh));
        map.put("wlzss", CommonFunc.convertDoubleToString(wlzss));
        map.put("wlzsp", CommonFunc.convertDoubleToString(wlzsp));
        map.put("wlza", CommonFunc.convertDoubleToString(wlza));
        map.put("wlzwx", CommonFunc.convertDoubleToString(wlzwx));
        map.put("wlzwy", CommonFunc.convertDoubleToString(wlzwy));
        map.put("wlzix", CommonFunc.convertDoubleToString(wlzix));
        map.put("wlzimin", CommonFunc.convertDoubleToString(wlzimin));
        map.put("wlzl", CommonFunc.convertDoubleToString(wlzl));
        map.put("wlzbggd", CommonFunc.convertDoubleToString(wlzbggd));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

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
        map.put("m5ds", CommonFunc.convertDoubleToString(m5ds));
        map.put("m6", CommonFunc.convertDoubleToString(m6));
        map.put("m7", CommonFunc.convertDoubleToString(m7));
        map.put("m10", CommonFunc.convertDoubleToString(m10));
        map.put("m11", CommonFunc.convertDoubleToString(m11));
        map.put("m12n", CommonFunc.convertDoubleToString(m12n));
        map.put("mwlz", CommonFunc.convertDoubleToString(mwlz));
        map.put("lhzwlz", CommonFunc.convertDoubleToString(lhzwlz));
        map.put("m5dsp", CommonFunc.convertDoubleToString(m5dsp));
        map.put("mwlzf", CommonFunc.convertDoubleToString(mwlzf));
        map.put("lhzwlzf", CommonFunc.convertDoubleToString(lhzwlzf));

        map.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        map.put("lshlhz", CommonFunc.convertDoubleToString(lshlhz));
        map.put("lhz1", CommonFunc.convertDoubleToString(lhz1));
        map.put("lhz2", CommonFunc.convertDoubleToString(lhz2));
        map.put("lhz3", CommonFunc.convertDoubleToString(lhz3));
        map.put("lhz4", CommonFunc.convertDoubleToString(lhz4));
        map.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        map.put("lhz6", CommonFunc.convertDoubleToString(lhz6));
        map.put("lhz7", CommonFunc.convertDoubleToString(lhz7));
        map.put("lhz10", CommonFunc.convertDoubleToString(lhz10));
        map.put("lhz11", CommonFunc.convertDoubleToString(lhz11));
        map.put("lhz12n", CommonFunc.convertDoubleToString(lhz12n));

        map.put("aslcx", CommonFunc.convertDoubleToString(aslcx));
        map.put("ashlcx", CommonFunc.convertDoubleToString(ashlcx));
        map.put("acx1", CommonFunc.convertDoubleToString(acx1));
        map.put("acx2", CommonFunc.convertDoubleToString(acx2));
        map.put("acx3", CommonFunc.convertDoubleToString(acx3));
        map.put("acx4", CommonFunc.convertDoubleToString(acx4));
        map.put("acx5ds", CommonFunc.convertDoubleToString(acx5ds));
        map.put("acx6", CommonFunc.convertDoubleToString(acx6));
        map.put("acx7", CommonFunc.convertDoubleToString(acx7));
        map.put("acx10", CommonFunc.convertDoubleToString(acx10));
        map.put("acx11", CommonFunc.convertDoubleToString(acx11));
        map.put("acx12n", CommonFunc.convertDoubleToString(acx12n));

        map.put("hslb", CommonFunc.convertDoubleToString(hslb));
        map.put("hshlb", CommonFunc.convertDoubleToString(hshlb));
        map.put("hb1", CommonFunc.convertDoubleToString(hb1));
        map.put("hb2", CommonFunc.convertDoubleToString(hb2));
        map.put("hb3", CommonFunc.convertDoubleToString(hb3));
        map.put("hb4", CommonFunc.convertDoubleToString(hb4));
        map.put("hb5", CommonFunc.convertDoubleToString(hb5));
        map.put("hb6", CommonFunc.convertDoubleToString(hb6));
        map.put("hb7", CommonFunc.convertDoubleToString(hb7));
        map.put("hb10", CommonFunc.convertDoubleToString(hb10));
        map.put("hb11", CommonFunc.convertDoubleToString(hb11));
        map.put("hb12n", CommonFunc.convertDoubleToString(hb12n));

        map.put("lhz1f", CommonFunc.convertDoubleToString(lhz1f));
        map.put("lhz2f", CommonFunc.convertDoubleToString(lhz2f));
        map.put("lhz3f", CommonFunc.convertDoubleToString(lhz3f));
        map.put("lhz4f", CommonFunc.convertDoubleToString(lhz4f));
        map.put("lhz5f", CommonFunc.convertDoubleToString(lhz5f));
        map.put("lhz6f", CommonFunc.convertDoubleToString(lhz6f));
        map.put("lhz7f", CommonFunc.convertDoubleToString(lhz7f));
        map.put("lhz10f", CommonFunc.convertDoubleToString(lhz10f));
        map.put("lhz11f", CommonFunc.convertDoubleToString(lhz11f));
        map.put("lhz12nf", CommonFunc.convertDoubleToString(lhz12nf));

        map.put("acx1f", CommonFunc.convertDoubleToString(acx1f));
        map.put("acx2f", CommonFunc.convertDoubleToString(acx2f));
        map.put("acx3f", CommonFunc.convertDoubleToString(acx3f));
        map.put("acx4f", CommonFunc.convertDoubleToString(acx4f));
        map.put("acx5dsf", CommonFunc.convertDoubleToString(acx5dsf));
        map.put("acx6f", CommonFunc.convertDoubleToString(acx6f));
        map.put("acx7f", CommonFunc.convertDoubleToString(acx7f));
        map.put("acx10f", CommonFunc.convertDoubleToString(acx10f));
        map.put("acx11f", CommonFunc.convertDoubleToString(acx11f));
        map.put("acx12nf", CommonFunc.convertDoubleToString(acx12nf));

        map.put("hb1f", CommonFunc.convertDoubleToString(hb1f));
        map.put("hb2f", CommonFunc.convertDoubleToString(hb2f));
        map.put("hb3f", CommonFunc.convertDoubleToString(hb3f));
        map.put("hb4f", CommonFunc.convertDoubleToString(hb4f));
        map.put("hb5f", CommonFunc.convertDoubleToString(hb5f));
        map.put("hb6f", CommonFunc.convertDoubleToString(hb6f));
        map.put("hb7f", CommonFunc.convertDoubleToString(hb7f));
        map.put("hb10f", CommonFunc.convertDoubleToString(hb10f));
        map.put("hb11f", CommonFunc.convertDoubleToString(hb11f));
        map.put("hb12nf", CommonFunc.convertDoubleToString(hb12nf));

        map.put("eg1", CommonFunc.convertDoubleToString(eg1));
        map.put("rg1", CommonFunc.convertDoubleToString(rg1));
        map.put("fe1", CommonFunc.convertDoubleToString(fe1));

        map.put("egf", CommonFunc.convertDoubleToString(egf));
        map.put("rgf", CommonFunc.convertDoubleToString(rgf));
        map.put("fef", CommonFunc.convertDoubleToString(fef));

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

//        工作状态  强度
        Double mslz = 1.25 * tsl * lslhz * 10 ;
        Double mshlz = 1.25 * tshl * lshlhz * 10 ;
        Double mz1 = 1.25 * m1 * lhz1 * 10 ;
        Double mz2 = 1.25 * m2 * lhz2 * 10 ;
        Double mz3 = 1.25 * m3 * lhz3 * 10 ;
        Double mz4 = 1.25 * m4 * lhz4 * 10 ;
        Double mz5 = 1.25 * m5ds * lhz5 * 10 ;
        Double mz6 = 1.25 * m6 * lhz6 * 10 ;
        Double mz7 = 1.25 * m7 * lhz7 * 10 ;
        map.put("mslz", mslz);
        map.put("mshlz", mshlz);
        map.put("mz1", mz1);
        map.put("mz2", mz2);
        map.put("mz3", mz3);
        map.put("mz4", mz4);
        map.put("mz5", mz5);
        map.put("mz6", mz6);
        map.put("mz7", mz7);

        Double mz10 = 1.25 * m10 * lhz10 * 10 ;
        Double mz11 = 1.25 * m11 * lhz11 * 10 ;
        Double mz12n = 1.25 * m12n * lhz12n * 10;
        map.put("mz10", mz10);
        map.put("mz11", mz11);
        map.put("mz12n", mz12n);

        Double mslcxw = 1.25 * aslcx * hslb * p ;
        Double mshlcxw = 1.25 * ashlcx * hshlb * p ;
        Double mcxw1 = 1.25 * acx1 * hb1 * p ;
        Double mcxw2 = 1.25 * acx2 * hb2 * p ;
        Double mcxw3 = 1.25 * acx3 * hb3 * p ;
        Double mcxw4 = 1.25 * acx4 * hb4 * p ;
        Double mcxw5 = 1.25 * acx5ds * hb5 * p ;
        Double mcxw6 = 1.25 * acx6 * hb6 * p ;
        Double mcxw7 = 1.25 * acx7 * hb7 * p ;
        Double mcxw10 = 1.25 * acx10 * hb10 * p ;
        Double mcxw11 = 1.25 * acx11 * hb11 * p ;
        Double mcxw12n = 1.25 * acx12n * hb12n * p ;
        map.put("mslcxw", mslcxw);
        map.put("mshlcxw", mshlcxw);
        map.put("mcxw1", mcxw1);
        map.put("mcxw2", mcxw2);
        map.put("mcxw3", mcxw3);
        map.put("mcxw4", mcxw4);
        map.put("mcxw5", mcxw5);
        map.put("mcxw6", mcxw6);
        map.put("mcxw7", mcxw7);
        map.put("mcxw10", mcxw10);
        map.put("mcxw11", mcxw11);
        map.put("mcxw12n", mcxw12n);

        Double mzq1 = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 + mz6 + mz7 ;
        Double mzk1 = mz10 + mz11 + mz12n ;
        Double mzz1 = mzq1 - mzk1 ;
        Double mzz2 = mslcxw + mshlcxw + mcxw1 + mcxw2 + mcxw3 + mcxw4 + mcxw5 + mcxw6 + mcxw7 + mcxw10 + mcxw11 + mcxw12n ;
        Double sz1 = 1000 * mzz1 / wlzwx ;
        Double sw1 = 1000 * mzz2 / wlzwy ;
        Double smax1 = sz1 + sw1 ;
        map.put("mzq1", mzq1);
        map.put("mzk1", mzk1);
        map.put("mzz1", mzz1);
        map.put("mzz2", mzz2);
        map.put("sz1", sz1);
        map.put("sw1", sw1);
        map.put("smax1", smax1);

        //        工作状态  稳定性
        Double pgz1 = 1.25 * mwlz * 10 ;
        Double sg1 = pgz1 / fe1 / wlza ;
        map.put("pgz1", pgz1);
        map.put("sg1", sg1);

//        非工作状态  强度
        Double mz1f = m1 * lhz1f * 10 ;
        Double mz2f = m2 * lhz2f * 10 ;
        Double mz3f = m3 * lhz3f * 10 ;
        Double mz4f = m4 * lhz4f * 10 ;
        Double mz5f = m5dsp * lhz5f * 10 ;
        Double mz6f = m6 * lhz6f * 10 ;
        Double mz7f = m7 * lhz7f * 10 ;
        map.put("mz1f", mz1f);
        map.put("mz2f", mz2f);
        map.put("mz3f", mz3f);
        map.put("mz4f", mz4f);
        map.put("mz5f", mz5f);
        map.put("mz6f", mz6f);
        map.put("mz7f", mz7f);

        Double mz10f = m10 * lhz10f * 10 ;
        Double mz11f = m11 * lhz11f * 10 ;
        Double mz12nf = m12n * lhz12nf * 10 ;
        map.put("mz10f", mz10f);
        map.put("mz11f", mz11f);
        map.put("mz12nf", mz12nf);

        Double mcxw1f = acx1f * hb1f * pf ;
        Double mcxw2f = acx2f * hb2f * pf ;
        Double mcxw3f = acx3f * hb3f * pf ;
        Double mcxw4f = acx4f * hb4f * pf ;
        Double mcxw5f = acx5dsf * hb5f * pf ;
        Double mcxw6f = acx6f * hb6f * pf ;
        Double mcxw7f = acx7f * hb7f * pf ;
        Double mcxw10f = acx10f * hb10f * pf ;
        Double mcxw11f = acx11f * hb11f * pf ;
        Double mcxw12nf = acx12nf * hb12nf * pf ;
        map.put("mcxw1f", mcxw1f);
        map.put("mcxw2f", mcxw2f);
        map.put("mcxw3f", mcxw3f);
        map.put("mcxw4f", mcxw4f);
        map.put("mcxw5f", mcxw5f);
        map.put("mcxw6f", mcxw6f);
        map.put("mcxw7f", mcxw7f);
        map.put("mcxw10f", mcxw10f);
        map.put("mcxw11f", mcxw11f);
        map.put("mcxw12nf", mcxw12nf);

        Double mzkf = mz1f + mz2f + mz3f + mz4f + mz5f + mz6f + mz7f ;
        Double mzqf = mz10f + mz11f + mz12nf ;
        Double mzz1f = Math.abs( mzqf - mzkf );
        Double mzz2f = mcxw1f + mcxw2f + mcxw3f + mcxw4f + mcxw5f + mcxw6f + mcxw7f + mcxw10f + mcxw11f + mcxw12nf ;
        Double szf = 1000 * mzz1f / wlzwx ;
        Double swf = 1000 * mzz2f / wlzwy ;
        Double smaxf = szf + swf ;
        map.put("mzkf", mzkf);
        map.put("mzqf", mzqf);
        map.put("mzz1f", mzz1f);
        map.put("mzz2f", mzz2f);
        map.put("szf", szf);
        map.put("swf", swf);
        map.put("smaxf", smaxf);

        //        非工作状态  稳定性
        Double pgzf = mwlzf * 10 ;
        Double sgf = pgzf / fef / wlza ;
        map.put("pgzf", pgzf);
        map.put("sgf", sgf);

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

        Double smax1 = doubleMap.get("smax1");
        String wlzb1 = takeSignByCompareNumber(smax1,236.67);
        String wlzm1 = takeStringByCompareNumber(smax1,236.67);
        map.put("wlzb1", CommonFunc.convertDoubleToString(wlzb1));
        map.put("wlzm1", CommonFunc.convertDoubleToString(wlzm1));

        Double sg1 = doubleMap.get("sg1");
        String wlzb2 = takeSignByCompareNumber(sg1,177.5);
        String wlzm2 = takeStringByCompareNumber(sg1,177.5);
        map.put("wlzb2", CommonFunc.convertDoubleToString(wlzb2));
        map.put("wlzm2", CommonFunc.convertDoubleToString(wlzm2));

        Double smaxf = doubleMap.get("smaxf");
        String wlzb3 = takeSignByCompareNumber(smaxf,236.67);
        String wlzm3 = takeStringByCompareNumber(smaxf,236.67);
        map.put("wlzb3", CommonFunc.convertDoubleToString(wlzb3));
        map.put("wlzm3", CommonFunc.convertDoubleToString(wlzm3));

        Double sgf = doubleMap.get("sgf");
        String wlzb4 = takeSignByCompareNumber(sgf,177.5);
        String wlzm4 = takeStringByCompareNumber(sgf,177.5);
        map.put("wlzb4", CommonFunc.convertDoubleToString(wlzb4));
        map.put("wlzm4", CommonFunc.convertDoubleToString(wlzm4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
