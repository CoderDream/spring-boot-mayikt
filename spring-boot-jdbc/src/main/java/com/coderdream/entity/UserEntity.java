package com.coderdream.entity;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/3 11:44
 * @description：
 * @modified By：
 * @version: $
 */
public class UserEntity {

    private String userName;

    private Integer age;

    public UserEntity(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUserName() {
        return userName;
    }

    public Integer getAge() {
        return age;
    }


    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
