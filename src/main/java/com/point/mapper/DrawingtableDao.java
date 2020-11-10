package com.point.mapper;

import com.point.entity.Drawingtable;
import org.apache.poi.xslf.usermodel.DrawingTable;

import java.util.List;

public interface DrawingtableDao {
    int deleteByPrimaryKey(Long id);

    int insert(Drawingtable record);

    int insertSelective(Drawingtable record);

    Drawingtable selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Drawingtable record);

    int updateByPrimaryKey(Drawingtable record);

    void deleteByDrawingNane(String name);

    List<Drawingtable> selectTableByDrawingName(String name);

    List<String> selectByTable(Drawingtable record);

}