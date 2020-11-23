package com.zjy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//等价于在xml里面注册了bean
@Component
public class User {

    //相当于property注册
    @Value("offer")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
