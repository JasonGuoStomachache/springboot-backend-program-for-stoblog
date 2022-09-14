package com.stovblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.List;

import lombok.Data;

/**
 * 
 * @TableName director_colume
 */
@TableName(value ="director_colume")
@Data
public class DirectorColume implements Serializable {
    /**
     * 导航栏ID
     */
    @TableId(type = IdType.AUTO)
    private Integer id;

    /**
     * 导航栏名称
     */
    private String name;

    /**
     * 导航栏图标
     */
    private String iconClass;

    /**
     * 导航栏跳转地址
     */
    private String linkTo;

    /**
     * 是否可以下拉
     */
    private Integer isDropdown;

    /**
     * 下拉菜单内容
     */
    private Integer childrenColume;

    @TableField(exist = false)
    private List<DirectorColumeChildren> DirectorColumeChildrens;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}