package com.coderdream.day01;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：xul
 * @date ：Created in 2021/6/3 8:53
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class MemberService {

@Value("${mayikt.name}")
private String name;

@Value("${mayikt.age}")
private String age;

@RequestMapping("/getProperties")
public String getProperties(){
    return name + "--" + age;
}

    @RequestMapping("/getMember")
    public String getMember(){
        return "CoderDream";
    }
}
