package com.zjy.demo1;

public class 房客 {
    public static void main(String[] args) {
        代理 proxy = new 代理(new 房东());
        proxy.租房();
    }
}
