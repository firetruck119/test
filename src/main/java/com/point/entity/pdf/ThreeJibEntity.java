package com.point.entity.pdf;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class ThreeJibEntity {
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

    //非页面数据
    private Double dcgssp;
    private Double grugssp;
    private Double m5;
    private Double acx5;
    private Double gruqhxs;
    private Double gruwzxs;
    private Double ldcgh;
    private Double lbtzh;
    private Double ldslzh;

    //    提示提醒
    private String grutstx;

    private Double dbmjb;
    private Double mbgj;
    private Double mbmj;

    private Double dbm1b;
    private Double mbg1;
    private Double mbm1;

    private Double dbm2b;
    private Double mbg2;
    private Double mbm2;

    private Double dbm3b;
    private Double mbg3;
    private Double mbm3;

    //    挠度
    private Double dbld;
    private Double dblx1;
    private Double dblx2;
    private Double dblx3;
    private Double dblx4;
    private Double dbld1;
    private Double dbld2;
    private Double dbld3;
    private Double dbld4;
    private Double dbhd2;
    private Double dbhd3;
    private Double dbhd4;

    //    基臂
    private String dbgcph;
    private Double dbss;
    private Double dbjh;
    private Double dbjb;
    private Double dbje;
    private Double dbwx;
    private Double dbwy;
    private Double dbix;

    //    一臂
    private String dbgcphi;
    private Double dbssi;
    private Double db1h;
    private Double db1b;
    private Double db1e;
    private Double dbwxi;
    private Double dbwyi;
    private Double dbixi;

    //    二臂
    private String dbgcphii;
    private Double dbssii;
    private Double db2h;
    private Double db2b;
    private Double db2e;
    private Double dbwxii;
    private Double dbwyii;
    private Double dbixii;

    //   三臂
    private String dbgcphiii;
    private Double dbssiii;
    private Double db3h;
    private Double db3b;
    private Double db3e;
    private Double dbwxiii;
    private Double dbwyiii;
    private Double dbixiii;

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

    private Double m6dbxt;
    private Double m7dbxt;
    private Double m8dbxt;

    private Double m4jbnd;
    private Double m5dbnd;
    private Double kgpdbpg;
    private Double kgpdbpq;
    private Double pdbpg;
    private Double pdbpq;

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

    private Double lslci;
    private Double lshlci;
    private Double lc1i;
    private Double lc2i;
    private Double lc3i;
    private Double lc6i;
    private Double lc7i;
    private Double lc8i;

    private Double lslxi;
    private Double lshlxi;
    private Double lx1i;
    private Double lx2i;
    private Double lx3i;
    private Double lx6i;
    private Double lx7i;
    private Double lx8i;

    private Double lslcii;
    private Double lshlcii;
    private Double lc1ii;
    private Double lc2ii;
    private Double lc3ii;
    private Double lc7ii;
    private Double lc8ii;

    private Double lslxii;
    private Double lshlxii;
    private Double lx1ii;
    private Double lx2ii;
    private Double lx3ii;
    private Double lx7ii;
    private Double lx8ii;

    private Double lslciii;
    private Double lshlciii;
    private Double lc1iii;
    private Double lc2iii;
    private Double lc3iii;
    private Double lc8iii;

    private Double lslxiii;
    private Double lshlxiii;
    private Double lx1iii;
    private Double lx2iii;
    private Double lx3iii;
    private Double lx8iii;

    private String db3Model;
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

        map.put("dcgssp", CommonFunc.convertDoubleToString(dcgssp));
        map.put("grugssp", CommonFunc.convertDoubleToString(grugssp));
        map.put("m5", CommonFunc.convertDoubleToString(m5));
        map.put("acx5", CommonFunc.convertDoubleToString(acx5));
        map.put("gruqhxs", CommonFunc.convertDoubleToString(gruqhxs));
        map.put("gruwzxs", CommonFunc.convertDoubleToString(gruwzxs));
        map.put("ldcgh", CommonFunc.convertDoubleToString(ldcgh));
        map.put("lbtzh", CommonFunc.convertDoubleToString(lbtzh));
        map.put("ldslzh", CommonFunc.convertDoubleToString(ldslzh));

        map.put("grutstx", CommonFunc.convertDoubleToString(grutstx));

        map.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        map.put("mbgj", CommonFunc.convertDoubleToString(mbgj));
        map.put("mbmj", CommonFunc.convertDoubleToString(mbmj));

        map.put("dbm1b", CommonFunc.convertDoubleToString(dbm1b));
        map.put("mbg1", CommonFunc.convertDoubleToString(mbg1));
        map.put("mbm1", CommonFunc.convertDoubleToString(mbm1));

        map.put("dbm2b", CommonFunc.convertDoubleToString(dbm2b));
        map.put("mbg2", CommonFunc.convertDoubleToString(mbg2));
        map.put("mbm2", CommonFunc.convertDoubleToString(mbm2));

        map.put("dbm3b", CommonFunc.convertDoubleToString(dbm3b));
        map.put("mbg3", CommonFunc.convertDoubleToString(mbg3));
        map.put("mbm3", CommonFunc.convertDoubleToString(mbm3));

        map.put("dbld", CommonFunc.convertDoubleToString(dbld));
        map.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
        map.put("dblx2", CommonFunc.convertDoubleToString(dblx2));
        map.put("dblx3", CommonFunc.convertDoubleToString(dblx3));
        map.put("dblx4", CommonFunc.convertDoubleToString(dblx4));
        map.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        map.put("dbld2", CommonFunc.convertDoubleToString(dbld2));
        map.put("dbld3", CommonFunc.convertDoubleToString(dbld3));
        map.put("dbld4", CommonFunc.convertDoubleToString(dbld4));
        map.put("dbhd2", CommonFunc.convertDoubleToString(dbhd2));
        map.put("dbhd3", CommonFunc.convertDoubleToString(dbhd3));
        map.put("dbhd4", CommonFunc.convertDoubleToString(dbhd4));

        map.put("dbgcph", CommonFunc.convertDoubleToString(dbgcph));
        map.put("dbss", CommonFunc.convertDoubleToString(dbss));
        map.put("dbjh", CommonFunc.convertDoubleToString(dbjh));
        map.put("dbjb", CommonFunc.convertDoubleToString(dbjb));
        map.put("dbje", CommonFunc.convertDoubleToString(dbje));
        map.put("dbwx", CommonFunc.convertDoubleToString(dbwx));
        map.put("dbwy", CommonFunc.convertDoubleToString(dbwy));
        map.put("dbix", CommonFunc.convertDoubleToString(dbix));

        map.put("dbgcphi", CommonFunc.convertDoubleToString(dbgcphi));
        map.put("dbssi", CommonFunc.convertDoubleToString(dbssi));
        map.put("db1h", CommonFunc.convertDoubleToString(db1h));
        map.put("db1b", CommonFunc.convertDoubleToString(db1b));
        map.put("db1e", CommonFunc.convertDoubleToString(db1e));
        map.put("dbwxi", CommonFunc.convertDoubleToString(dbwxi));
        map.put("dbwyi", CommonFunc.convertDoubleToString(dbwyi));
        map.put("dbixi", CommonFunc.convertDoubleToString(dbixi));

        map.put("dbgcphii", CommonFunc.convertDoubleToString(dbgcphii));
        map.put("dbssii", CommonFunc.convertDoubleToString(dbssii));
        map.put("db2h", CommonFunc.convertDoubleToString(db2h));
        map.put("db2b", CommonFunc.convertDoubleToString(db2b));
        map.put("db2e", CommonFunc.convertDoubleToString(db2e));
        map.put("dbwxii", CommonFunc.convertDoubleToString(dbwxii));
        map.put("dbwyii", CommonFunc.convertDoubleToString(dbwyii));
        map.put("dbixii", CommonFunc.convertDoubleToString(dbixii));

        map.put("dbgcphiii", CommonFunc.convertDoubleToString(dbgcphiii));
        map.put("dbssiii", CommonFunc.convertDoubleToString(dbssiii));
        map.put("db3h", CommonFunc.convertDoubleToString(db3h));
        map.put("db3b", CommonFunc.convertDoubleToString(db3b));
        map.put("db3e", CommonFunc.convertDoubleToString(db3e));
        map.put("dbwxiii", CommonFunc.convertDoubleToString(dbwxiii));
        map.put("dbwyiii", CommonFunc.convertDoubleToString(dbwyiii));
        map.put("dbixiii", CommonFunc.convertDoubleToString(dbixiii));

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

        map.put("m6dbxt", CommonFunc.convertDoubleToString(m6dbxt));
        map.put("m7dbxt", CommonFunc.convertDoubleToString(m7dbxt));
        map.put("m8dbxt", CommonFunc.convertDoubleToString(m8dbxt));

        map.put("m4jbnd", CommonFunc.convertDoubleToString(m4jbnd));
        map.put("m5dbnd", CommonFunc.convertDoubleToString(m5dbnd));
        map.put("kgpdbpg", CommonFunc.convertDoubleToString(kgpdbpg));
        map.put("kgpdbpq", CommonFunc.convertDoubleToString(kgpdbpq));
        map.put("pdbpg", CommonFunc.convertDoubleToString(pdbpg));
        map.put("pdbpq", CommonFunc.convertDoubleToString(pdbpq));

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

        map.put("lslci", CommonFunc.convertDoubleToString(lslci));
        map.put("lshlci", CommonFunc.convertDoubleToString(lshlci));
        map.put("lc1i", CommonFunc.convertDoubleToString(lc1i));
        map.put("lc2i", CommonFunc.convertDoubleToString(lc2i));
        map.put("lc3i", CommonFunc.convertDoubleToString(lc3i));
        map.put("lc6i", CommonFunc.convertDoubleToString(lc6i));
        map.put("lc7i", CommonFunc.convertDoubleToString(lc7i));
        map.put("lc8i", CommonFunc.convertDoubleToString(lc8i));

        map.put("lslxi", CommonFunc.convertDoubleToString(lslxi));
        map.put("lshlxi", CommonFunc.convertDoubleToString(lshlxi));
        map.put("lx1i", CommonFunc.convertDoubleToString(lx1i));
        map.put("lx2i", CommonFunc.convertDoubleToString(lx2i));
        map.put("lx3i", CommonFunc.convertDoubleToString(lx3i));
        map.put("lx6i", CommonFunc.convertDoubleToString(lx6i));
        map.put("lx7i", CommonFunc.convertDoubleToString(lx7i));
        map.put("lx8i", CommonFunc.convertDoubleToString(lx8i));

        map.put("lslcii", CommonFunc.convertDoubleToString(lslcii));
        map.put("lshlcii", CommonFunc.convertDoubleToString(lshlcii));
        map.put("lc1ii", CommonFunc.convertDoubleToString(lc1ii));
        map.put("lc2ii", CommonFunc.convertDoubleToString(lc2ii));
        map.put("lc3ii", CommonFunc.convertDoubleToString(lc3ii));
        map.put("lc7ii", CommonFunc.convertDoubleToString(lc7ii));
        map.put("lc8ii", CommonFunc.convertDoubleToString(lc8ii));

        map.put("lslxii", CommonFunc.convertDoubleToString(lslxii));
        map.put("lshlxii", CommonFunc.convertDoubleToString(lshlxii));
        map.put("lx1ii", CommonFunc.convertDoubleToString(lx1ii));
        map.put("lx2ii", CommonFunc.convertDoubleToString(lx2ii));
        map.put("lx3ii", CommonFunc.convertDoubleToString(lx3ii));
        map.put("lx7ii", CommonFunc.convertDoubleToString(lx7ii));
        map.put("lx8ii", CommonFunc.convertDoubleToString(lx8ii));

        map.put("lslciii", CommonFunc.convertDoubleToString(lslciii));
        map.put("lshlciii", CommonFunc.convertDoubleToString(lshlciii));
        map.put("lc1iii", CommonFunc.convertDoubleToString(lc1iii));
        map.put("lc2iii", CommonFunc.convertDoubleToString(lc2iii));
        map.put("lc3iii", CommonFunc.convertDoubleToString(lc3iii));
        map.put("lc8iii", CommonFunc.convertDoubleToString(lc8iii));

        map.put("lslxiii", CommonFunc.convertDoubleToString(lslxiii));
        map.put("lshlxiii", CommonFunc.convertDoubleToString(lshlxiii));
        map.put("lx1iii", CommonFunc.convertDoubleToString(lx1iii));
        map.put("lx2iii", CommonFunc.convertDoubleToString(lx2iii));
        map.put("lx3iii", CommonFunc.convertDoubleToString(lx3iii));
        map.put("lx8iii", CommonFunc.convertDoubleToString(lx8iii));

        map.putAll(takeStringMapForPdf(type));
        return map;
    }

    public Map<String, String> takeMapForCheckPDF() {
        Map<String, Double> map = takeDoubleMapForPdf("");

        Double mzi = map.get("mzi");
        Double mzii = map.get("mzii");
        Double mziii = map.get("mziii");
        Double m4jbhzq = mbgj / 2 + ( dbld1 - dblx1 / 2 ) * mbmj / 1000 ;
        Double lslhz = lbd;
        Double lshlhz = lbd - ( ldcgh - lbtzh ) ;
        Double lhz1 = lshlhz ;
        Double lhz2;
        if ( m2 == 0 ) {
            lhz2 = 0.0 ;
        } else {
            lhz2 = lc2 + dblx1 / 2000 ;
        }
        Double lhz3 = lshlhz ;
        Double lhzjb4 = ( mbgj * ( dbld1 - dblx1 / 2 ) / 2000 + mbmj * ( dbld1 - dblx1 / 2 ) * ( dbld1 - dblx1 / 2 ) / 2000000 ) / m4jbhzq ;
        Double lhz5;
        if ( m5db == 0 ) {
            lhz5 = 0.0 ;
        } else {
            lhz5 = lc5 + dblx1 / 2000 ;
        }
        Double lhz6 = lc6 + dblx1 / 2000 ;
        Double lhz7 = lc7 + dblx1 / 2000 ;
        Double lhz8 = lc8 + dblx1 / 2000 ;

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
        Double mjbhz = mslhz + mshlhz + mhz1 + mhz2 + mhz3 + mhz4 + mhz5 + mhz6 + mhz7 + mhz8 ;
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
        if ( mzi < dbm1b ) {
            dbwjybi = "<" ;
        } else if ( mzi == dbm1b ) {
            dbwjybi = "=";
        } else{
            dbwjybi = ">";
        }
        String dbwjymi = (mzi <= dbm1b) ? "符合" : "不符合";

        String dbwjybii;
        if ( mzii < dbm2b ) {
            dbwjybii = "<" ;
        } else if ( mzii == dbm2b ) {
            dbwjybii = "=";
        } else{
            dbwjybii = ">";
        }
        String dbwjymii = (mzii <= dbm2b) ? "符合" : "不符合";

        String dbwjybiii;
        if ( mziii < dbm3b ) {
            dbwjybiii = "<" ;
        } else if ( mziii == dbm3b ) {
            dbwjybiii = "=";
        } else{
            dbwjybiii = ">";
        }
        String dbwjymiii = (mziii <= dbm3b) ? "符合" : "不符合";

        Map<String, String> result = new HashMap<>();
        result.put("lbd", CommonFunc.convertDoubleToString(lbd));
        result.put("dbld1", CommonFunc.convertDoubleToString(dbld1));
        result.put("dblx1", CommonFunc.convertDoubleToString(dblx1));
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
        result.put("lc2", CommonFunc.convertDoubleToString(lc2));
        result.put("lc5", CommonFunc.convertDoubleToString(lc5));
        result.put("lc6", CommonFunc.convertDoubleToString(lc6));
        result.put("lc7", CommonFunc.convertDoubleToString(lc7));
        result.put("lc8", CommonFunc.convertDoubleToString(lc8));
        result.put("dbmjb", CommonFunc.convertDoubleToString(dbmjb));
        result.put("dbm1b", CommonFunc.convertDoubleToString(dbm1b));
        result.put("dbm2b", CommonFunc.convertDoubleToString(dbm2b));
        result.put("dbm3b", CommonFunc.convertDoubleToString(dbm3b));
        result.put("mzi", CommonFunc.convertDoubleToString(mzi));
        result.put("mzii", CommonFunc.convertDoubleToString(mzii));
        result.put("mziii", CommonFunc.convertDoubleToString(mziii));
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
        result.put("mjbhz", CommonFunc.convertDoubleToString(mjbhz));
        result.put("dbwjyb", CommonFunc.convertDoubleToString(dbwjyb));
        result.put("dbwjym", CommonFunc.convertDoubleToString(dbwjym));
        result.put("dbwjybi", CommonFunc.convertDoubleToString(dbwjybi));
        result.put("dbwjymi", CommonFunc.convertDoubleToString(dbwjymi));
        result.put("dbwjybii", CommonFunc.convertDoubleToString(dbwjybii));
        result.put("dbwjymii", CommonFunc.convertDoubleToString(dbwjymii));
        result.put("dbwjybiii", CommonFunc.convertDoubleToString(dbwjybiii));
        result.put("dbwjymiii", CommonFunc.convertDoubleToString(dbwjymiii));
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

        Double mz = mslza + mshlza + mza1 + mza2 + mza3 + mza4 + mza5 + mza6 + mza7 + mza8 ;
        Double sz = 1000 * mz / dbwx ;
        Double mw = mslwa + mshlwa + mwa1 + mwa2 + mwa3 + mwa4 + mwa5 + mwa6 + mwa7 + mwa8 ;
        Double sw = 1000 * mw / dbwy ;
        Double smax = sz + sw ;
        Double ssqd = dbss / 1.5 ;
        map.put("mz", mz);
        map.put("sz", sz);
        map.put("mw", mw);
        map.put("sw", sw);
        map.put("smax", smax);
        map.put("ssqd", ssqd);

//        一臂
        Double mslzai= 1.25 * 10 * tsl * lslci ;
        Double mshlzai= 1.25 * 10 * tshl * lshlci ;
        Double mza1i= 1.25 * 10 * m1 * lc1i ;
        Double mza2i= 1.25 * 10 * m2 * lc2i ;
        Double mza3i= 1.25 * 10 * m3 * lc3i ;
        Double mza6i= 1.25 * 10 * m6dbxt * lc6i ;
        Double mza7i= 1.25 * 10 * m7db * lc7i ;
        Double mza8i= 1.25 * 10 * m8db * lc8i ;
        map.put("mslzai", mslzai);
        map.put("mshlzai", mshlzai);
        map.put("mza1i", mza1i);
        map.put("mza2i", mza2i);
        map.put("mza3i", mza3i);
        map.put("mza6i", mza6i);
        map.put("mza7i", mza7i);
        map.put("mza8i", mza8i);

        Double mslwai = p * 1.25 * aslcx * lslxi ;
        Double mshlwai = p * 1.25 * ashlcx * lshlxi ;
        Double mwa1i = p * 1.25 * acx1 * lx1i ;
        Double mwa2i = p * 1.25 * acx2 * lx2i ;
        Double mwa3i = p * 1.25 * acx3 * lx3i ;
        Double mwa6i = p * 1.25 * acx6db * lx6i ;
        Double mwa7i = p * 1.25 * acx7db * lx7i ;
        Double mwa8i = p * 1.25 * acx8db * lx8i ;
        map.put("mslwai", mslwai);
        map.put("mshlwai", mshlwai);
        map.put("mwa1i", mwa1i);
        map.put("mwa2i", mwa2i);
        map.put("mwa3i", mwa3i);
        map.put("mwa6i", mwa6i);
        map.put("mwa7i", mwa7i);
        map.put("mwa8i", mwa8i);

        Double mzi = mslzai + mshlzai + mza1i + mza2i + mza3i + mza6i + mza7i + mza8i ;
        Double szi = 1000 * mzi / dbwxi ;
        Double mwi = mslwai + mshlwai + mwa1i + mwa2i + mwa3i + mwa6i + mwa7i + mwa8i ;
        Double swi = 1000 * mwi / dbwyi ;
        Double smaxi = szi + swi ;
        Double ssqdi = dbssi / 1.5 ;
        map.put("mzi", mzi);
        map.put("szi", szi);
        map.put("mwi", mwi);
        map.put("swi", swi);
        map.put("smaxi", smaxi);
        map.put("ssqdi", ssqdi);

//        二臂
        Double mslzaii= 1.25 * 10 * tsl * lslcii ;
        Double mshlzaii= 1.25 * 10 * tshl * lshlcii ;
        Double mza1ii= 1.25 * 10 * m1 * lc1ii ;
        Double mza2ii= 1.25 * 10 * m2 * lc2ii ;
        Double mza3ii= 1.25 * 10 * m3 * lc3ii ;
        Double mza7ii= 1.25 * 10 * m7dbxt * lc7ii ;
        Double mza8ii= 1.25 * 10 * m8db * lc8ii ;
        map.put("mslzaii", mslzaii);
        map.put("mshlzaii", mshlzaii);
        map.put("mza1ii", mza1ii);
        map.put("mza2ii", mza2ii);
        map.put("mza3ii", mza3ii);
        map.put("mza7ii", mza7ii);
        map.put("mza8ii", mza8ii);

        Double mslwaii = p * 1.25 * aslcx * lslxii ;
        Double mshlwaii = p * 1.25 * ashlcx * lshlxii ;
        Double mwa1ii = p * 1.25 * acx1 * lx1ii ;
        Double mwa2ii = p * 1.25 * acx2 * lx2ii ;
        Double mwa3ii = p * 1.25 * acx3 * lx3ii ;
        Double mwa7ii = p * 1.25 * acx7db * lx7ii ;
        Double mwa8ii = p * 1.25 * acx8db * lx8ii ;
        map.put("mslwaii", mslwaii);
        map.put("mshlwaii", mshlwaii);
        map.put("mwa1ii", mwa1ii);
        map.put("mwa2ii", mwa2ii);
        map.put("mwa3ii", mwa3ii);
        map.put("mwa7ii", mwa7ii);
        map.put("mwa8ii", mwa8ii);

        Double mzii = mslzaii + mshlzaii + mza1ii + mza2ii + mza3ii + mza7ii + mza8ii ;
        Double szii = 1000 * mzii / dbwxii ;
        Double mwii = mslwaii + mshlwaii + mwa1ii + mwa2ii + mwa3ii + mwa7ii + mwa8ii ;
        Double swii = 1000 * mwii / dbwyii ;
        Double smaxii = szii + swii ;
        Double ssqdii = dbssii / 1.5 ;
        map.put("mzii", mzii);
        map.put("szii", szii);
        map.put("mwii", mwii);
        map.put("swii", swii);
        map.put("smaxii", smaxii);
        map.put("ssqdii", ssqdii);

//        三臂
        Double mslzaiii= 1.25 * 10 * tsl * lslciii ;
        Double mshlzaiii= 1.25 * 10 * tshl * lshlciii ;
        Double mza1iii= 1.25 * 10 * m1 * lc1iii ;
        Double mza2iii= 1.25 * 10 * m2 * lc2iii ;
        Double mza3iii= 1.25 * 10 * m3 * lc3iii ;
        Double mza8iii= 1.25 * 10 * m8dbxt * lc8iii ;
        map.put("mslzaiii", mslzaiii);
        map.put("mshlzaiii", mshlzaiii);
        map.put("mza1iii", mza1iii);
        map.put("mza2iii", mza2iii);
        map.put("mza3iii", mza3iii);
        map.put("mza8iii", mza8iii);

        Double mslwaiii = p * 1.25 * aslcx * lslxiii ;
        Double mshlwaiii = p * 1.25 * ashlcx * lshlxiii ;
        Double mwa1iii = p * 1.25 * acx1 * lx1iii ;
        Double mwa2iii = p * 1.25 * acx2 * lx2iii ;
        Double mwa3iii = p * 1.25 * acx3 * lx3iii ;
        Double mwa8iii = p * 1.25 * acx8db * lx8iii ;
        map.put("mslwaiii", mslwaiii);
        map.put("mshlwaiii", mshlwaiii);
        map.put("mwa1iii", mwa1iii);
        map.put("mwa2iii", mwa2iii);
        map.put("mwa3iii", mwa3iii);
        map.put("mwa8iii", mwa8iii);

        Double mziii = mslzaiii + mshlzaiii + mza1iii + mza2iii + mza3iii + mza8iii ;
        Double sziii = 1000 * mziii / dbwxiii ;
        Double mwiii = mslwaiii + mshlwaiii + mwa1iii + mwa2iii + mwa3iii + mwa8iii ;
        Double swiii = 1000 * mwiii / dbwyiii ;
        Double smaxiii = sziii + swiii ;
        Double ssqdiii = dbssiii / 1.5 ;
        map.put("mziii", mziii);
        map.put("sziii", sziii);
        map.put("mwiii", mwiii);
        map.put("swiii", swiii);
        map.put("smaxiii", smaxiii);
        map.put("ssqdiii", ssqdiii);

        //        挠度计算
        Double pdbp = 1.25 * pdbpg / 3 + 1.25 * pdbpq ;
        Double tz = pdbp / Math.cos(dbyj / 180 * Math.PI) ;
        Double mlj1 = tz * dbhd2 ;
        Double mlj2 = tz * dbhd3 ;
        Double mlj3 = tz * dbhd4 ;
        Double fx1 = mlj1 * ( dbld1 * dbld1 / 2 - 2 * dbld1 * dblx1 / 3 + dblx1 * dblx1 / 6 - dblx2 * dblx2 / 6 ) / 210000 / dbix + tz * dbld1 * ( dbld1 - dblx1 ) * ( dbld1 - dblx1 ) / 3 / 210000 / dbix ;
        Double fx2 = mlj2 * ( dbld2 * dbld2 / 2 - 2 * dbld2 * dblx2 / 3 + dblx2 * dblx2 / 6 - dblx3 * dblx3 / 6 ) / 210000 / dbixi + tz * dbld2 * ( dbld2 - dblx2 ) * ( dbld2 - dblx2 ) / 3 / 210000 / dbixi ;
        Double fx3 = mlj3 * ( dbld3 * dbld3 / 2 - 2 * dbld3 * dblx3 / 3 + dblx3 * dblx3 / 6 - dblx4 * dblx4 / 6 ) / 210000 / dbixii + tz * dbld3 * ( dbld3 - dblx3 ) * ( dbld3 - dblx3 ) / 3 / 210000 / dbixii ;
        Double fx4 = tz * dbld4 * ( dbld4 - dblx4 ) * ( dbld4 - dblx4 ) / 3 / 210000 / dbixiii ;
        Double nd = dbld * dbld / 1000000 ;
        map.put("pdbp", pdbp);
        map.put("tz", tz);
        map.put("mlj1", mlj1);
        map.put("mlj2", mlj2);
        map.put("mlj3", mlj3);
        map.put("fx1", fx1);
        map.put("fx2", fx2);
        map.put("fx3", fx3);
        map.put("fx4", fx4);
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

        Double smaxi = doubleMap.get("smaxi");
        Double ssqdi = doubleMap.get("ssqdi");
        String dbb2 = takeSignByCompareNumber(smaxi, ssqdi);
        String dbm2 = takeStringByCompareNumber(smaxi, ssqdi);
        map.put("dbb2", CommonFunc.convertDoubleToString(dbb2));
        map.put("dbm2", CommonFunc.convertDoubleToString(dbm2));

        Double smaxii = doubleMap.get("smaxii");
        Double ssqdii = doubleMap.get("ssqdii");
        String dbb3 = takeSignByCompareNumber(smaxii, ssqdii);
        String dbm3 = takeStringByCompareNumber(smaxii, ssqdii);
        map.put("dbb3", CommonFunc.convertDoubleToString(dbb3));
        map.put("dbm3", CommonFunc.convertDoubleToString(dbm3));

        Double smaxiii = doubleMap.get("smaxiii");
        Double ssqdiii = doubleMap.get("ssqdiii");
        String dbb4 = takeSignByCompareNumber(smaxiii, ssqdiii);
        String dbm4 = takeStringByCompareNumber(smaxiii, ssqdiii);
        map.put("dbb4", CommonFunc.convertDoubleToString(dbb4));
        map.put("dbm4", CommonFunc.convertDoubleToString(dbm4));

        Double fx1 = doubleMap.get("fx1");
        Double fx2 = doubleMap.get("fx2");
        Double fx3 = doubleMap.get("fx3");
        Double fx4 = doubleMap.get("fx4");
        Double tz = doubleMap.get("tz");
        Double mlj1 = doubleMap.get("mlj1");
        Double mlj2 = doubleMap.get("mlj2");
        Double mlj3 = doubleMap.get("mlj3");
        Double o2 = mlj1 * ( dbld1 - 2 * dblx1 / 3 - 2 * dblx2 / 3 ) / 210000 / dbix + tz * ( dbld1 * dbld1 / 2 - 2 * dbld1 * dblx1 / 3 + dblx1 * dblx1 / 6 - dblx2 * dblx2 / 6 ) / 210000 / dbix ;
        Double o3 = mlj2 * ( dbld2 - 2 * dblx2 / 3 - 2 * dblx3 / 3 ) / 210000 / dbixi + tz * ( dbld2 * dbld2 / 2 - 2 * dbld2 * dblx2 / 3 + dblx2 * dblx2 / 6 - dblx3 * dblx3 / 6 ) / 210000 / dbixi ;
        Double o4 = mlj3 * ( dbld3 - 2 * dblx3 / 3 - 2 * dblx4 / 3 ) / 210000 / dbixii + tz * ( dbld3 * dbld3 / 2 - 2 * dbld3 * dblx3 / 3 + dblx3 * dblx3 / 6 - dblx4 * dblx4 / 6 ) / 210000 / dbixii ;
        Double f = fx1 + fx2 + fx3 + fx4 + o2 * dbhd2 + o3 * dbhd3 + o4 * dbhd4 ;
        map.put("o2", CommonFunc.convertDoubleToString4(o2));
        map.put("o3", CommonFunc.convertDoubleToString4(o3));
        map.put("o4", CommonFunc.convertDoubleToString4(o4));
        map.put("f", CommonFunc.convertDoubleToString(f));

        Double nd = doubleMap.get("nd");
        String dbb6 = takeSignByCompareNumber(f, nd);
        String dbm6 = takeStringByCompareNumber(f, nd);
        map.put("dbb6", CommonFunc.convertDoubleToString(dbb6));
        map.put("dbm6", CommonFunc.convertDoubleToString(dbm6));

        for (Map.Entry<String, Double> entry : doubleMap.entrySet()) {
            map.put(entry.getKey(), CommonFunc.convertDoubleToString(entry.getValue()));
        }
        return map;
    }

}
