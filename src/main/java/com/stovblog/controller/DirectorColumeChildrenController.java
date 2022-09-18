package com.stovblog.controller;

import com.stovblog.entity.DirectorColumeChildren;
import com.stovblog.mapper.DirectorColumeChildrenMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DirectorColumeChildrenController {
    @Autowired
    DirectorColumeChildrenMapper directorColumeChildrenMapper;

    @GetMapping("/getpartitioncolume")
    public List<DirectorColumeChildren> getpartitioncolume(@RequestParam("id") String id){
        return directorColumeChildrenMapper.selectByParentId(id);
    }
}
