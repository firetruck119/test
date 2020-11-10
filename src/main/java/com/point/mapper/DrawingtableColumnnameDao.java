package com.point.mapper;

import com.point.entity.DrawingtableColumnname;

import java.util.List;

public interface DrawingtableColumnnameDao {
    int deleteByPrimaryKey(Long id);

    int insert(DrawingtableColumnname record);

    int insertSelective(DrawingtableColumnname record);

    DrawingtableColumnname selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DrawingtableColumnname record);

    int updateByPrimaryKey(DrawingtableColumnname record);

    void deleteByDrawingNane(String name);

    List<DrawingtableColumnname> selectColumnsByDrawingName(String name);

}