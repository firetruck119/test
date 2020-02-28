package com.point.common;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Image;
import com.point.entity.CleaningCycleCalculation;
import com.point.entity.InputCache;
import com.point.entity.InputCacheExample;
import com.point.entity.InputImageCache;
import com.point.mapper.InputCacheMapper;
import com.point.mapper.InputImageCacheMapper;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class ImageCacheData<T> {

    @Autowired
    private InputImageCacheMapper mapper;

    private void writeCache2Db(String batchId, Map<String, InputImageCache> dataMap) {
        try {
            if (StringUtils.isEmpty(batchId) || dataMap == null) {
                return;
            }
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputImageCache> existedList = mapper.selectByExample(example);
            Map<String, InputImageCache> existedMap = existedList.stream()
                    .collect(Collectors.toMap(InputImageCache::getInputname, v -> v));
            for (Map.Entry<String, InputImageCache> entry : dataMap.entrySet()) {
                InputImageCache inputCache = existedMap.get(entry.getKey());
                InputImageCache temp = entry.getValue();
                if(entry.getValue()==null && inputCache!=null){
                    entry.setValue(inputCache);
                    continue;
                }
                temp.setBatchid(batchId);
                if (inputCache == null) {
                    temp.setInputcacheid(null);
                    mapper.insertSelective(temp);
                } else {
                    temp.setInputcacheid(inputCache.getInputcacheid());
                    mapper.updateByPrimaryKeySelective(temp);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private Map<String, InputImageCache> readCacheFromDb(String batchId) {
        Map<String, InputImageCache> result = new HashMap<>();
        try {
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputImageCache> existedList = mapper.selectByExample(example);

            result = existedList.stream()
                    .collect(Collectors.toMap(InputImageCache::getInputname, e -> {
                        e.setType(ImgDataType.getTypeByName(e.getType()).getTypeBybase64());
                        return e;
                    }));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }

//    public List<String> getBatchIdList() {
//        List<String> batchIdList = new ArrayList<>();
//        try {
//            batchIdList = mapper.selectAllBatchId();
//
//        } catch (Exception ex) {
//
//        }
//        return batchIdList;
//    }

    private Class getClassByClassName(String className) {
        Class entity = Object.class;
        try {
            entity = Class.forName("com.point.entity." + className);
        } catch (ClassNotFoundException e) {
            try {
                entity = Class.forName("com.point.entity.pdf." + className);
            } catch (ClassNotFoundException ex) {
                return null;
            }
        }
        return entity;
    }

//    public Object readCacheValueByClassString(String batchId, String className) {
//        Class entity = getClassByClassName(className);
//        if (StringUtils.isEmpty(batchId)) {
//            return null;
//        }
//        if (entity == null) {
//            return null;
//        }
//        Map<String, byte[]> cacheMap = readCacheFromDb(batchId);
//        Field[] fields = entity.getClass().getDeclaredFields();
//        try {
//            for (Field field : fields) {
//                byte[] cacheValue = cacheMap.get(field.getName());
//                if (cacheValue != null) {
//                    field.setAccessible(true);
//                    field.set(entity, cacheValue);
//                }
//            }
//        } catch (IllegalAccessException e) {
//            e.printStackTrace();
//        }
//        return null;
//    }

    public Map readCacheValue(String batchId) {

        if (StringUtils.isEmpty(batchId)) {
            return null;
        }
        return readCacheFromDb(batchId);

    }

    //    public void saveCacheValueByClassName(String batchId, String className) {
//        Class entity = getClassByClassName(className);
//        if (StringUtils.isEmpty(batchId)) {
//            return;
//        }
//        try {
//            Map<String, byte[]> cacheMap = new HashMap<>();
//            Field[] fields = entity.getClass().getDeclaredFields();
//            for (Field field : fields) {
//                field.setAccessible(true);
//                Object object = field.get(entity);
//                if (object != null && object.toString().length() > 0) {
//                    cacheMap.put(field.getName(), (byte[]) object);
//                }
//            }
//            writeCache2Db(batchId, cacheMap);
//        } catch (Exception ex) {
//            System.out.println("saveCacheValueByClassName");
//
//        }
//    }
    public Image readCacheFromById(String id) throws IOException, BadElementException {
        byte[] bytes = mapper.selectByPrimaryKey(new Integer(id)).getInputvalue();
        return Image.getInstance(bytes);
    }

    public InputImageCache readCacheFromById_New(String id) throws IOException, BadElementException {
        return  mapper.selectByPrimaryKey(new Integer(id));
    }

    public void saveCacheValue(String batchId, Map<String, InputImageCache> map) {
        writeCache2Db(batchId, map);
    }
}
