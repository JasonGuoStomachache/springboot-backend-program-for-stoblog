package com.stovblog.mapper;

import com.stovblog.entity.UserAuthor;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

/**
* @author 35088
* @description 针对表【user_author】的数据库操作Mapper
* @createDate 2022-09-17 23:38:54
* @Entity com.stovblog.entity.UserAuthor
*/
public interface UserAuthorMapper extends BaseMapper<UserAuthor> {

    @Select("select * from user_author where user_id = #{id}")
    UserAuthor selectUserAuthorById(Long id);
}




