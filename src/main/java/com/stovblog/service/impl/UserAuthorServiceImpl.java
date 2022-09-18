package com.stovblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stovblog.entity.UserAuthor;
import com.stovblog.service.UserAuthorService;
import com.stovblog.mapper.UserAuthorMapper;
import org.springframework.stereotype.Service;

/**
* @author 35088
* @description 针对表【user_author】的数据库操作Service实现
* @createDate 2022-09-17 23:38:54
*/
@Service
public class UserAuthorServiceImpl extends ServiceImpl<UserAuthorMapper, UserAuthor>
    implements UserAuthorService{

}




