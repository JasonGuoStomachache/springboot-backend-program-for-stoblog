package com.stovblog.controller;

import com.stovblog.entity.Users;
import com.stovblog.mapper.UsersMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsersController {
    @Autowired
    private UsersMapper usersMapper;

    @GetMapping("/users")
    public List<Users> getAllUsers(){
        List<Users> users = usersMapper.selectList(null);
        users.forEach(System.out::println);
        return users;
    }

}
