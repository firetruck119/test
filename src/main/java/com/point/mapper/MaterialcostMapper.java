package com.point.mapper;

import com.point.entity.Materialcost;
import com.point.entity.MaterialcostExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MaterialcostMapper {
    int countByExample(MaterialcostExample example);

    int deleteByExample(MaterialcostExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Materialcost record);

    int insertSelective(Materialcost record);

    List<Materialcost> selectByExample(MaterialcostExample example);

    Materialcost selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Materialcost record, @Param("example") MaterialcostExample example);

    int updateByExample(@Param("record") Materialcost record, @Param("example") MaterialcostExample example);

    int updateByPrimaryKeySelective(Materialcost record);

    int updateByPrimaryKey(Materialcost record);
}