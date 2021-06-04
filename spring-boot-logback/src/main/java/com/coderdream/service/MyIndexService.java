package com.coderdream.service;

import com.coderdream.entity.MayiktUserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xulin
 * @date ：Created in 2021/6/4 15:35
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@Slf4j
public class MyIndexService {

    @Value("${mayikt.name}")
    private String name;

    @Value("${mayikt.age}")
    private String age;

    @Value("${mayikt.address}")
    private String address;

    @Autowired
    private MayiktUserEntity mayiktUserEntity;

    @RequestMapping("/getNameAndAge")
    public String getNameAndAge() {
        return name + "，" + age;
    }

    /**
     * ConfigurationProperties
     *
     * @return
     */
    @RequestMapping("/getNameAndAgeAndAddress")
    public String getNameAndAgeAndAddress() {
        return mayiktUserEntity.toString();
    }

    /**
     * 演示打印日志
     *
     * @return
     */
    @RequestMapping("/getName")
    public String getName(String name, int age) {
        log.info("name:{},age:{}", name, age);
        return name;
    }
}
