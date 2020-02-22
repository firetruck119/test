package com.point.mapper;

import com.point.entity.InputCache;
import com.point.entity.InputCacheExample;
import java.util.List;

import com.point.entity.InputImageCache;
import org.apache.ibatis.annotations.Param;

public interface InputImageCacheMapper {
    int countByExample(InputCacheExample example);

    int deleteByExample(InputCacheExample example);

    int deleteByPrimaryKey(Integer inputcacheid);

    int insert(InputImageCache record);

    int insertSelective(InputImageCache record);

    List<InputImageCache> selectByExample(InputCacheExample example);

    InputImageCache selectByPrimaryKey(Integer inputcacheid);

    int updateByExampleSelective(@Param("record") InputImageCache record, @Param("example") InputCacheExample example);

    int updateByExample(@Param("record") InputImageCache record, @Param("example") InputCacheExample example);

    int updateByPrimaryKeySelective(InputImageCache record);

    int updateByPrimaryKey(InputImageCache record);

    List<String> selectAllBatchId();
}