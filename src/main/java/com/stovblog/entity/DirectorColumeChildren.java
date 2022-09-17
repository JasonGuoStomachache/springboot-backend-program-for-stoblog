package com.stovblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName director_colume_children
 */
@TableName(value ="director_colume_children")
@Data
public class DirectorColumeChildren implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 
     */
    private Integer parentId;

    /**
     * 
     */
    private String name;

    /**
     * 
     */
    private String linkTo;

    private String imgSrc;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}