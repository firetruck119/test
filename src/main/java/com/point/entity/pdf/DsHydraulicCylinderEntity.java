package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class DsHydraulicCylinderEntity {
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
    private Double lbx;
    private Double llzyyg;
    private Double dldcw;
    private Double lwlzbg;

    private Double dsdd;
    private Double dsxd;
    private Double dsi;
    private Double dslltl;
    private Double dsgcyl;
    private Double dslb;
    private Double dslbf;
    private Double dsn1;
    private Double dsn;
    private Double dsnk;
    private Double dsk;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double grudsxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double dslltlf;
    private Double dslltlk;
    private Double dslltlfk;
    private Double dsdlr;

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

    private Double tsldsp;
    private Double tshldsp;
    private Double m5dsp;
    private Double mwlzf;

    private Double lslhzf;
    private Double lshlhzf;
    private Double lhzf1;
    private Double lhzf2;
    private Double lhzf3;
    private Double lhzf4;
    private Double lhzf5;
    private Double lhzf6;
    private Double lhzf7;
    private Double lhzf10;
    private Double lhzf11;
    private Double lhzf12n;

    private Double lslfy;
    private Double lshlfy;
    private Double lfy1;
    private Double lfy2;
    private Double lfy3;
    private Double lfy4;
    private Double lfy5;
    private Double lfy6;
    private Double lfy7;
    private Double lfy10;
    private Double lfy11;
    private Double lfy12n;

    private Double aslftx;
    private Double ashlftx;
    private Double aftx1;
    private Double aftx2;
    private Double aftx3;
    private Double aftx4;
    private Double aftx5ds;
    private Double aftx6;
    private Double aftx7;
    private Double aftx10;
    private Double aftx11;
    private Double aftx12n;

    private Double hslfb;
    private Double hshlfb;
    private Double hfb1;
    private Double hfb2;
    private Double hfb3;
    private Double hfb4;
    private Double hfb5;
    private Double hfb6;
    private Double hfb7;
    private Double hfb10;
    private Double hfb11;
    private Double hfb12n;

    private String dsyygModel;
    private String btModel;
    private String dcModel;
    private String dcgssModel;
    private String gruModel;
    private String ffbbModel;
    private String dlxhxzModel;
    private String grudsModel;
    private String dsyygezModel;


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
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("llzyyg", CommonFunc.convertDoubleToString(llzyyg));
        map.put("dldcw", CommonFunc.convertDoubleToString(dldcw));
        map.put("lwlzbg", CommonFunc.convertDoubleToString(lwlzbg));

        map.put("dsdd", CommonFunc.convertDoubleToString(dsdd));
        map.put("dsxd", CommonFunc.convertDoubleToString(dsxd));
        map.put("dsi", CommonFunc.convertDoubleToString(dsi));
        map.put("dslltl", CommonFunc.convertDoubleToString(dslltl));
        map.put("dsgcyl", CommonFunc.convertDoubleToString(dsgcyl));
        map.put("dslb", CommonFunc.convertDoubleToString(dslb));
        map.put("dslbf", CommonFunc.convertDoubleToString(dslbf));
        map.put("dsn1", CommonFunc.convertDoubleToString(dsn1));
        map.put("dsn", CommonFunc.convertDoubleToString(dsn));
        map.put("dsnk", CommonFunc.convertDoubleToString(dsnk));
        map.put("dsk", CommonFunc.convertDoubleToString(dsk));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("grudsxs", CommonFunc.convertDoubleToString(grudsxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("dslltlf", CommonFunc.convertDoubleToString(dslltlf));
        map.put("dslltlk", CommonFunc.convertDoubleToString(dslltlk));
        map.put("dslltlfk", CommonFunc.convertDoubleToString(dslltlfk));
        map.put("dsdlr", CommonFunc.convertDoubleToString(dsdlr));

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

        map.put("tsldsp", CommonFunc.convertDoubleToString(tsldsp));
        map.put("tshldsp", CommonFunc.convertDoubleToString(tshldsp));
        map.put("m5dsp", CommonFunc.convertDoubleToString(m5dsp));
        map.put("mwlzf", CommonFunc.convertDoubleToString(mwlzf));

        map.put("lslhzf", CommonFunc.convertDoubleToString(lslhzf));
        map.put("lshlhzf", CommonFunc.convertDoubleToString(lshlhzf));
        map.put("lhzf1", CommonFunc.convertDoubleToString(lhzf1));
        map.put("lhzf2", CommonFunc.convertDoubleToString(lhzf2));
        map.put("lhzf3", CommonFunc.convertDoubleToString(lhzf3));
        map.put("lhzf4", CommonFunc.convertDoubleToString(lhzf4));
        map.put("lhzf5", CommonFunc.convertDoubleToString(lhzf5));
        map.put("lhzf6", CommonFunc.convertDoubleToString(lhzf6));
        map.put("lhzf7", CommonFunc.convertDoubleToString(lhzf7));
        map.put("lhzf10", CommonFunc.convertDoubleToString(lhzf10));
        map.put("lhzf11", CommonFunc.convertDoubleToString(lhzf11));
        map.put("lhzf12n", CommonFunc.convertDoubleToString(lhzf12n));

        map.put("lslfy", CommonFunc.convertDoubleToString(lslfy));
        map.put("lshlfy", CommonFunc.convertDoubleToString(lshlfy));
        map.put("lfy1", CommonFunc.convertDoubleToString(lfy1));
        map.put("lfy2", CommonFunc.convertDoubleToString(lfy2));
        map.put("lfy3", CommonFunc.convertDoubleToString(lfy3));
        map.put("lfy4", CommonFunc.convertDoubleToString(lfy4));
        map.put("lfy5", CommonFunc.convertDoubleToString(lfy5));
        map.put("lfy6", CommonFunc.convertDoubleToString(lfy6));
        map.put("lfy7", CommonFunc.convertDoubleToString(lfy7));
        map.put("lfy10", CommonFunc.convertDoubleToString(lfy10));
        map.put("lfy11", CommonFunc.convertDoubleToString(lfy11));
        map.put("lfy12n", CommonFunc.convertDoubleToString(lfy12n));

        map.put("aslftx", CommonFunc.convertDoubleToString(aslftx));
        map.put("ashlftx", CommonFunc.convertDoubleToString(ashlftx));
        map.put("aftx1", CommonFunc.convertDoubleToString(aftx1));
        map.put("aftx2", CommonFunc.convertDoubleToString(aftx2));
        map.put("aftx3", CommonFunc.convertDoubleToString(aftx3));
        map.put("aftx4", CommonFunc.convertDoubleToString(aftx4));
        map.put("aftx5ds", CommonFunc.convertDoubleToString(aftx5ds));
        map.put("aftx6", CommonFunc.convertDoubleToString(aftx6));
        map.put("aftx7", CommonFunc.convertDoubleToString(aftx7));
        map.put("aftx10", CommonFunc.convertDoubleToString(aftx10));
        map.put("aftx11", CommonFunc.convertDoubleToString(aftx11));
        map.put("aftx12n", CommonFunc.convertDoubleToString(aftx12n));

        map.put("hslfb", CommonFunc.convertDoubleToString(hslfb));
        map.put("hshlfb", CommonFunc.convertDoubleToString(hshlfb));
        map.put("hfb1", CommonFunc.convertDoubleToString(hfb1));
        map.put("hfb2", CommonFunc.convertDoubleToString(hfb2));
        map.put("hfb3", CommonFunc.convertDoubleToString(hfb3));
        map.put("hfb4", CommonFunc.convertDoubleToString(hfb4));
        map.put("hfb5", CommonFunc.convertDoubleToString(hfb5));
        map.put("hfb6", CommonFunc.convertDoubleToString(hfb6));
        map.put("hfb7", CommonFunc.convertDoubleToString(hfb7));
        map.put("hfb10", CommonFunc.convertDoubleToString(hfb10));
        map.put("hfb11", CommonFunc.convertDoubleToString(hfb11));
        map.put("hfb12n", CommonFunc.convertDoubleToString(hfb12n));

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

//        工况1
        Double fs = mwlz * 10 ;
        Double fsn = dsn * fs / dsn1 ;
        Double fsnk = fsn / 1000 ;
        map.put("fs", fs);
        map.put("fsn", fsn);
        map.put("fsnk", fsnk);

        Double fk = 3.14 * 3.14 * 180000 * dsi / 1000000 / dsk / dsk / dslb / dslb ;
        Double fkn = fk / dsnk ;
        Double f1 = fs ;
        Double fknk = fkn / 1000 ;
        Double f1k = f1 / 1000 ;
        map.put("fk", fk);
        map.put("fkn", fkn);
        map.put("f1", f1);
        map.put("fknk", fknk);
        map.put("f1k", f1k);

//工况2
        Double mf5 = m5dsp * lfy5 * 10 ;
        Double mf10 = m10 * lfy10 * 10 ;
        Double mf11 = m11 * lfy11 * 10 ;
        Double mf12n = m12n * lfy12n * 10 ;
        map.put("mf5", mf5);
        map.put("mf10", mf10);
        map.put("mf11", mf11);
        map.put("mf12n", mf12n);

        Double mslwf = p * aslftx * hslfb ;
        Double mshlwf = p * ashlftx * hshlfb ;
        Double mwf1 = p * aftx1 * hfb1 ;
        Double mwf2 = p * aftx2 * hfb2 ;
        Double mwf3 = p * aftx3 * hfb3 ;
        Double mwf4 = p * aftx4 * hfb4 ;
        Double mwf5 = p * aftx5ds * hfb5 ;
        Double mwf6 = p * aftx6 * hfb6 ;
        Double mwf7 = p * aftx7 * hfb7 ;
        Double mwf10 = p * aftx10 * hfb10 ;
        Double mwf11 = p * aftx11 * hfb11 ;
        Double mwf12n = p * aftx12n * hfb12n ;
        map.put("mslwf", mslwf);
        map.put("mshlwf", mshlwf);
        map.put("mwf1", mwf1);
        map.put("mwf2", mwf2);
        map.put("mwf3", mwf3);
        map.put("mwf4", mwf4);
        map.put("mwf5", mwf5);
        map.put("mwf6", mwf6);
        map.put("mwf7", mwf7);
        map.put("mwf10", mwf10);
        map.put("mwf11", mwf11);
        map.put("mwf12n", mwf12n);

        Double mslf = tsldsp * lslfy * 10 ;
        Double mshlf = tshldsp * lshlfy * 10 ;
        Double mf1 = m1 * lfy1 * 10 ;
        Double mf2 = m2 * lfy2 * 10 ;
        Double mf3 = m3 * lfy3 * 10 ;
        Double mf4 = m4 * lfy4 * 10 ;
        Double mf6 = m6 * lfy6 * 10 ;
        Double mf7 = m7 * lfy7 * 10 ;
        map.put("mslf", mslf);
        map.put("mshlf", mshlf);
        map.put("mf1", mf1);
        map.put("mf2", mf2);
        map.put("mf3", mf3);
        map.put("mf4", mf4);
        map.put("mf6", mf6);
        map.put("mf7", mf7);

        Double mgzf = mf5 + mf10 + mf11 + mf12n ;
        Double mgwf = mslwf + mshlwf + mwf1 + mwf2 + mwf3 + mwf4 + mwf5 + mwf6 + mwf7 + mwf10 + mwf11 + mwf12n ;
        Double mgkf = mslf + mshlf + mf1 + mf2 + mf3 + mf4 + mf6 + mf7 ;
        Double gf = mwlzf * 10 ;
        Double mgqf = mgzf + mgwf ;
        Double fglf = ( mgqf - mgkf ) / lwlzbg / 2 ;
        Double ff = 0.05 * fglf / dsdlr ;
        Double fsf = gf + ff ;
        Double fsnf = dsn * fsf / dsn1 ;
        Double fsnfk = fsnf / 1000 ;
        map.put("mgzf", mgzf);
        map.put("mgwf", mgwf);
        map.put("mgkf", mgkf);
        map.put("gf", gf);
        map.put("mgqf", mgqf);
        map.put("fglf", fglf);
        map.put("ff", ff);
        map.put("fsf", fsf);
        map.put("fsnf", fsnf);
        map.put("fsnfk", fsnfk);

        Double fkf = 3.14 * 3.14 * 180000 * dsi / 1000000 / dsk / dsk / dslbf / dslbf ;
        Double fknf = fkf / dsnk ;
        Double f2 = fsf ;
        Double fknfk = fknf / 1000 ;
        Double f2k = f2 / 1000 ;
        map.put("fkf", fkf);
        map.put("fknf", fknf);
        map.put("f2", f2);
        map.put("fknfk", fknfk);
        map.put("f2k", f2k);

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

        Double fsn = doubleMap.get("fsn");
        String dsb1 = takeSignByCompareNumber(fsn,dslltl);
        String dsm1 = takeStringByCompareNumber(fsn,dslltl);
        map.put("dsb1", CommonFunc.convertDoubleToString(dsb1));
        map.put("dsm1", CommonFunc.convertDoubleToString(dsm1));

        Double f1 = doubleMap.get("f1");
        Double fkn = doubleMap.get("fkn");
        String dsb2 = takeSignByCompareNumber(f1,fkn);
        String dsm2 = takeStringByCompareNumber(f1,fkn);
        map.put("dsb2", CommonFunc.convertDoubleToString(dsb2));
        map.put("dsm2", CommonFunc.convertDoubleToString(dsm2));

        Double fsnf = doubleMap.get("fsnf");
        String dsb3 = takeSignByCompareNumber(fsnf,dslltl);
        String dsm3 = takeStringByCompareNumber(fsnf,dslltl);
        map.put("dsb3", CommonFunc.convertDoubleToString(dsb3));
        map.put("dsm3", CommonFunc.convertDoubleToString(dsm3));

        Double f2 = doubleMap.get("f2");
        Double fknf = doubleMap.get("fknf");
        String dsb4 = takeSignByCompareNumber(f2,fknf);
        String dsm4 = takeStringByCompareNumber(f2,fknf);
        map.put("dsb4", CommonFunc.convertDoubleToString(dsb4));
        map.put("dsm4", CommonFunc.convertDoubleToString(dsm4));


        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
