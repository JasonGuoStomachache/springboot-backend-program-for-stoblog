package com.stovblog.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin
public class ArticleController {

    @PostMapping(value = "/postarticleappendix")
    public String upLoad(
                         @RequestParam("articleInfo")List<String> articleInfo,
                         @RequestParam("articleCover")MultipartFile photo,
                         @RequestParam("articleImgSet") List<MultipartFile> imgSet,
                         @RequestParam("articleFile")MultipartFile file,
                         HttpServletRequest request) throws IOException {
        String path = request.getServletContext().getRealPath("/blogcover");
        System.out.println(path);
        for (String str: articleInfo){
            System.out.println(str);
        }
        System.out.println("photo:"+ photo);
        System.out.println("file:"+file);
        System.out.println("imgSet:"+imgSet);
        for (MultipartFile img:imgSet
             ) {
            saveFile(img,path);
        }
        saveFile(photo,path);
        saveFile(file,path);
        return "succeed";
    }

    private void saveFile(MultipartFile multipartFile,String path) throws IOException {
        File dir = new File(path);
        if (!dir.exists()){
            dir.mkdir();
        }
        File file = new File(path +"/"+ multipartFile.getOriginalFilename());
        System.out.println(file.getPath());
        multipartFile.transferTo(file);
    }

    @PostMapping("/testnewarticle")
    public String newarticle(@RequestBody Map<String,Object> params){
        System.out.println(params.get("articleName"));
        System.out.println(params.get("articleInfo"));
        System.out.println(params.get("articleType"));
        System.out.println(params.get("articleFormat"));
        return "succeed";
    }
}
