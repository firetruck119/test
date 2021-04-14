package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class HlDrawingEntity {

    private String xmmc;
    private String plh;
    private String jsr;
    private String date;

//后台
    private Double hltzm1;
    private Double hltzm2;
    private Double hltzm3;
    private Double hltzgm1;

    //    总图参数
    private Double lhltz1;
    private Double lhltz2;
    private Double hltzn1;
    //提示提醒
//    private String lhltz1tstx;
    private String lhltz1tcck;

//    质量参数
    private Double mhltz1;
    private Double mhltz2;
    private Double mhltz3;
    private Double mhltz4;

//    下拉
    private String hltzModel;

    public Map<String, String> takeMapForPDF() {
        Map map = new HashMap();
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("plh", CommonFunc.convertDoubleToString(plh));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("date", CommonFunc.convertDoubleToString(date));

        map.put("hltzm1", CommonFunc.convertDoubleToString(hltzm1));
        map.put("hltzm2", CommonFunc.convertDoubleToString(hltzm2));
        map.put("hltzm3", CommonFunc.convertDoubleToString(hltzm3));
        map.put("hltzgm1", CommonFunc.convertDoubleToString(hltzgm1));

        map.put("lhltz1", CommonFunc.convertDoubleToString(lhltz1));
        map.put("lhltz2", CommonFunc.convertDoubleToString(lhltz2));
        map.put("hltzn1", CommonFunc.convertDoubleToString(hltzn1));

//        map.put("lhltz1tstx", CommonFunc.convertDoubleToString(lhltz1tstx));
        map.put("lhltz1tcck", CommonFunc.convertDoubleToString(lhltz1tcck));

        map.put("mhltz1", CommonFunc.convertDoubleToString(mhltz1));
        map.put("mhltz2", CommonFunc.convertDoubleToString(mhltz2));
        map.put("mhltz3", CommonFunc.convertDoubleToString(mhltz3));
        map.put("mhltz4", CommonFunc.convertDoubleToString(mhltz4));

        return map;
    }

    public String _getPDFName() {
        if ( hltzModel.equals("HL(1000)") ) {
            return "HL(1000)";
        } else if ( hltzModel.equals("HL(2000)") ) {
            return "HL(2000)";
        } else if ( hltzModel.equals("HL(3000)") ) {
            return "HL(3000)";
        } else if ( hltzModel.equals("HL(4000)") ) {
            return "HL(4000)";
        } else if ( hltzModel.equals("HL(5000)") ) {
            return "HL(5000)";
        } else if ( hltzModel.equals("HL(6000)") ) {
            return "HL(6000)";
        }
        return null;
    }

    public String _getImageName() {

        return null;
    }
}
