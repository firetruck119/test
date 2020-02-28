package com.point.common;

import com.itextpdf.text.BadElementException;
import com.point.entity.InputCacheExample;
import com.point.entity.InputURLCache;
import com.point.mapper.InputURLCacheMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.io.File;
import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
public class URLCacheData<T> {

    @Autowired
    private InputURLCacheMapper mapper;

//    public File getFile(String URL) {
//        return mapper;
//    }
    private void writeCache2Db(String batchId, Map<String, File> dataMap) {
        try {
            if (StringUtils.isEmpty(batchId) || dataMap == null) {
                return;
            }
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputURLCache> existedList = mapper.selectByExample(example);
            Map<String, InputURLCache> existedMap = existedList.stream()
                    .collect(Collectors.toMap(InputURLCache::getInputname, v -> v));
            for (Map.Entry<String, File> entry : dataMap.entrySet()) {
                InputURLCache inputCache = existedMap.get(entry.getKey());
                File temp = entry.getValue();
                InputURLCache newCache = new InputURLCache();
                newCache.setBatchid(batchId);
                newCache.setInputname(entry.getKey());
                newCache.setInputvalue(entry.getValue().getName());
                if (inputCache == null) {
                    newCache.setInputcacheid(null);
                    mapper.insertSelective(newCache);
                } else {
                    newCache.setInputcacheid(inputCache.getInputcacheid());
                    mapper.updateByPrimaryKeySelective(newCache);
                }
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }

    private Map<String, InputURLCache> readCacheFromDb(String batchId) {
        Map<String, InputURLCache> result = new HashMap<>();
        try {
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputURLCache> existedList = mapper.selectByExample(example);

            result = existedList.stream()
                    .collect(Collectors.toMap(InputURLCache::getInputname, e -> {
                        return e;
                    }));
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return result;
    }

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


    public Map readCacheValue(String batchId) {

        if (StringUtils.isEmpty(batchId)) {
            return null;
        }
        return readCacheFromDb(batchId);

    }

    public InputURLCache readCacheFromById_New(String id) throws IOException, BadElementException {
        return mapper.selectByPrimaryKey(new Integer(id));
    }

    public void saveCacheValue(String batchId, Map<String, File> map) {
        writeCache2Db(batchId, map);
    }
}
