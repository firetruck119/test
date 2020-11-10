package com.point.mapper;

import com.point.entity.Drawing;

import java.util.List;

public interface DrawingDao {
    int deleteByPrimaryKey(Integer id);

    int insert(Drawing record);

    int insertSelective(Drawing record);

    Drawing selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Drawing record);

    int updateByPrimaryKey(Drawing record);

    List<Drawing> getAll();

    void deleteByDrawingName(String name);

    Drawing getByNo(String drawingname);

}