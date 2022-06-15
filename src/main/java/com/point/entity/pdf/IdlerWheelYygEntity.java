package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class IdlerWheelYygEntity {
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

    private String dsglxs;
    private Double bfb;

    private Double atx5;
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

    private Double h;
    private Double p;
    private Double pf;
    private Double lbd;
    private Double lbx;
    private Double llzyyg;
    private Double lwlzbg;
    private Double lbggd;

    private String lzglxh;
    private Double dldcw;
    private Double dlbcw;
    private String lzglzcxh;
    private Double cr;
    private Double c0r;
    private Double dlzcd;
    private Double ndlsl;
    private Double tzcb;
    private Double rzcb;
    private Double azcb;
    private Double zcbfky;
    private Double zcsm;
    private Double fh;

    private Double dsdd;
    private Double dsxd;
    private Double dsi;
    private Double dslltl;
    private Double dsgcyl;
    private Double dslb;
    private Double dsn1;
    private Double dsn;
    private Double dsnk;
    private Double dsk;

    //    提示提醒
    private String grutstx;

    private Double jzwts;
    private Double jzmwlz;
    private Double jzmwlzi;

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
    private Double mwlzi;

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

    private Double asltx;
    private Double ashltx;
    private Double atx1;
    private Double atx2;
    private Double atx3;
    private Double atx4;
    private Double atx5ds;
    private Double atx6;
    private Double atx7;
    private Double atx10;
    private Double atx11;
    private Double atx12n;

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

    private Double lslhzi;
    private Double lshlhzi;
    private Double lhz1i;
    private Double lhz2i;
    private Double lhz3i;
    private Double lhz4i;
    private Double lhz5i;
    private Double lhz6i;
    private Double lhz7i;
    private Double lhz10i;
    private Double lhz11i;
    private Double lhz12ni;

    private Double asltxi;
    private Double ashltxi;
    private Double atx1i;
    private Double atx2i;
    private Double atx3i;
    private Double atx4i;
    private Double atx5dsi;
    private Double atx6i;
    private Double atx7i;
    private Double atx10i;
    private Double atx11i;
    private Double atx12ni;

    private Double hslbi;
    private Double hshlbi;
    private Double hb1i;
    private Double hb2i;
    private Double hb3i;
    private Double hb4i;
    private Double hb5i;
    private Double hb6i;
    private Double hb7i;
    private Double hb10i;
    private Double hb11i;
    private Double hb12ni;

    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;
    private String grudsModel;

    private String dlxhxzModel;
    private String sfsglxzModel;
    private String zcsmxzModel;

    private String dsyygModel;
    private String dsyygezModel;

    private String dsyygwzModel;

    private String xljzsyModel;//静载试验选择

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

        map.put("dsglxs", CommonFunc.convertDoubleToString(dsglxs));
        map.put("bfb", CommonFunc.convertDoubleToString(bfb));

        map.put("atx5", CommonFunc.convertDoubleToString(atx5));
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

        map.put("h", CommonFunc.convertDoubleToString(h));
        map.put("p", CommonFunc.convertDoubleToString(p));
        map.put("pf", CommonFunc.convertDoubleToString(pf));
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("llzyyg", CommonFunc.convertDoubleToString(llzyyg));
        map.put("lwlzbg", CommonFunc.convertDoubleToString(lwlzbg));
        map.put("lbggd", CommonFunc.convertDoubleToString(lbggd));

        map.put("lzglxh", CommonFunc.convertDoubleToString(lzglxh));
        map.put("dldcw", CommonFunc.convertDoubleToString(dldcw));
        map.put("dlbcw", CommonFunc.convertDoubleToString(dlbcw));
        map.put("lzglzcxh", CommonFunc.convertDoubleToString(lzglzcxh));
        map.put("cr", CommonFunc.convertDoubleToString(cr));
        map.put("c0r", CommonFunc.convertDoubleToString(c0r));
        map.put("dlzcd", CommonFunc.convertDoubleToString(dlzcd));
        map.put("ndlsl", CommonFunc.convertDoubleToString(ndlsl));
        map.put("tzcb", CommonFunc.convertDoubleToString(tzcb));
        map.put("rzcb", CommonFunc.convertDoubleToString(rzcb));
        map.put("azcb", CommonFunc.convertDoubleToString(azcb));
        map.put("zcbfky", CommonFunc.convertDoubleToString(zcbfky));
        map.put("zcsm", CommonFunc.convertDoubleToString(zcsm));
        map.put("fh", CommonFunc.convertDoubleToString(fh));

        map.put("dsdd", CommonFunc.convertDoubleToString(dsdd));
        map.put("dsxd", CommonFunc.convertDoubleToString(dsxd));
        map.put("dsi", CommonFunc.convertDoubleToString(dsi));
        map.put("dslltl", CommonFunc.convertDoubleToString(dslltl));
        map.put("dsgcyl", CommonFunc.convertDoubleToString(dsgcyl));
        map.put("dslb", CommonFunc.convertDoubleToString(dslb));
        map.put("dsn1", CommonFunc.convertDoubleToString(dsn1));
        map.put("dsn", CommonFunc.convertDoubleToString(dsn));
        map.put("dsnk", CommonFunc.convertDoubleToString(dsnk));
        map.put("dsk", CommonFunc.convertDoubleToString(dsk));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("jzwts", CommonFunc.convertDoubleToString(jzwts));
        map.put("jzmwlz", CommonFunc.convertDoubleToString(jzmwlz));
        map.put("jzmwlzi", CommonFunc.convertDoubleToString(jzmwlzi));

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
        map.put("mwlzi", CommonFunc.convertDoubleToString(mwlzi));

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

        map.put("asltx", CommonFunc.convertDoubleToString(asltx));
        map.put("ashltx", CommonFunc.convertDoubleToString(ashltx));
        map.put("atx1", CommonFunc.convertDoubleToString(atx1));
        map.put("atx2", CommonFunc.convertDoubleToString(atx2));
        map.put("atx3", CommonFunc.convertDoubleToString(atx3));
        map.put("atx4", CommonFunc.convertDoubleToString(atx4));
        map.put("atx5ds", CommonFunc.convertDoubleToString(atx5ds));
        map.put("atx6", CommonFunc.convertDoubleToString(atx6));
        map.put("atx7", CommonFunc.convertDoubleToString(atx7));
        map.put("atx10", CommonFunc.convertDoubleToString(atx10));
        map.put("atx11", CommonFunc.convertDoubleToString(atx11));
        map.put("atx12n", CommonFunc.convertDoubleToString(atx12n));

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

        map.put("lslhzi", CommonFunc.convertDoubleToString(lslhzi));
        map.put("lshlhzi", CommonFunc.convertDoubleToString(lshlhzi));
        map.put("lhz1i", CommonFunc.convertDoubleToString(lhz1i));
        map.put("lhz2i", CommonFunc.convertDoubleToString(lhz2i));
        map.put("lhz3i", CommonFunc.convertDoubleToString(lhz3i));
        map.put("lhz4i", CommonFunc.convertDoubleToString(lhz4i));
        map.put("lhz5i", CommonFunc.convertDoubleToString(lhz5i));
        map.put("lhz6i", CommonFunc.convertDoubleToString(lhz6i));
        map.put("lhz7i", CommonFunc.convertDoubleToString(lhz7i));
        map.put("lhz10i", CommonFunc.convertDoubleToString(lhz10i));
        map.put("lhz11i", CommonFunc.convertDoubleToString(lhz11i));
        map.put("lhz12ni", CommonFunc.convertDoubleToString(lhz12ni));

        map.put("asltxi", CommonFunc.convertDoubleToString(asltxi));
        map.put("ashltxi", CommonFunc.convertDoubleToString(ashltxi));
        map.put("atx1i", CommonFunc.convertDoubleToString(atx1i));
        map.put("atx2i", CommonFunc.convertDoubleToString(atx2i));
        map.put("atx3i", CommonFunc.convertDoubleToString(atx3i));
        map.put("atx4i", CommonFunc.convertDoubleToString(atx4i));
        map.put("atx5dsi", CommonFunc.convertDoubleToString(atx5dsi));
        map.put("atx6i", CommonFunc.convertDoubleToString(atx6i));
        map.put("atx7i", CommonFunc.convertDoubleToString(atx7i));
        map.put("atx10i", CommonFunc.convertDoubleToString(atx10i));
        map.put("atx11i", CommonFunc.convertDoubleToString(atx11i));
        map.put("atx12ni", CommonFunc.convertDoubleToString(atx12ni));

        map.put("hslbi", CommonFunc.convertDoubleToString(hslbi));
        map.put("hshlbi", CommonFunc.convertDoubleToString(hshlbi));
        map.put("hb1i", CommonFunc.convertDoubleToString(hb1i));
        map.put("hb2i", CommonFunc.convertDoubleToString(hb2i));
        map.put("hb3i", CommonFunc.convertDoubleToString(hb3i));
        map.put("hb4i", CommonFunc.convertDoubleToString(hb4i));
        map.put("hb5i", CommonFunc.convertDoubleToString(hb5i));
        map.put("hb6i", CommonFunc.convertDoubleToString(hb6i));
        map.put("hb7i", CommonFunc.convertDoubleToString(hb7i));
        map.put("hb10i", CommonFunc.convertDoubleToString(hb10i));
        map.put("hb11i", CommonFunc.convertDoubleToString(hb11i));
        map.put("hb12ni", CommonFunc.convertDoubleToString(hb12ni));

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

        if (xljzsyModel.equals("常规工况")) {
//        工况1
            Double mslz = tsl * lslhz * 10;
            Double mshlz = tshl * lshlhz * 10;
            Double mz1 = m1 * lhz1 * 10;
            Double mz2 = m2 * lhz2 * 10;
            Double mz3 = m3 * lhz3 * 10;
            Double mz4 = m4 * lhz4 * 10;
            Double mz5 = m5ds * lhz5 * 10;
            Double mz6 = m6 * lhz6 * 10;
            Double mz7 = m7 * lhz7 * 10;
            map.put("mslz", mslz);
            map.put("mshlz", mshlz);
            map.put("mz1", mz1);
            map.put("mz2", mz2);
            map.put("mz3", mz3);
            map.put("mz4", mz4);
            map.put("mz5", mz5);
            map.put("mz6", mz6);
            map.put("mz7", mz7);

            Double mz10 = m10 * lhz10 * 10;
            Double mz11 = m11 * lhz11 * 10;
            Double mz12n = m12n * lhz12n * 10;
            map.put("mz10", mz10);
            map.put("mz11", mz11);
            map.put("mz12n", mz12n);

            Double msltxw = asltx * hslb * p;
            Double mshltxw = ashltx * hshlb * p;
            Double mtxw1 = atx1 * hb1 * p;
            Double mtxw2 = atx2 * hb2 * p;
            Double mtxw3 = atx3 * hb3 * p;
            Double mtxw4 = atx4 * hb4 * p;
            Double mtxw5 = atx5ds * hb5 * p;
            Double mtxw6 = atx6 * hb6 * p;
            Double mtxw7 = atx7 * hb7 * p;
            Double mtxw10 = atx10 * hb10 * p;
            Double mtxw11 = atx11 * hb11 * p;
            Double mtxw12n = atx12n * hb12n * p;
            map.put("msltxw", msltxw);
            map.put("mshltxw", mshltxw);
            map.put("mtxw1", mtxw1);
            map.put("mtxw2", mtxw2);
            map.put("mtxw3", mtxw3);
            map.put("mtxw4", mtxw4);
            map.put("mtxw5", mtxw5);
            map.put("mtxw6", mtxw6);
            map.put("mtxw7", mtxw7);
            map.put("mtxw10", mtxw10);
            map.put("mtxw11", mtxw11);
            map.put("mtxw12n", mtxw12n);

            Double t1 = mwlz * 10;
            Double mgq1 = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 + mz6 + mz7;
            Double mgk1 = mz10 + mz11 + mz12n;
            Double mgw1 = msltxw + mshltxw + mtxw1 + mtxw2 + mtxw3 + mtxw4 + mtxw5 + mtxw6 + mtxw7 + mtxw10 + mtxw11 + mtxw12n;
            Double mg1;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                mg1 = Math.abs(mgq1 - mgk1 - t1 * llzyyg) + mgw1;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                mg1 = Math.abs(mgq1 - mgk1 + t1 * llzyyg) + mgw1;
            } else {
                mg1 = null;
            }
            Double ngl1 = mg1 / lwlzbg;
            map.put("t1", t1);
            map.put("mgq1", mgq1);
            map.put("mgk1", mgk1);
            map.put("mgw1", mgw1);
            map.put("mg1", mg1);
            map.put("ngl1", ngl1);

//        工况2
            Double mslzi = tsl * lslhzi * 10;
            Double mshlzi = tshl * lshlhzi * 10;
            Double mz1i = m1 * lhz1i * 10;
            Double mz2i = m2 * lhz2i * 10;
            Double mz3i = m3 * lhz3i * 10;
            Double mz4i = m4 * lhz4i * 10;
            Double mz5i = m5dsp * lhz5i * 10;
            Double mz6i = m6 * lhz6i * 10;
            Double mz7i = m7 * lhz7i * 10;
            map.put("mslzi", mslzi);
            map.put("mshlzi", mshlzi);
            map.put("mz1i", mz1i);
            map.put("mz2i", mz2i);
            map.put("mz3i", mz3i);
            map.put("mz4i", mz4i);
            map.put("mz5i", mz5i);
            map.put("mz6i", mz6i);
            map.put("mz7i", mz7i);

            Double mz10i = m10 * lhz10i * 10;
            Double mz11i = m11 * lhz11i * 10;
            Double mz12ni = m12n * lhz12ni * 10;
            map.put("mz10i", mz10i);
            map.put("mz11i", mz11i);
            map.put("mz12ni", mz12ni);

            Double msltxwi = asltxi * hslbi * p;
            Double mshltxwi = ashltxi * hshlbi * p;
            Double mtxw1i = atx1i * hb1i * p;
            Double mtxw2i = atx2i * hb2i * p;
            Double mtxw3i = atx3i * hb3i * p;
            Double mtxw4i = atx4i * hb4i * p;
            Double mtxw5i = atx5dsi * hb5i * p;
            Double mtxw6i = atx6i * hb6i * p;
            Double mtxw7i = atx7i * hb7i * p;
            Double mtxw10i = atx10i * hb10i * p;
            Double mtxw11i = atx11i * hb11i * p;
            Double mtxw12ni = atx12ni * hb12ni * p;
            map.put("msltxwi", msltxwi);
            map.put("mshltxwi", mshltxwi);
            map.put("mtxw1i", mtxw1i);
            map.put("mtxw2i", mtxw2i);
            map.put("mtxw3i", mtxw3i);
            map.put("mtxw4i", mtxw4i);
            map.put("mtxw5i", mtxw5i);
            map.put("mtxw6i", mtxw6i);
            map.put("mtxw7i", mtxw7i);
            map.put("mtxw10i", mtxw10i);
            map.put("mtxw11i", mtxw11i);
            map.put("mtxw12ni", mtxw12ni);

            Double mgq2 = mslzi + mshlzi + mz1i + mz2i + mz3i + mz4i + mz5i + mz6i + mz7i;
            Double mgk2 = mz10i + mz11i + mz12ni;
            Double mgw2 = msltxwi + mshltxwi + mtxw1i + mtxw2i + mtxw3i + mtxw4i + mtxw5i + mtxw6i + mtxw7i + mtxw10i + mtxw11i + mtxw12ni;
            Double fcsa = 1 - (llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg) * (llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg);
            Double fcsb;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                fcsb = 2 * llzyyg * (mgq2 - mgk2) * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg - 2 * mgw2 - 2 * mwlzi * 10 * llzyyg * llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                fcsb = -2 * llzyyg * (mgq2 - mgk2) * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg - 2 * mgw2 - 2 * mwlzi * 10 * llzyyg * llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg;
            } else {
                fcsb = null;
            }
            Double fcsc;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                fcsc = -(mgq2 - mgk2) * (mgq2 - mgk2) + 2 * mwlzi * 10 * llzyyg * (mgq2 - mgk2) - (mwlzi * 10 * llzyyg) * (mwlzi * 10 * llzyyg) + mgw2 * mgw2;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                fcsc = -(mgq2 - mgk2) * (mgq2 - mgk2) - 2 * mwlzi * 10 * llzyyg * (mgq2 - mgk2) - (mwlzi * 10 * llzyyg) * (mwlzi * 10 * llzyyg) + mgw2 * mgw2;
            } else {
                fcsc = null;
            }
            Double fcsz1 = (-fcsb + Math.sqrt(fcsb * fcsb - 4 * fcsa * fcsc)) / 2 / fcsa;
            Double fcsz2 = (-fcsb - Math.sqrt(fcsb * fcsb - 4 * fcsa * fcsc)) / 2 / fcsa;
            Double mg2;
            if (fcsz1 >= 0 && fcsz2 < 0) {
                mg2 = fcsz1;
            } else if (fcsz2 >= 0 && fcsz1 < 0) {
                mg2 = fcsz2;
            } else if (fcsz2 >= 0 && fcsz1 >= 0 && fcsz2 > fcsz1) {
                mg2 = fcsz2;
            } else if (fcsz2 >= 0 && fcsz1 >= 0 && fcsz1 > fcsz2) {
                mg2 = fcsz1;
            } else {
                mg2 = null;
            }
            Double ngl2 = mg2 / lwlzbg;
            Double nglmax = Math.max(ngl1, ngl2);
            map.put("mgq2", mgq2);
            map.put("mgk2", mgk2);
            map.put("mgw2", mgw2);
            map.put("fcsa", fcsa);
            map.put("fcsb", fcsb);
            map.put("fcsc", fcsc);
            map.put("fcsz1", fcsz1);
            map.put("fcsz2", fcsz2);
            map.put("mg2", mg2);
            map.put("ngl2", ngl2);
            map.put("nglmax", nglmax);

//        立柱滚轮轴承受力
            Double pg2 = nglmax * bfb / 2 / ndlsl;
            Double c = fh * 1.5 * 1.5 * pg2 / 1.435 / 1;
            Double ck = c / 1000;
            Double crk = cr / 1000;
            Double c1 = 2.25 * pg2;
            Double c1k = c1 / 1000;
            Double c0rk = c0r / 1000;
            map.put("pg2", pg2);
            map.put("c", c);
            map.put("ck", ck);
            map.put("crk", crk);
            map.put("c1", c1);
            map.put("c1k", c1k);
            map.put("c0rk", c0rk);

            //        立柱滚轮接触应力
            Double pg1 = bfb * nglmax / ndlsl;
            Double shz = Math.sqrt(0.35 * 210000 * pg1 / dldcw / dlbcw);
            Double bshz = shz / 800;
            map.put("pg1", pg1);
            map.put("shz", shz);
            map.put("bshz", bshz);

            //        立柱滚轮支撑板抗压强度
            Double szcb = bfb * nglmax / 2 / azcb;
            Double zcbfkys = zcbfky / 1.5;
            map.put("szcb", szcb);
            map.put("zcbfkys", zcbfkys);

            //        工况1液压缸推力
            Double t1n = dsn * t1 / dsn1;
            Double t1nk = t1n / 1000;
            Double dslltlk = dslltl / 1000;
            map.put("t1n", t1n);
            map.put("t1nk", t1nk);
            map.put("dslltlk", dslltlk);

            //        工况1液压缸稳定性
            Double fk = 3.14 * 3.14 * 180000 * dsi / dsk / dsk / dslb / dslb;
            Double fkn = fk / dsnk;
            Double fknk = fkn / 1000;
            Double f1n = t1 / dsn1;
            Double f1nk = f1n / 1000;
            map.put("fk", fk);
            map.put("fkn", fkn);
            map.put("fknk", fknk);
            map.put("f1n", f1n);
            map.put("f1nk", f1nk);

            //        工况2液压缸推力
            Double fmci = 2 * ngl2 * (2 * 0.25 + 0.02 * dlzcd) / dldcw;
            Double t2 = mwlzi * 10 + fmci;
            Double t2n = dsn * t2 / dsn1;
            Double t2nk = t2n / 1000;
            Double dslltlk1 = dslltlk;
            map.put("fmci", fmci);
            map.put("t2", t2);
            map.put("t2n", t2n);
            map.put("t2nk", t2nk);
            map.put("dslltlk1", dslltlk1);

            //        工况2液压缸稳定性
            Double f2n = t2 / dsn1;
            Double f2nk = f2n / 1000;
            Double fknk1 = fknk;
            map.put("f2n", f2n);
            map.put("f2nk", f2nk);
            map.put("fknk1", fknk1);
        }else  if (xljzsyModel.equals("静载试验")) {

            //        工况1
            Double mslz = jzwts * lslhz * 10;
            Double mshlz = tshl * lshlhz * 10 * 1.4 ;
            Double mz1 = m1 * lhz1 * 10;
            Double mz2 = m2 * lhz2 * 10;
            Double mz3 = m3 * lhz3 * 10;
            Double mz4 = m4 * lhz4 * 10;
            Double mz5 = m5ds * lhz5 * 10;
            Double mz6 = m6 * lhz6 * 10;
            Double mz7 = m7 * lhz7 * 10;
            map.put("mslz", mslz);
            map.put("mshlz", mshlz);
            map.put("mz1", mz1);
            map.put("mz2", mz2);
            map.put("mz3", mz3);
            map.put("mz4", mz4);
            map.put("mz5", mz5);
            map.put("mz6", mz6);
            map.put("mz7", mz7);

            Double mz10 = m10 * lhz10 * 10;
            Double mz11 = m11 * lhz11 * 10;
            Double mz12n = m12n * lhz12n * 10;
            map.put("mz10", mz10);
            map.put("mz11", mz11);
            map.put("mz12n", mz12n);

            Double msltxw = asltx * hslb * p;
            Double mshltxw = ashltx * hshlb * p;
            Double mtxw1 = atx1 * hb1 * p;
            Double mtxw2 = atx2 * hb2 * p;
            Double mtxw3 = atx3 * hb3 * p;
            Double mtxw4 = atx4 * hb4 * p;
            Double mtxw5 = atx5ds * hb5 * p;
            Double mtxw6 = atx6 * hb6 * p;
            Double mtxw7 = atx7 * hb7 * p;
            Double mtxw10 = atx10 * hb10 * p;
            Double mtxw11 = atx11 * hb11 * p;
            Double mtxw12n = atx12n * hb12n * p;
            map.put("msltxw", msltxw);
            map.put("mshltxw", mshltxw);
            map.put("mtxw1", mtxw1);
            map.put("mtxw2", mtxw2);
            map.put("mtxw3", mtxw3);
            map.put("mtxw4", mtxw4);
            map.put("mtxw5", mtxw5);
            map.put("mtxw6", mtxw6);
            map.put("mtxw7", mtxw7);
            map.put("mtxw10", mtxw10);
            map.put("mtxw11", mtxw11);
            map.put("mtxw12n", mtxw12n);

            Double t1 = jzmwlz * 10;
            Double mgq1 = mslz + mshlz + mz1 + mz2 + mz3 + mz4 + mz5 + mz6 + mz7;
            Double mgk1 = mz10 + mz11 + mz12n;
            Double mgw1 = msltxw + mshltxw + mtxw1 + mtxw2 + mtxw3 + mtxw4 + mtxw5 + mtxw6 + mtxw7 + mtxw10 + mtxw11 + mtxw12n;
            Double mg1;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                mg1 = Math.abs(mgq1 - mgk1 - t1 * llzyyg) + mgw1;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                mg1 = Math.abs(mgq1 - mgk1 + t1 * llzyyg) + mgw1;
            } else {
                mg1 = null;
            }
            Double ngl1 = mg1 / lwlzbg;
            map.put("t1", t1);
            map.put("mgq1", mgq1);
            map.put("mgk1", mgk1);
            map.put("mgw1", mgw1);
            map.put("mg1", mg1);
            map.put("ngl1", ngl1);

//        工况2
            Double mslzi = jzwts * lslhzi * 10;
            Double mshlzi = tshl * lshlhzi * 10 * 1.4 ;
            Double mz1i = m1 * lhz1i * 10;
            Double mz2i = m2 * lhz2i * 10;
            Double mz3i = m3 * lhz3i * 10;
            Double mz4i = m4 * lhz4i * 10;
            Double mz5i = m5dsp * lhz5i * 10;
            Double mz6i = m6 * lhz6i * 10;
            Double mz7i = m7 * lhz7i * 10;
            map.put("mslzi", mslzi);
            map.put("mshlzi", mshlzi);
            map.put("mz1i", mz1i);
            map.put("mz2i", mz2i);
            map.put("mz3i", mz3i);
            map.put("mz4i", mz4i);
            map.put("mz5i", mz5i);
            map.put("mz6i", mz6i);
            map.put("mz7i", mz7i);

            Double mz10i = m10 * lhz10i * 10;
            Double mz11i = m11 * lhz11i * 10;
            Double mz12ni = m12n * lhz12ni * 10;
            map.put("mz10i", mz10i);
            map.put("mz11i", mz11i);
            map.put("mz12ni", mz12ni);

            Double msltxwi = asltxi * hslbi * p;
            Double mshltxwi = ashltxi * hshlbi * p;
            Double mtxw1i = atx1i * hb1i * p;
            Double mtxw2i = atx2i * hb2i * p;
            Double mtxw3i = atx3i * hb3i * p;
            Double mtxw4i = atx4i * hb4i * p;
            Double mtxw5i = atx5dsi * hb5i * p;
            Double mtxw6i = atx6i * hb6i * p;
            Double mtxw7i = atx7i * hb7i * p;
            Double mtxw10i = atx10i * hb10i * p;
            Double mtxw11i = atx11i * hb11i * p;
            Double mtxw12ni = atx12ni * hb12ni * p;
            map.put("msltxwi", msltxwi);
            map.put("mshltxwi", mshltxwi);
            map.put("mtxw1i", mtxw1i);
            map.put("mtxw2i", mtxw2i);
            map.put("mtxw3i", mtxw3i);
            map.put("mtxw4i", mtxw4i);
            map.put("mtxw5i", mtxw5i);
            map.put("mtxw6i", mtxw6i);
            map.put("mtxw7i", mtxw7i);
            map.put("mtxw10i", mtxw10i);
            map.put("mtxw11i", mtxw11i);
            map.put("mtxw12ni", mtxw12ni);

            Double mgq2 = mslzi + mshlzi + mz1i + mz2i + mz3i + mz4i + mz5i + mz6i + mz7i;
            Double mgk2 = mz10i + mz11i + mz12ni;
            Double mgw2 = msltxwi + mshltxwi + mtxw1i + mtxw2i + mtxw3i + mtxw4i + mtxw5i + mtxw6i + mtxw7i + mtxw10i + mtxw11i + mtxw12ni;
            Double fcsa = 1 - (llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg) * (llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg);
            Double fcsb;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                fcsb = 2 * llzyyg * (mgq2 - mgk2) * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg - 2 * mgw2 - 2 * jzmwlzi * 10 * llzyyg * llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                fcsb = -2 * llzyyg * (mgq2 - mgk2) * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg - 2 * mgw2 - 2 * jzmwlzi * 10 * llzyyg * llzyyg * (4 * 0.25 + 2 * 0.02 * dlzcd) / dldcw / lwlzbg;
            } else {
                fcsb = null;
            }
            Double fcsc;
            if (dsyygwzModel.equals("顶升液压缸在立柱前")) {
                fcsc = -(mgq2 - mgk2) * (mgq2 - mgk2) + 2 * jzmwlzi * 10 * llzyyg * (mgq2 - mgk2) - (jzmwlzi * 10 * llzyyg) * (jzmwlzi * 10 * llzyyg) + mgw2 * mgw2;
            } else if (dsyygwzModel.equals("顶升液压缸在立柱后")) {
                fcsc = -(mgq2 - mgk2) * (mgq2 - mgk2) - 2 * jzmwlzi * 10 * llzyyg * (mgq2 - mgk2) - (jzmwlzi * 10 * llzyyg) * (jzmwlzi * 10 * llzyyg) + mgw2 * mgw2;
            } else {
                fcsc = null;
            }
            Double fcsz1 = (-fcsb + Math.sqrt(fcsb * fcsb - 4 * fcsa * fcsc)) / 2 / fcsa;
            Double fcsz2 = (-fcsb - Math.sqrt(fcsb * fcsb - 4 * fcsa * fcsc)) / 2 / fcsa;
            Double mg2;
            if (fcsz1 >= 0 && fcsz2 < 0) {
                mg2 = fcsz1;
            } else if (fcsz2 >= 0 && fcsz1 < 0) {
                mg2 = fcsz2;
            } else if (fcsz2 >= 0 && fcsz1 >= 0 && fcsz2 > fcsz1) {
                mg2 = fcsz2;
            } else if (fcsz2 >= 0 && fcsz1 >= 0 && fcsz1 > fcsz2) {
                mg2 = fcsz1;
            } else {
                mg2 = null;
            }
            Double ngl2 = mg2 / lwlzbg;
            Double nglmax = Math.max(ngl1, ngl2);
            map.put("mgq2", mgq2);
            map.put("mgk2", mgk2);
            map.put("mgw2", mgw2);
            map.put("fcsa", fcsa);
            map.put("fcsb", fcsb);
            map.put("fcsc", fcsc);
            map.put("fcsz1", fcsz1);
            map.put("fcsz2", fcsz2);
            map.put("mg2", mg2);
            map.put("ngl2", ngl2);
            map.put("nglmax", nglmax);

//        立柱滚轮轴承受力
            Double pg2 = nglmax * bfb / 2 / ndlsl;
            Double c = fh * 1.5 * 1.5 * pg2 / 1.435 / 1;
            Double ck = c / 1000;
            Double crk = cr / 1000;
            Double c1 = 2.25 * pg2;
            Double c1k = c1 / 1000;
            Double c0rk = c0r / 1000;
            map.put("pg2", pg2);
            map.put("c", c);
            map.put("ck", ck);
            map.put("crk", crk);
            map.put("c1", c1);
            map.put("c1k", c1k);
            map.put("c0rk", c0rk);

            //        立柱滚轮接触应力
            Double pg1 = bfb * nglmax / ndlsl;
            Double shz = Math.sqrt(0.35 * 210000 * pg1 / dldcw / dlbcw);
            Double bshz = shz / 800;
            map.put("pg1", pg1);
            map.put("shz", shz);
            map.put("bshz", bshz);

            //        立柱滚轮支撑板抗压强度
            Double szcb = bfb * nglmax / 2 / azcb;
            Double zcbfkys = zcbfky / 1.5;
            map.put("szcb", szcb);
            map.put("zcbfkys", zcbfkys);

            //        工况1液压缸推力
            Double t1n = dsn * t1 / dsn1;
            Double t1nk = t1n / 1000;
            Double dslltlk = dslltl / 1000;
            map.put("t1n", t1n);
            map.put("t1nk", t1nk);
            map.put("dslltlk", dslltlk);

            //        工况1液压缸稳定性
            Double fk = 3.14 * 3.14 * 180000 * dsi / dsk / dsk / dslb / dslb;
            Double fkn = fk / dsnk;
            Double fknk = fkn / 1000;
            Double f1n = t1 / dsn1;
            Double f1nk = f1n / 1000;
            map.put("fk", fk);
            map.put("fkn", fkn);
            map.put("fknk", fknk);
            map.put("f1n", f1n);
            map.put("f1nk", f1nk);

            //        工况2液压缸推力
            Double fmci = 2 * ngl2 * (2 * 0.25 + 0.02 * dlzcd) / dldcw;
            Double t2 = jzmwlzi * 10 + fmci;
            Double t2n = dsn * t2 / dsn1;
            Double t2nk = t2n / 1000;
            Double dslltlk1 = dslltlk;
            map.put("fmci", fmci);
            map.put("t2", t2);
            map.put("t2n", t2n);
            map.put("t2nk", t2nk);
            map.put("dslltlk1", dslltlk1);

            //        工况2液压缸稳定性
            Double f2n = t2 / dsn1;
            Double f2nk = f2n / 1000;
            Double fknk1 = fknk;
            map.put("f2n", f2n);
            map.put("f2nk", f2nk);
            map.put("fknk1", fknk1);
        }

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

        Double c = doubleMap.get("c");
        String lzglb2 = takeSignByCompareNumber(c,cr);
        String lzglm2 = takeStringByCompareNumber(c,cr);
        map.put("lzglb2", CommonFunc.convertDoubleToString(lzglb2));
        map.put("lzglm2", CommonFunc.convertDoubleToString(lzglm2));

        Double c1 = doubleMap.get("c1");
        String lzglb3 = takeSignByCompareNumber(c1,c0r);
        String lzglm3 = takeStringByCompareNumber(c1,c0r);
        map.put("lzglb3", CommonFunc.convertDoubleToString(lzglb3));
        map.put("lzglm3", CommonFunc.convertDoubleToString(lzglm3));

        Double bshz = doubleMap.get("bshz");
        String lzglb1 = takeSignByCompareNumber(bshz,1.0);
        String lzglm1 = takeStringByCompareNumber(bshz,1.0);
        map.put("lzglb1", CommonFunc.convertDoubleToString(lzglb1));
        map.put("lzglm1", CommonFunc.convertDoubleToString(lzglm1));

        Double szcb = doubleMap.get("szcb");
        Double zcbfkys = doubleMap.get("zcbfkys");
        String lzglb4 = takeSignByCompareNumber(szcb, zcbfkys);
        String lzglm4 = takeStringByCompareNumber(szcb, zcbfkys);
        map.put("lzglb4", CommonFunc.convertDoubleToString(lzglb4));
        map.put("lzglm4", CommonFunc.convertDoubleToString(lzglm4));

        Double t1n = doubleMap.get("t1n");
        String dsb1 = takeSignByCompareNumber(t1n,dslltl);
        String dsm1 = takeStringByCompareNumber(t1n,dslltl);
        map.put("dsb1", CommonFunc.convertDoubleToString(dsb1));
        map.put("dsm1", CommonFunc.convertDoubleToString(dsm1));

        Double f1n = doubleMap.get("f1n");
        Double fkn = doubleMap.get("fkn");
        String dsb2 = takeSignByCompareNumber(f1n,fkn);
        String dsm2 = takeStringByCompareNumber(f1n,fkn);
        map.put("dsb2", CommonFunc.convertDoubleToString(dsb2));
        map.put("dsm2", CommonFunc.convertDoubleToString(dsm2));

        Double t2n = doubleMap.get("t2n");
        String dsb3 = takeSignByCompareNumber(t2n,dslltl);
        String dsm3 = takeStringByCompareNumber(t2n,dslltl);
        map.put("dsb3", CommonFunc.convertDoubleToString(dsb3));
        map.put("dsm3", CommonFunc.convertDoubleToString(dsm3));

        Double f2n = doubleMap.get("f2n");
//        Double fkn = doubleMap.get("fkn");
        String dsb4 = takeSignByCompareNumber(f2n,fkn);
        String dsm4 = takeStringByCompareNumber(f2n,fkn);
        map.put("dsb4", CommonFunc.convertDoubleToString(dsb4));
        map.put("dsm4", CommonFunc.convertDoubleToString(dsm4));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
