package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.sqrt;

@Data
public class OneJibWheelEntity {
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

    private Double fssjg;
    private Double sslltl;

    private Double dbgcshzr1;

    private Double dbjbxglr;
    private Double db1bshdlr;

    private Double m5;

    //    提示提醒
    private String grutstx;

    //    平行吊臂方向距离
    private Double dblx1;
    private Double dblx2;
    private Double dbld1;
    private Double dbld2;

    //    第一段搭接处滚轮
    private String dbjbxglxh;
    private Double dbjbxglfk;
//    private Double dbjbxglf;
    private Double dbjbxgln;
    private Double dbjbxgld;
    private Double dbjbxglb;

    private String db1bshdlxh;
    private Double db1bshdlfk;
//    private Double db1bshdlf;
    private Double db1bshdln;
    private Double db1bshdld;
    private Double db1bshdlb;

    private Double dbdjl1;

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
    private Double mlz;

    private Double fslf;
    private Double fshlf;
    private Double ff1;
    private Double ff2;
    private Double ff3;
    private Double ff6gl;
    private Double flz;

    private Double lslp;
    private Double lshlp;
    private Double lp1;
    private Double lp2;
    private Double lp3;
    private Double lp6gl;

    private String db1Model;
    private String btModel;
    private String dcModel;
    private String ffbbModel;
    private String dcgssModel;
    private String gruModel;

    private String dbjbxglModel;
    private String db1bshdlModel;

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

        map.put("fssjg", CommonFunc.convertDoubleToString(fssjg));
        map.put("sslltl", CommonFunc.convertDoubleToString(sslltl));

        map.put("dbgcshzr1", CommonFunc.convertDoubleToString(dbgcshzr1));

        map.put("dbjbxglr", CommonFunc.convertDoubleToString(dbjbxglr));
        map.put("db1bshdlr", CommonFunc.convertDoubleToString(db1bshdlr));

        map.put("m5", CommonFunc.convertDoubleToString(m5));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
        map.put("dblx2", CommonFunc.convertDoubleToString(dblx2));
        map.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        map.put("dbld2", CommonFunc.convertDoubleToString(dbld2));

        map.put("dbjbxglxh", CommonFunc.convertDoubleToString(dbjbxglxh));
        map.put("dbjbxglfk", CommonFunc.convertDoubleToString(dbjbxglfk));
//        map.put("dbjbxglf", CommonFunc.convertDoubleToString(dbjbxglf));
        map.put("dbjbxgln", CommonFunc.convertDoubleToString(dbjbxgln));
        map.put("dbjbxgld", CommonFunc.convertDoubleToString(dbjbxgld));
        map.put("dbjbxglb", CommonFunc.convertDoubleToString(dbjbxglb));

        map.put("db1bshdlxh", CommonFunc.convertDoubleToString(db1bshdlxh));
        map.put("db1bshdlfk", CommonFunc.convertDoubleToString(db1bshdlfk));
//        map.put("db1bshdlf", CommonFunc.convertDoubleToString(db1bshdlf));
        map.put("db1bshdln", CommonFunc.convertDoubleToString(db1bshdln));
        map.put("db1bshdld", CommonFunc.convertDoubleToString(db1bshdld));
        map.put("db1bshdlb", CommonFunc.convertDoubleToString(db1bshdlb));

        map.put("dbdjl1", CommonFunc.convertDoubleToString(dbdjl1));

        map.put("ssjgxh", CommonFunc.convertDoubleToString(ssjgxh));
        map.put("nssjg", CommonFunc.convertDoubleToString(nssjg));
        map.put("fssjgk", CommonFunc.convertDoubleToString(fssjgk));
        map.put("pssjg", CommonFunc.convertDoubleToString(pssjg));

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
        map.put("mlz", CommonFunc.convertDoubleToString(mlz));

        map.put("fslf", CommonFunc.convertDoubleToString(fslf));
        map.put("fshlf", CommonFunc.convertDoubleToString(fshlf));
        map.put("ff1", CommonFunc.convertDoubleToString(ff1));
        map.put("ff2", CommonFunc.convertDoubleToString(ff2));
        map.put("ff3", CommonFunc.convertDoubleToString(ff3));
        map.put("ff6gl", CommonFunc.convertDoubleToString(ff6gl));
        map.put("flz", CommonFunc.convertDoubleToString(flz));

        map.put("lslp", CommonFunc.convertDoubleToString(lslp));
        map.put("lshlp", CommonFunc.convertDoubleToString(lshlp));
        map.put("lp1", CommonFunc.convertDoubleToString(lp1));
        map.put("lp2", CommonFunc.convertDoubleToString(lp2));
        map.put("lp3", CommonFunc.convertDoubleToString(lp3));
        map.put("lp6gl", CommonFunc.convertDoubleToString(lp6gl));

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
//第一段搭接处滚轮
        Double msll= fslf * lslp ;
        Double mshll= fshlf * lshlp ;
        Double ml1= ff1 * lp1 ;
        Double ml2= ff2 * lp2 ;
        Double ml3= ff3 * lp3 ;
        Double ml6= ff6gl * lp6gl ;
        map.put("msll", msll);
        map.put("mshll", mshll);
        map.put("ml1", ml1);
        map.put("ml2", ml2);
        map.put("ml3", ml3);
        map.put("ml6", ml6);

        Double ml = msll + mshll + ml1 + ml2 + ml3 + ml6 ;
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

        //        齿轮齿条式伸缩机构机构推力
        if (ssjgxsModel.equals("齿轮齿条式伸缩机构")) {
            Double f1 = 2 * ngl11 * 0.05 / dbjbxglr;
            Double f2 = 2 * ngl21 * 0.05 / db1bshdlr;
            Double tjs = (tsl + tshl + mlz * Math.sin(dbyj / 180 * Math.PI)) / 100 + f1 + f2;
            Double tn = nssjg * fssjgk;
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
            Double tjs = (tsl + tshl + mlz * Math.sin(dbyj / 180 * Math.PI)) / 100 + f1 + f2;
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

        Double glbz3 = doubleMap.get("glbz3");
        Double glbz4 = doubleMap.get("glbz4");
        String glb3 = takeSignByCompareNumber(glbz3, 1.0);
        String glb4 = takeSignByCompareNumber(glbz4, 1.0);
        String glm3 = takeStringByCompareNumber(glbz3, 1.0);
        String glm4 = takeStringByCompareNumber(glbz4, 1.0);
        map.put("glb3", CommonFunc.convertDoubleToString(glb3));
        map.put("glb4", CommonFunc.convertDoubleToString(glb4));
        map.put("glm3", CommonFunc.convertDoubleToString(glm3));
        map.put("glm4", CommonFunc.convertDoubleToString(glm4));

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
