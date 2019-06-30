package com.csq.community.mapper;

import com.csq.community.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Service;

/**
 * @author ercai
 * @date 2019/6/28 - 10:22
 */
@Mapper
public interface  UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);

    @Select("select * from user where token = #{token}")
    User findUserByToken(String token);

    @Select("select * from user where id = #{id}")
    User findById(Integer id);
}
