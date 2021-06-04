package com.coderdream.mapper;

import com.coderdream.entity.UserEntity;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/3 16:28
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserMapper {

    @Insert("INSERT INTO users values (null, #{userName}, #{age})")
    int insertUser(@Param("userName") String userName, @Param("age") Integer age);

    @Select("SELECT id as id, name as userName, age as age FROM users where id=#{id} ")
    UserEntity selectByUserId(@Param("id") Integer id);
}
