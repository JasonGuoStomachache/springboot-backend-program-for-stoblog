package com.stovblog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 
 * @TableName zj_users
 */
@TableName(value ="zj_users")
@Data
public class Users implements Serializable {
    /**
     * 用户ID
     */
    @TableId(type = IdType.AUTO)
    private Long userId;

    /**
     * 用户IP
     */
    private String userIp;

    /**
     * 用户名
     */
    private String userName;

    /**
     * 用户密码
     */
    private String userPassword;

    /**
     * 用户邮箱
     */
    private String userEmail;

    /**
     * 用户头像
     */
    private String userProfilePhoto;

    /**
     * 注册时间
     */
    private Date userRegistrationTime;

    /**
     * 用户生日
     */
    private Date userBirthday;

    /**
     * 用户年龄
     */
    private Integer userAge;

    /**
     * 用户手机号
     */
    private String userTelephoneNumber;

    /**
     * 用户昵称
     */
    private String userNickname;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}