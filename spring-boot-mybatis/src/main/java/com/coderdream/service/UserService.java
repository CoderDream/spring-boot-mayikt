package com.coderdream.service;

import com.coderdream.entity.UserEntity;
import com.coderdream.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Driver;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/3 16:09
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private UserMapper userMapper;

    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("", userName, age);

        return update > 0 ? "success" : "fail";
    }

    @RequestMapping("/mybatisFindById")
    public UserEntity mybatisFindById(Integer id) {
        com.mysql.jdbc.Driver d = null;
        return userMapper.selectByUserId(id);
    }

    @RequestMapping("/mybatisInsertUser")
    public String mybatisInsertUser(String userName, Integer age) {
        int update = userMapper.insertUser(userName, age);
        return update > 0 ? "success" : "fail";
    }
}
