package com.stovblog.mapper;

import com.stovblog.entity.DirectorColumeChildren;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
* @author 35088
* @description 针对表【director_colume_children】的数据库操作Mapper
* @createDate 2022-09-12 21:50:09
* @Entity com.stovblog.entity.DirectorColumeChildren
*/
public interface DirectorColumeChildrenMapper extends BaseMapper<DirectorColumeChildren> {

    @Select("select * from director_colume_children where parent_id=#{id}")
    List<DirectorColumeChildren> selectByparentId(int id);
}




