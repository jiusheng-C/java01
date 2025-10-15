package com.jiusheng.capsulation;

public class Student {
    // 1、如何隐藏：使用private关键字（私有、隐藏）修饰成员变量，就只能在本类中被直接访问，
    // 其他任何地方不能被直接访问。
    private int age;
    private double chinese;
    private double math;

    // 2、如何暴露（合理暴露）：使用public修饰（公开）的get和set的方法合理暴露
    // 成员变量的取值和赋值。
    public void setAge(int age){
        if(age > 0 && age < 120)
            this.age = age;
        else
            System.out.println("年龄输入错误！");
    }
    public int getAge(){ //获取年龄
        return age;
    }
}
