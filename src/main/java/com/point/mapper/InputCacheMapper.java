package com.point.mapper;

import com.point.entity.InputCache;
import com.point.entity.InputCacheExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InputCacheMapper {
    int countByExample(InputCacheExample example);

    int deleteByExample(InputCacheExample example);

    int deleteByPrimaryKey(Integer inputcacheid);

    int insert(InputCache record);

    int insertSelective(InputCache record);

    List<InputCache> selectByExample(InputCacheExample example);

    InputCache selectByPrimaryKey(Integer inputcacheid);

    int updateByExampleSelective(@Param("record") InputCache record, @Param("example") InputCacheExample example);

    int updateByExample(@Param("record") InputCache record, @Param("example") InputCacheExample example);

    int updateByPrimaryKeySelective(InputCache record);

    int updateByPrimaryKey(InputCache record);

    List<String> selectAllBatchId();
}