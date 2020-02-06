package com.point.common;

import com.point.entity.InputCache;
import com.point.entity.InputCacheExample;
import com.point.mapper.InputCacheMapper;
import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.thymeleaf.util.StringUtils;

import java.lang.reflect.Field;
import java.util.*;
import java.util.stream.Collectors;

@Component
public class CacheData<T> {

    @Autowired
    private InputCacheMapper inputCacheMapper;

    private void writeCache2Db(String batchId, Map<String,String> dataMap){
        try{
            if(StringUtils.isEmpty(batchId)||dataMap==null){
                return;
            }
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputCache> existedList = inputCacheMapper.selectByExample(example);
            Map<String, InputCache> existedMap= existedList.stream()
                    .collect(Collectors.toMap(InputCache::getInputname,v->v));
            for(Map.Entry<String,String> entry : dataMap.entrySet()) {
                InputCache inputCache = existedMap.get(entry.getKey());
                if(inputCache==null) {
                    inputCache = new InputCache();
                    inputCache.setBatchid(batchId);
                    inputCache.setInputname(entry.getKey());
                    inputCache.setInputvalue(entry.getValue());
                    inputCacheMapper.insertSelective(inputCache);
                }else {
                    inputCache.setInputvalue(entry.getValue());
                    inputCacheMapper.updateByPrimaryKeySelective(inputCache);
                }
            }
        }catch (Exception ex){

        }
    }

    private Map<String, String> readCacheFromDb(String batchId){
        Map<String, String> result = new HashMap<>();
        try{
            InputCacheExample example = new InputCacheExample();
            InputCacheExample.Criteria criteria = example.createCriteria();
            criteria.andBatchidEqualTo(batchId);
            List<InputCache> existedList = inputCacheMapper.selectByExample(example);
            result = existedList.stream()
                    .collect(Collectors.toMap(InputCache::getInputname,InputCache::getInputvalue));
        }catch (Exception ex){

        }
        return result;
    }

    public List<String> getBatchIdList(){
        List<String> batchIdList = new ArrayList<>();
        try{
            batchIdList = inputCacheMapper.selectAllBatchId();

        }catch (Exception ex){

        }
        return batchIdList;
    }

    public void readCacheValue(String batchId, T entity){
        try {
            Map<String, String> cacheMap = readCacheFromDb(batchId);
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                String cacheValue = cacheMap.get(field.getName());
                if (cacheValue != null) {
                    field.setAccessible(true);
                    if (field.getType().getName().equals("java.lang.Double")) {
                        field.set(entity, Double.parseDouble(cacheValue));
                    }else if(field.getType().getName().equals("java.lang.String")){
                        field.set(entity, cacheValue);
                    }
                }
            }
        }catch (Exception ex){

        }
    }

    public void saveCacheValue(String batchId, T entity) {
        try {
            Map<String, String> cacheMap = new HashMap<>();
            Field[] fields = entity.getClass().getDeclaredFields();
            for (Field field : fields) {
                field.setAccessible(true);
                Object object = field.get(entity);
                if (object != null && object.toString().length() > 0) {
                    cacheMap.put(field.getName(), object.toString());
                }
            }
            writeCache2Db(batchId, cacheMap);
        } catch (Exception ex) {

        }
    }
}
