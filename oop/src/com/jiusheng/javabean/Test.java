package com.jiusheng.javabean;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚实体类是啥？搞清楚其基本作用和应用场景。
        // 实体类的基本作用：创建他的对象，存取数据（封装数据）
        Student s1 = new Student();
        s1.setName("佩奇");
        s1.setMath(100);
        s1.setChinese(100);
        System.out.println(s1.getName());
        System.out.println(s1.getChinese());
        System.out.println(s1.getMath());

        Student s2 = new Student("乔治", 60, 80);
        System.out.println(s2.getName());
        System.out.println(s2.getChinese());
        System.out.println(s2.getMath());

        //实体类在开发中的应用场景。
        StudentOperator so = new StudentOperator(s2);
        so.printScore();
        so.printAvg();
    }
}