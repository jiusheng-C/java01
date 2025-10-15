package com.jiusheng.javabean;
//实体类
public class Student {
    // 1、私有成员变量。
    private String name;
    private double chinese; //语文
    private double math; //数学

    // 必须提供一个无参构造器
    public Student() {

    }

    //提供一个有参构造器（可选）
    public Student(String name, double chinese, double math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }

    // 2、提供公开的getter和setter方法。
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getChinese() {
        return chinese;
    }

    public void setChinese(double chinese) {
        this.chinese = chinese;
    }

    public double getMath() {
        return math;
    }

    public void setMath(double math) {
        this.math = math;
    }
}