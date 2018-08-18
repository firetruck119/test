package com.point.mapper;

import com.point.entity.ComponentArmEntity;

import java.util.List;

public interface ComponentArmMapper {
    List<ComponentArmEntity> getAll();

    void insert(ComponentArmEntity user);

    void delete(Long id);
}
