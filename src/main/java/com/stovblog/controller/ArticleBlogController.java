package com.stovblog.controller;

import com.stovblog.entity.ArticleBlog;
import com.stovblog.mapper.ArticleBlogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ArticleBlogController {

    @Autowired
    private ArticleBlogMapper articleBlogMapper;

    @PostMapping(value = "/postarticleappendix")
    public String upLoad(
                         @RequestParam("articleInfo")List<String> articleInfo,
                         @RequestParam("articleCover")MultipartFile cover,
                         @RequestParam(value = "articleImgSet",required=false) List<MultipartFile> imgSet,
                         @RequestParam("articleFile")MultipartFile file,
                         HttpServletRequest request) throws IOException, ParseException {

        ArticleBlog articleBlog = new ArticleBlog();
        //保存博客基本信息
        articleBlog.setUserId(Long.parseLong(articleInfo.get(0)));
        articleBlog.setArticleTitle(articleInfo.get(1));
        articleBlog.setArticleIntroduction(articleInfo.get(2));
        articleBlog.setArticleType(Integer.parseInt(articleInfo.get(3)));
        articleBlog.setArticleFormat(Integer.parseInt(articleInfo.get(4)));
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        articleBlog.setArticleDate(ft.parse(articleInfo.get((5))));
        articleBlogMapper.insert(articleBlog);
        //先提交基本信息创建数据库行，得到返回的雪花算法生成的主键id，再将主键id作为博客封面和文件的前缀名，以次来定位。
        //保存博客封面图片
        String path = "/blogcover";
        String coverUrl =  saveFile(cover,path,String.valueOf(articleBlog.getArticleId()),request);

        //保存的博客文件
        path = "/blogfile";
        String fileUrl = saveFile(file,path,String.valueOf(articleBlog.getArticleId()),request);

        articleBlogMapper.updateArticleCoverUrlAndArticleFileUrl(coverUrl,fileUrl,articleBlog.getArticleId());

//        System.out.println("imgSet:"+imgSet);
//        for (MultipartFile img:imgSet
//             ) {
////            saveFile(img,path);
//        }
//        saveFile(cover,path);
//        saveFile(file,path);
        return "succeed";
    }

    private String saveFile(MultipartFile multipartFile,String path,String articlePrefix,HttpServletRequest request) throws IOException {
        String realPath = request.getServletContext().getRealPath(path);
        File dir = new File(realPath);
        if (!dir.exists()){
            dir.mkdir();
        }
        File file = new File(realPath +"/" + articlePrefix + "_" + multipartFile.getOriginalFilename());
        System.out.println(file.getPath());
        multipartFile.transferTo(file);
        return "http://localhost:8081"+ path +"/" + articlePrefix + "_" + multipartFile.getOriginalFilename();
    }
    @GetMapping(value = "/getAllArticleBlog")
    public List<ArticleBlog> getAllArticleBlog(){
        return articleBlogMapper.selectAllArticles();
    }
//    @RequestMapping("/api/public/docs/README.md")
//    public ResT getAbout() throws IOException {
//        String readme = "README.md";
//        //1.获取通道
//        FileInputStream fin = new FileInputStream(readme);
//        FileChannel fc = fin.getChannel();
//
//        //2.创建缓冲区
//        ByteBuffer buffer = ByteBuffer.allocate(1024);
//
//        int length = -1;
//        StringBuffer stringBuffer = new StringBuffer();
//        //3.将数据从通道读到缓冲区中
//        while ((length = fc.read(buffer)) != -1) {
//            stringBuffer.append(new String(buffer.array()));
//            buffer.clear();
//        }
//        fin.close();
//
//        return ResT.ok().setData(stringBuffer.toString().trim());
//    }


}
