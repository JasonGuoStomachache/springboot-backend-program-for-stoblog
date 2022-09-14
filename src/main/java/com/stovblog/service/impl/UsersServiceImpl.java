package com.stovblog.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.stovblog.entity.Users;
import com.stovblog.service.UsersService;
import com.stovblog.mapper.UsersMapper;
import org.springframework.stereotype.Service;

/**
* @author 35088
* @description 针对表【zj_users】的数据库操作Service实现
* @createDate 2022-09-11 20:39:35
*/
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users>
    implements UsersService{

}




