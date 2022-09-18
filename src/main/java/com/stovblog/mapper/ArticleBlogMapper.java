package com.stovblog.mapper;

import com.stovblog.entity.ArticleBlog;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.stovblog.entity.UserAuthor;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
* @author 35088
* @description 针对表【article_blog】的数据库操作Mapper
* @createDate 2022-09-17 16:29:34
* @Entity com.stovblog.entity.ArticleBlog
*/
public interface ArticleBlogMapper extends BaseMapper<ArticleBlog> {


//    mybatis在传递多个参数时必须要加入@Param（）给它指定绑定的参数，只有一个参数时，它默认传递唯一的一个参数。
    @Update("update article_blog set article_cover_url = #{coverUrl} , article_file_url = #{fileUrl} where article_id = #{id}")
    int updateArticleCoverUrlAndArticleFileUrl(@Param("coverUrl")String coverUrl, @Param("fileUrl")String fileUrl,@Param("id")long id);

    @Select("select * from article_blog")
    @Results({
            @Result(column = "article_id",property = "articleId"),
            @Result(column = "user_id",property = "userId"),
            @Result(column = "article_title",property = "articleTitle"),
            @Result(column = "article_introduction",property = "articleIntroduction"),
            @Result(column = "article_type",property = "articleType"),
            @Result(column = "article_format",property = "articleFormat"),
            @Result(column = "article_cover_url",property = "articleCoverUrl"),
            @Result(column = "article_file_url",property = "articleFileUrl"),
            @Result(column = "article_date",property = "articleDate"),
            @Result(column = "article_views",property = "articleViews"),
            @Result(column = "article_comment_count",property = "articleCommentCount"),
            @Result(column = "article_like_count",property = "articleLikeCount"),
            @Result(column = "user_id",property ="userAuthor",javaType = UserAuthor.class,
                    one = @One(select="com.stovblog.mapper.UserAuthorMapper.selectUserAuthorById")
            )
    })
    List<ArticleBlog> selectAllArticles();
}




