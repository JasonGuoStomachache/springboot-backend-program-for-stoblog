package com.stovblog.mapper;

import com.stovblog.entity.DirectorColume;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 35088
* @description 针对表【director_colume】的数据库操作Mapper
* @createDate 2022-09-12 21:49:38
* @Entity com.stovblog.entity.DirectorColume
*/
public interface DirectorColumeMapper extends BaseMapper<DirectorColume> {

    @Select("select * from director_colume")
    @Results({
            @Result(column = "id",property = "id"),
            @Result(column = "name",property = "name"),
            @Result(column = "icon_class",property = "iconClass"),
            @Result(column = "link_to",property = "linkTo"),
            @Result(column = "is_dropdown",property = "isDropdown"),
            @Result(column = "id",property ="DirectorColumeChildrens",javaType = List.class,
            many = @Many(select="com.stovblog.mapper.DirectorColumeChildrenMapper.selectByparentId")
            )
    })
    List<DirectorColume> getAllDirectorColume();
}




