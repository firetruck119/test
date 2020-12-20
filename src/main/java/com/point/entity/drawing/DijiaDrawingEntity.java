package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class DijiaDrawingEntity {

    private Double lg;
    private Double ll;
    private Double lzpxj;
    private String djhzxs;
    private String hzzc;
    private String yxjgxz;
    private String djbdb;
    private String djlx;
    private String djqsjg;
    private String djth;
    private String djzl;

    public String _getPDFName(){
        return null;
    }

    public String _getImageName(){
        return null;
    }
}
