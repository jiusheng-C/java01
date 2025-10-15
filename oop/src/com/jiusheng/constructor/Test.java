package com.jiusheng.constructor;

public class Test {
    public static void main(String[] args) {
        Student s1=new Student();
        Student s2=new Student("张三");
        Student s3=new Student("张三",18,'男');
        System.out.println(s3.name);
        System.out.println(s3.age);
        System.out.println(s3.gender);
    }
}
