package com.stovblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 
 * @TableName user_author
 */
@TableName(value ="user_author")
@Data
public class UserAuthor implements Serializable {
    /**
     * 
     */
    @TableId(type = IdType.ID_WORKER)
    private Long userId;

    /**
     * 
     */
    private String userNickName;

    /**
     * 
     */
    private String userPassword;

    /**
     * 
     */
    private String userEmail;

    /**
     * 
     */
    private String userProfilePhoto;

    /**
     * 
     */
    private String userMotto;

    /**
     * 
     */
    private Integer userAge;

    /**
     * 
     */
    private Long userBlogCount;

    /**
     * 
     */
    private Long userCollectionCount;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}