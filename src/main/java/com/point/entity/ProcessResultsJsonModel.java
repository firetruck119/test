package com.point.entity;

import java.util.List;

/**
 * Created by tchu on 2017/12/26.
 */
public class ProcessResultsJsonModel<T>  {
    private String status;
    private  String message;
    private List<T> Data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<T> getData() {
        return Data;
    }

    public void setData(List<T> data) {
        Data = data;
    }
}
