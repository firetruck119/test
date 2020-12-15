package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class SingleJibEntity {
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
    private Double lbd;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double acx5;
    private Double gruqhxs;
    private Double lbtzh;
    private Double ldcgh;
    private Double ldslzh;
    private Double mbmj;
    private Double ldbb;
    private Double ldbbz;
    private Double mdbb;
    private Double adbb;
    private Double dbmjb;

    //    提示提醒
    private String grutstx;

    private String dbgcph;
    private Double dbss;
    private Double dbjh;
    private Double dbjb;
    private Double dbje;
    private Double dbwx;
    private Double dbwy;
    private Double dbix;
    private Double dblm;
    private Double dbll;

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
    private Double m4jbcq;
    private Double m5db;

    private Double lslc;
    private Double lshlc;
    private Double lc1;
    private Double lc2;
    private Double lc3;
    private Double lc4;
    private Double lc5;

    private Double aslcx;
    private Double ashlcx;
    private Double acx1;
    private Double acx2;
    private Double acx3;
    private Double acx4cq;
    private Double acx5db;

    private Double lslx;
    private Double lshlx;
    private Double lx1;
    private Double lx2;
    private Double lx3;
    private Double lx4;
    private Double lx5;

    private Double lslwq;
    private Double lshlwq;
    private Double lwq1;
    private Double lwq2;
    private Double lwq3;

    private String dbjbModel;
    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;
    private String gruazModel;

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
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("gruqhxs", CommonFunc.convertDoubleToString(gruqhxs));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("mbmj", CommonFunc.convertDoubleToString(mbmj));
        map.put("ldbb", CommonFunc.convertDoubleToString(ldbb));
        map.put("ldbbz", CommonFunc.convertDoubleToString(ldbbz));
        map.put("mdbb", CommonFunc.convertDoubleToString(mdbb));
        map.put("adbb", CommonFunc.convertDoubleToString(adbb));
        map.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dbgcph", CommonFunc.convertDoubleToString(dbgcph));
        map.put("dbss", CommonFunc.convertDoubleToString(dbss));
        map.put("dbjh", CommonFunc.convertDoubleToString(dbjh));
        map.put("dbjb", CommonFunc.convertDoubleToString(dbjb));
        map.put("dbje", CommonFunc.convertDoubleToString(dbje));
        map.put("dbwx", CommonFunc.convertDoubleToString(dbwx));
        map.put("dbwy", CommonFunc.convertDoubleToString(dbwy));
        map.put("dbix", CommonFunc.convertDoubleToString(dbix));
        map.put("dblm", CommonFunc.convertDoubleToString(dblm));
        map.put("dbll", CommonFunc.convertDoubleToString(dbll));

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
        map.put("m4jbcq", CommonFunc.convertDoubleToString(m4jbcq));
        map.put("m5db", CommonFunc.convertDoubleToString(m5db));

        map.put("lslc", CommonFunc.convertDoubleToString(lslc));
        map.put("lshlc", CommonFunc.convertDoubleToString(lshlc));
        map.put("lc1", CommonFunc.convertDoubleToString(lc1));
        map.put("lc2", CommonFunc.convertDoubleToString(lc2));
        map.put("lc3", CommonFunc.convertDoubleToString(lc3));
        map.put("lc4", CommonFunc.convertDoubleToString(lc4));
        map.put("lc5", CommonFunc.convertDoubleToString(lc5));

        map.put("aslcx", CommonFunc.convertDoubleToString(aslcx));
        map.put("ashlcx", CommonFunc.convertDoubleToString(ashlcx));
        map.put("acx1", CommonFunc.convertDoubleToString(acx1));
        map.put("acx2", CommonFunc.convertDoubleToString(acx2));
        map.put("acx3", CommonFunc.convertDoubleToString(acx3));
        map.put("acx4cq", CommonFunc.convertDoubleToString(acx4cq));
        map.put("acx5db", CommonFunc.convertDoubleToString(acx5db));

        map.put("lslx", CommonFunc.convertDoubleToString(lslx));
        map.put("lshlx", CommonFunc.convertDoubleToString(lshlx));
        map.put("lx1", CommonFunc.convertDoubleToString(lx1));
        map.put("lx2", CommonFunc.convertDoubleToString(lx2));
        map.put("lx3", CommonFunc.convertDoubleToString(lx3));
        map.put("lx4", CommonFunc.convertDoubleToString(lx4));
        map.put("lx5", CommonFunc.convertDoubleToString(lx5));

        map.put("lslwq", CommonFunc.convertDoubleToString(lslwq));
        map.put("lshlwq", CommonFunc.convertDoubleToString(lshlwq));
        map.put("lwq1", CommonFunc.convertDoubleToString(lwq1));
        map.put("lwq2", CommonFunc.convertDoubleToString(lwq2));
        map.put("lwq3", CommonFunc.convertDoubleToString(lwq3));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Double m4jbhzq = mdbb + ( dblm - ldbbz + dbll / 2 ) * mbmj / 1000 ;
        Double lslhz = lbd;
        Double lshlhz = lbd - ( ldcgh - lbtzh ) ;
        Double lhz1 = lshlhz ;
        Double lhz2;
        if ( m2 == 0 ) {
            lhz2 = 0.0 ;
        } else {
            lhz2 = lc2 + dbll / 2000 ;
        }
        Double lhz3 = lshlhz ;
        Double lhzjb4 = ( mdbb * ( dblm - ldbb + dbll / 2 ) / 1000 + ( dblm - ldbbz + dbll / 2 ) * mbmj * ( dblm - ldbbz + dbll / 2 ) / 2000000 ) / m4jbhzq ;
        Double lhz5;
        if ( m5db == 0 ) {
            lhz5 = 0.0 ;
        } else {
            lhz5 = lc5 + dbll / 2000 ;
        }

        Double mslhz = tsl * lslhz ;
        Double mshlhz = tshl * lshlhz ;
        Double mhz1 = m1 * lhz1 ;
        Double mhz2 = m2 * lhz2 ;
        Double mhz3 = m3 * lhz3 ;
        Double mhz4 = m4jbhzq * lhzjb4 ;
        Double mhz5 = m5db * lhz5 ;
        Double mjbhz = mslhz + mshlhz + mhz1 + mhz2 + mhz3 + mhz4 + mhz5 ;
        String dbwjyb;
        if ( mjbhz < dbmjb ) {
            dbwjyb = "<" ;
        } else if ( mjbhz == dbmjb ) {
            dbwjyb = "=";
        } else{
            dbwjyb = ">";
        }
        String dbwjym = (mjbhz <= dbmjb) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("lbd", CommonFunc.convertDoubleToString(lbd));
        result.put("dblm", CommonFunc.convertDoubleToString(dblm));
        result.put("dbll", CommonFunc.convertDoubleToString(dbll));
        result.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        result.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        result.put("mdbb", CommonFunc.convertDoubleToString(mdbb));
        result.put("ldbb", CommonFunc.convertDoubleToString(ldbb));
        result.put("ldbbz", CommonFunc.convertDoubleToString(ldbbz));
        result.put("mbmj", CommonFunc.convertDoubleToString(mbmj));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m5db", CommonFunc.convertDoubleToString(m5db));
        result.put("lc2", CommonFunc.convertDoubleToString(lc2));
        result.put("lc5", CommonFunc.convertDoubleToString(lc5));
        result.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        result.put("m4jbhzq", CommonFunc.convertDoubleToString(m4jbhzq));
        result.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        result.put("lshlhz", CommonFunc.convertDoubleToString(lshlhz));
        result.put("lhz1", CommonFunc.convertDoubleToString(lhz1));
        result.put("lhz2", CommonFunc.convertDoubleToString(lhz2));
        result.put("lhz3", CommonFunc.convertDoubleToString(lhz3));
        result.put("lhzjb4", CommonFunc.convertDoubleToString(lhzjb4));
        result.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        result.put("mslhz", CommonFunc.convertDoubleToString(mslhz));
        result.put("mshlhz", CommonFunc.convertDoubleToString(mshlhz));
        result.put("mhz1", CommonFunc.convertDoubleToString(mhz1));
        result.put("mhz2", CommonFunc.convertDoubleToString(mhz2));
        result.put("mhz3", CommonFunc.convertDoubleToString(mhz3));
        result.put("mhz4", CommonFunc.convertDoubleToString(mhz4));
        result.put("mhz5", CommonFunc.convertDoubleToString(mhz5));
        result.put("mjbhz", CommonFunc.convertDoubleToString(mjbhz));
        result.put("dbwjyb", CommonFunc.convertDoubleToString(dbwjyb));
        result.put("dbwjym", CommonFunc.convertDoubleToString(dbwjym));

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        Double mslza= 1.25 * 10 * tsl * lslc ;
        Double mshlza= 1.25 * 10 * tshl * lshlc ;
        Double mza1= 1.25 * 10 * m1 * lc1 ;
        Double mza2= 1.25 * 10 * m2 * lc2 ;
        Double mza3= 1.25 * 10 * m3 * lc3 ;
        Double mza4= 1.25 * 10 * m4jbcq * lc4 ;
        Double mza5= 1.25 * 10 * m5db * lc5 ;
        map.put("mslza", mslza);
        map.put("mshlza", mshlza);
        map.put("mza1", mza1);
        map.put("mza2", mza2);
        map.put("mza3", mza3);
        map.put("mza4", mza4);
        map.put("mza5", mza5);

        Double mslwa = p * 1.25 * aslcx * lslx ;
        Double mshlwa = p * 1.25 * ashlcx * lshlx ;
        Double mwa1 = p * 1.25 * acx1 * lx1 ;
        Double mwa2 = p * 1.25 * acx2 * lx2 ;
        Double mwa3 = p * 1.25 * acx3 * lx3 ;
        Double mwa4 = p * 1.25 * acx4cq * lx4 ;
        Double mwa5 = p * 1.25 * acx5db * lx5 ;
        map.put("mslwa", mslwa);
        map.put("mshlwa", mshlwa);
        map.put("mwa1", mwa1);
        map.put("mwa2", mwa2);
        map.put("mwa3", mwa3);
        map.put("mwa4", mwa4);
        map.put("mwa5", mwa5);

        Double mz = mslza + mshlza + mza1 + mza2 + mza3 + mza4 + mza5 ;
        Double sz = 1000 * mz / dbwx ;
        Double mw = mslwa + mshlwa + mwa1 + mwa2 + mwa3 + mwa4 + mwa5 ;
        Double sw = 1000 * mw / dbwy ;
        Double smax = sz + sw ;
        Double ssqd = dbss / 1.5 / 1.1 ;
        map.put("mz", mz);
        map.put("sz", sz);
        map.put("mw", mw);
        map.put("sw", sw);
        map.put("smax", smax);
        map.put("ssqd", ssqd);

        Double mslwq = 1.25 * 10 * tsl * lslwq ;
        Double mshlwq = 1.25 * 10 * tshl * lshlwq ;
        Double mwq1 = 1.25 * 10 * m1 * lwq1 ;
        Double mwq2 = 1.25 * 10 * m2 * lwq2 ;
        Double mwq3 = 1.25 * 10 * m3 * lwq3 ;
        map.put("mslwq", mslwq);
        map.put("mshlwq", mshlwq);
        map.put("mwq1", mwq1);
        map.put("mwq2", mwq2);
        map.put("mwq3", mwq3);

        Double kn = dblm / dbll ;
        Double mwz = tsl + tshl + m1 + m2 + m3 ;
        Double f1 = 1.25 * mwz * 10 * dblm * dblm * dbll * ( 1 + kn ) / 3 / 210000 / dbix ;
        Double mwq = mslwq + mshlwq + mwq1 + mwq2 + mwq3 ;
        Double f2 = 1000 * mwq * dblm * dbll * ( 1 + 2 * kn ) / 4 / 210000 / dbix ;
        Double q = ( m4jbcq + m5db ) * 10 / dblm ;
        Double f3 = 1.25 * q * dblm * dblm * dblm * dbll * ( 4 + 3 * kn ) / 24 / 210000 / dbix ;
        Double f = f1 + f2 + f3 ;
        Double nd = dblm * dblm / 1000000 ;
        map.put("kn", kn);
        map.put("mwz", mwz);
        map.put("f1", f1);
        map.put("mwq", mwq);
        map.put("f2", f2);
        map.put("q", q);
        map.put("f3", f3);
        map.put("f", f);
        map.put("nd", nd);

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
//    private String takeEnStringByCompareNumber(Double a, Double b) {
//        if (a > b) {
//            return "doesn't meet";
//        } else {
//            return "meets";
//        }
//    }
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
        Double smax = doubleMap.get("smax");
        Double ssqd = doubleMap.get("ssqd");
        String dbb1 = takeSignByCompareNumber(smax, ssqd);
        String dbm1 = takeStringByCompareNumber(smax, ssqd);
        map.put("dbb1", CommonFunc.convertDoubleToString(dbb1));
        map.put("dbm1", CommonFunc.convertDoubleToString(dbm1));

        Double f = doubleMap.get("f");
        Double nd = doubleMap.get("nd");
        String dbb2 = takeSignByCompareNumber(f, nd);
        String dbm2 = takeStringByCompareNumber(f, nd);
        map.put("dbb2", CommonFunc.convertDoubleToString(dbb2));
        map.put("dbm2", CommonFunc.convertDoubleToString(dbm2));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
