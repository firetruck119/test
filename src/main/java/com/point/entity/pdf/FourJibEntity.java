package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class FourJibEntity {
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
    private Double nlsk;
    private Double nlski;
    private Double nlskii;
    private Double nlskiii;
    private Double nlskiv;

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double acx5;
    private Double gruqhxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;
//    private String db2xh;

    private Double dbmjb;
    private Double dbwx;
    private Double dbwy;
    private Double dbix;
    private Double mbgj;
    private Double mbmj;

    private Double dbm1b;
    private Double dbwxi;
    private Double dbwyi;
    private Double dbixi;
    private Double mbg1;
    private Double mbm1;

    private Double dbm2b;
    private Double dbwxii;
    private Double dbwyii;
    private Double dbixii;
    private Double mbg2;
    private Double mbm2;

    private Double dbm3b;
    private Double dbwxiii;
    private Double dbwyiii;
    private Double dbixiii;
    private Double mbg3;
    private Double mbm3;

    private Double dbm4b;
    private Double dbwxiv;
    private Double dbwyiv;
    private Double dbixiv;
    private Double mbg4;
    private Double mbm4;

//    基臂
    private String dbgcph;
    private Double dbss;
    private Double dbjh;
    private Double dbjb;
    private Double dbje;
    private Double dbwxls;
    private Double dbwyls;
    private Double dbixls;
    private Double dblm;
    private Double dbll;

//    一臂
    private String dbgcphi;
    private Double dbssi;
    private Double db1h;
    private Double db1b;
    private Double db1e;
    private Double dbwxlsi;
    private Double dbwylsi;
    private Double dbixlsi;
    private Double dblmi;
    private Double dblli;

//    二臂
    private String dbgcphii;
    private Double dbssii;
    private Double db2h;
    private Double db2b;
    private Double db2e;
    private Double dbwxlsii;
    private Double dbwylsii;
    private Double dbixlsii;
    private Double dblmii;
    private Double dbllii;

    //   三臂
    private String dbgcphiii;
    private Double dbssiii;
    private Double db3h;
    private Double db3b;
    private Double db3e;
    private Double dbwxlsiii;
    private Double dbwylsiii;
    private Double dbixlsiii;
    private Double dblmiii;
    private Double dblliii;

    //    四臂
    private String dbgcphiv;
    private Double dbssiv;
    private Double db4h;
    private Double db4b;
    private Double db4e;
    private Double dbwxlsiv;
    private Double dbwylsiv;
    private Double dbixlsiv;
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

    private Double lslwq;
    private Double lshlwq;
    private Double lwq1;
    private Double lwq2;
    private Double lwq3;
    private Double lwq6;
    private Double lwq7;
    private Double lwq8;
    private Double lwq9;

    private Double lwq6p;

    private Double lslxi;
    private Double lshlxi;
    private Double lx1i;
    private Double lx2i;
    private Double lx3i;
    private Double lx6i;
    private Double lx7i;
    private Double lx8i;
    private Double lx9i;

    private Double lslwqi;
    private Double lshlwqi;
    private Double lwq1i;
    private Double lwq2i;
    private Double lwq3i;
    private Double lwq7i;
    private Double lwq8i;
    private Double lwq9i;

    private Double lwq7ip;

    private Double lslxii;
    private Double lshlxii;
    private Double lx1ii;
    private Double lx2ii;
    private Double lx3ii;
    private Double lx7ii;
    private Double lx8ii;
    private Double lx9ii;

    private Double lslwqii;
    private Double lshlwqii;
    private Double lwq1ii;
    private Double lwq2ii;
    private Double lwq3ii;
    private Double lwq8ii;
    private Double lwq9ii;

    private Double lwq8iip;

    private Double lslxiii;
    private Double lshlxiii;
    private Double lx1iii;
    private Double lx2iii;
    private Double lx3iii;
    private Double lx8iii;
    private Double lx9iii;

    private Double lslwqiii;
    private Double lshlwqiii;
    private Double lwq1iii;
    private Double lwq2iii;
    private Double lwq3iii;
    private Double lwq9iii;

    private Double lwq9iiip;

    private Double lslxiv;
    private Double lshlxiv;
    private Double lx1iv;
    private Double lx2iv;
    private Double lx3iv;
    private Double lx9iv;

    private Double lslwqiv;
    private Double lshlwqiv;
    private Double lwq1iv;
    private Double lwq2iv;
    private Double lwq3iv;

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
        map.put("nlsk", CommonFunc.convertDoubleToString(nlsk));
        map.put("nlski", CommonFunc.convertDoubleToString(nlski));
        map.put("nlskii", CommonFunc.convertDoubleToString(nlskii));
        map.put("nlskiii", CommonFunc.convertDoubleToString(nlskiii));
        map.put("nlskiv", CommonFunc.convertDoubleToString(nlskiv));

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("gruqhxs", CommonFunc.convertDoubleToString(gruqhxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));
//        map.put("db2xh", CommonFunc.convertDoubleToString(db2xh));

        map.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        map.put("dbwx", CommonFunc.convertDoubleToString(dbwx));
        map.put("dbwy", CommonFunc.convertDoubleToString(dbwy));
        map.put("dbix", CommonFunc.convertDoubleToString(dbix));
        map.put("mbgj", CommonFunc.convertDoubleToString(mbgj));
        map.put("mbmj", CommonFunc.convertDoubleToString(mbmj));

        map.put("dbm1b", CommonFunc.convertDoubleToString(dbm1b));
        map.put("dbwxi", CommonFunc.convertDoubleToString(dbwxi));
        map.put("dbwyi", CommonFunc.convertDoubleToString(dbwyi));
        map.put("dbixi", CommonFunc.convertDoubleToString(dbixi));
        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));

        map.put("dbm2b", CommonFunc.convertDoubleToString(dbm2b));
        map.put("dbwxii", CommonFunc.convertDoubleToString(dbwxii));
        map.put("dbwyii", CommonFunc.convertDoubleToString(dbwyii));
        map.put("dbixii", CommonFunc.convertDoubleToString(dbixii));
        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));

        map.put("dbm3b", CommonFunc.convertDoubleToString(dbm3b));
        map.put("dbwxiii", CommonFunc.convertDoubleToString(dbwxiii));
        map.put("dbwyiii", CommonFunc.convertDoubleToString(dbwyiii));
        map.put("dbixiii", CommonFunc.convertDoubleToString(dbixiii));
        map.put("mbg3", CommonFunc.convertDoubleToString(mbg3));
        map.put("mbm3", CommonFunc.convertDoubleToString(mbm3));

        map.put("dbm4b", CommonFunc.convertDoubleToString(dbm4b));
        map.put("dbwxiv", CommonFunc.convertDoubleToString(dbwxiv));
        map.put("dbwyiv", CommonFunc.convertDoubleToString(dbwyiv));
        map.put("dbixiv", CommonFunc.convertDoubleToString(dbixiv));
        map.put("mbg4", CommonFunc.convertDoubleToString(mbg4));
        map.put("mbm4", CommonFunc.convertDoubleToString(mbm4));

        map.put("dbgcph", CommonFunc.convertDoubleToString(dbgcph));
        map.put("dbss", CommonFunc.convertDoubleToString(dbss));
        map.put("dbjh", CommonFunc.convertDoubleToString(dbjh));
        map.put("dbjb", CommonFunc.convertDoubleToString(dbjb));
        map.put("dbje", CommonFunc.convertDoubleToString(dbje));
        map.put("dbwxls", CommonFunc.convertDoubleToString(dbwxls));
        map.put("dbwyls", CommonFunc.convertDoubleToString(dbwyls));
        map.put("dbixls", CommonFunc.convertDoubleToString(dbixls));
        map.put("dblm", CommonFunc.convertDoubleToString(dblm));
        map.put("dbll", CommonFunc.convertDoubleToString(dbll));

        map.put("dbgcphi", CommonFunc.convertDoubleToString(dbgcphi));
        map.put("dbssi", CommonFunc.convertDoubleToString(dbssi));
        map.put("db1h", CommonFunc.convertDoubleToString(db1h));
        map.put("db1b", CommonFunc.convertDoubleToString(db1b));
        map.put("db1e", CommonFunc.convertDoubleToString(db1e));
        map.put("dbwxlsi", CommonFunc.convertDoubleToString(dbwxlsi));
        map.put("dbwylsi", CommonFunc.convertDoubleToString(dbwylsi));
        map.put("dbixlsi", CommonFunc.convertDoubleToString(dbixlsi));
        map.put("dblmi", CommonFunc.convertDoubleToString(dblmi));
        map.put("dblli", CommonFunc.convertDoubleToString(dblli));

        map.put("dbgcphii", CommonFunc.convertDoubleToString(dbgcphii));
        map.put("dbssii", CommonFunc.convertDoubleToString(dbssii));
        map.put("db2h", CommonFunc.convertDoubleToString(db2h));
        map.put("db2b", CommonFunc.convertDoubleToString(db2b));
        map.put("db2e", CommonFunc.convertDoubleToString(db2e));
        map.put("dbwxlsii", CommonFunc.convertDoubleToString(dbwxlsii));
        map.put("dbwylsii", CommonFunc.convertDoubleToString(dbwylsii));
        map.put("dbixlsii", CommonFunc.convertDoubleToString(dbixlsii));
        map.put("dblmii", CommonFunc.convertDoubleToString(dblmii));
        map.put("dbllii", CommonFunc.convertDoubleToString(dbllii));

        map.put("dbgcphiii", CommonFunc.convertDoubleToString(dbgcphiii));
        map.put("dbssiii", CommonFunc.convertDoubleToString(dbssiii));
        map.put("db3h", CommonFunc.convertDoubleToString(db3h));
        map.put("db3b", CommonFunc.convertDoubleToString(db3b));
        map.put("db3e", CommonFunc.convertDoubleToString(db3e));
        map.put("dbwxlsiii", CommonFunc.convertDoubleToString(dbwxlsiii));
        map.put("dbwylsiii", CommonFunc.convertDoubleToString(dbwylsiii));
        map.put("dbixlsiii", CommonFunc.convertDoubleToString(dbixlsiii));
        map.put("dblmiii", CommonFunc.convertDoubleToString(dblmiii));
        map.put("dblliii", CommonFunc.convertDoubleToString(dblliii));

        map.put("dbgcphiv", CommonFunc.convertDoubleToString(dbgcphiv));
        map.put("dbssiv", CommonFunc.convertDoubleToString(dbssiv));
        map.put("db4h", CommonFunc.convertDoubleToString(db4h));
        map.put("db4b", CommonFunc.convertDoubleToString(db4b));
        map.put("db4e", CommonFunc.convertDoubleToString(db4e));
        map.put("dbwxlsiv", CommonFunc.convertDoubleToString(dbwxlsiv));
        map.put("dbwylsiv", CommonFunc.convertDoubleToString(dbwylsiv));
        map.put("dbixlsiv", CommonFunc.convertDoubleToString(dbixlsiv));
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

        map.put("lslwq", CommonFunc.convertDoubleToString(lslwq));
        map.put("lshlwq", CommonFunc.convertDoubleToString(lshlwq));
        map.put("lwq1", CommonFunc.convertDoubleToString(lwq1));
        map.put("lwq2", CommonFunc.convertDoubleToString(lwq2));
        map.put("lwq3", CommonFunc.convertDoubleToString(lwq3));
        map.put("lwq6", CommonFunc.convertDoubleToString(lwq6));
        map.put("lwq7", CommonFunc.convertDoubleToString(lwq7));
        map.put("lwq8", CommonFunc.convertDoubleToString(lwq8));
        map.put("lwq9", CommonFunc.convertDoubleToString(lwq9));

        map.put("lwq6p", CommonFunc.convertDoubleToString(lwq6p));

        map.put("lslxi", CommonFunc.convertDoubleToString(lslxi));
        map.put("lshlxi", CommonFunc.convertDoubleToString(lshlxi));
        map.put("lx1i", CommonFunc.convertDoubleToString(lx1i));
        map.put("lx2i", CommonFunc.convertDoubleToString(lx2i));
        map.put("lx3i", CommonFunc.convertDoubleToString(lx3i));
        map.put("lx6i", CommonFunc.convertDoubleToString(lx6i));
        map.put("lx7i", CommonFunc.convertDoubleToString(lx7i));
        map.put("lx8i", CommonFunc.convertDoubleToString(lx8i));
        map.put("lx9i", CommonFunc.convertDoubleToString(lx9i));

        map.put("lslwqi", CommonFunc.convertDoubleToString(lslwqi));
        map.put("lshlwqi", CommonFunc.convertDoubleToString(lshlwqi));
        map.put("lwq1i", CommonFunc.convertDoubleToString(lwq1i));
        map.put("lwq2i", CommonFunc.convertDoubleToString(lwq2i));
        map.put("lwq3i", CommonFunc.convertDoubleToString(lwq3i));
        map.put("lwq7i", CommonFunc.convertDoubleToString(lwq7i));
        map.put("lwq8i", CommonFunc.convertDoubleToString(lwq8i));
        map.put("lwq9i", CommonFunc.convertDoubleToString(lwq9i));

        map.put("lwq7ip", CommonFunc.convertDoubleToString(lwq7ip));

        map.put("lslxii", CommonFunc.convertDoubleToString(lslxii));
        map.put("lshlxii", CommonFunc.convertDoubleToString(lshlxii));
        map.put("lx1ii", CommonFunc.convertDoubleToString(lx1ii));
        map.put("lx2ii", CommonFunc.convertDoubleToString(lx2ii));
        map.put("lx3ii", CommonFunc.convertDoubleToString(lx3ii));
        map.put("lx7ii", CommonFunc.convertDoubleToString(lx7ii));
        map.put("lx8ii", CommonFunc.convertDoubleToString(lx8ii));
        map.put("lx9ii", CommonFunc.convertDoubleToString(lx9ii));

        map.put("lslwqii", CommonFunc.convertDoubleToString(lslwqii));
        map.put("lshlwqii", CommonFunc.convertDoubleToString(lshlwqii));
        map.put("lwq1ii", CommonFunc.convertDoubleToString(lwq1ii));
        map.put("lwq2ii", CommonFunc.convertDoubleToString(lwq2ii));
        map.put("lwq3ii", CommonFunc.convertDoubleToString(lwq3ii));
        map.put("lwq8ii", CommonFunc.convertDoubleToString(lwq8ii));
        map.put("lwq9ii", CommonFunc.convertDoubleToString(lwq9ii));

        map.put("lwq8iip", CommonFunc.convertDoubleToString(lwq8iip));

        map.put("lslxiii", CommonFunc.convertDoubleToString(lslxiii));
        map.put("lshlxiii", CommonFunc.convertDoubleToString(lshlxiii));
        map.put("lx1iii", CommonFunc.convertDoubleToString(lx1iii));
        map.put("lx2iii", CommonFunc.convertDoubleToString(lx2iii));
        map.put("lx3iii", CommonFunc.convertDoubleToString(lx3iii));
        map.put("lx8iii", CommonFunc.convertDoubleToString(lx8iii));
        map.put("lx9iii", CommonFunc.convertDoubleToString(lx9iii));

        map.put("lslwqiii", CommonFunc.convertDoubleToString(lslwqiii));
        map.put("lshlwqiii", CommonFunc.convertDoubleToString(lshlwqiii));
        map.put("lwq1iii", CommonFunc.convertDoubleToString(lwq1iii));
        map.put("lwq2iii", CommonFunc.convertDoubleToString(lwq2iii));
        map.put("lwq3iii", CommonFunc.convertDoubleToString(lwq3iii));
        map.put("lwq9iii", CommonFunc.convertDoubleToString(lwq9iii));

        map.put("lwq9iiip", CommonFunc.convertDoubleToString(lwq9iiip));

        map.put("lslxiv", CommonFunc.convertDoubleToString(lslxiv));
        map.put("lshlxiv", CommonFunc.convertDoubleToString(lshlxiv));
        map.put("lx1iv", CommonFunc.convertDoubleToString(lx1iv));
        map.put("lx2iv", CommonFunc.convertDoubleToString(lx2iv));
        map.put("lx3iv", CommonFunc.convertDoubleToString(lx3iv));
        map.put("lx9iv", CommonFunc.convertDoubleToString(lx9iv));

        map.put("lslwqiv", CommonFunc.convertDoubleToString(lslwqiv));
        map.put("lshlwqiv", CommonFunc.convertDoubleToString(lshlwqiv));
        map.put("lwq1iv", CommonFunc.convertDoubleToString(lwq1iv));
        map.put("lwq2iv", CommonFunc.convertDoubleToString(lwq2iv));
        map.put("lwq3iv", CommonFunc.convertDoubleToString(lwq3iv));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Double mwqp = map.get("mwqp");
        Double mwqip = map.get("mwqip");
        Double mwqiip = map.get("mwqiip");
        Double mwqiiip = map.get("mwqiiip");
        Double m4jbhzq = mbgj / 2 + ( dblm + dbll / 2 ) * mbmj / 1000 ;
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
        Double lhzjb4 = ( mbgj * ( dblm + dbll / 2 ) / 2000 + mbmj * ( dblm + dbll / 2 ) * ( dblm + dbll / 2 ) / 2000000 ) / m4jbhzq ;
        Double lhz5; 
        if ( m5db == 0 ) {
            lhz5 = 0.0 ;
        } else {
            lhz5 = lc5 + dbll / 2000 ;
        }
        Double lhz6 = lc6 + dbll / 2000 ;
        Double lhz7 = lc7 + dbll / 2000 ;
        Double lhz8 = lc8 + dbll / 2000 ;
        Double lhz9 = lc9 + dbll / 2000 ;

        Double mslhz = tsl * lslhz * 1.25 * 10 ;
        Double mshlhz = tshl * lshlhz * 1.25 * 10 ;
        Double mhz1 = m1 * lhz1 * 1.25 * 10 ;
        Double mhz2 = m2 * lhz2 * 1.25 * 10 ;
        Double mhz3 = m3 * lhz3 * 1.25 * 10 ;
        Double mhz4 = m4jbhzq * lhzjb4 * 1.25 * 10 ;
        Double mhz5 = m5db * lhz5 * 1.25 * 10 ;
        Double mhz6 = m6db * lhz6 * 1.25 * 10 ;
        Double mhz7 = m7db * lhz7 * 1.25 * 10 ;
        Double mhz8 = m8db * lhz8 * 1.25 * 10 ;
        Double mhz9 = m9db * lhz9 * 1.25 * 10 ;
        Double mjbhz = mslhz + mshlhz + mhz1 + mhz2 + mhz3 + mhz4 + mhz5 + mhz6 + mhz7 + mhz8 + mhz9 ;
        String dbwjyb;
        if ( mjbhz < dbmjb ) {
            dbwjyb = "<" ;
        } else if ( mjbhz == dbmjb ) {
            dbwjyb = "=";
        } else{
            dbwjyb = ">";
        }
        String dbwjym = (mjbhz <= dbmjb) ? "符合" : "不符合";

        String dbwjybi;
        if ( mwqp < dbm1b ) {
            dbwjybi = "<" ;
        } else if ( mwqp == dbm1b ) {
            dbwjybi = "=";
        } else{
            dbwjybi = ">";
        }
        String dbwjymi = (mwqp <= dbm1b) ? "符合" : "不符合";

        String dbwjybii;
        if ( mwqip < dbm2b ) {
            dbwjybii = "<" ;
        } else if ( mwqip == dbm2b ) {
            dbwjybii = "=";
        } else{
            dbwjybii = ">";
        }
        String dbwjymii = (mwqip <= dbm2b) ? "符合" : "不符合";

        String dbwjybiii;
        if ( mwqiip < dbm3b ) {
            dbwjybiii = "<" ;
        } else if ( mwqiip == dbm3b ) {
            dbwjybiii = "=";
        } else{
            dbwjybiii = ">";
        }
        String dbwjymiii = (mwqiip <= dbm3b) ? "符合" : "不符合";

        String dbwjybiv;
        if ( mwqiiip < dbm4b ) {
            dbwjybiv = "<" ;
        } else if ( mwqiiip == dbm4b ) {
            dbwjybiv = "=";
        } else{
            dbwjybiv = ">";
        }
        String dbwjymiv = (mwqiiip <= dbm4b) ? "符合" : "不符合";


        Map<String, String> result = new HashMap<>();
        result.put("lbd", CommonFunc.convertDoubleToString(lbd));
        result.put("dblm", CommonFunc.convertDoubleToString(dblm));
        result.put("dbll", CommonFunc.convertDoubleToString(dbll));
        result.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        result.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        result.put("mbgj", CommonFunc.convertDoubleToString(mbgj));
        result.put("mbmj", CommonFunc.convertDoubleToString(mbmj));
        result.put("tsl", CommonFunc.convertDoubleToString(tsl));
        result.put("tshl", CommonFunc.convertDoubleToString(tshl));
        result.put("m1", CommonFunc.convertDoubleToString(m1));
        result.put("m2", CommonFunc.convertDoubleToString(m2));
        result.put("m3", CommonFunc.convertDoubleToString(m3));
        result.put("m5db", CommonFunc.convertDoubleToString(m5db));
        result.put("m6db", CommonFunc.convertDoubleToString(m6db));
        result.put("m7db", CommonFunc.convertDoubleToString(m7db));
        result.put("m8db", CommonFunc.convertDoubleToString(m8db));
        result.put("m9db", CommonFunc.convertDoubleToString(m9db));
        result.put("lc2", CommonFunc.convertDoubleToString(lc2));
        result.put("lc5", CommonFunc.convertDoubleToString(lc5));
        result.put("lc6", CommonFunc.convertDoubleToString(lc6));
        result.put("lc7", CommonFunc.convertDoubleToString(lc7));
        result.put("lc8", CommonFunc.convertDoubleToString(lc8));
        result.put("lc9", CommonFunc.convertDoubleToString(lc9));
        result.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        result.put("dbm1b", CommonFunc.convertDoubleToString(dbm1b));
        result.put("dbm2b", CommonFunc.convertDoubleToString(dbm2b));
        result.put("dbm3b", CommonFunc.convertDoubleToString(dbm3b));
        result.put("dbm4b", CommonFunc.convertDoubleToString(dbm4b));
        result.put("mwqp", CommonFunc.convertDoubleToString(mwqp));
        result.put("mwqip", CommonFunc.convertDoubleToString(mwqip));
        result.put("mwqiip", CommonFunc.convertDoubleToString(mwqiip));
        result.put("mwqiiip", CommonFunc.convertDoubleToString(mwqiiip));
        result.put("m4jbhzq", CommonFunc.convertDoubleToString(m4jbhzq));
        result.put("lslhz", CommonFunc.convertDoubleToString(lslhz));
        result.put("lshlhz", CommonFunc.convertDoubleToString(lshlhz));
        result.put("lhz1", CommonFunc.convertDoubleToString(lhz1));
        result.put("lhz2", CommonFunc.convertDoubleToString(lhz2));
        result.put("lhz3", CommonFunc.convertDoubleToString(lhz3));
        result.put("lhzjb4", CommonFunc.convertDoubleToString(lhzjb4));
        result.put("lhz5", CommonFunc.convertDoubleToString(lhz5));
        result.put("lhz6", CommonFunc.convertDoubleToString(lhz6));
        result.put("lhz7", CommonFunc.convertDoubleToString(lhz7));
        result.put("lhz8", CommonFunc.convertDoubleToString(lhz8));
        result.put("lhz9", CommonFunc.convertDoubleToString(lhz9));
        result.put("mslhz", CommonFunc.convertDoubleToString(mslhz));
        result.put("mshlhz", CommonFunc.convertDoubleToString(mshlhz));
        result.put("mhz1", CommonFunc.convertDoubleToString(mhz1));
        result.put("mhz2", CommonFunc.convertDoubleToString(mhz2));
        result.put("mhz3", CommonFunc.convertDoubleToString(mhz3));
        result.put("mhz4", CommonFunc.convertDoubleToString(mhz4));
        result.put("mhz5", CommonFunc.convertDoubleToString(mhz5));
        result.put("mhz6", CommonFunc.convertDoubleToString(mhz6));
        result.put("mhz7", CommonFunc.convertDoubleToString(mhz7));
        result.put("mhz8", CommonFunc.convertDoubleToString(mhz8));
        result.put("mhz9", CommonFunc.convertDoubleToString(mhz9));
        result.put("mjbhz", CommonFunc.convertDoubleToString(mjbhz));
        result.put("dbwjyb", CommonFunc.convertDoubleToString(dbwjyb));
        result.put("dbwjym", CommonFunc.convertDoubleToString(dbwjym));
        result.put("dbwjybi", CommonFunc.convertDoubleToString(dbwjybi));
        result.put("dbwjymi", CommonFunc.convertDoubleToString(dbwjymi));
        result.put("dbwjybii", CommonFunc.convertDoubleToString(dbwjybii));
        result.put("dbwjymii", CommonFunc.convertDoubleToString(dbwjymii));
        result.put("dbwjybiii", CommonFunc.convertDoubleToString(dbwjybiii));
        result.put("dbwjymiii", CommonFunc.convertDoubleToString(dbwjymiii));
        result.put("dbwjybiv", CommonFunc.convertDoubleToString(dbwjybiv));
        result.put("dbwjymiv", CommonFunc.convertDoubleToString(dbwjymiv));

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
        Double sz = 1000 * mz / dbwxls ;
        Double mw = mslwa + mshlwa + mwa1 + mwa2 + mwa3 + mwa4 + mwa5 + mwa6 + mwa7 + mwa8 + mwa9 ;
        Double sw = 1000 * mw / dbwyls ;
        Double smax = sz + sw ;
        Double ssqd = dbss / 1.5 ;
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
        Double mwq6 = 1.25 * 10 * m6db * lwq6 ;
        Double mwq7 = 1.25 * 10 * m7db * lwq7 ;
        Double mwq8 = 1.25 * 10 * m8db * lwq8 ;
        Double mwq9 = 1.25 * 10 * m9db * lwq9 ;
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
        Double f1 = 1.25 * mwz * 10 * dblm * dblm * dbll * ( 1 + kn ) / 3 / 210000 / dbixls ;
        Double mwq = mslwq + mshlwq + mwq1 + mwq2 + mwq3 + mwq6 + mwq7 + mwq8 + mwq9 ;
        Double f2 = 1000 * mwq * dblm * dbll * ( 1 + 2 * kn ) / 4 / 210000 / dbixls ;
        Double q = ( m4jbcq + m5db ) * 10 / dblm ;
        Double f3 = 1.25 * q * dblm * dblm * dblm * dbll * ( 4 + 3 * kn ) / 24 / 210000 / dbixls ;
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

//        一臂
        Double mwq6p = 1.25 * 10 * m6dbxt * lwq6p ;
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
        Double szi = 1000 * mwqp / dbwxlsi ;
        Double mwi = mslwai + mshlwai + mwa1i + mwa2i + mwa3i + mwa6i + mwa7i + mwa8i + mwa9i ;
        Double swi = 1000 * mwi / dbwylsi ;
        Double smaxi = szi + swi ;
        Double ssqdi = dbssi / 1.5 ;
        map.put("mwqp", mwqp);
        map.put("szi", szi);
        map.put("mwi", mwi);
        map.put("swi", swi);
        map.put("smaxi", smaxi);
        map.put("ssqdi", ssqdi);

        Double mslwqi = 1.25 * 10 * tsl * lslwqi ;
        Double mshlwqi = 1.25 * 10 * tshl * lshlwqi ;
        Double mwq1i = 1.25 * 10 * m1 * lwq1i ;
        Double mwq2i = 1.25 * 10 * m2 * lwq2i ;
        Double mwq3i = 1.25 * 10 * m3 * lwq3i ;
        Double mwq7i = 1.25 * 10 * m7db * lwq7i ;
        Double mwq8i = 1.25 * 10 * m8db * lwq8i ;
        Double mwq9i = 1.25 * 10 * m9db * lwq9i ;
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
        Double f1i = 1.25 * mwzi * 10 * dblmi * dblmi * dblli * ( 1 + kni ) / 3 / 210000 / dbixlsi ;
        Double mwqi = mslwqi + mshlwqi + mwq1i + mwq2i + mwq3i + mwq7i + mwq8i + mwq9i ;
        Double f2i = 1000 * mwqi * dblmi * dblli * ( 1 + 2 * kni ) / 4 / 210000 / dbixlsi ;
        Double qi = m6dbxt * 10 / dblmi ;
        Double f3i = 1.25 * qi * dblmi * dblmi * dblmi * dblli * ( 4 + 3 * kni ) / 24 / 210000 / dbixlsi ;
        Double fi = f1i + f2i + f3i ;
        Double ndi = dblmi * dblmi / 1000000 ;
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
        Double mwq7ip = 1.25 * 10 * m7dbxt * lwq7ip ;
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

        Double mwqip = mslwqi + mshlwqi + mwq1i + mwq2i + mwq3i + mwq7ip + mwq8i + mwq9i ;
        Double szii = 1000 * mwqip / dbwxlsii ;
        Double mwii = mslwaii + mshlwaii + mwa1ii + mwa2ii + mwa3ii + mwa7ii + mwa8ii + mwa9ii ;
        Double swii = 1000 * mwii / dbwylsii ;
        Double smaxii = szii + swii ;
        Double ssqdii = dbssii / 1.5 ;
        map.put("mwqip", mwqip);
        map.put("szii", szii);
        map.put("mwii", mwii);
        map.put("swii", swii);
        map.put("smaxii", smaxii);
        map.put("ssqdii", ssqdii);

        Double mslwqii = 1.25 * 10 * tsl * lslwqii ;
        Double mshlwqii = 1.25 * 10 * tshl * lshlwqii ;
        Double mwq1ii = 1.25 * 10 * m1 * lwq1ii ;
        Double mwq2ii = 1.25 * 10 * m2 * lwq2ii ;
        Double mwq3ii = 1.25 * 10 * m3 * lwq3ii ;
        Double mwq8ii = 1.25 * 10 * m8db * lwq8ii ;
        Double mwq9ii = 1.25 * 10 * m9db * lwq9ii ;
        map.put("mslwqii", mslwqii);
        map.put("mshlwqii", mshlwqii);
        map.put("mwq1ii", mwq1ii);
        map.put("mwq2ii", mwq2ii);
        map.put("mwq3ii", mwq3ii);
        map.put("mwq8ii", mwq8ii);
        map.put("mwq9ii", mwq9ii);

        Double knii = dblmii / dbllii ;
        Double mwzii = tsl + tshl + m1 + m2 + m3 + m8db + m9db  ;
        Double f1ii = 1.25 * mwzii * 10 * dblmii * dblmii * dbllii * ( 1 + knii ) / 3 / 210000 / dbixlsii ;
        Double mwqii = mslwqii + mshlwqii + mwq1ii + mwq2ii + mwq3ii + mwq8ii + mwq9ii ;
        Double f2ii = 1000 * mwqii * dblmii * dbllii * ( 1 + 2 * knii ) / 4 / 210000 / dbixlsii ;
        Double qii = m7dbxt * 10 / dblmii ;
        Double f3ii = 1.25 * qii * dblmii * dblmii * dblmii * dbllii * ( 4 + 3 * knii ) / 24 / 210000 / dbixlsii ;
        Double fii = f1ii + f2ii + f3ii ;
        Double ndii = dblmii * dblmii / 1000000 ;
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
        Double mwq8iip = 1.25 * 10 * m8dbxt * lwq8iip ;
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
        Double sziii = 1000 * mwqiip / dbwxlsiii ;
        Double mwiii = mslwaiii + mshlwaiii + mwa1iii + mwa2iii + mwa3iii + mwa8iii + mwa9iii ;
        Double swiii = 1000 * mwiii / dbwylsiii ;
        Double smaxiii = sziii + swiii ;
        Double ssqdiii = dbssiii / 1.5 ;
        map.put("mwqiip", mwqiip);
        map.put("sziii", sziii);
        map.put("mwiii", mwiii);
        map.put("swiii", swiii);
        map.put("smaxiii", smaxiii);
        map.put("ssqdiii", ssqdiii);

        Double mslwqiii = 1.25 * 10 * tsl * lslwqiii ;
        Double mshlwqiii = 1.25 * 10 * tshl * lshlwqiii ;
        Double mwq1iii = 1.25 * 10 * m1 * lwq1iii ;
        Double mwq2iii = 1.25 * 10 * m2 * lwq2iii ;
        Double mwq3iii = 1.25 * 10 * m3 * lwq3iii ;
        Double mwq9iii = 1.25 * 10 * m9db * lwq9iii ;
        map.put("mslwqiii", mslwqiii);
        map.put("mshlwqiii", mshlwqiii);
        map.put("mwq1iii", mwq1iii);
        map.put("mwq2iii", mwq2iii);
        map.put("mwq3iii", mwq3iii);
        map.put("mwq9iii", mwq9iii);

        Double kniii = dblmiii / dblliii ;
        Double mwziii = tsl + tshl + m1 + m2 + m3 + m9db  ;
        Double f1iii = 1.25 * mwziii * 10 * dblmiii * dblmiii * dblliii * ( 1 + kniii ) / 3 / 210000 / dbixlsiii ;
        Double mwqiii = mslwqiii + mshlwqiii + mwq1iii + mwq2iii + mwq3iii + mwq9iii ;
        Double f2iii = 1000 * mwqiii * dblmiii * dblliii * ( 1 + 2 * kniii ) / 4 / 210000 / dbixlsiii ;
        Double qiii = m8dbxt * 10 / dblmiii ;
        Double f3iii = 1.25 * qiii * dblmiii * dblmiii * dblmiii * dblliii * ( 4 + 3 * kniii ) / 24 / 210000 / dbixlsiii ;
        Double fiii = f1iii + f2iii + f3iii ;
        Double ndiii = dblmiii * dblmiii / 1000000 ;
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
        Double mwq9iiip = 1.25 * 10 * m9dbxt * lwq9iiip ;
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

        Double mwqiiip = mslwqiii + mshlwqiii + mwq1iii + mwq2iii + mwq3iii + mwq9iiip ;
        Double sziv = 1000 * mwqiiip / dbwxlsiv ;
        Double mwiv = mslwaiv + mshlwaiv + mwa1iv + mwa2iv + mwa3iv + mwa9iv ;
        Double swiv = 1000 * mwiv / dbwylsiv ;
        Double smaxiv = sziv + swiv ;
        Double ssqdiv = dbssiv / 1.5 ;
        map.put("mwqiiip", mwqiiip);
        map.put("sziv", sziv);
        map.put("mwiv", mwiv);
        map.put("swiv", swiv);
        map.put("smaxiv", smaxiv);
        map.put("ssqdiv", ssqdiv);

        Double mslwqiv = 1.25 * 10 * tsl * lslwqiv ;
        Double mshlwqiv = 1.25 * 10 * tshl * lshlwqiv ;
        Double mwq1iv = 1.25 * 10 * m1 * lwq1iv ;
        Double mwq2iv = 1.25 * 10 * m2 * lwq2iv ;
        Double mwq3iv = 1.25 * 10 * m3 * lwq3iv ;
        map.put("mslwqiv", mslwqiv);
        map.put("mshlwqiv", mshlwqiv);
        map.put("mwq1iv", mwq1iv);
        map.put("mwq2iv", mwq2iv);
        map.put("mwq3iv", mwq3iv);

        Double kniv = dblmiv / dblliv ;
        Double mwziv = tsl + tshl + m1 + m2 + m3 ;
        Double f1iv = 1.25 * mwziv * 10 * dblmiv * dblmiv * dblliv * ( 1 + kniv ) / 3 / 210000 / dbixlsiv ;
        Double mwqiv = mslwqiv + mshlwqiv + mwq1iv + mwq2iv + mwq3iv ;
        Double f2iv = 1000 * mwqiv * dblmiv * dblliv * ( 1 + 2 * kniv ) / 4 / 210000 / dbixlsiv ;
        Double qiv = m9dbxt * 10 / dblmiv ;
        Double f3iv = 1.25 * qiv * dblmiv * dblmiv * dblmiv * dblliv * ( 4 + 3 * kniv ) / 24 / 210000 / dbixlsiv ;
        Double fiv = f1iv + f2iv + f3iv ;
        Double ndiv = dblmiv * dblmiv / 1000000 ;
        map.put("kniv", kniv);
        map.put("mwziv", mwziv);
        map.put("f1iv", f1iv);
        map.put("mwqiv", mwqiv);
        map.put("f2iv", f2iv);
        map.put("qiv", qiv);
        map.put("f3iv", f3iv);
        map.put("fiv", fiv);
        map.put("ndiv", ndiv);

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

        Double smaxi = doubleMap.get("smaxi");
        Double ssqdi = doubleMap.get("ssqdi");
        String dbb3 = takeSignByCompareNumber(smaxi, ssqdi);
        String dbm3 = takeStringByCompareNumber(smaxi, ssqdi);
        map.put("dbb3", CommonFunc.convertDoubleToString(dbb3));
        map.put("dbm3", CommonFunc.convertDoubleToString(dbm3));

        Double fi = doubleMap.get("fi");
        Double ndi = doubleMap.get("ndi");
        String dbb4 = takeSignByCompareNumber(fi, ndi);
        String dbm4 = takeStringByCompareNumber(fi, ndi);
        map.put("dbb4", CommonFunc.convertDoubleToString(dbb4));
        map.put("dbm4", CommonFunc.convertDoubleToString(dbm4));

        Double smaxii = doubleMap.get("smaxii");
        Double ssqdii = doubleMap.get("ssqdii");
        String dbb5 = takeSignByCompareNumber(smaxii, ssqdii);
        String dbm5 = takeStringByCompareNumber(smaxii, ssqdii);
        map.put("dbb5", CommonFunc.convertDoubleToString(dbb5));
        map.put("dbm5", CommonFunc.convertDoubleToString(dbm5));

        Double fii = doubleMap.get("fii");
        Double ndii = doubleMap.get("ndii");
        String dbb6 = takeSignByCompareNumber(fii, ndii);
        String dbm6 = takeStringByCompareNumber(fii, ndii);
        map.put("dbb6", CommonFunc.convertDoubleToString(dbb6));
        map.put("dbm6", CommonFunc.convertDoubleToString(dbm6));

        Double smaxiii = doubleMap.get("smaxiii");
        Double ssqdiii = doubleMap.get("ssqdiii");
        String dbb7 = takeSignByCompareNumber(smaxiii, ssqdiii);
        String dbm7 = takeStringByCompareNumber(smaxiii, ssqdiii);
        map.put("dbb7", CommonFunc.convertDoubleToString(dbb7));
        map.put("dbm7", CommonFunc.convertDoubleToString(dbm7));

        Double fiii = doubleMap.get("fiii");
        Double ndiii = doubleMap.get("ndiii");
        String dbb8 = takeSignByCompareNumber(fiii, ndiii);
        String dbm8 = takeStringByCompareNumber(fiii, ndiii);
        map.put("dbb8", CommonFunc.convertDoubleToString(dbb8));
        map.put("dbm8", CommonFunc.convertDoubleToString(dbm8));

        Double smaxiv = doubleMap.get("smaxiv");
        Double ssqdiv = doubleMap.get("ssqdiv");
        String dbb9 = takeSignByCompareNumber(smaxiv, ssqdiv);
        String dbm9 = takeStringByCompareNumber(smaxiv, ssqdiv);
        map.put("dbb9", CommonFunc.convertDoubleToString(dbb9));
        map.put("dbm9", CommonFunc.convertDoubleToString(dbm9));

        Double fiv = doubleMap.get("fiv");
        Double ndiv = doubleMap.get("ndiv");
        String dbb10 = takeSignByCompareNumber(fiv, ndiv);
        String dbm10 = takeStringByCompareNumber(fiv, ndiv);
        map.put("dbb10", CommonFunc.convertDoubleToString(dbb10));
        map.put("dbm10", CommonFunc.convertDoubleToString(dbm10));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}