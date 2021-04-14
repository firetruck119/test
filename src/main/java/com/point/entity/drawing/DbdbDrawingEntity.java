package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DbdbDrawingEntity {

    private String xmmc;
    private String plh;
    private String jsr;
    private String date;

//后台
    private Double dbdbjxgm1;
    private Double dbdbjxgm2;
    private Double dbdbjbcbm1;
    private Double dbdbjbcbm2;
    private Double dbdbjbcbm3;
    private Double dbdbjbsxbm1;
    private Double dbdbjbsxbm2;
    private Double dbdbjbsxbm3;
    private Double dbdbjbsxbm4;
    private Double dbdbjbjqbm1;
    private Double dbdbjbjqbm2;
    private Double dbdbzxgm1;
    private Double dbdbzxgm2;
    private Double dbdbgm1;
    private Double dbdbgm2;
    private Double dbdbgm3;
    private Double dbdbgm4;
    private Double dbdbgl1;
    private Double dbdbgl2;
//    private Double dbdbhlzjqb;

    //    总图参数
    private String dbdbhlzxh;
    private Double ldbdb1;
    private Double ldbdb2;
    private Double ldbdb3;
    private Double ldbdb4;
    private Double ldbdb5;
    private Double ldbdbzxg1;
    private Double ldbdbzxg2;
    private String lsxndj1;
    private String lsxndj2;
    //提示提醒
    private String dbdb2tstx;
    private String dbdb2tcck;

//    基臂后段组焊件参数
    private Double ldbdb6;
    private Double ldbdb7;
    private Double ldbdb8;
    private Double ldbdb9;
    private Double ndbdbjqb;
    private Double ldbdbjqb;
    private Double ndbdbj1;
    private Double ndbdbj2;
    private Double ldbdbj1;
    private Double ldbdbj2;
    private Double ndbdbjz1;
//提示提醒
    private String dbdbjqbtstx;
    private String dbdbjqbtcck;

//基臂前段组焊件参数
    private Double ldbdb10;
    private Double ndbdbj3;
    private Double ldbdbj3;
    private Double ndbdbjz2;

//    质量参数
    private Double mdbdb1;
    private Double mdbdb2;
    private Double mdbdb3;
    private Double mdbdb4;
    private Double mdbdb5;
    private Double mdbdb5s;
    private Double mdbdb6;
    private Double mdbdb7;
    private Double mdbdb8;
    private Double mdbdb9;
    private Double mdbdb9s;
    private Double mdbdb10;
    private Double mdbdb11;
    private Double mdbdb12;
    private Double mdbdb13;
    private Double mdbdbzxg1;
    private Double mdbdbzxg2;

//    下拉
    private String dbdbtzModel;
    private String dbdblsxndjModel;

    public Map<String, String> takeMapForPDF() {
        Map map = new HashMap();
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("plh", CommonFunc.convertDoubleToString(plh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("date", CommonFunc.convertDoubleToString(date));

        map.put("dbdbjxgm1", CommonFunc.convertDoubleToString(dbdbjxgm1));
        map.put("dbdbjxgm2", CommonFunc.convertDoubleToString(dbdbjxgm2));
        map.put("dbdbjbcbm1", CommonFunc.convertDoubleToString(dbdbjbcbm1));
        map.put("dbdbjbcbm2", CommonFunc.convertDoubleToString(dbdbjbcbm2));
        map.put("dbdbjbcbm3", CommonFunc.convertDoubleToString(dbdbjbcbm3));
        map.put("dbdbjbsxbm1", CommonFunc.convertDoubleToString(dbdbjbsxbm1));
        map.put("dbdbjbsxbm2", CommonFunc.convertDoubleToString(dbdbjbsxbm2));
        map.put("dbdbjbsxbm3", CommonFunc.convertDoubleToString(dbdbjbsxbm3));
        map.put("dbdbjbsxbm4", CommonFunc.convertDoubleToString(dbdbjbsxbm4));
        map.put("dbdbjbjqbm1", CommonFunc.convertDoubleToString(dbdbjbjqbm1));
        map.put("dbdbjbjqbm2", CommonFunc.convertDoubleToString(dbdbjbjqbm2));
        map.put("dbdbzxgm1", CommonFunc.convertDoubleToString(dbdbzxgm1));
        map.put("dbdbzxgm2", CommonFunc.convertDoubleToString(dbdbzxgm2));
        map.put("dbdbgm1", CommonFunc.convertDoubleToString(dbdbgm1));
        map.put("dbdbgm2", CommonFunc.convertDoubleToString(dbdbgm2));
        map.put("dbdbgm3", CommonFunc.convertDoubleToString(dbdbgm3));
        map.put("dbdbgm4", CommonFunc.convertDoubleToString(dbdbgm4));
        map.put("dbdbgl1", CommonFunc.convertDoubleToString(dbdbgl1));
        map.put("dbdbgl2", CommonFunc.convertDoubleToString(dbdbgl2));
//        map.put("dbdbhlzjqb", CommonFunc.convertDoubleToString(dbdbhlzjqb));

        map.put("dbdbhlzxh", CommonFunc.convertDoubleToString(dbdbhlzxh));
        map.put("ldbdb1", CommonFunc.convertDoubleToString(ldbdb1));
        map.put("ldbdb2", CommonFunc.convertDoubleToString(ldbdb2));
        map.put("ldbdb3", CommonFunc.convertDoubleToString(ldbdb3));
        map.put("ldbdb4", CommonFunc.convertDoubleToString(ldbdb4));
        map.put("ldbdb5", CommonFunc.convertDoubleToString(ldbdb5));
        map.put("ldbdbzxg1", CommonFunc.convertDoubleToString(ldbdbzxg1));
        map.put("ldbdbzxg2", CommonFunc.convertDoubleToString(ldbdbzxg2));
        map.put("lsxndj1", CommonFunc.convertDoubleToString(lsxndj1));
        map.put("lsxndj2", CommonFunc.convertDoubleToString(lsxndj2));

        map.put("dbdb2tstx", CommonFunc.convertDoubleToString(dbdb2tstx));
        map.put("dbdb2tcck", CommonFunc.convertDoubleToString(dbdb2tcck));

        map.put("ldbdb6", CommonFunc.convertDoubleToString(ldbdb6));
        map.put("ldbdb7", CommonFunc.convertDoubleToString(ldbdb7));
        map.put("ldbdb8", CommonFunc.convertDoubleToString(ldbdb8));
        map.put("ldbdb9", CommonFunc.convertDoubleToString(ldbdb9));
        map.put("ndbdbjqb", CommonFunc.convertDoubleToString(ndbdbjqb));
        map.put("ldbdbjqb", CommonFunc.convertDoubleToString(ldbdbjqb));
        map.put("ndbdbj1", CommonFunc.convertDoubleToString(ndbdbj1));
        map.put("ndbdbj2", CommonFunc.convertDoubleToString(ndbdbj2));
        map.put("ldbdbj1", CommonFunc.convertDoubleToString(ldbdbj1));
        map.put("ldbdbj2", CommonFunc.convertDoubleToString(ldbdbj2));
        map.put("ndbdbjz1", CommonFunc.convertDoubleToString(ndbdbjz1));

        map.put("dbdbjqbtstx", CommonFunc.convertDoubleToString(dbdbjqbtstx));
        map.put("dbdbjqbtcck", CommonFunc.convertDoubleToString(dbdbjqbtcck));

        map.put("ldbdb10", CommonFunc.convertDoubleToString(ldbdb10));
        map.put("ndbdbj3", CommonFunc.convertDoubleToString(ndbdbj3));
        map.put("ldbdbj3", CommonFunc.convertDoubleToString(ldbdbj3));
        map.put("ndbdbjz2", CommonFunc.convertDoubleToString(ndbdbjz2));

        map.put("mdbdb1", CommonFunc.convertDoubleToString(mdbdb1));
        map.put("mdbdb2", CommonFunc.convertDoubleToString(mdbdb2));
        map.put("mdbdb3", CommonFunc.convertDoubleToString(mdbdb3));
        map.put("mdbdb4", CommonFunc.convertDoubleToString(mdbdb4));
        map.put("mdbdb5", CommonFunc.convertDoubleToString(mdbdb5));
        map.put("mdbdb5s", CommonFunc.convertDoubleToString(mdbdb5s));
        map.put("mdbdb6", CommonFunc.convertDoubleToString(mdbdb6));
        map.put("mdbdb7", CommonFunc.convertDoubleToString(mdbdb7));
        map.put("mdbdb8", CommonFunc.convertDoubleToString(mdbdb8));
        map.put("mdbdb9", CommonFunc.convertDoubleToString(mdbdb9));
        map.put("mdbdb9s", CommonFunc.convertDoubleToString(mdbdb9s));
        map.put("mdbdb10", CommonFunc.convertDoubleToString(mdbdb10));
        map.put("mdbdb11", CommonFunc.convertDoubleToString(mdbdb11));
        map.put("mdbdb12", CommonFunc.convertDoubleToString(mdbdb12));
        map.put("mdbdb13", CommonFunc.convertDoubleToString(mdbdb13));
        map.put("mdbdbzxg1", CommonFunc.convertDoubleToString(mdbdbzxg1));
        map.put("mdbdbzxg2", CommonFunc.convertDoubleToString(mdbdbzxg2));

        return map;
    }

    public String _getPDFName() {
        if ( dbdbtzModel.equals("DB(200×300)(7)") && ldbdb8 == 1000 ) {
            return "DB(200×300)(7)-G";
        } else if ( dbdbtzModel.equals("DB(200×300)(7)") && ldbdb8 > 1000 ) {
            return "DB(200×300)(7)";
        } else if ( dbdbtzModel.equals("DB(250×400)(10)") && ldbdb8 == 1100 ) {
            return "DB(250×400)(10)-G";
        } else if ( dbdbtzModel.equals("DB(250×400)(10)") && ldbdb8 > 1100 ) {
            return "DB(250×400)(10)";
        } else if ( dbdbtzModel.equals("DB(300×500)(15)") && ldbdb8 >= 2500 ) {
            return "DB(300×500)(15)";
        } else if ( dbdbtzModel.equals("DB(400×600)(20)") && ldbdb8 >= 2500 ) {
            return "DB(400×600)(20)";
        }
        return null;
    }

    public String _getImageName() {
//        if ( dbdbtzModel.equals("DB(200×300)(7)") ) {
//            return "DB(200×300)(7).png";
//        } else if ( dbdbtzModel.equals("DB(250×400)(10)") ) {
//            return "DB(250×400)(10).png";
//        } else if ( dbdbtzModel.equals("DB(300×500)(15)") ) {
//            return "DB(300×500)(15).png";
//        } else if ( dbdbtzModel.equals("DB(400×600)(20)") ) {
//            return "DB(400×600)(20).png";
//        }
        return null;
    }
}
