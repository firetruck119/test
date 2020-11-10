package com.point.entity;

import java.io.Serializable;
import lombok.Data;

/**
 * drawing
 * @author 
 */
@Data
public class Drawing implements Serializable {
    private Integer id;

    private String drawingname;

    private String drawinno;

    private static final long serialVersionUID = 1L;
}