package com.jiusheng.extends1demo;

public class Test {

    public static void main(String[] args) {
        // 目标：认识继承，好处。
        // 1.创建对象，封装老师数据
        // 子类可以继承父类的非私有成员。
        // 子类对象其实是由子类和父类多张设计图共同创建出来的对象，所以子类对象是完整的。
        Teacher  t = new Teacher();
        t.setName("Jiusheng");
        t.setSkill("打球、代码、牛马");
        t.setSex('男');
        System.out.println(t.getName());
        System.out.println(t.getSkill());
        System.out.println(t.getSex());
    }
}