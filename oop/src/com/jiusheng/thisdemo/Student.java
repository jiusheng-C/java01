package com.jiusheng.thisdemo;

public class Student {
    String name;
    //通过this来解决变量冲突的问题
    public void printhobby(String name){
        System.out.println(this.name + "的职业是" + name);
    }
}
