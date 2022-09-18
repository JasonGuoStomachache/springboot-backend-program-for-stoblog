package com.stovblog;

import com.stovblog.entity.ArticleBlog;
import com.stovblog.mapper.ArticleBlogMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;

@SpringBootTest
public class testInsertArticle {

    @Autowired
    private ArticleBlogMapper articleBlogMapper;
    @Test
    public void testArticleUUID(){
        ArticleBlog articleBlog = new ArticleBlog();
        articleBlog.setUserId(1571164162819784705L);
        articleBlog.setArticleTitle("基于 SCSS mixin 的 flex gap polyfill");
        articleBlog.setArticleIntroduction("一直以来，习惯在 flex 布局中使用 gap这个属性设置间距，一直以来也都是在最新的" +
                " Chrome上调试，所以从来没有想在 flex gap在其他浏览器上存在兼容性问题。" +
                "最近看了一下文档才反应过来，gap原来只是 grid 布局的属性，虽然近些年来主流浏览器都已经支持了");
        articleBlog.setArticleType(0);
        articleBlog.setArticleFormat(0);
        articleBlog.setArticleCoverUrl("http://localhost:8080/backgroundimgs/03.png");
        articleBlog.setArticleFileUrl("nofile");
        articleBlog.setArticleDate(new Date());
        articleBlogMapper.insert(articleBlog);
        System.out.println(articleBlog.getArticleId());
    }
}
