package com.point.entity.drawing;

import com.point.common.CommonFunc;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class LowerLZDrawingEntity {

    private String xmmc;
    private String jsr;
    private String date;
    private String qsjg;

    private String lzxxzModel;
    private String qsjgazwzModel;
    private String qsjgModel;

    private String lzxhzjgxz;
    private String lzxdbjm;
    private String lzxxz;
    private String lzxhlz;

    private Double lzx001;
//    lzx001.rotate(Math.PI);
    private Double lzx002;
    private Double lzx003;
    private Double lzx004;
    private Double lzx005;
    private Double lzx006;
    private Double lzx007;
    private Double lzx008;
    private Double lzx009;
    private Double lzx010;
    private Double lzx011;
    private Double lzx012;
    private Double lzx013;
    private Double lzx014;
    private Double lzx015;

    private Double mlzx001;
    private Double mlzx002;
    private Double mlzx003;
    private Double mlzx004;
    private Double mlzx005;
    private Double mlzx006;
    private Double mlzx007;
    private Double mlzx008;
    private Double mlzx009;
    private Double mlzx010;
    private Double mlzx011;
    private Double mlzx012;
    private Double mlzx013;
    private Double mlzx014;
    private Double mlzx015;

    private Double lzxg1;
    private Double lzxg2;
    private Double mlzxg1;
    private Double mlzxg2;
    private Double mlzxg3;
    private Double mlzxg4;
    private Double mlzxg5;
    private Double mlzxg6;
    private Double mlzxg7;
    private Double mlzxg8;
    private Double mlzxg9;
    private Double mlzxg10;
    private Double mlzxg11;

    private Double mlzwbxs;

    public Map<String, String> takeMapForPDF() {
        Map map = new HashMap();
        map.put("xmmc", CommonFunc.convertDoubleToString(xmmc));
        map.put("jsr", CommonFunc.convertDoubleToString(jsr));
        map.put("date", CommonFunc.convertDoubleToString(date));
        map.put("qsjg", CommonFunc.convertDoubleToString(qsjg));

        map.put("lzxhzjgxz", CommonFunc.convertDoubleToString(lzxhzjgxz));
        map.put("lzxdbjm", CommonFunc.convertDoubleToString(lzxdbjm));
        map.put("lzxxz", CommonFunc.convertDoubleToString(lzxxz));
        map.put("lzxhlz", CommonFunc.convertDoubleToString(lzxhlz));

        map.put("lzx001", CommonFunc.convertDoubleToString(lzx001));
        map.put("lzx002", CommonFunc.convertDoubleToString(lzx002));
        map.put("lzx003", CommonFunc.convertDoubleToString(lzx003));
        map.put("lzx004", CommonFunc.convertDoubleToString(lzx004));
        map.put("lzx005", CommonFunc.convertDoubleToString(lzx005));
        map.put("lzx006", CommonFunc.convertDoubleToString(lzx006));
        map.put("lzx007", CommonFunc.convertDoubleToString(lzx007));
        map.put("lzx008", CommonFunc.convertDoubleToString(lzx008));
        map.put("lzx009", CommonFunc.convertDoubleToString(lzx009));
        map.put("lzx010", CommonFunc.convertDoubleToString(lzx010));
        map.put("lzx011", CommonFunc.convertDoubleToString(lzx011));
        map.put("lzx012", CommonFunc.convertDoubleToString(lzx012));
        map.put("lzx013", CommonFunc.convertDoubleToString(lzx013));
        map.put("lzx014", CommonFunc.convertDoubleToString(lzx014));
        map.put("lzx015", CommonFunc.convertDoubleToString(lzx015));

        map.put("mlzx001", CommonFunc.convertDoubleToString(mlzx001));
        map.put("mlzx002", CommonFunc.convertDoubleToString(mlzx002));
        map.put("mlzx003", CommonFunc.convertDoubleToString(mlzx003));
        map.put("mlzx004", CommonFunc.convertDoubleToString(mlzx004));
        map.put("mlzx005", CommonFunc.convertDoubleToString(mlzx005));
        map.put("mlzx006", CommonFunc.convertDoubleToString(mlzx006));
        map.put("mlzx007", CommonFunc.convertDoubleToString(mlzx007));
        map.put("mlzx008", CommonFunc.convertDoubleToString(mlzx008));
        map.put("mlzx009", CommonFunc.convertDoubleToString(mlzx009));
        map.put("mlzx010", CommonFunc.convertDoubleToString(mlzx010));
        map.put("mlzx011", CommonFunc.convertDoubleToString(mlzx011));
        map.put("mlzx012", CommonFunc.convertDoubleToString(mlzx012));
        map.put("mlzx013", CommonFunc.convertDoubleToString(mlzx013));
        map.put("mlzx014", CommonFunc.convertDoubleToString(mlzx014));
        map.put("mlzx015", CommonFunc.convertDoubleToString(mlzx015));
        
        map.put("lzxg1", CommonFunc.convertDoubleToString(lzxg1));
        map.put("lzxg2", CommonFunc.convertDoubleToString(lzxg2));
        map.put("mlzxg1", CommonFunc.convertDoubleToString(mlzxg1));
        map.put("mlzxg2", CommonFunc.convertDoubleToString(mlzxg2));
        map.put("mlzxg3", CommonFunc.convertDoubleToString(mlzxg3));
        map.put("mlzxg4", CommonFunc.convertDoubleToString(mlzxg4));
        map.put("mlzxg5", CommonFunc.convertDoubleToString(mlzxg5));
        map.put("mlzxg6", CommonFunc.convertDoubleToString(mlzxg6));
        map.put("mlzxg7", CommonFunc.convertDoubleToString(mlzxg7));
        map.put("mlzxg8", CommonFunc.convertDoubleToString(mlzxg8));
        map.put("mlzxg9", CommonFunc.convertDoubleToString(mlzxg9));
        map.put("mlzxg10", CommonFunc.convertDoubleToString(mlzxg10));
        map.put("mlzxg11", CommonFunc.convertDoubleToString(mlzxg11));
        map.put("mlzwbxs", CommonFunc.convertDoubleToString(mlzwbxs));

        return map;
    }

    public String _getPDFName(){
        if ( lzxxzModel.equals("LZX(300×300)(6.3)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(300×300)(6.3)(4M)";
        } else if ( lzxxzModel.equals("LZX(350×350)(7.1)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(350×350)(7.1)(4M)";
        } else if ( lzxxzModel.equals("LZX(390×500)(8.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(390×500)(8.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(500×600)(9.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(500×600)(9.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(535×700)(10.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×700)(10.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(535×750)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×750)(11.2)(4M)";
        }else if ( lzxxzModel.equals("LZX(535×800)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×800)(12.5)(4M)";
        }else if ( lzxxzModel.equals("LZX(675×800)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×800)(11.2)(4M)";
        }else if ( lzxxzModel.equals("LZX(675×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×850)(12.5)(4M)";
        }else if ( lzxxzModel.equals("LZX(675×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×900)(14.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(815×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×850)(12.5)(4M)";
        }else if ( lzxxzModel.equals("LZX(815×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×900)(14.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(815×950)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×950)(14.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(815×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×1000)(16.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(975×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(975×1000)(16.0)(4M)";
        }else if ( lzxxzModel.equals("LZX(300×300)(6.3)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(300×300)(6.3)";
        }else if ( lzxxzModel.equals("LZX(350×350)(7.1)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(350×350)(7.1)";
        } else if ( lzxxzModel.equals("LZX(390×500)(8.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(390×500)(8.0)";
        }else if ( lzxxzModel.equals("LZX(500×600)(9.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(500×600)(9.0)";
        }else if ( lzxxzModel.equals("LZX(535×700)(10.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×700)(10.0)";
        }else if ( lzxxzModel.equals("LZX(535×750)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×750)(11.2)";
        }else if ( lzxxzModel.equals("LZX(535×800)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×800)(12.5)";
        }else if ( lzxxzModel.equals("LZX(675×800)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×800)(11.2)";
        }else if ( lzxxzModel.equals("LZX(675×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×850)(12.5)";
        }else if ( lzxxzModel.equals("LZX(675×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×900)(14.0)";
        }else if ( lzxxzModel.equals("LZX(815×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×850)(12.5)";
        }else if ( lzxxzModel.equals("LZX(815×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×900)(14.0)";
        }else if ( lzxxzModel.equals("LZX(815×950)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×950)(14.0)";
        }else if ( lzxxzModel.equals("LZX(815×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×1000)(16.0)";
        }else if ( lzxxzModel.equals("LZX(975×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(975×1000)(16.0)";
        }
        return null;
    }

    public String _getImageName() {
        if ( lzxxzModel.equals("LZX(300×300)(6.3)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(300×300)(6.3)(4M).png";
        } else if ( lzxxzModel.equals("LZX(350×350)(7.1)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(350×350)(7.1)(4M).png";
        } else if ( lzxxzModel.equals("LZX(390×500)(8.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(390×500)(8.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(500×600)(9.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(500×600)(9.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(535×700)(10.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×700)(10.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(535×750)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×750)(11.2)(4M).png";
        }else if ( lzxxzModel.equals("LZX(535×800)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(535×800)(12.5)(4M).png";
        }else if ( lzxxzModel.equals("LZX(675×800)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×800)(11.2)(4M).png";
        }else if ( lzxxzModel.equals("LZX(675×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×850)(12.5)(4M).png";
        }else if ( lzxxzModel.equals("LZX(675×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(675×900)(14.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(815×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×850)(12.5)(4M).png";
        }else if ( lzxxzModel.equals("LZX(815×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×900)(14.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(815×950)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×950)(14.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(815×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(815×1000)(16.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(975×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 <= 4000 ) {
            return "LZX(975×1000)(16.0)(4M).png";
        }else if ( lzxxzModel.equals("LZX(300×300)(6.3)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(300×300)(6.3).png";
        }else if ( lzxxzModel.equals("LZX(350×350)(7.1)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(350×350)(7.1).png";
        } else if ( lzxxzModel.equals("LZX(390×500)(8.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(390×500)(8.0).png";
        }else if ( lzxxzModel.equals("LZX(500×600)(9.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(500×600)(9.0).png";
        }else if ( lzxxzModel.equals("LZX(535×700)(10.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×700)(10.0).png";
        }else if ( lzxxzModel.equals("LZX(535×750)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×750)(11.2).png";
        }else if ( lzxxzModel.equals("LZX(535×800)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(535×800)(12.5).png";
        }else if ( lzxxzModel.equals("LZX(675×800)(11.2)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×800)(11.2).png";
        }else if ( lzxxzModel.equals("LZX(675×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×850)(12.5).png";
        }else if ( lzxxzModel.equals("LZX(675×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(675×900)(14.0).png";
        }else if ( lzxxzModel.equals("LZX(815×850)(12.5)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×850)(12.5).png";
        }else if ( lzxxzModel.equals("LZX(815×900)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×900)(14.0).png";
        }else if ( lzxxzModel.equals("LZX(815×950)(14.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×950)(14.0).png";
        }else if ( lzxxzModel.equals("LZX(815×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(815×1000)(16.0).png";
        }else if ( lzxxzModel.equals("LZX(975×1000)(16.0)") && qsjgazwzModel.equals("立柱后面") && lzx001 > 4000 ) {
            return "LZX(975×1000)(16.0).png";
        }
        return null;
    }
}
