package com.jiusheng.extends5constructor;

public class Test3 {
    public static void main(String[] args) {
        // 目标：理解this(...)调用兄弟构造器。
        // 创建对象，存储一个学生的数据。
        Student s1 = new Student("张三",18 ,'男');
        Student s2 = new Student("李四", 19, '女', "清华大学");
        System.out.println(s1);
        System.out.println(s2);
    }
}
