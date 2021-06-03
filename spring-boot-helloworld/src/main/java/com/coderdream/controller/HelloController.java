package com.coderdream.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class, args);
    }
}
        