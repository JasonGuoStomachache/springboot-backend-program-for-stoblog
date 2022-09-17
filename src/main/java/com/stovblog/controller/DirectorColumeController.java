package com.stovblog.controller;

import com.stovblog.entity.DirectorColume;
import com.stovblog.mapper.DirectorColumeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class DirectorColumeController {

    @Autowired
    private DirectorColumeMapper directorColumeMapper;

    @GetMapping("/getdirectorcolumes")
    public List<DirectorColume> getDirectorColumes(){
        return directorColumeMapper.getAllDirectorColume();
    }

}
