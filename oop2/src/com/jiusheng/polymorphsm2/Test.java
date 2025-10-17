package com.jiusheng.polymorphsm2;

public class Test {
    public static void main(String[] args) {
        // 目标：认识多态的好处。
        // 1、多态的好处1：右边的 对象是解耦合的。
//        Animal a1 = new Wolf();
//        a1.run(); // 狼跑的贼快

//        Animal a1 = new Tortoise();
//        a1.run(); // 乌龟跑的贼慢

        // 2、多态的好处2：父类类型的变量作为参数，可以接收一切子类对象。
        Animal w = new Wolf();
        go(w);
        Animal t = new Tortoise();
        go(t);

        // 3、注意：多态下不能调用子类独有功能。
        // t.shrinkHead(); // 报错. 因为缩头是乌龟的特有功能，用Animal定义违背了不能调用特有功能的原则。
    }

    public static void go(Animal a) {
        System.out.println("开始跑步...");
        a.run();
    }

}
