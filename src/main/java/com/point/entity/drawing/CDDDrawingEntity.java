package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class CDDDrawingEntity {


    private Double cdddy;
    private Double cddpl;
    private Double psgd;
    private Double gsscd;
    private String cddxhModel;
    private String gjdqModel;
    private String gjdq;
    private String xmmc;


    public Map<String, String> takeMapForPDF() {
        Map map = new HashMap();
        map.put("cdddy", CommonFunc.convertDoubleToString(cdddy));
        map.put("cddpl", CommonFunc.convertDoubleToString(cddpl));
        map.put("psgd", CommonFunc.convertDoubleToString(psgd));
        map.put("gsscd", CommonFunc.convertDoubleToString(gsscd));
        map.put("gjdq", CommonFunc.convertDoubleToString(gjdq));
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        return map;
    }

    public String _getPDFName(){
        if ( cddxhModel.equals("CDD240(2A)") ) {
            return "CDD240（2A）";
        } else if ( cddxhModel.equals("CDD240(3A)") ) {
            return "CDD240（3A）";
        } else if ( cddxhModel.equals("CDD240(4A)") ) {
            return "CDD240（4A）";
        }
        return null;
    }

    public String _getImageName() {
        if( cddxhModel.equals("CDD240(2A)") ){
            return "CDD240（2A）.png";
        }else if ( cddxhModel.equals("CDD240(3A)" )){
            return "CDD240（3A）.png";
        }else if ( cddxhModel.equals("CDD240(4A)" )){
            return "CDD240（4A）.png";
        }
        return null;
    }
}
