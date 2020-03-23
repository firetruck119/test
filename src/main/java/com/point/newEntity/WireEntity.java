package com.point.newEntity;

import com.point.newEntity.PDFEntity;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

@Data
public class WireEntity implements PDFEntity {

    @Override
    public Map<String, String> PDFMap(String type) {
        Map<String,String> map=new HashMap<>();
        map.put("123","321");
        return map;
    }

    @Override
    public Map<String, String> checkData(String type) {
        Map<String,String> map=new HashMap<>();
        map.put("123","321");
        return map;
    }
}
