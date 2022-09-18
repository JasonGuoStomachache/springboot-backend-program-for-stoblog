package com.stovblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stovblog.entity.ArticleBlog;
import com.stovblog.service.ArticleBlogService;
import com.stovblog.mapper.ArticleBlogMapper;
import org.springframework.stereotype.Service;

/**
* @author 35088
* @description 针对表【article_blog】的数据库操作Service实现
* @createDate 2022-09-17 16:29:34
*/
@Service
public class ArticleBlogServiceImpl extends ServiceImpl<ArticleBlogMapper, ArticleBlog>
    implements ArticleBlogService{

}




