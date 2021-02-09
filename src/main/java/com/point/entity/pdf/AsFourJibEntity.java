package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class AsFourJibEntity {
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
    private Double lbx;
    private Double dbyj;
    private Double dblqcz;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double acx5;
    private Double gruqhxs;
//    private Double gruwzxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;

    //    提示提醒
    private String grutstx;

//    private Double dbmjb;
    private Double mbgj;
    private Double mbmj;

//    private Double dbm1b;
    private Double mbg1;
    private Double mbm1;

//    private Double dbm2b;
    private Double mbg2;
    private Double mbm2;

//    private Double dbm3b;
    private Double mbg3;
    private Double mbm3;

//    private Double dbm4b;
    private Double mbg4;
    private Double mbm4;

    //    挠度
//    private Double dbld;
    private Double dblx1;
    private Double dblx2;
    private Double dblx3;
    private Double dblx4;
    private Double dblx5;
    private Double dbld1;
    private Double dbld2;
    private Double dbld3;
    private Double dbld4;
    private Double dbld5;
//    private Double dbhd2;
//    private Double dbhd3;
//    private Double dbhd4;
//    private Double dbhd5;

//    基臂
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

//    一臂
    private String dbgcphi;
    private Double dbssi;
    private Double db1h;
    private Double db1b;
    private Double db1e;
    private Double dbwxi;
    private Double dbwyi;
    private Double dbixi;
    private Double dblmi;
    private Double dblli;

//    二臂
    private String dbgcphii;
    private Double dbssii;
    private Double db2h;
    private Double db2b;
    private Double db2e;
    private Double dbwxii;
    private Double dbwyii;
    private Double dbixii;
    private Double dblmii;
    private Double dbllii;

    //   三臂
    private String dbgcphiii;
    private Double dbssiii;
    private Double db3h;
    private Double db3b;
    private Double db3e;
    private Double dbwxiii;
    private Double dbwyiii;
    private Double dbixiii;
    private Double dblmiii;
    private Double dblliii;

    //    四臂
    private String dbgcphiv;
    private Double dbssiv;
    private Double db4h;
    private Double db4b;
    private Double db4e;
    private Double dbwxiv;
    private Double dbwyiv;
    private Double dbixiv;
    private Double dblmiv;
    private Double dblliv;

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
    private Double m6db;
    private Double m7db;
    private Double m8db;
    private Double m9db;

    private Double m6dbxt;
    private Double m7dbxt;
    private Double m8dbxt;
    private Double m9dbxt;

//    private Double m4jbnd;
//    private Double m5dbnd;
//    private Double kgpdbpg;
//    private Double kgpdbpq;
//    private Double pdbpg;
//    private Double pdbpq;

    private Double aslcx;
    private Double ashlcx;
    private Double acx1;
    private Double acx2;
    private Double acx3;
    private Double acx4cq;
    private Double acx5db;
    private Double acx6db;
    private Double acx7db;
    private Double acx8db;
    private Double acx9db;

    private Double lslc;
    private Double lshlc;
    private Double lc1;
    private Double lc2;
    private Double lc3;
    private Double lc4;
    private Double lc5;
    private Double lc6;
    private Double lc7;
    private Double lc8;
    private Double lc9;

    private Double lslx;
    private Double lshlx;
    private Double lx1;
    private Double lx2;
    private Double lx3;
    private Double lx4;
    private Double lx5;
    private Double lx6;
    private Double lx7;
    private Double lx8;
    private Double lx9;

    private Double lslci;
    private Double lshlci;
    private Double lc1i;
    private Double lc2i;
    private Double lc3i;
    private Double lc6ind;
    private Double lc7i;
    private Double lc8i;
    private Double lc9i;
    private Double lc6i;

    private Double lslxi;
    private Double lshlxi;
    private Double lx1i;
    private Double lx2i;
    private Double lx3i;
    private Double lx6i;
    private Double lx7i;
    private Double lx8i;
    private Double lx9i;

    private Double lslcii;
    private Double lshlcii;
    private Double lc1ii;
    private Double lc2ii;
    private Double lc3ii;
    private Double lc7iind;
    private Double lc8ii;
    private Double lc9ii;
    private Double lc7ii;

    private Double lslxii;
    private Double lshlxii;
    private Double lx1ii;
    private Double lx2ii;
    private Double lx3ii;
    private Double lx7ii;
    private Double lx8ii;
    private Double lx9ii;

    private Double lslciii;
    private Double lshlciii;
    private Double lc1iii;
    private Double lc2iii;
    private Double lc3iii;
    private Double lc8iiind;
    private Double lc9iii;
    private Double lc8iii;

    private Double lslxiii;
    private Double lshlxiii;
    private Double lx1iii;
    private Double lx2iii;
    private Double lx3iii;
    private Double lx8iii;
    private Double lx9iii;

    private Double lslciv;
    private Double lshlciv;
    private Double lc1iv;
    private Double lc2iv;
    private Double lc3iv;
    private Double lc9ivnd;
    private Double lc9iv;

    private Double lslxiv;
    private Double lshlxiv;
    private Double lx1iv;
    private Double lx2iv;
    private Double lx3iv;
    private Double lx9iv;

    private Double lslcv;
    private Double lshlcv;
    private Double lc1v;
    private Double lc2v;
    private Double lc3v;

    private String db4Model;
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
        map.put("lbx", CommonFunc.convertDoubleToString(lbx));
        map.put("dbyj", CommonFunc.convertDoubleToString(dbyj));
        map.put("dblqcz", CommonFunc.convertDoubleToString(dblqcz));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("gruqhxs", CommonFunc.convertDoubleToString(gruqhxs));
//        map.put("gruwzxs", CommonFunc.convertDoubleToString(gruwzxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

//        map.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        map.put("mbgj", CommonFunc.convertDoubleToString(mbgj));
        map.put("mbmj", CommonFunc.convertDoubleToString(mbmj));

//        map.put("dbm1b", CommonFunc.convertDoubleToString(dbm1b));
        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));

//        map.put("dbm2b", CommonFunc.convertDoubleToString(dbm2b));
        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));

//        map.put("dbm3b", CommonFunc.convertDoubleToString(dbm3b));
        map.put("mbg3", CommonFunc.convertDoubleToString(mbg3));
        map.put("mbm3", CommonFunc.convertDoubleToString(mbm3));

//        map.put("dbm4b", CommonFunc.convertDoubleToString(dbm4b));
        map.put("mbg4", CommonFunc.convertDoubleToString(mbg4));
        map.put("mbm4", CommonFunc.convertDoubleToString(mbm4));

//        map.put("dbld", CommonFunc.convertDoubleToString(dbld));
        map.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
        map.put("dblx2", CommonFunc.convertDoubleToString(dblx2));
        map.put("dblx3", CommonFunc.convertDoubleToString(dblx3));
        map.put("dblx4", CommonFunc.convertDoubleToString(dblx4));
        map.put("dblx5", CommonFunc.convertDoubleToString(dblx5));
        map.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        map.put("dbld2", CommonFunc.convertDoubleToString(dbld2));
        map.put("dbld3", CommonFunc.convertDoubleToString(dbld3));
        map.put("dbld4", CommonFunc.convertDoubleToString(dbld4));
        map.put("dbld5", CommonFunc.convertDoubleToString(dbld5));
//        map.put("dbhd2", CommonFunc.convertDoubleToString(dbhd2));
//        map.put("dbhd3", CommonFunc.convertDoubleToString(dbhd3));
//        map.put("dbhd4", CommonFunc.convertDoubleToString(dbhd4));
//        map.put("dbhd5", CommonFunc.convertDoubleToString(dbhd5));

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

        map.put("dbgcphi", CommonFunc.convertDoubleToString(dbgcphi));
        map.put("dbssi", CommonFunc.convertDoubleToString(dbssi));
        map.put("db1h", CommonFunc.convertDoubleToString(db1h));
        map.put("db1b", CommonFunc.convertDoubleToString(db1b));
        map.put("db1e", CommonFunc.convertDoubleToString(db1e));
        map.put("dbwxi", CommonFunc.convertDoubleToString(dbwxi));
        map.put("dbwyi", CommonFunc.convertDoubleToString(dbwyi));
        map.put("dbixi", CommonFunc.convertDoubleToString(dbixi));
        map.put("dblmi", CommonFunc.convertDoubleToString(dblmi));
        map.put("dblli", CommonFunc.convertDoubleToString(dblli));

        map.put("dbgcphii", CommonFunc.convertDoubleToString(dbgcphii));
        map.put("dbssii", CommonFunc.convertDoubleToString(dbssii));
        map.put("db2h", CommonFunc.convertDoubleToString(db2h));
        map.put("db2b", CommonFunc.convertDoubleToString(db2b));
        map.put("db2e", CommonFunc.convertDoubleToString(db2e));
        map.put("dbwxii", CommonFunc.convertDoubleToString(dbwxii));
        map.put("dbwyii", CommonFunc.convertDoubleToString(dbwyii));
        map.put("dbixii", CommonFunc.convertDoubleToString(dbixii));
        map.put("dblmii", CommonFunc.convertDoubleToString(dblmii));
        map.put("dbllii", CommonFunc.convertDoubleToString(dbllii));

        map.put("dbgcphiii", CommonFunc.convertDoubleToString(dbgcphiii));
        map.put("dbssiii", CommonFunc.convertDoubleToString(dbssiii));
        map.put("db3h", CommonFunc.convertDoubleToString(db3h));
        map.put("db3b", CommonFunc.convertDoubleToString(db3b));
        map.put("db3e", CommonFunc.convertDoubleToString(db3e));
        map.put("dbwxiii", CommonFunc.convertDoubleToString(dbwxiii));
        map.put("dbwyiii", CommonFunc.convertDoubleToString(dbwyiii));
        map.put("dbixiii", CommonFunc.convertDoubleToString(dbixiii));
        map.put("dblmiii", CommonFunc.convertDoubleToString(dblmiii));
        map.put("dblliii", CommonFunc.convertDoubleToString(dblliii));

        map.put("dbgcphiv", CommonFunc.convertDoubleToString(dbgcphiv));
        map.put("dbssiv", CommonFunc.convertDoubleToString(dbssiv));
        map.put("db4h", CommonFunc.convertDoubleToString(db4h));
        map.put("db4b", CommonFunc.convertDoubleToString(db4b));
        map.put("db4e", CommonFunc.convertDoubleToString(db4e));
        map.put("dbwxiv", CommonFunc.convertDoubleToString(dbwxiv));
        map.put("dbwyiv", CommonFunc.convertDoubleToString(dbwyiv));
        map.put("dbixiv", CommonFunc.convertDoubleToString(dbixiv));
        map.put("dblmiv", CommonFunc.convertDoubleToString(dblmiv));
        map.put("dblliv", CommonFunc.convertDoubleToString(dblliv));

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
        map.put("m6db", CommonFunc.convertDoubleToString(m6db));
        map.put("m7db", CommonFunc.convertDoubleToString(m7db));
        map.put("m8db", CommonFunc.convertDoubleToString(m8db));
        map.put("m9db", CommonFunc.convertDoubleToString(m9db));

        map.put("m6dbxt", CommonFunc.convertDoubleToString(m6dbxt));
        map.put("m7dbxt", CommonFunc.convertDoubleToString(m7dbxt));
        map.put("m8dbxt", CommonFunc.convertDoubleToString(m8dbxt));
        map.put("m9dbxt", CommonFunc.convertDoubleToString(m9dbxt));

//        map.put("m4jbnd", CommonFunc.convertDoubleToString(m4jbnd));
//        map.put("m5dbnd", CommonFunc.convertDoubleToString(m5dbnd));
//        map.put("kgpdbpg", CommonFunc.convertDoubleToString(kgpdbpg));
//        map.put("kgpdbpq", CommonFunc.convertDoubleToString(kgpdbpq));
//        map.put("pdbpg", CommonFunc.convertDoubleToString(pdbpg));
//        map.put("pdbpq", CommonFunc.convertDoubleToString(pdbpq));

        map.put("aslcx", CommonFunc.convertDoubleToString(aslcx));
        map.put("ashlcx", CommonFunc.convertDoubleToString(ashlcx));
        map.put("acx1", CommonFunc.convertDoubleToString(acx1));
        map.put("acx2", CommonFunc.convertDoubleToString(acx2));
        map.put("acx3", CommonFunc.convertDoubleToString(acx3));
        map.put("acx4cq", CommonFunc.convertDoubleToString(acx4cq));
        map.put("acx5db", CommonFunc.convertDoubleToString(acx5db));
        map.put("acx6db", CommonFunc.convertDoubleToString(acx6db));
        map.put("acx7db", CommonFunc.convertDoubleToString(acx7db));
        map.put("acx8db", CommonFunc.convertDoubleToString(acx8db));
        map.put("acx9db", CommonFunc.convertDoubleToString(acx9db));

        map.put("lslc", CommonFunc.convertDoubleToString(lslc));
        map.put("lshlc", CommonFunc.convertDoubleToString(lshlc));
        map.put("lc1", CommonFunc.convertDoubleToString(lc1));
        map.put("lc2", CommonFunc.convertDoubleToString(lc2));
        map.put("lc3", CommonFunc.convertDoubleToString(lc3));
        map.put("lc4", CommonFunc.convertDoubleToString(lc4));
        map.put("lc5", CommonFunc.convertDoubleToString(lc5));
        map.put("lc6", CommonFunc.convertDoubleToString(lc6));
        map.put("lc7", CommonFunc.convertDoubleToString(lc7));
        map.put("lc8", CommonFunc.convertDoubleToString(lc8));
        map.put("lc9", CommonFunc.convertDoubleToString(lc9));

        map.put("lslx", CommonFunc.convertDoubleToString(lslx));
        map.put("lshlx", CommonFunc.convertDoubleToString(lshlx));
        map.put("lx1", CommonFunc.convertDoubleToString(lx1));
        map.put("lx2", CommonFunc.convertDoubleToString(lx2));
        map.put("lx3", CommonFunc.convertDoubleToString(lx3));
        map.put("lx4", CommonFunc.convertDoubleToString(lx4));
        map.put("lx5", CommonFunc.convertDoubleToString(lx5));
        map.put("lx6", CommonFunc.convertDoubleToString(lx6));
        map.put("lx7", CommonFunc.convertDoubleToString(lx7));
        map.put("lx8", CommonFunc.convertDoubleToString(lx8));
        map.put("lx9", CommonFunc.convertDoubleToString(lx9));

        map.put("lslci", CommonFunc.convertDoubleToString(lslci));
        map.put("lshlci", CommonFunc.convertDoubleToString(lshlci));
        map.put("lc1i", CommonFunc.convertDoubleToString(lc1i));
        map.put("lc2i", CommonFunc.convertDoubleToString(lc2i));
        map.put("lc3i", CommonFunc.convertDoubleToString(lc3i));
        map.put("lc6ind", CommonFunc.convertDoubleToString(lc6ind));
        map.put("lc7i", CommonFunc.convertDoubleToString(lc7i));
        map.put("lc8i", CommonFunc.convertDoubleToString(lc8i));
        map.put("lc9i", CommonFunc.convertDoubleToString(lc9i));
        map.put("lc6i", CommonFunc.convertDoubleToString(lc6i));

        map.put("lslxi", CommonFunc.convertDoubleToString(lslxi));
        map.put("lshlxi", CommonFunc.convertDoubleToString(lshlxi));
        map.put("lx1i", CommonFunc.convertDoubleToString(lx1i));
        map.put("lx2i", CommonFunc.convertDoubleToString(lx2i));
        map.put("lx3i", CommonFunc.convertDoubleToString(lx3i));
        map.put("lx6i", CommonFunc.convertDoubleToString(lx6i));
        map.put("lx7i", CommonFunc.convertDoubleToString(lx7i));
        map.put("lx8i", CommonFunc.convertDoubleToString(lx8i));
        map.put("lx9i", CommonFunc.convertDoubleToString(lx9i));

        map.put("lslcii", CommonFunc.convertDoubleToString(lslcii));
        map.put("lshlcii", CommonFunc.convertDoubleToString(lshlcii));
        map.put("lc1ii", CommonFunc.convertDoubleToString(lc1ii));
        map.put("lc2ii", CommonFunc.convertDoubleToString(lc2ii));
        map.put("lc3ii", CommonFunc.convertDoubleToString(lc3ii));
        map.put("lc7iind", CommonFunc.convertDoubleToString(lc7iind));
        map.put("lc8ii", CommonFunc.convertDoubleToString(lc8ii));
        map.put("lc9ii", CommonFunc.convertDoubleToString(lc9ii));
        map.put("lc7ii", CommonFunc.convertDoubleToString(lc7ii));

        map.put("lslxii", CommonFunc.convertDoubleToString(lslxii));
        map.put("lshlxii", CommonFunc.convertDoubleToString(lshlxii));
        map.put("lx1ii", CommonFunc.convertDoubleToString(lx1ii));
        map.put("lx2ii", CommonFunc.convertDoubleToString(lx2ii));
        map.put("lx3ii", CommonFunc.convertDoubleToString(lx3ii));
        map.put("lx7ii", CommonFunc.convertDoubleToString(lx7ii));
        map.put("lx8ii", CommonFunc.convertDoubleToString(lx8ii));
        map.put("lx9ii", CommonFunc.convertDoubleToString(lx9ii));

        map.put("lslciii", CommonFunc.convertDoubleToString(lslciii));
        map.put("lshlciii", CommonFunc.convertDoubleToString(lshlciii));
        map.put("lc1iii", CommonFunc.convertDoubleToString(lc1iii));
        map.put("lc2iii", CommonFunc.convertDoubleToString(lc2iii));
        map.put("lc3iii", CommonFunc.convertDoubleToString(lc3iii));
        map.put("lc8iiind", CommonFunc.convertDoubleToString(lc8iiind));
        map.put("lc9iii", CommonFunc.convertDoubleToString(lc9iii));
        map.put("lc8iii", CommonFunc.convertDoubleToString(lc8iii));

        map.put("lslxiii", CommonFunc.convertDoubleToString(lslxiii));
        map.put("lshlxiii", CommonFunc.convertDoubleToString(lshlxiii));
        map.put("lx1iii", CommonFunc.convertDoubleToString(lx1iii));
        map.put("lx2iii", CommonFunc.convertDoubleToString(lx2iii));
        map.put("lx3iii", CommonFunc.convertDoubleToString(lx3iii));
        map.put("lx8iii", CommonFunc.convertDoubleToString(lx8iii));
        map.put("lx9iii", CommonFunc.convertDoubleToString(lx9iii));

        map.put("lslciv", CommonFunc.convertDoubleToString(lslciv));
        map.put("lshlciv", CommonFunc.convertDoubleToString(lshlciv));
        map.put("lc1iv", CommonFunc.convertDoubleToString(lc1iv));
        map.put("lc2iv", CommonFunc.convertDoubleToString(lc2iv));
        map.put("lc3iv", CommonFunc.convertDoubleToString(lc3iv));
        map.put("lc9ivnd", CommonFunc.convertDoubleToString(lc9ivnd));
        map.put("lc9iv", CommonFunc.convertDoubleToString(lc9iv));

        map.put("lslxiv", CommonFunc.convertDoubleToString(lslxiv));
        map.put("lshlxiv", CommonFunc.convertDoubleToString(lshlxiv));
        map.put("lx1iv", CommonFunc.convertDoubleToString(lx1iv));
        map.put("lx2iv", CommonFunc.convertDoubleToString(lx2iv));
        map.put("lx3iv", CommonFunc.convertDoubleToString(lx3iv));
        map.put("lx9iv", CommonFunc.convertDoubleToString(lx9iv));

        map.put("lslcv", CommonFunc.convertDoubleToString(lslcv));
        map.put("lshlcv", CommonFunc.convertDoubleToString(lshlcv));
        map.put("lc1v", CommonFunc.convertDoubleToString(lc1v));
        map.put("lc2v", CommonFunc.convertDoubleToString(lc2v));
        map.put("lc3v", CommonFunc.convertDoubleToString(lc3v));

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
//基臂
        Double mslza= 1.25 * 10 * tsl * lslc ;
        Double mshlza= 1.25 * 10 * tshl * lshlc ;
        Double mza1= 1.25 * 10 * m1 * lc1 ;
        Double mza2= 1.25 * 10 * m2 * lc2 ;
        Double mza3= 1.25 * 10 * m3 * lc3 ;
        Double mza4= 1.25 * 10 * m4jbcq * lc4 ;
        Double mza5= 1.25 * 10 * m5db * lc5 ;
        Double mza6= 1.25 * 10 * m6db * lc6 ;
        Double mza7= 1.25 * 10 * m7db * lc7 ;
        Double mza8= 1.25 * 10 * m8db * lc8 ;
        Double mza9= 1.25 * 10 * m9db * lc9 ;
        map.put("mslza", mslza);
        map.put("mshlza", mshlza);
        map.put("mza1", mza1);
        map.put("mza2", mza2);
        map.put("mza3", mza3);
        map.put("mza4", mza4);
        map.put("mza5", mza5);
        map.put("mza6", mza6);
        map.put("mza7", mza7);
        map.put("mza8", mza8);
        map.put("mza9", mza9);

        Double mslwa = p * 1.25 * aslcx * lslx ;
        Double mshlwa = p * 1.25 * ashlcx * lshlx ;
        Double mwa1 = p * 1.25 * acx1 * lx1 ;
        Double mwa2 = p * 1.25 * acx2 * lx2 ;
        Double mwa3 = p * 1.25 * acx3 * lx3 ;
        Double mwa4 = p * 1.25 * acx4cq * lx4 ;
        Double mwa5 = p * 1.25 * acx5db * lx5 ;
        Double mwa6 = p * 1.25 * acx6db * lx6 ;
        Double mwa7 = p * 1.25 * acx7db * lx7 ;
        Double mwa8 = p * 1.25 * acx8db * lx8 ;
        Double mwa9 = p * 1.25 * acx9db * lx9 ;
        map.put("mslwa", mslwa);
        map.put("mshlwa", mshlwa);
        map.put("mwa1", mwa1);
        map.put("mwa2", mwa2);
        map.put("mwa3", mwa3);
        map.put("mwa4", mwa4);
        map.put("mwa5", mwa5);
        map.put("mwa6", mwa6);
        map.put("mwa7", mwa7);
        map.put("mwa8", mwa8);
        map.put("mwa9", mwa9);

        Double mz = mslza + mshlza + mza1 + mza2 + mza3 + mza4 + mza5 + mza6 + mza7 + mza8 + mza9 ;
        Double sz = 1000 * mz / dbwx ;
        Double mw = mslwa + mshlwa + mwa1 + mwa2 + mwa3 + mwa4 + mwa5 + mwa6 + mwa7 + mwa8 + mwa9 ;
        Double sw = 1000 * mw / dbwy ;
        Double smax = sz + sw ;
        Double ssqd = dbss / 1.5 ;
        map.put("mz", mz);
        map.put("sz", sz);
        map.put("mw", mw);
        map.put("sw", sw);
        map.put("smax", smax);
        map.put("ssqd", ssqd);
//挠度
        Double mslwq= 1.25 * 10 * tsl * lslci ;
        Double mshlwq= 1.25 * 10 * tshl * lshlci ;
        Double mwq1= 1.25 * 10 * m1 * lc1i ;
        Double mwq2= 1.25 * 10 * m2 * lc2i ;
        Double mwq3= 1.25 * 10 * m3 * lc3i ;
        Double mwq6= 1.25 * 10 * m6db * lc6ind ;
        Double mwq7= 1.25 * 10 * m7db * lc7i ;
        Double mwq8= 1.25 * 10 * m8db * lc8i ;
        Double mwq9= 1.25 * 10 * m9db * lc9i ;
        map.put("mslwq", mslwq);
        map.put("mshlwq", mshlwq);
        map.put("mwq1", mwq1);
        map.put("mwq2", mwq2);
        map.put("mwq3", mwq3);
        map.put("mwq6", mwq6);
        map.put("mwq7", mwq7);
        map.put("mwq8", mwq8);
        map.put("mwq9", mwq9);

        Double kn = dblm / dbll ;
        Double mwz = tsl + tshl + m1 + m2 + m3 + m6db + m7db + m8db + m9db ;
        Double f1 = 1.25 * mwz * 10 * dblm * dblm * dbll * ( 1 + kn ) / 3 / 210000 / dbix ;
        Double mwq = mslwq + mshlwq + mwq1 + mwq2 + mwq3 + mwq6 + mwq7 + mwq8 + mwq9 ;
        Double f2 = 1000 * mwq * dblm * dbll * ( 1 + 2 * kn ) / 4 / 210000 / dbix ;
        Double q = ( m4jbcq + m5db ) * 10 / dblm ;
        Double f3 = 1.25 * q * dblm * dblm * dblm * dbll * ( 4 + 3 * kn ) / 24 / 210000 / dbix ;
        Double f = f1 + f2 + f3 ;
        Double nd = ( dblm + dbll ) / 300 ;
        map.put("kn", kn);
        map.put("mwz", mwz);
        map.put("f1", f1);
        map.put("mwq", mwq);
        map.put("f2", f2);
        map.put("q", q);
        map.put("f3", f3);
        map.put("f", f);
        map.put("nd", nd);

//        一臂
        Double mwq6p= 1.25 * 10 * m6dbxt * lc6i ;
        map.put("mwq6p", mwq6p);

        Double mslwai = p * 1.25 * aslcx * lslxi ;
        Double mshlwai = p * 1.25 * ashlcx * lshlxi ;
        Double mwa1i = p * 1.25 * acx1 * lx1i ;
        Double mwa2i = p * 1.25 * acx2 * lx2i ;
        Double mwa3i = p * 1.25 * acx3 * lx3i ;
        Double mwa6i = p * 1.25 * acx6db * lx6i ;
        Double mwa7i = p * 1.25 * acx7db * lx7i ;
        Double mwa8i = p * 1.25 * acx8db * lx8i ;
        Double mwa9i = p * 1.25 * acx9db * lx9i ;
        map.put("mslwai", mslwai);
        map.put("mshlwai", mshlwai);
        map.put("mwa1i", mwa1i);
        map.put("mwa2i", mwa2i);
        map.put("mwa3i", mwa3i);
        map.put("mwa6i", mwa6i);
        map.put("mwa7i", mwa7i);
        map.put("mwa8i", mwa8i);
        map.put("mwa9i", mwa9i);

        Double mwqp = mslwq + mshlwq + mwq1 + mwq2 + mwq3 + mwq6p + mwq7 + mwq8 + mwq9 ;
        Double szi = 1000 * mwqp / dbwxi ;
        Double mwi = mslwai + mshlwai + mwa1i + mwa2i + mwa3i + mwa6i + mwa7i + mwa8i + mwa9i ;
        Double swi = 1000 * mwi / dbwyi ;
        Double smaxi = szi + swi ;
        Double ssqdi = dbssi / 1.5 ;
        map.put("mwqp", mwqp);
        map.put("szi", szi);
        map.put("mwi", mwi);
        map.put("swi", swi);
        map.put("smaxi", smaxi);
        map.put("ssqdi", ssqdi);

        //挠度
        Double mslwqi= 1.25 * 10 * tsl * lslcii ;
        Double mshlwqi= 1.25 * 10 * tshl * lshlcii ;
        Double mwq1i= 1.25 * 10 * m1 * lc1ii ;
        Double mwq2i= 1.25 * 10 * m2 * lc2ii ;
        Double mwq3i= 1.25 * 10 * m3 * lc3ii ;
        Double mwq7i= 1.25 * 10 * m7db * lc7iind ;
        Double mwq8i= 1.25 * 10 * m8db * lc8ii ;
        Double mwq9i= 1.25 * 10 * m9db * lc9ii ;
        map.put("mslwqi", mslwqi);
        map.put("mshlwqi", mshlwqi);
        map.put("mwq1i", mwq1i);
        map.put("mwq2i", mwq2i);
        map.put("mwq3i", mwq3i);
        map.put("mwq7i", mwq7i);
        map.put("mwq8i", mwq8i);
        map.put("mwq9i", mwq9i);

        Double kni = dblmi / dblli ;
        Double mwzi = tsl + tshl + m1 + m2 + m3 + m7db + m8db + m9db ;
        Double f1i = 1.25 * mwzi * 10 * dblmi * dblmi * dblli * ( 1 + kni ) / 3 / 210000 / dbixi ;
        Double mwqi = mslwqi + mshlwqi + mwq1i + mwq2i + mwq3i + mwq7i + mwq8i + mwq9i ;
        Double f2i = 1000 * mwqi * dblmi * dblli * ( 1 + 2 * kni ) / 4 / 210000 / dbixi ;
        Double qi = m6dbxt * 10 / dblmi ;
        Double f3i = 1.25 * qi * dblmi * dblmi * dblmi * dblli * ( 4 + 3 * kni ) / 24 / 210000 / dbixi ;
        Double fi = f1i + f2i + f3i ;
        Double ndi = ( dblmi + dblli ) / 300 ;
        map.put("kni", kni);
        map.put("mwzi", mwzi);
        map.put("f1i", f1i);
        map.put("mwqi", mwqi);
        map.put("f2i", f2i);
        map.put("qi", qi);
        map.put("f3i", f3i);
        map.put("fi", fi);
        map.put("ndi", ndi);

//        二臂
        Double mwq7ip= 1.25 * 10 * m7dbxt * lc7ii ;
        map.put("mwq7ip", mwq7ip);

        Double mslwaii = p * 1.25 * aslcx * lslxii ;
        Double mshlwaii = p * 1.25 * ashlcx * lshlxii ;
        Double mwa1ii = p * 1.25 * acx1 * lx1ii ;
        Double mwa2ii = p * 1.25 * acx2 * lx2ii ;
        Double mwa3ii = p * 1.25 * acx3 * lx3ii ;
        Double mwa7ii = p * 1.25 * acx7db * lx7ii ;
        Double mwa8ii = p * 1.25 * acx8db * lx8ii ;
        Double mwa9ii = p * 1.25 * acx9db * lx9ii ;
        map.put("mslwaii", mslwaii);
        map.put("mshlwaii", mshlwaii);
        map.put("mwa1ii", mwa1ii);
        map.put("mwa2ii", mwa2ii);
        map.put("mwa3ii", mwa3ii);
        map.put("mwa7ii", mwa7ii);
        map.put("mwa8ii", mwa8ii);
        map.put("mwa9ii", mwa9ii);

        Double mwqip = mslwqi+ mshlwqi + mwq1i + mwq2i + mwq3i + mwq7ip + mwq8i + mwq9i ;
        Double szii = 1000 * mwqip / dbwxii ;
        Double mwii = mslwaii + mshlwaii + mwa1ii + mwa2ii + mwa3ii + mwa7ii + mwa8ii + mwa9ii ;
        Double swii = 1000 * mwii / dbwyii ;
        Double smaxii = szii + swii ;
        Double ssqdii = dbssii / 1.5 ;
        map.put("mwqip", mwqip);
        map.put("szii", szii);
        map.put("mwii", mwii);
        map.put("swii", swii);
        map.put("smaxii", smaxii);
        map.put("ssqdii", ssqdii);

        //挠度
        Double mslwqii= 1.25 * 10 * tsl * lslciii ;
        Double mshlwqii= 1.25 * 10 * tshl * lshlciii ;
        Double mwq1ii= 1.25 * 10 * m1 * lc1iii ;
        Double mwq2ii= 1.25 * 10 * m2 * lc2iii ;
        Double mwq3ii= 1.25 * 10 * m3 * lc3iii ;
        Double mwq8ii= 1.25 * 10 * m8db * lc8iiind ;
        Double mwq9ii= 1.25 * 10 * m9db * lc9iii ;
        map.put("mslwqii", mslwqii);
        map.put("mshlwqii", mshlwqii);
        map.put("mwq1ii", mwq1ii);
        map.put("mwq2ii", mwq2ii);
        map.put("mwq3ii", mwq3ii);
        map.put("mwq8ii", mwq8ii);
        map.put("mwq9ii", mwq9ii);

        Double knii = dblmii / dbllii ;
        Double mwzii = tsl + tshl + m1 + m2 + m3 + m8db + m9db ;
        Double f1ii = 1.25 * mwzii * 10 * dblmii * dblmii * dbllii * ( 1 + knii ) / 3 / 210000 / dbixii ;
        Double mwqii = mslwqii + mshlwqii + mwq1ii + mwq2ii + mwq3ii + mwq8ii + mwq9ii ;
        Double f2ii = 1000 * mwqii * dblmii * dbllii * ( 1 + 2 * knii ) / 4 / 210000 / dbixii ;
        Double qii = m7dbxt * 10 / dblmii ;
        Double f3ii = 1.25 * qii * dblmii * dblmii * dblmii * dbllii * ( 4 + 3 * knii ) / 24 / 210000 / dbixii ;
        Double fii = f1ii + f2ii + f3ii ;
        Double ndii =  ( dblmii + dbllii ) / 300 ;
        map.put("knii", knii);
        map.put("mwzii", mwzii);
        map.put("f1ii", f1ii);
        map.put("mwqii", mwqii);
        map.put("f2ii", f2ii);
        map.put("qii", qii);
        map.put("f3ii", f3ii);
        map.put("fii", fii);
        map.put("ndii", ndii);

//        三臂
        Double mwq8iip= 1.25 * 10 * m8dbxt * lc8iii ;
        map.put("mwq8iip", mwq8iip);

        Double mslwaiii = p * 1.25 * aslcx * lslxiii ;
        Double mshlwaiii = p * 1.25 * ashlcx * lshlxiii ;
        Double mwa1iii = p * 1.25 * acx1 * lx1iii ;
        Double mwa2iii = p * 1.25 * acx2 * lx2iii ;
        Double mwa3iii = p * 1.25 * acx3 * lx3iii ;
        Double mwa8iii = p * 1.25 * acx8db * lx8iii ;
        Double mwa9iii = p * 1.25 * acx9db * lx9iii ;
        map.put("mslwaiii", mslwaiii);
        map.put("mshlwaiii", mshlwaiii);
        map.put("mwa1iii", mwa1iii);
        map.put("mwa2iii", mwa2iii);
        map.put("mwa3iii", mwa3iii);
        map.put("mwa8iii", mwa8iii);
        map.put("mwa9iii", mwa9iii);

        Double mwqiip = mslwqii + mshlwqii + mwq1ii + mwq2ii + mwq3ii + mwq8iip + mwq9ii ;
        Double sziii = 1000 * mwqiip / dbwxiii ;
        Double mwiii = mslwaiii + mshlwaiii + mwa1iii + mwa2iii + mwa3iii + mwa8iii + mwa9iii ;
        Double swiii = 1000 * mwiii / dbwyiii ;
        Double smaxiii = sziii + swiii ;
        Double ssqdiii = dbssiii / 1.5 ;
        map.put("mwqiip", mwqiip);
        map.put("sziii", sziii);
        map.put("mwiii", mwiii);
        map.put("swiii", swiii);
        map.put("smaxiii", smaxiii);
        map.put("ssqdiii", ssqdiii);

        //挠度
        Double mslwqiii= 1.25 * 10 * tsl * lslciv ;
        Double mshlwqiii= 1.25 * 10 * tshl * lshlciv ;
        Double mwq1iii= 1.25 * 10 * m1 * lc1iv ;
        Double mwq2iii= 1.25 * 10 * m2 * lc2iv ;
        Double mwq3iii= 1.25 * 10 * m3 * lc3iv ;
        Double mwq9iii= 1.25 * 10 * m9db * lc9ivnd ;
        map.put("mslwqiii", mslwqiii);
        map.put("mshlwqiii", mshlwqiii);
        map.put("mwq1iii", mwq1iii);
        map.put("mwq2iii", mwq2iii);
        map.put("mwq3iii", mwq3iii);
        map.put("mwq9iii", mwq9iii);

        Double kniii = dblmiii / dblliii ;
        Double mwziii = tsl + tshl + m1 + m2 + m3 + m9db ;
        Double f1iii = 1.25 * mwziii * 10 * dblmiii * dblmiii * dblliii * ( 1 + kniii ) / 3 / 210000 / dbixiii ;
        Double mwqiii = mslwqiii + mshlwqiii + mwq1iii + mwq2iii + mwq3iii + mwq9iii ;
        Double f2iii = 1000 * mwqiii * dblmiii * dblliii * ( 1 + 2 * kniii ) / 4 / 210000 / dbixiii ;
        Double qiii = m8dbxt * 10 / dblmiii ;
        Double f3iii = 1.25 * qiii * dblmiii * dblmiii * dblmiii * dblliii * ( 4 + 3 * kniii ) / 24 / 210000 / dbixiii ;
        Double fiii = f1iii + f2iii + f3iii ;
        Double ndiii = ( dblmiii + dblliii ) / 300 ;
        map.put("kniii", kniii);
        map.put("mwziii", mwziii);
        map.put("f1iii", f1iii);
        map.put("mwqiii", mwqiii);
        map.put("f2iii", f2iii);
        map.put("qiii", qiii);
        map.put("f3iii", f3iii);
        map.put("fiii", fiii);
        map.put("ndiii", ndiii);

        //        四臂
        Double mwq9iiip= 1.25 * 10 * m9dbxt * lc9iv ;
        map.put("mwq9iiip", mwq9iiip);

        Double mslwaiv = p * 1.25 * aslcx * lslxiv ;
        Double mshlwaiv = p * 1.25 * ashlcx * lshlxiv ;
        Double mwa1iv = p * 1.25 * acx1 * lx1iv ;
        Double mwa2iv = p * 1.25 * acx2 * lx2iv ;
        Double mwa3iv = p * 1.25 * acx3 * lx3iv ;
        Double mwa9iv = p * 1.25 * acx9db * lx9iv ;
        map.put("mslwaiv", mslwaiv);
        map.put("mshlwaiv", mshlwaiv);
        map.put("mwa1iv", mwa1iv);
        map.put("mwa2iv", mwa2iv);
        map.put("mwa3iv", mwa3iv);
        map.put("mwa9iv", mwa9iv);

        Double mwqiiip = mslwqiii+ mshlwqiii + mwq1iii + mwq2iii + mwq3iii + mwq9iiip ;
        Double sziv = 1000 * mwqiiip / dbwxiv ;
        Double mwiv = mslwaiv + mshlwaiv + mwa1iv + mwa2iv + mwa3iv + mwa9iv ;
        Double swiv = 1000 * mwiv / dbwyiv ;
        Double smaxiv = sziv + swiv ;
        Double ssqdiv = dbssiv / 1.5 ;
        map.put("mwqiiip", mwqiiip);
        map.put("sziv", sziv);
        map.put("mwiv", mwiv);
        map.put("swiv", swiv);
        map.put("smaxiv", smaxiv);
        map.put("ssqdiv", ssqdiv);

        //挠度
        Double mslwqiv= 1.25 * 10 * tsl * lslcv ;
        Double mshlwqiv= 1.25 * 10 * tshl * lshlcv ;
        Double mwq1iv= 1.25 * 10 * m1 * lc1v ;
        Double mwq2iv= 1.25 * 10 * m2 * lc2v ;
        Double mwq3iv= 1.25 * 10 * m3 * lc3v ;
        map.put("mslwqiv", mslwqiv);
        map.put("mshlwqiv", mshlwqiv);
        map.put("mwq1iv", mwq1iv);
        map.put("mwq2iv", mwq2iv);
        map.put("mwq3iv", mwq3iv);

        Double kniv = dblmiv / dblliv ;
        Double mwziv = tsl + tshl + m1 + m2 + m3 ;
        Double f1iv = 1.25 * mwziv * 10 * dblmiv * dblmiv * dblliv * ( 1 + kniv ) / 3 / 210000 / dbixiv ;
        Double mwqiv = mslwqiv + mshlwqiv + mwq1iv + mwq2iv + mwq3iv ;
        Double f2iv = 1000 * mwqiv * dblmiv * dblliv * ( 1 + 2 * kniv ) / 4 / 210000 / dbixiv ;
        Double qiv = m9dbxt * 10 / dblmiv ;
        Double f3iv = 1.25 * qiv * dblmiv * dblmiv * dblmiv* dblliv * ( 4 + 3 * kniv ) / 24 / 210000 / dbixiv ;
        Double fiv = f1iv + f2iv + f3iv ;
        Double ndiv = ( dblmiv + dblliv ) / 300 ;
        map.put("kniv", kniv);
        map.put("mwziv", mwziv);
        map.put("f1iv", f1iv);
        map.put("mwqiv", mwqiv);
        map.put("f2iv", f2iv);
        map.put("qiv", qiv);
        map.put("f3iv", f3iv);
        map.put("fiv", fiv);
        map.put("ndiv", ndiv);


//        总挠度计算
        Double fz = f + fi + fii + fiii + fiv ;
        Double ndz = dblqcz / 300 ;
        map.put("fz", fz);
        map.put("ndz", ndz);
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
        String dbbn1 = takeSignByCompareNumber(f, nd);
        String dbmn1 = takeStringByCompareNumber(f, nd);
        map.put("dbbn1", CommonFunc.convertDoubleToString(dbbn1));
        map.put("dbmn1", CommonFunc.convertDoubleToString(dbmn1));

        Double smaxi = doubleMap.get("smaxi");
        Double ssqdi = doubleMap.get("ssqdi");
        String dbb2 = takeSignByCompareNumber(smaxi, ssqdi);
        String dbm2 = takeStringByCompareNumber(smaxi, ssqdi);
        map.put("dbb2", CommonFunc.convertDoubleToString(dbb2));
        map.put("dbm2", CommonFunc.convertDoubleToString(dbm2));

        Double fi = doubleMap.get("fi");
        Double ndi = doubleMap.get("ndi");
        String dbbn2 = takeSignByCompareNumber(fi, ndi);
        String dbmn2 = takeStringByCompareNumber(fi, ndi);
        map.put("dbbn2", CommonFunc.convertDoubleToString(dbbn2));
        map.put("dbmn2", CommonFunc.convertDoubleToString(dbmn2));

        Double smaxii = doubleMap.get("smaxii");
        Double ssqdii = doubleMap.get("ssqdii");
        String dbb3 = takeSignByCompareNumber(smaxii, ssqdii);
        String dbm3 = takeStringByCompareNumber(smaxii, ssqdii);
        map.put("dbb3", CommonFunc.convertDoubleToString(dbb3));
        map.put("dbm3", CommonFunc.convertDoubleToString(dbm3));

        Double fii = doubleMap.get("fii");
        Double ndii = doubleMap.get("ndii");
        String dbbn3 = takeSignByCompareNumber(fii, ndii);
        String dbmn3 = takeStringByCompareNumber(fii, ndii);
        map.put("dbbn3", CommonFunc.convertDoubleToString(dbbn3));
        map.put("dbmn3", CommonFunc.convertDoubleToString(dbmn3));

        Double smaxiii = doubleMap.get("smaxiii");
        Double ssqdiii = doubleMap.get("ssqdiii");
        String dbb4 = takeSignByCompareNumber(smaxiii, ssqdiii);
        String dbm4 = takeStringByCompareNumber(smaxiii, ssqdiii);
        map.put("dbb4", CommonFunc.convertDoubleToString(dbb4));
        map.put("dbm4", CommonFunc.convertDoubleToString(dbm4));

        Double fiii = doubleMap.get("fiii");
        Double ndiii = doubleMap.get("ndiii");
        String dbbn4 = takeSignByCompareNumber(fiii, ndiii);
        String dbmn4 = takeStringByCompareNumber(fiii, ndiii);
        map.put("dbbn4", CommonFunc.convertDoubleToString(dbbn4));
        map.put("dbmn4", CommonFunc.convertDoubleToString(dbmn4));

        Double smaxiv = doubleMap.get("smaxiv");
        Double ssqdiv = doubleMap.get("ssqdiv");
        String dbb5 = takeSignByCompareNumber(smaxiv, ssqdiv);
        String dbm5 = takeStringByCompareNumber(smaxiv, ssqdiv);
        map.put("dbb5", CommonFunc.convertDoubleToString(dbb5));
        map.put("dbm5", CommonFunc.convertDoubleToString(dbm5));

        Double fiv = doubleMap.get("fiv");
        Double ndiv = doubleMap.get("ndiv");
        String dbbn5 = takeSignByCompareNumber(fiv, ndiv);
        String dbmn5 = takeStringByCompareNumber(fiv, ndiv);
        map.put("dbbn5", CommonFunc.convertDoubleToString(dbbn5));
        map.put("dbmn5", CommonFunc.convertDoubleToString(dbmn5));

        Double fz = doubleMap.get("fz");
        Double ndz = doubleMap.get("ndz");
        String dbb6 = takeSignByCompareNumber(fz, ndz);
        String dbm6 = takeStringByCompareNumber(fz, ndz);
        map.put("dbb6", CommonFunc.convertDoubleToString(dbb6));
        map.put("dbm6", CommonFunc.convertDoubleToString(dbm6));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
