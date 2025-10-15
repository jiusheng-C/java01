package com.jiusheng.javabean;

public class StudentOperator {
    // 必须拿到要处理的学生对象
    private Student s; // 用于记住将要来操作的学生对象。
    public StudentOperator(Student s) {
        this.s = s;
    }

    // 提供方法：打印学生对线的总成绩
    public void printScore() {
        System.out.println(s.getName() + "的总成绩是：" + (s.getChinese() + s.getMath()));
    }

    // 提供方法：打印学生对象的平均成绩
    public void printAvg() {
        System.out.println(s.getName() + "的平均成绩是：" + (s.getChinese() + s.getMath()) / 2);
    }
}