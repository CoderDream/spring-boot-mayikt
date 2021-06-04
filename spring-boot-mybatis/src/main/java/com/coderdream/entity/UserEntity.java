package com.coderdream.entity;

/**
 * @author ：yujl
 * @date ：Created in 2021/6/3 11:44
 * @description：
 * @modified By：
 * @version: $
 */
public class UserEntity {

    private Integer id;

    private String userName;

    private Integer age;

public UserEntity() {
}

public UserEntity(Integer id, String userName, Integer age) {
    this.id = id;
    this.userName = userName;
    this.age = age;
}

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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
