package com.jiusheng.stasticfield;

public class Test2 {
    public static void main(String[] args) {
        // 目标：了解静态变量的应用。
        new User();
        new User();
        new User();
        new User();
        System.out.println(User.count); // 4
    }
}
