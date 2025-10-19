package com.jiusheng.polymorphsm3;

public class Test {
    public static void main(String[] args) {
        // 强制类型转换：可以解决多态下调用子类特有功能
        Animal a1 = new Tortoise();
        a1.run();
        // a1.shrinkHead(); //多态下的一个问题。多态下不能调用子类的特有功能。

//        // 强制类型转换
//        Tortoise t1 = (Tortoise) a1;
//        t1.shrinkHead();

        System.out.println("这是分界线========");

        Wolf w = new Wolf();
        go(w);
    }

    public static void go(Animal a) {
        System.out.println("开始跑步...");
        a.run();

        // java建议强制转换前，应该判断对象的真实类型，再进行强制类型转换。
        if (a instanceof Wolf) {
            Wolf w1 = (Wolf) a;
            w1.eatSheep();
        }else if(a instanceof Tortoise){
            Tortoise t1 = (Tortoise) a;
            t1.shrinkHead();
        }

    }

}
