package com.point.mapper;

import com.point.entity.ProjectData;
import com.point.entity.ProjectDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectDataMapper {
    int countByExample(ProjectDataExample example);

    int deleteByExample(ProjectDataExample example);

    int deleteByPrimaryKey(Integer projectdataid);

    int insert(ProjectData record);

    int insertSelective(ProjectData record);

    List<ProjectData> selectByExample(ProjectDataExample example);

    ProjectData selectByPrimaryKey(Integer projectdataid);

    int updateByExampleSelective(@Param("record") ProjectData record, @Param("example") ProjectDataExample example);

    int updateByExample(@Param("record") ProjectData record, @Param("example") ProjectDataExample example);

    int updateByPrimaryKeySelective(ProjectData record);

    int updateByPrimaryKey(ProjectData record);
}