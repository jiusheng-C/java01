package com.jiusheng.capsulation;

public class Test {
    public static void main(String[] args) {
        //目的：搞清楚封装的设计思想：合理隐藏、合理暴露。学会如何隐藏然后暴露。
        Student s1 = new Student();
        s1.setAge(-20);// 输入年龄 当年龄不合法时 会输出相对应语句 然后无法完成赋值
        System.out.println(s1.getAge());
    }
}
