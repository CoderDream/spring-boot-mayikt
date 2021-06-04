package com.coderdream;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：xulin
 * @date ：Created in 2021/6/3 14:39
 * @description：
 * @modified By：
 * @version: $
 */
@SpringBootApplication
@MapperScan("com.coderdream.mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
