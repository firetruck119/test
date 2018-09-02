package com.point.mapper;

import com.point.entity.Componentpost;
import com.point.entity.ComponentpostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComponentpostMapper {
    int countByExample(ComponentpostExample example);

    int deleteByExample(ComponentpostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Componentpost record);

    int insertSelective(Componentpost record);

    List<Componentpost> selectByExample(ComponentpostExample example);

    Componentpost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Componentpost record, @Param("example") ComponentpostExample example);

    int updateByExample(@Param("record") Componentpost record, @Param("example") ComponentpostExample example);

    int updateByPrimaryKeySelective(Componentpost record);

    int updateByPrimaryKey(Componentpost record);
}