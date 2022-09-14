package com.stovblog.mapper;

import com.stovblog.entity.Users;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
* @author 35088
* @description 针对表【zj_users】的数据库操作Mapper
* @createDate 2022-09-11 20:39:35
* @Entity com.stovblog.entity.Users
*/
@Mapper
public interface UsersMapper extends BaseMapper<Users> {


//    @Select( "select * from t_user")
//    @Results(
//            {
//                @Result(column = "id",property = "id"),
//                @Result(column = "username",property = "username"),
//                @Result(column = "password",property = "password" ),
//                @Result(column = "birthday",property = "birthday" ),
//                @Result(column = "id",property = "orders",javaType = List.class,
//                    many=@Many(select ="com.example.mpdemo.mapper.OrderMapper.selectByUid")
//                )
//            }
//    )
//    List<Users> selectAllUserAnd0rders();


    @Select("select * from zj_users where user_id = #{id}")
    Users selectById(int id);

}




