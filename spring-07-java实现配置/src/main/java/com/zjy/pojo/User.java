package com.zjy.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class User {

    @Value("offer")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
