package com.zjy.pojo;

public class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

   /* public User() {
        System.out.println("User无参构造~~~");
    }*/

    public void show() {
        System.out.println("name" + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
