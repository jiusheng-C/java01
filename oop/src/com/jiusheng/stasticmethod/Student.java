package com.jiusheng.stasticmethod;

public class Student {
    private double score;
    // 静态方法
    public static void printHelloWorld(){
        System.out.println("Hello World!");
        System.out.println("Hello World!");
        System.out.println("Hello World!");
    }

    // 实例方法：没有static修饰，属于对象持有。
    public void printPass(){
        System.out.println(score >=60 ? "通过了" : "您挂科了！");
    }

    public void setScore(double score){
        this.score = score;
    }
}
