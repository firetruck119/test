package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class IdlerWheelEntity {
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
    private Double llzyyg;
    private Double llzss;
    private Double llzgdn;
    private Double lwlzbg;
    private Double dldcw;
    private Double dlbcw;
    private Double ndlsl;
    private String dsglxs;
    private Double rzcb;
    private Double tzcb;
    private Double cr;
    private Double c0r;
    private Double bfb;
    private Double zcsm;
    private Double fh;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
//    private Double mlz1gd;
//    private Double lz1mmzz;

//    private Double lxtz;
//    private Double lxtm;
//    private Double ldjm;
//    private Double ldbm;
//    private Double mdbb;
//    private Double ldbbz;
//    private Double mbmj;
//    private Double mbm1;
//    private Double mbm2;
//    private Double mbm3;
//    private Double mbm4;
//    private Double mbgj;
//    private Double mbg1;
//    private Double mbg2;
//    private Double mbg3;
//    private Double mbg4;

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
    private Double m12n;
    private Double m10;
    private Double m11;

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
    private Double lhz12;

    private Double lsly;
    private Double lshly;
    private Double ly1;
    private Double ly2;
    private Double ly3;
    private Double ly4;
    private Double ly5;
    private Double ly6;
    private Double ly7;
    private Double ly12n;
    private Double ly10;
    private Double ly11;

    private Double asltx;
    private Double ashltx;
    private Double atx1;
    private Double atx2;
    private Double atx3;
    private Double atx4;
    private Double atx5;
    private Double atx6;
    private Double atx7;
    private Double atx12n;
    private Double atx10;
    private Double atx11;

    private Double hslb;
    private Double hshlb;
    private Double hb1;
    private Double hb2;
    private Double hb3;
    private Double hb4;
    private Double hb5;
    private Double hb6;
    private Double hb7;
    private Double hb12n;
    private Double hb10;
    private Double hb11;

    private Double hslbi;
    private Double hshlbi;
    private Double hb1i;
    private Double hb2i;
    private Double hb3i;
    private Double hb4i;
    private Double hb5i;
    private Double hb6i;
    private Double hb7i;
    private Double hb12ni;
    private Double hb10i;
    private Double hb11i;

    private Double asltxi;
    private Double ashltxi;
    private Double atx1i;
    private Double atx2i;
    private Double atx3i;
    private Double atx4i;
    private Double atx5i;
    private Double atx6i;
    private Double atx7i;
    private Double atx12ni;
    private Double atx10i;
    private Double atx11i;

    private Double lslfyi;
    private Double lshlfyi;
    private Double lfy1i;
    private Double lfy2i;
    private Double lfy3i;
    private Double lfy4i;
    private Double lfy5i;
    private Double lfy6i;
    private Double lfy7i;
    private Double lfy12ni;
    private Double lfy10i;
    private Double lfy11i;

    private Double lfy1;
    private Double lfy2;
    private Double lfy3;
    private Double lfy4;
    private Double lfy5;
    private Double lfy6;
    private Double lfy7;
    private Double lfy12n;
    private Double lfy10;
    private Double lfy11;

    private Double aftx1;
    private Double aftx2;
    private Double aftx3;
    private Double aftx4;
    private Double aftx5;
    private Double aftx6;
    private Double aftx7;
    private Double aftx12n;
    private Double aftx10;
    private Double aftx11;

    private Double hfb1;
    private Double hfb2;
    private Double hfb3;
    private Double hfb4;
    private Double hfb5;
    private Double hfb6;
    private Double hfb7;
    private Double hfb12n;
    private Double hfb10;
    private Double hfb11;

    private String btModel;
    private String dcModel;
    private String dcgssModel;
    private String gruModel;
    private String ffbbModel;
//    private String bdlxzModel;
    private String sfybxzModel;
//    private String dbxzModel;
//    private String lzxzModel;
    private String sfsglxzModel;
    private String zcxhxz;
    private String zcsmxzModel;

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
        map.put("llzyyg", CommonFunc.convertDoubleToString(llzyyg));
        map.put("llzss", CommonFunc.convertDoubleToString(llzss));
        map.put("llzgdn", CommonFunc.convertDoubleToString(llzgdn));
        map.put("lwlzbg", CommonFunc.convertDoubleToString(lwlzbg));
        map.put("dldcw", CommonFunc.convertDoubleToString(dldcw));
        map.put("dlbcw", CommonFunc.convertDoubleToString(dlbcw));
        map.put("ndlsl", CommonFunc.convertDoubleToString(ndlsl));
        map.put("dsglxs", CommonFunc.convertDoubleToString(dsglxs));
        map.put("rzcb", CommonFunc.convertDoubleToString(rzcb));
        map.put("tzcb", CommonFunc.convertDoubleToString(tzcb));
        map.put("cr", CommonFunc.convertDoubleToString(cr));
        map.put("c0r", CommonFunc.convertDoubleToString(c0r));
        map.put("bfb", CommonFunc.convertDoubleToString(bfb));
        map.put("zcsm", CommonFunc.convertDoubleToString(zcsm));
        map.put("fh", CommonFunc.convertDoubleToString(fh));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
//        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
//        map.put("lz1mmzz", CommonFunc.convertDoubleToString(lz1mmzz));
//        map.put("lxtz", CommonFunc.convertDoubleToString(lxtz));
//        map.put("lxtm", CommonFunc.convertDoubleToString(lxtm));
//        map.put("ldjm", CommonFunc.convertDoubleToString(ldjm));
//        map.put("ldbm", CommonFunc.convertDoubleToString(ldbm));
//        map.put("mdbb", CommonFunc.convertDoubleToString(mdbb));
//        map.put("ldbbz", CommonFunc.convertDoubleToString(ldbbz));
//        map.put("mbmj", CommonFunc.convertDoubleToString(mbmj));
//        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));
//        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));
//        map.put("mbm3", CommonFunc.convertDoubleToString(mbm3));
//        map.put("mbm4", CommonFunc.convertDoubleToString(mbm4));
//        map.put("mbgj", CommonFunc.convertDoubleToString(mbgj));
//        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
//        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
//        map.put("mbg3", CommonFunc.convertDoubleToString(mbg3));
//        map.put("mbg4", CommonFunc.convertDoubleToString(mbg4));

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
        map.put("m12n", CommonFunc.convertDoubleToString(m12n));
        map.put("m10", CommonFunc.convertDoubleToString(m10));
        map.put("m11", CommonFunc.convertDoubleToString(m11));

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
        map.put("lhz12", CommonFunc.convertDoubleToString(lhz12));

        map.put("lsly", CommonFunc.convertDoubleToString(lsly));
        map.put("lshly", CommonFunc.convertDoubleToString(lshly));
        map.put("ly1", CommonFunc.convertDoubleToString(ly1));
        map.put("ly2", CommonFunc.convertDoubleToString(ly2));
        map.put("ly3", CommonFunc.convertDoubleToString(ly3));
        map.put("ly4", CommonFunc.convertDoubleToString(ly4));
        map.put("ly5", CommonFunc.convertDoubleToString(ly5));
        map.put("ly6", CommonFunc.convertDoubleToString(ly6));
        map.put("ly7", CommonFunc.convertDoubleToString(ly7));
        map.put("ly12n", CommonFunc.convertDoubleToString(ly12n));
        map.put("ly10", CommonFunc.convertDoubleToString(ly10));
        map.put("ly11", CommonFunc.convertDoubleToString(ly11));

        map.put("asltx", CommonFunc.convertDoubleToString(asltx));
        map.put("ashltx", CommonFunc.convertDoubleToString(ashltx));
        map.put("atx1", CommonFunc.convertDoubleToString(atx1));
        map.put("atx2", CommonFunc.convertDoubleToString(atx2));
        map.put("atx3", CommonFunc.convertDoubleToString(atx3));
        map.put("atx4", CommonFunc.convertDoubleToString(atx4));
        map.put("atx5", CommonFunc.convertDoubleToString(atx5));
        map.put("atx6", CommonFunc.convertDoubleToString(atx6));
        map.put("atx7", CommonFunc.convertDoubleToString(atx7));
        map.put("atx12n", CommonFunc.convertDoubleToString(atx12n));
        map.put("atx10", CommonFunc.convertDoubleToString(atx10));
        map.put("atx11", CommonFunc.convertDoubleToString(atx11));

        map.put("hslb", CommonFunc.convertDoubleToString(hslb));
        map.put("hshlb", CommonFunc.convertDoubleToString(hshlb));
        map.put("hb1", CommonFunc.convertDoubleToString(hb1));
        map.put("hb2", CommonFunc.convertDoubleToString(hb2));
        map.put("hb3", CommonFunc.convertDoubleToString(hb3));
        map.put("hb4", CommonFunc.convertDoubleToString(hb4));
        map.put("hb5", CommonFunc.convertDoubleToString(hb5));
        map.put("hb6", CommonFunc.convertDoubleToString(hb6));
        map.put("hb7", CommonFunc.convertDoubleToString(hb7));
        map.put("hb12n", CommonFunc.convertDoubleToString(hb12n));
        map.put("hb10", CommonFunc.convertDoubleToString(hb10));
        map.put("hb11", CommonFunc.convertDoubleToString(hb11));

        map.put("hslbi", CommonFunc.convertDoubleToString(hslbi));
        map.put("hshlbi", CommonFunc.convertDoubleToString(hshlbi));
        map.put("hb1i", CommonFunc.convertDoubleToString(hb1i));
        map.put("hb2i", CommonFunc.convertDoubleToString(hb2i));
        map.put("hb3i", CommonFunc.convertDoubleToString(hb3i));
        map.put("hb4i", CommonFunc.convertDoubleToString(hb4i));
        map.put("hb5i", CommonFunc.convertDoubleToString(hb5i));
        map.put("hb6i", CommonFunc.convertDoubleToString(hb6i));
        map.put("hb7i", CommonFunc.convertDoubleToString(hb7i));
        map.put("hb12ni", CommonFunc.convertDoubleToString(hb12ni));
        map.put("hb10i", CommonFunc.convertDoubleToString(hb10i));
        map.put("hb11i", CommonFunc.convertDoubleToString(hb11i));

        map.put("asltxi", CommonFunc.convertDoubleToString(asltxi));
        map.put("ashltxi", CommonFunc.convertDoubleToString(ashltxi));
        map.put("atx1i", CommonFunc.convertDoubleToString(atx1i));
        map.put("atx2i", CommonFunc.convertDoubleToString(atx2i));
        map.put("atx3i", CommonFunc.convertDoubleToString(atx3i));
        map.put("atx4i", CommonFunc.convertDoubleToString(atx4i));
        map.put("atx5i", CommonFunc.convertDoubleToString(atx5i));
        map.put("atx6i", CommonFunc.convertDoubleToString(atx6i));
        map.put("atx7i", CommonFunc.convertDoubleToString(atx7i));
        map.put("atx12ni", CommonFunc.convertDoubleToString(atx12ni));
        map.put("atx10i", CommonFunc.convertDoubleToString(atx10i));
        map.put("atx11i", CommonFunc.convertDoubleToString(atx11i));

        map.put("lslfyi", CommonFunc.convertDoubleToString(lslfyi));
        map.put("lshlfyi", CommonFunc.convertDoubleToString(lshlfyi));
        map.put("lfy1i", CommonFunc.convertDoubleToString(lfy1i));
        map.put("lfy2i", CommonFunc.convertDoubleToString(lfy2i));
        map.put("lfy3i", CommonFunc.convertDoubleToString(lfy3i));
        map.put("lfy4i", CommonFunc.convertDoubleToString(lfy4i));
        map.put("lfy5i", CommonFunc.convertDoubleToString(lfy5i));
        map.put("lfy6i", CommonFunc.convertDoubleToString(lfy6i));
        map.put("lfy7i", CommonFunc.convertDoubleToString(lfy7i));
        map.put("lfy12ni", CommonFunc.convertDoubleToString(lfy12ni));
        map.put("lfy10i", CommonFunc.convertDoubleToString(lfy10i));
        map.put("lfy11i", CommonFunc.convertDoubleToString(lfy11i));

        map.put("lfy1", CommonFunc.convertDoubleToString(lfy1));
        map.put("lfy2", CommonFunc.convertDoubleToString(lfy2));
        map.put("lfy3", CommonFunc.convertDoubleToString(lfy3));
        map.put("lfy4", CommonFunc.convertDoubleToString(lfy4));
        map.put("lfy5", CommonFunc.convertDoubleToString(lfy5));
        map.put("lfy6", CommonFunc.convertDoubleToString(lfy6));
        map.put("lfy7", CommonFunc.convertDoubleToString(lfy7));
        map.put("lfy12n", CommonFunc.convertDoubleToString(lfy12n));
        map.put("lfy10", CommonFunc.convertDoubleToString(lfy10));
        map.put("lfy11", CommonFunc.convertDoubleToString(lfy11));

        map.put("aftx1", CommonFunc.convertDoubleToString(aftx1));
        map.put("aftx2", CommonFunc.convertDoubleToString(aftx2));
        map.put("aftx3", CommonFunc.convertDoubleToString(aftx3));
        map.put("aftx4", CommonFunc.convertDoubleToString(aftx4));
        map.put("aftx5", CommonFunc.convertDoubleToString(aftx5));
        map.put("aftx6", CommonFunc.convertDoubleToString(aftx6));
        map.put("aftx7", CommonFunc.convertDoubleToString(aftx7));
        map.put("aftx12n", CommonFunc.convertDoubleToString(aftx12n));
        map.put("aftx10", CommonFunc.convertDoubleToString(aftx10));
        map.put("aftx11", CommonFunc.convertDoubleToString(aftx11));

        map.put("hfb1", CommonFunc.convertDoubleToString(hfb1));
        map.put("hfb2", CommonFunc.convertDoubleToString(hfb2));
        map.put("hfb3", CommonFunc.convertDoubleToString(hfb3));
        map.put("hfb4", CommonFunc.convertDoubleToString(hfb4));
        map.put("hfb5", CommonFunc.convertDoubleToString(hfb5));
        map.put("hfb6", CommonFunc.convertDoubleToString(hfb6));
        map.put("hfb7", CommonFunc.convertDoubleToString(hfb7));
        map.put("hfb12n", CommonFunc.convertDoubleToString(hfb12n));
        map.put("hfb10", CommonFunc.convertDoubleToString(hfb10));
        map.put("hfb11", CommonFunc.convertDoubleToString(hfb11));

        map.put("zcxhxz", CommonFunc.convertDoubleToString(zcxhxz));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    //验证部分
    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");
//
//
        Double pg2 = map.get("pg2");

        Double fhp = 0.638 * cr / pg2 ;
        String lzdlyzm5 = (fhp >= fh) ? "满足" : "不满足";
        String lzdlyzp5 = takeSignByCompareNumber(fhp,fh);

        Map<String, String> result = new HashMap<>();
        result.put("pg2", CommonFunc.convertDoubleToString(pg2));
        result.put("fh", CommonFunc.convertDoubleToString(fh));
        result.put("fhp", CommonFunc.convertDoubleToString(fhp));
        result.put("cr", CommonFunc.convertDoubleToString(cr));
        result.put("lzdlyzm5", CommonFunc.convertDoubleToString(lzdlyzm5));
        result.put("lzdlyzp5", CommonFunc.convertDoubleToString(lzdlyzp5));



        return result;
    }

    //正文部分
    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        Double msld = tsl * lsly * 1.25 * 10 ;
        Double mshld = tshl * lshly * 1.25 * 10 ;
        Double md1 = m1 * ly1 * 1.25 * 10 ;
        Double md2 = m2 * ly2 * 1.25 * 10 ;
        Double md3 = m3 * ly3 * 1.25 * 10 ;
        Double md4 = m4 * ly4 * 1.25 * 10 ;
        Double md6 = m6 * ly6 * 1.25 * 10 ;
        Double md7 = m7 * ly7 * 1.25 * 10 ;
        map.put("msld", msld);
        map.put("mshld", mshld);
        map.put("md1", md1);
        map.put("md2", md2);
        map.put("md3", md3);
        map.put("md4", md4);
        map.put("md6", md6);
        map.put("md7", md7);

        Double msltxw = asltx * hslb * p * 1.25 ;
        Double mshltxw = ashltx * hshlb * p * 1.25 ;
        Double mtxw1 = atx1 * hb1 * p * 1.25 ;
        Double mtxw2 = atx2 * hb2 * p * 1.25 ;
        Double mtxw3 = atx3 * hb3 * p * 1.25 ;
        Double mtxw4 = atx4 * hb4 * p * 1.25 ;
        Double mtxw5 = atx5 * hb5 * p * 1.25 ;
        Double mtxw6 = atx6 * hb6 * p * 1.25 ;
        Double mtxw7 = atx7 * hb7 * p * 1.25 ;
        Double mtxw12n = atx12n * hb12n * p * 1.25 ;
        Double mtxw10 = atx10 * hb10 * p * 1.25 ;
        Double mtxw11 = atx11 * hb11 * p * 1.25 ;
        map.put("msltxw", msltxw);
        map.put("mshltxw", mshltxw);
        map.put("mtxw1", mtxw1);
        map.put("mtxw2", mtxw2);
        map.put("mtxw3", mtxw3);
        map.put("mtxw4", mtxw4);
        map.put("mtxw5", mtxw5);
        map.put("mtxw6", mtxw6);
        map.put("mtxw7", mtxw7);
        map.put("mtxw12n", mtxw12n);
        map.put("mtxw10", mtxw10);
        map.put("mtxw11", mtxw11);

        Double md5 = m5 * ly5 * 10 ;
        Double md12n = m12n * ly12n * 10 ;
        Double md10 = m10 * ly10 * 10 ;
        Double md11 = m11 * ly11 * 10 ;
        map.put("md5", md5);
        map.put("md12n", md12n);
        map.put("md10", md10);
        map.put("md11", md11);

        Double msldi = tsl * lslfyi * 1.25 * 10 ;
        Double mshldi = tshl * lshlfyi * 1.25 * 10 ;
        Double md1i = m1 * lfy1i * 1.25 * 10 ;
        Double md2i = m2 * lfy2i * 1.25 * 10 ;
        Double md3i = m3 * lfy3i * 1.25 * 10 ;
        Double md4i = m4 * lfy4i * 1.25 * 10 ;
        Double md6i = m6 * lfy6i * 1.25 * 10 ;
        Double md7i = m7 * lfy7i * 1.25 * 10 ;
        map.put("msldi", msldi);
        map.put("mshldi", mshldi);
        map.put("md1i", md1i);
        map.put("md2i", md2i);
        map.put("md3i", md3i);
        map.put("md4i", md4i);
        map.put("md6i", md6i);
        map.put("md7i", md7i);

        Double msltxwi = asltxi * hslbi * p * 1.25 ;
        Double mshltxwi = ashltxi * hshlbi * p * 1.25 ;
        Double mtxw1i = atx1i * hb1i * p * 1.25 ;
        Double mtxw2i = atx2i * hb2i * p * 1.25 ;
        Double mtxw3i = atx3i * hb3i * p * 1.25 ;
        Double mtxw4i = atx4i * hb4i * p * 1.25 ;
        Double mtxw5i = atx5i * hb5i * p * 1.25 ;
        Double mtxw6i = atx6i * hb6i * p * 1.25 ;
        Double mtxw7i = atx7i * hb7i * p * 1.25 ;
        Double mtxw12ni = atx12ni * hb12ni * p * 1.25 ;
        Double mtxw10i = atx10i * hb10i * p * 1.25 ;
        Double mtxw11i = atx11i * hb11i * p * 1.25 ;
        map.put("msltxwi", msltxwi);
        map.put("mshltxwi", mshltxwi);
        map.put("mtxw1i", mtxw1i);
        map.put("mtxw2i", mtxw2i);
        map.put("mtxw3i", mtxw3i);
        map.put("mtxw4i", mtxw4i);
        map.put("mtxw5i", mtxw5i);
        map.put("mtxw6i", mtxw6i);
        map.put("mtxw7i", mtxw7i);
        map.put("mtxw12ni", mtxw12ni);
        map.put("mtxw10i", mtxw10i);
        map.put("mtxw11i", mtxw11i);

        Double md5i = m5 * lfy5i * 10 ;
        Double md12ni = m12n * lfy12ni * 10 ;
        Double md10i = m10 * lfy10i * 10 ;
        Double md11i = m11 * lfy11i * 10 ;
        map.put("md5i", md5i);
        map.put("md12ni", md12ni);
        map.put("md10i", md10i);
        map.put("md11i", md11i);

        Double mfd5 = m5 * lfy5 * 10 ;
        Double mfd12n = m12n * lfy12n * 10 ;
        Double mfd10 = m10 * lfy10 * 10 ;
        Double mfd11 = m11 * lfy11 * 10 ;
        map.put("mfd5", mfd5);
        map.put("mfd12n", mfd12n);
        map.put("mfd10", mfd10);
        map.put("mfd11", mfd11);

        Double mftxw1 = pf * aftx1 * hfb1 ;
        Double mftxw2 = pf * aftx2 * hfb2 ;
        Double mftxw3 = pf * aftx3 * hfb3 ;
        Double mftxw4 = pf * aftx4 * hfb4 ;
        Double mftxw5 = pf * aftx5 * hfb5 ;
        Double mftxw6 = pf * aftx6 * hfb6 ;
        Double mftxw7 = pf * aftx7 * hfb7 ;
        Double mftxw12n = pf * aftx12n * hfb12n ;
        Double mftxw10 = pf * aftx10 * hfb10 ;
        Double mftxw11 = pf * aftx11 * hfb11 ;
        map.put("mftxw1", mftxw1);
        map.put("mftxw2", mftxw2);
        map.put("mftxw3", mftxw3);
        map.put("mftxw4", mftxw4);
        map.put("mftxw5", mftxw5);
        map.put("mftxw6", mftxw6);
        map.put("mftxw7", mftxw7);
        map.put("mftxw12n", mftxw12n);
        map.put("mftxw10", mftxw10);
        map.put("mftxw11", mftxw11);

        Double mfd1 = m1 * lfy1 * 10 ;
        Double mfd2 = m2 * lfy2 * 10 ;
        Double mfd3 = m3 * lfy3 * 10 ;
        Double mfd4 = m4 * lfy4 * 10 ;
        Double mfd6 = m6 * lfy6 * 10 ;
        Double mfd7 = m7 * lfy7 * 10 ;
        map.put("mfd1", mfd1);
        map.put("mfd2", mfd2);
        map.put("mfd3", mfd3);
        map.put("mfd4", mfd4);
        map.put("mfd6", mfd6);
        map.put("mfd7", mfd7);

        Double mgz1 = msld + mshld + md1 + md2 + md3 + md4 + md6 + md7 ;
        Double mgw1 = msltxw + mshltxw + mtxw1 + mtxw2 + mtxw3 + mtxw4 + mtxw5 + mtxw6 + mtxw7 + mtxw12n + mtxw10 + mtxw11 ;
        Double mgq1 = mgz1 + mgw1 ;
        Double mgk1 = md5 + md12n + md10 + md11 ;
        Double f1 = Math.abs( ( mgq1 - mgk1 ) / lwlzbg  );
        Double mgz2 = msldi + mshldi + md1i + md2i + md3i + md4i + md6i + md7i ;
        Double mgw2 = msltxwi + mshltxwi + mtxw1i + mtxw2i + mtxw3i + mtxw4i + mtxw5i + mtxw6i + mtxw7i + mtxw12ni + mtxw10i + mtxw11i ;
        Double mgq2 = mgz2 + mgw2 ;
        Double mgk2 = md5i + md12ni + md10i + md11i ;
        Double f2 = Math.abs( ( mgq2 - mgk2 ) / lwlzbg  ) ;
        Double mfz = mfd5 + mfd12n + mfd10 + mfd11 ;
        Double mfw = mftxw1 + mftxw2 + mftxw3 + mftxw4 + mftxw5 + mftxw6 + mftxw7 + mftxw12n + mftxw10 + mftxw11 ;
        Double mfq = mfz + mfw ;
        Double mfk = mfd1 + mfd2 + mfd3 + mfd4 + mfd6 + mfd7 ;
        Double f3 = Math.abs( ( mfq - mfk ) / lwlzbg  );
        Double fmax =(f1 > f2 ? f1 : f2) > f3 ? ( f1 > f2  ? f1 : f2) : f3;
        map.put("mgz1", mgz1);
        map.put("mgw1", mgw1);
        map.put("mgq1", mgq1);
        map.put("mgk1", mgk1);
        map.put("f1", f1);
        map.put("mgz2", mgz2);
        map.put("mgw2", mgw2);
        map.put("mgq2", mgq2);
        map.put("mgk2", mgk2);
        map.put("f2", f2);
        map.put("mfz", mfz);
        map.put("mfw", mfw);
        map.put("mfq", mfq);
        map.put("mfk", mfk);
        map.put("f3", f3);
        map.put("fmax", fmax);

        Double pg1 = bfb * fmax / ndlsl ;
        Double fxbfb = bfb * fmax ;
        Double ohz = sqrt( 0.35 * 210000 * pg1 / dldcw / dlbcw );
        Double bohz = ohz / 800 ;
        Double pg2 = fmax * bfb / 2 / ndlsl ;
        Double c = fh * 1.57 * pg2 ;
        Double c1 = 2.25 * pg2 ;
        Double a = 3.14 * rzcb * tzcb ;
        Double o = bfb * fmax / 2 / a ;
        map.put("pg1", pg1);
        map.put("fxbfb", fxbfb);
        map.put("ohz", ohz);
        map.put("bohz", bohz);
        map.put("pg2", pg2);
        map.put("c", c);
        map.put("c1", c1);
        map.put("a", a);
        map.put("o", o);

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
        Double bohz = doubleMap.get("bohz");
        String lzglp1 = takeSignByCompareNumber(bohz,1.0);
        String lzglm1 = takeStringByCompareNumber(bohz,1.0);
        map.put("lzglp1", CommonFunc.convertDoubleToString(lzglp1));
        map.put("lzglm1", CommonFunc.convertDoubleToString(lzglm1));

        Double c = doubleMap.get("c");
//        Double cr = doubleMap.get("cr");
        String lzglp2 = takeSignByCompareNumber(c,cr);
        String lzglm2 = takeStringByCompareNumber(c,cr);
        map.put("lzglp2", CommonFunc.convertDoubleToString(lzglp2));
        map.put("lzglm2", CommonFunc.convertDoubleToString(lzglm2));

        Double c1 = doubleMap.get("c1");
//        Double c0r = doubleMap.get("c0r");
        String lzglp4 = takeSignByCompareNumber(c1,c0r);
        String lzglm4 = takeStringByCompareNumber(c1,c0r);
        map.put("lzglp4", CommonFunc.convertDoubleToString(lzglp4));
        map.put("lzglm4", CommonFunc.convertDoubleToString(lzglm4));

        Double o = doubleMap.get("o");
        String lzglp3 = takeSignByCompareNumber(o,206.7);
        String lzglm3 = takeStringByCompareNumber(o,206.7);
        map.put("lzglp3", CommonFunc.convertDoubleToString(lzglp3));
        map.put("lzglm3", CommonFunc.convertDoubleToString(lzglm3));


        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
