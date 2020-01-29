package com.point.entity;

import java.util.List;
import java.util.Set;

public class ProjectColumnDefinitionDetail extends ProjectColumnDefinition {
    public ProjectColumnDefinitionDetail(ProjectColumnDefinition projectColumnDefinition){
        this.setChangelasttime(projectColumnDefinition.getChangelasttime());
        this.setColumndatatype(projectColumnDefinition.getColumndatatype());
        this.setColumnname(projectColumnDefinition.getColumnname());
        this.setCreatetime(projectColumnDefinition.getCreatetime());
        this.setProjectcolumndefinitionid(projectColumnDefinition.getProjectcolumndefinitionid());
        this.setQueryconditionorder(projectColumnDefinition.getQueryconditionorder());
    }

    private Set<String> stringValues;

    private Double minValue;

    private Double maxValue;

    public Set<String> getStringValues() {
        return stringValues;
    }

    public void setStringValues(Set<String> stringValues) {
        this.stringValues = stringValues;
    }

    public Double getMinValue() {
        return minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }
}
