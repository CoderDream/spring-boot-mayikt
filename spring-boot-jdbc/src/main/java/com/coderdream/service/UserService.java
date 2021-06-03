package com.coderdream.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/insertUser")
    public String insertUser(String userName, Integer age) {
        int update = jdbcTemplate.update("INSERT INTO users values (null ,?,?)", userName, age);

        return update > 0 ? "success" : "fail";
    }

}
