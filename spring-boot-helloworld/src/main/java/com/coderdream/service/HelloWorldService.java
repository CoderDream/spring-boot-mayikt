package com.coderdream.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/2 17:37
 * @description：
 * @modified By：
 * @version: $
 */
//@RestController
@Controller // 转发页面
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.coderdream.service") // 控制器扫包范围
public class HelloWorldService {

    /**
     * 在上加上RestController 表示修饰该Controller所有的方法返回JSON格式,直接可以编写
     * Restful接口
     * 注意该注解是SpringMVC提供的，不是SpringBoot提供的！
     */
    @RequestMapping("/getUser")
    public String getUser(){
        return "mayikt";
    }


    public static void main(String[] args) {
        /**
         * 启动类入口class，默认整合Tomcat，容器端口8080
         */
        SpringApplication.run(HelloWorldService.class, args);


    }
}
