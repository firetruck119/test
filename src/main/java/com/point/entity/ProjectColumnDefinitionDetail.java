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

    private List<String> stringValues;

    private Double minValue;

    private Double maxValue;

    public List<String> getStringValues() {
        return stringValues;
    }

    public void setStringValues(List<String> stringValues) {
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
