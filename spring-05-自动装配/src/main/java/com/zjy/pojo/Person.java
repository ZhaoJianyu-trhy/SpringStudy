package com.zjy.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    private Cat cat;

    @Autowired
    private Dog dog;

    private String name;

    public Cat getCat() {
        return cat;
    }

    public Dog getDog() {
        return dog;
    }

    public String getName() {
        return name;
    }
}
