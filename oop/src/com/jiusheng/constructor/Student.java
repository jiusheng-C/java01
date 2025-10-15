package com.jiusheng.constructor;

public class Student {
    String name;
    int age;
    char gender;
    public Student(){
        System.out.println("===这是一个无参构造器===");
    }
    public Student(String s){
        System.out.println("===这是一个有参构造器===");
    }
    public Student(String s,int a,char g){
        name=s;
        age=a;
        gender=g;
    }
}
