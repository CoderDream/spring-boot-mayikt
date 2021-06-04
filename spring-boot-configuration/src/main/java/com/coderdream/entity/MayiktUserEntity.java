package com.coderdream.entity;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/4 11:50
 * @description：
 * @modified By：
 * @version: $
 */
@Data
@Component
@ConfigurationProperties(prefix = "mayikt")
public class MayiktUserEntity {
    private String address;
    private String age;
    private String name;
//
//    public String getAddress() {
//        return address;
//    }
//
//    public String getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setAge(String age) {
//        this.age = age;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "MayiktUserEntity{" +
//                "address='" + address + '\'' +
//                ", age='" + age + '\'' +
//                ", name='" + name + '\'' +
//                '}';
//    }
}
