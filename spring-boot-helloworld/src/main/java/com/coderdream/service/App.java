package com.coderdream.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.coderdream.service") // 控制器扫包范围
@SpringBootApplication
public class App {

    /**
     * @SpringBootApplication  组合
     * @EnableAutoConfiguration
     * @ComponentScan
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         * 启动类入口class，默认整合Tomcat，容器端口8080
         */
        SpringApplication.run(App.class, args);
    }

    /**
     * @SpringBootApplication
     * @SpringBootApplication 被 @Configuration、@EnableAutoConfiguration、@ComponentScan 注解所修饰，
     * 换言之 Springboot 提供了统一的注解来替代以上三个注解
     * 扫包范围：在启动类上加上@SpringBootApplication注解，当前包下或者子包下所有的类都可以扫到。
     */
}
