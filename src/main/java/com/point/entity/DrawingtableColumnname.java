package com.point.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * drawingtable_columnname
 * @author 
 */
@Data
public class DrawingtableColumnname implements Serializable {
    private Long id;

    private String drawingname;

    private String columnno;

    private String columnname;

    private static final long serialVersionUID = 1L;
}