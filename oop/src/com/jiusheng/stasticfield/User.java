package com.jiusheng.stasticfield;

public class User {
    public static int count = 0;

    public User(){
        // User.count++;
        // 注意：同一个类名中访问静态成员可以省略类名不写。
        count++;
    }
}