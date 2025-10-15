package com.jiusheng.stasticmethod;

public class Test4 {
    // 静态变量
    public static int count = 100;
    // 静态方法
    public static void printHelloworld2(){
        System.out.println("Hello World!");
    }
    // 实例变量：属于对象的。
    private String name;
    // 实例方法：属于对象的。
    public void run(){
    }
    public static void main(String[] args) {
        // 目标：搞清楚静态方法，实例方法访问的几点注意事项。
    }
    // 1、静态方法中可以直接访问静态成员，不可以直接访问实例成员。
    public static void printHelloworld1(){
        System.out.println(count);
        printHelloworld2();
        // System.out.println(name);// 报错
        // run(); // 报错
        // System.out.println(this); // 报错。this代表的只能是对象。

    }

    // 2、实例方法中既可以直接访问静态成员，也可以直接访问实例成员。
    // 3、实例方法中可以出现this关键字，静态方法中不可以出现this关键字的。
    public void go(){
        System.out.println(count);
        printHelloworld2();
        System.out.println(name);
        run();
    }
}
