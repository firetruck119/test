package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class TwoJibWheelEntity {
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
    private Double dbyj;
    private String dbgcph;
    private Double dbgcshzr;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
    private Double mbg1;
    private Double mbm1;
    private Double mbg2;
    private Double mbm2;

    private Double fssjg;
    private Double sslltl;

    private Double dbgcshzr1;
    private Double dbgcshzr2;
    private Double dbgcshzr3;

    private Double dbjbxglr;
    private Double db1bshdlr;
    private Double db1bxglr;
    private Double db2bshdlr;

    private Double m5;

    //    提示提醒
    private String grutstx;

    //    平行吊臂方向距离
    private Double dblx1;
    private Double dblx2;
    private Double dblx3;
    private Double dbld1;
    private Double dbld2;
    private Double dbld3;

    //    第一段搭接处滚轮
    private String dbjbxglxh;
    private Double dbjbxglfk;
    private Double dbjbxgln;
    private Double dbjbxgld;
    private Double dbjbxglb;

    private String db1bshdlxh;
    private Double db1bshdlfk;
    private Double db1bshdln;
    private Double db1bshdld;
    private Double db1bshdlb;

    private Double dbdjl1;

    //    第二段搭接处滚轮
    private String db1bxglxh;
    private Double db1bxglfk;
    private Double db1bxgln;
    private Double db1bxgld;
    private Double db1bxglb;

    private String db2bshdlxh;
    private Double db2bshdlfk;
    private Double db2bshdln;
    private Double db2bshdld;
    private Double db2bshdlb;

    private Double dbdjl2;

    //   链条
    private String db2bltxh;
    private Double tlt1;
    private Double nlt1;

    //   齿轮齿条式伸缩机构
    private String ssjgxh;
    private Double nssjg;
    private Double fssjgk;
    private Double pssjg;

    //   液压式伸缩机构
    private Double ssdd;
    private Double ssxd;
    private Double ssi;
    private Double sslltlk;
    private Double ssnsl;
    private Double sslb;
    private Double ssns;
    private Double ssnk;
    private Double ssk;

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
    private Double m6db;
    private Double m7db;
    private Double mlz;

    private Double fslf;
    private Double fshlf;
    private Double ff1;
    private Double ff2;
    private Double ff3;
    private Double ff6gl;
    private Double ff7gl;
    private Double flz;

    private Double lslp;
    private Double lshlp;
    private Double lp1;
    private Double lp2;
    private Double lp3;
    private Double lp6gl;
    private Double lp7gl;

    private Double lslpi;
    private Double lshlpi;
    private Double lp1i;
    private Double lp2i;
    private Double lp3i;
    private Double lp7gli;

//    下拉
    private String db2Model;
    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;

    private String dbjbxglModel;
    private String db1bshdlModel;
    private String db1bxglModel;
    private String db2bshdlModel;

    private String db2bltModel;
    private String ssjgxsModel;
    private String ssjgModel;
    private String ssyygModel;
    private String ssyygezModel;

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
        map.put("lbd", CommonFunc.convertDoubleToString(lbd));
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));
        map.put("dbgcph", CommonFunc.convertDoubleToString(dbgcph));
        map.put("dbgcshzr", CommonFunc.convertDoubleToString(dbgcshzr));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));
        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));

        map.put("fssjg", CommonFunc.convertDoubleToString(fssjg));
        map.put("sslltl", CommonFunc.convertDoubleToString(sslltl));

        map.put("dbgcshzr1", CommonFunc.convertDoubleToString(dbgcshzr1));
        map.put("dbgcshzr2", CommonFunc.convertDoubleToString(dbgcshzr2));
        map.put("dbgcshzr3", CommonFunc.convertDoubleToString(dbgcshzr3));

        map.put("dbjbxglr", CommonFunc.convertDoubleToString(dbjbxglr));
        map.put("db1bshdlr", CommonFunc.convertDoubleToString(db1bshdlr));
        map.put("db1bxglr", CommonFunc.convertDoubleToString(db1bxglr));
        map.put("db2bshdlr", CommonFunc.convertDoubleToString(db2bshdlr));

        map.put("m5", CommonFunc.convertDoubleToString(m5));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
        map.put("dblx2", CommonFunc.convertDoubleToString(dblx2));
        map.put("dblx3", CommonFunc.convertDoubleToString(dblx3));
        map.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        map.put("dbld2", CommonFunc.convertDoubleToString(dbld2));
        map.put("dbld3", CommonFunc.convertDoubleToString(dbld3));

//        第一段搭接
        map.put("dbjbxglxh", CommonFunc.convertDoubleToString(dbjbxglxh));
        map.put("dbjbxglfk", CommonFunc.convertDoubleToString(dbjbxglfk));
        map.put("dbjbxgln", CommonFunc.convertDoubleToString(dbjbxgln));
        map.put("dbjbxgld", CommonFunc.convertDoubleToString(dbjbxgld));
        map.put("dbjbxglb", CommonFunc.convertDoubleToString(dbjbxglb));

        map.put("db1bshdlxh", CommonFunc.convertDoubleToString(db1bshdlxh));
        map.put("db1bshdlfk", CommonFunc.convertDoubleToString(db1bshdlfk));
        map.put("db1bshdln", CommonFunc.convertDoubleToString(db1bshdln));
        map.put("db1bshdld", CommonFunc.convertDoubleToString(db1bshdld));
        map.put("db1bshdlb", CommonFunc.convertDoubleToString(db1bshdlb));

        map.put("dbdjl1", CommonFunc.convertDoubleToString(dbdjl1));

        //        第二段搭接
        map.put("db1bxglxh", CommonFunc.convertDoubleToString(db1bxglxh));
        map.put("db1bxglfk", CommonFunc.convertDoubleToString(db1bxglfk));
        map.put("db1bxgln", CommonFunc.convertDoubleToString(db1bxgln));
        map.put("db1bxgld", CommonFunc.convertDoubleToString(db1bxgld));
        map.put("db1bxglb", CommonFunc.convertDoubleToString(db1bxglb));

        map.put("db2bshdlxh", CommonFunc.convertDoubleToString(db2bshdlxh));
        map.put("db2bshdlfk", CommonFunc.convertDoubleToString(db2bshdlfk));
        map.put("db2bshdln", CommonFunc.convertDoubleToString(db2bshdln));
        map.put("db2bshdld", CommonFunc.convertDoubleToString(db2bshdld));
        map.put("db2bshdlb", CommonFunc.convertDoubleToString(db2bshdlb));

        map.put("dbdjl2", CommonFunc.convertDoubleToString(dbdjl2));

        //        链条
        map.put("db2bltxh", CommonFunc.convertDoubleToString(db2bltxh));
        map.put("tlt1", CommonFunc.convertDoubleToString(tlt1));
        map.put("nlt1", CommonFunc.convertDoubleToString(nlt1));

//        齿轮齿条式伸缩机构
        map.put("ssjgxh", CommonFunc.convertDoubleToString(ssjgxh));
        map.put("nssjg", CommonFunc.convertDoubleToString(nssjg));
        map.put("fssjgk", CommonFunc.convertDoubleToString(fssjgk));
        map.put("pssjg", CommonFunc.convertDoubleToString(pssjg));

        //        液压式伸缩机构
        map.put("ssdd", CommonFunc.convertDoubleToString(ssdd));
        map.put("ssxd", CommonFunc.convertDoubleToString(ssxd));
        map.put("ssi", CommonFunc.convertDoubleToString(ssi));
        map.put("sslltlk", CommonFunc.convertDoubleToString(sslltlk));
        map.put("ssnsl", CommonFunc.convertDoubleToString(ssnsl));
        map.put("sslb", CommonFunc.convertDoubleToString(sslb));
        map.put("ssns", CommonFunc.convertDoubleToString(ssns));
        map.put("ssnk", CommonFunc.convertDoubleToString(ssnk));
        map.put("ssk", CommonFunc.convertDoubleToString(ssk));

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
        map.put("m6db", CommonFunc.convertDoubleToString(m6db));
        map.put("m7db", CommonFunc.convertDoubleToString(m7db));
        map.put("mlz", CommonFunc.convertDoubleToString(mlz));

        map.put("fslf", CommonFunc.convertDoubleToString(fslf));
        map.put("fshlf", CommonFunc.convertDoubleToString(fshlf));
        map.put("ff1", CommonFunc.convertDoubleToString(ff1));
        map.put("ff2", CommonFunc.convertDoubleToString(ff2));
        map.put("ff3", CommonFunc.convertDoubleToString(ff3));
        map.put("ff6gl", CommonFunc.convertDoubleToString(ff6gl));
        map.put("ff7gl", CommonFunc.convertDoubleToString(ff7gl));
        map.put("flz", CommonFunc.convertDoubleToString(flz));

        map.put("lslp", CommonFunc.convertDoubleToString(lslp));
        map.put("lshlp", CommonFunc.convertDoubleToString(lshlp));
        map.put("lp1", CommonFunc.convertDoubleToString(lp1));
        map.put("lp2", CommonFunc.convertDoubleToString(lp2));
        map.put("lp3", CommonFunc.convertDoubleToString(lp3));
        map.put("lp6gl", CommonFunc.convertDoubleToString(lp6gl));
        map.put("lp7gl", CommonFunc.convertDoubleToString(lp7gl));

        map.put("lslpi", CommonFunc.convertDoubleToString(lslpi));
        map.put("lshlpi", CommonFunc.convertDoubleToString(lshlpi));
        map.put("lp1i", CommonFunc.convertDoubleToString(lp1i));
        map.put("lp2i", CommonFunc.convertDoubleToString(lp2i));
        map.put("lp3i", CommonFunc.convertDoubleToString(lp3i));
        map.put("lp7gli", CommonFunc.convertDoubleToString(lp7gli));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Map<String, String> result = new HashMap<>();

        return result;
    }

    public Map<String, Double> takeDoubleMapForPdf(String type) {
        Map<String, Double> map = new HashMap();

        //第二段搭接处滚轮
        Double mslli= fslf * lslpi ;
        Double mshlli= fshlf * lshlpi ;
        Double ml1i= ff1 * lp1i ;
        Double ml2i= ff2 * lp2i ;
        Double ml3i= ff3 * lp3i ;
        Double ml7i= ff7gl * lp7gli ;
        map.put("mslli", mslli);
        map.put("mshlli", mshlli);
        map.put("ml1i", ml1i);
        map.put("ml2i", ml2i);
        map.put("ml3i", ml3i);
        map.put("ml7i", ml7i);

        Double mli = mslli + mshlli + ml1i + ml2i + ml3i + ml7i ;
        Double ngl4 = mli / dbdjl2 / 1000 ;
        Double ngl3 = ( flz - ff6gl ) / 1000 + ngl4 ;
        Double ngl41 = ngl4 * Math.cos( Math.PI / 4 ) ;
        Double ngl31 = ngl3 * Math.cos( Math.PI / 4 ) ;
        Double glbz6 = ngl31 / db1bxglfk ;
        Double glbz7 = ngl41 / db2bshdlfk ;
        map.put("mli", mli);
        map.put("ngl4", ngl4);
        map.put("ngl3", ngl3);
        map.put("ngl41", ngl41);
        map.put("ngl31", ngl31);
        map.put("glbz6", glbz6);
        map.put("glbz7", glbz7);

        Double shz3 = sqrt( 0.35 * 210000 * 1000 * ngl31 / db1bxgld / db1bxglb / db1bxgln ) ;
        Double shz4 = sqrt( 0.35 * 210000 * 1000 * ngl41 / db2bshdld / db2bshdlb / db2bshdln ) ;
        Double glbz8 = shz3 / dbgcshzr ;
        Double glbz9 = shz4 / dbgcshzr ;
        map.put("shz3", shz3);
        map.put("shz4", shz4);
        map.put("glbz8", glbz8);
        map.put("glbz9", glbz9);

//第一段搭接处滚轮
        Double msll= fslf * lslp ;
        Double mshll= fshlf * lshlp ;
        Double ml1= ff1 * lp1 ;
        Double ml2= ff2 * lp2 ;
        Double ml3= ff3 * lp3 ;
        Double ml6= ff6gl * lp6gl ;
        Double ml7= ff7gl * lp7gl ;
        map.put("msll", msll);
        map.put("mshll", mshll);
        map.put("ml1", ml1);
        map.put("ml2", ml2);
        map.put("ml3", ml3);
        map.put("ml6", ml6);
        map.put("ml7", ml7);

        Double ml = msll + mshll + ml1 + ml2 + ml3 + ml6 + ml7 ;
        Double ngl2 = ml / dbdjl1 / 1000 ;
        Double ngl1 = flz / 1000 + ngl2 ;
        Double ngl21 = ngl2 * Math.cos( Math.PI / 4 ) ;
        Double ngl11 = ngl1 * Math.cos( Math.PI / 4 ) ;
        Double glbz1 = ngl11 / dbjbxglfk ;
        Double glbz2 = ngl21 / db1bshdlfk ;
        map.put("ml", ml);
        map.put("ngl2", ngl2);
        map.put("ngl1", ngl1);
        map.put("ngl21", ngl21);
        map.put("ngl11", ngl11);
        map.put("glbz1", glbz1);
        map.put("glbz2", glbz2);

        Double shz1 = sqrt( 0.35 * 210000 * 1000 * ngl11 / dbjbxgld / dbjbxglb / dbjbxgln ) ;
        Double shz2 = sqrt( 0.35 * 210000 * 1000 * ngl21 / db1bshdld / db1bshdlb / db1bshdln ) ;
        Double glbz3 = shz1 / dbgcshzr ;
        Double glbz4 = shz2 / dbgcshzr ;
        map.put("shz1", shz1);
        map.put("shz2", shz2);
        map.put("glbz3", glbz3);
        map.put("glbz4", glbz4);

        //        链条校核
        Double f3 = 2 * ngl31 * 0.05 / db1bxglr ;
        Double f4 = 2 * ngl41 * 0.05 / db2bshdlr ;
        Double tlts1 = ( tsl + tshl + ( mlz - m6db ) * Math.sin( dbyj / 180 * Math.PI ) ) * 10 / 1000 + f3 +f4 ;
        Double tltbz1 = nlt1 * tlt1 ;
        Double glbz10 = nlt1 * tlt1 / tlts1 ;
        map.put("f3", f3);
        map.put("f4", f4);
        map.put("tlts1", tlts1);
        map.put("tltbz1", tltbz1);
        map.put("glbz10", glbz10);

        //        齿轮齿条式伸缩机构机构推力
        if (ssjgxsModel.equals("齿轮齿条式伸缩机构")) {
            Double f1 = 2 * ngl11 * 0.05 / dbjbxglr;
            Double f2 = 2 * ngl21 * 0.05 / db1bshdlr;
            Double tjs = 2 * tlts1 + m6db * 10 * Math.sin(dbyj / 180 * Math.PI) / 1000 + f1 + f2;
            Double tn = nssjg * fssjgk ;
            Double glbz5 = tjs / tn;
            map.put("f1", f1);
            map.put("f2", f2);
            map.put("tjs", tjs);
            map.put("tn", tn);
            map.put("glbz5", glbz5);
        }

        //        液压式伸缩机构机构推力
        if (ssjgxsModel.equals("液压式伸缩机构")) {
            Double f1 = 2 * ngl11 * 0.05 / dbjbxglr;
            Double f2 = 2 * ngl21 * 0.05 / db1bshdlr;
            Double tjs = 2 * tlts1 + m6db * 10 * Math.sin(dbyj / 180 * Math.PI) / 1000 + f1 + f2;
            Double tyys = ssns * tjs / ssnsl;
            Double yyssbz1 = tyys / sslltlk;
            map.put("f1", f1);
            map.put("f2", f2);
            map.put("tjs", tjs);
            map.put("tyys", tyys);
            map.put("yyssbz1", yyssbz1);

            //        液压式伸缩机构机构稳定性
            Double fk = 3.14 * 3.14 * 180000 * ssi / ssk / ssk / sslb / sslb;
            Double fknk = fk / ssnk / 1000;
            Double tjsyy = tjs;
            Double yyssbz2 = tjs / fknk;
            map.put("fk", fk);
            map.put("fknk", fknk);
            map.put("tjsyy", tjsyy);
            map.put("yyssbz2", yyssbz2);
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

        Double ngl31 = doubleMap.get("ngl31");
        Double ngl41 = doubleMap.get("ngl41");
        String glb6 = takeSignByCompareNumber(ngl31, db1bxglfk);
        String glb7 = takeSignByCompareNumber(ngl41, db2bshdlfk);
        String glm6 = takeStringByCompareNumber(ngl31, db1bxglfk);
        String glm7 = takeStringByCompareNumber(ngl41, db2bshdlfk);
        map.put("glb6", CommonFunc.convertDoubleToString(glb6));
        map.put("glb7", CommonFunc.convertDoubleToString(glb7));
        map.put("glm6", CommonFunc.convertDoubleToString(glm6));
        map.put("glm7", CommonFunc.convertDoubleToString(glm7));

        Double shz3 = doubleMap.get("shz3");
        Double shz4 = doubleMap.get("shz4");
        String glb8 = takeSignByCompareNumber(shz3, dbgcshzr);
        String glb9 = takeSignByCompareNumber(shz4, dbgcshzr);
        String glm8 = takeStringByCompareNumber(shz3, dbgcshzr);
        String glm9 = takeStringByCompareNumber(shz4, dbgcshzr);
        map.put("glb8", CommonFunc.convertDoubleToString(glb8));
        map.put("glb9", CommonFunc.convertDoubleToString(glb9));
        map.put("glm8", CommonFunc.convertDoubleToString(glm8));
        map.put("glm9", CommonFunc.convertDoubleToString(glm9));

        Double ngl11 = doubleMap.get("ngl11");
        Double ngl21 = doubleMap.get("ngl21");
        String glb1 = takeSignByCompareNumber(ngl11, dbjbxglfk);
        String glb2 = takeSignByCompareNumber(ngl21, db1bshdlfk);
        String glm1 = takeStringByCompareNumber(ngl11, dbjbxglfk);
        String glm2 = takeStringByCompareNumber(ngl21, db1bshdlfk);
        map.put("glb1", CommonFunc.convertDoubleToString(glb1));
        map.put("glb2", CommonFunc.convertDoubleToString(glb2));
        map.put("glm1", CommonFunc.convertDoubleToString(glm1));
        map.put("glm2", CommonFunc.convertDoubleToString(glm2));

        Double shz1 = doubleMap.get("shz1");
        Double shz2 = doubleMap.get("shz2");
        String glb3 = takeSignByCompareNumber(shz1, dbgcshzr);
        String glb4 = takeSignByCompareNumber(shz2, dbgcshzr);
        String glm3 = takeStringByCompareNumber(shz1, dbgcshzr);
        String glm4 = takeStringByCompareNumber(shz2, dbgcshzr);
        map.put("glb3", CommonFunc.convertDoubleToString(glb3));
        map.put("glb4", CommonFunc.convertDoubleToString(glb4));
        map.put("glm3", CommonFunc.convertDoubleToString(glm3));
        map.put("glm4", CommonFunc.convertDoubleToString(glm4));

        Double glbz10 = doubleMap.get("glbz10");
        String glb10 = takeSignByCompareNumber(glbz10, 8.0);
        String glm10 = (glbz10 < 8) ? "不满足" : "满足";
        map.put("glb10", CommonFunc.convertDoubleToString(glb10));
        map.put("glm10", CommonFunc.convertDoubleToString(glm10));

        if (ssjgxsModel.equals("齿轮齿条式伸缩机构")) {
            Double tjs = doubleMap.get("tjs");
            Double tn = doubleMap.get("tn");
            String glb5 = takeSignByCompareNumber(tjs, tn);
            String glm5 = takeStringByCompareNumber(tjs, tn);
            map.put("glb5", CommonFunc.convertDoubleToString(glb5));
            map.put("glm5", CommonFunc.convertDoubleToString(glm5));
        }

        if (ssjgxsModel.equals("液压式伸缩机构")) {
            Double tyys = doubleMap.get("tyys");
            String yyssb1 = takeSignByCompareNumber(tyys, sslltlk);
            String yyssm1 = takeStringByCompareNumber(tyys, sslltlk);
            map.put("yyssb1", CommonFunc.convertDoubleToString(yyssb1));
            map.put("yyssm1", CommonFunc.convertDoubleToString(yyssm1));

            Double tjs = doubleMap.get("tjs");
            Double fknk = doubleMap.get("fknk");
            String yyssb2 = takeSignByCompareNumber(tjs, fknk);
            String yyssm2 = takeStringByCompareNumber(tjs, fknk);
            map.put("yyssb2", CommonFunc.convertDoubleToString(yyssb2));
            map.put("yyssm2", CommonFunc.convertDoubleToString(yyssm2));
        }

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
