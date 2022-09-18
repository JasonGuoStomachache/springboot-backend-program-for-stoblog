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
 * @TableName article_blog
 */
@TableName(value ="article_blog")
@Data
public class ArticleBlog implements Serializable {
    /**
     * 博客id
     */
    @TableId(type = IdType.ID_WORKER)
    private Long articleId;

    /**
     * 作者id
     */
    private Long userId;

    /**
     * 博客标题
     */
    private String articleTitle;

    /**
     * 博客简介
     */
    private String articleIntroduction;

    /**
     * 博客分类
     */
    private Integer articleType;

    /**
     * 博客正文格式
     */
    private Integer articleFormat;

    /**
     * 博客封面url
     */
    private String articleCoverUrl;

    /**
     * 博客正文文件url
     */
    private String articleFileUrl;

    /**
     * 博客提交时间
     */
    private Date articleDate;

    /**
     * 博客浏览数
     */
    private Long articleViews;

    /**
     * 博客评论数
     */
    private Long articleCommentCount;

    /**
     * 博客收藏数
     */
    private Long articleLikeCount;

    @TableField(exist = false)
    private UserAuthor userAuthor;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}