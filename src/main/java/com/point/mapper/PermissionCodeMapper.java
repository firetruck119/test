package com.point.mapper;

import com.point.entity.PermissionCode;
import com.point.entity.PermissionCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PermissionCodeMapper {
    int countByExample(PermissionCodeExample example);

    int deleteByExample(PermissionCodeExample example);

    int deleteByPrimaryKey(Integer permissioncodeid);

    int insert(PermissionCode record);

    int insertSelective(PermissionCode record);

    List<PermissionCode> selectByExample(PermissionCodeExample example);

    PermissionCode selectByPrimaryKey(Integer permissioncodeid);

    int updateByExampleSelective(@Param("record") PermissionCode record, @Param("example") PermissionCodeExample example);

    int updateByExample(@Param("record") PermissionCode record, @Param("example") PermissionCodeExample example);

    int updateByPrimaryKeySelective(PermissionCode record);

    int updateByPrimaryKey(PermissionCode record);
}