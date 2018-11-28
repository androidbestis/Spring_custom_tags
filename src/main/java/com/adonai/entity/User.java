package com.adonai.entity;

import lombok.Data;

//user pojo
@Data
public class User {

    private String id;
    private String userName;
    private String email;

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
