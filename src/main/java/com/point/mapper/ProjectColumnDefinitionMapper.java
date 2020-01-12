package com.point.mapper;

import com.point.entity.ProjectColumnDefinition;
import com.point.entity.ProjectColumnDefinitionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProjectColumnDefinitionMapper {
    int countByExample(ProjectColumnDefinitionExample example);

    int deleteByExample(ProjectColumnDefinitionExample example);

    int deleteByPrimaryKey(Integer projectcolumndefinitionid);

    int insert(ProjectColumnDefinition record);

    int insertSelective(ProjectColumnDefinition record);

    List<ProjectColumnDefinition> selectByExample(ProjectColumnDefinitionExample example);

    ProjectColumnDefinition selectByPrimaryKey(Integer projectcolumndefinitionid);

    int updateByExampleSelective(@Param("record") ProjectColumnDefinition record, @Param("example") ProjectColumnDefinitionExample example);

    int updateByExample(@Param("record") ProjectColumnDefinition record, @Param("example") ProjectColumnDefinitionExample example);

    int updateByPrimaryKeySelective(ProjectColumnDefinition record);

    int updateByPrimaryKey(ProjectColumnDefinition record);
}