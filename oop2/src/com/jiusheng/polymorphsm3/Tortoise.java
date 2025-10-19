package com.jiusheng.polymorphsm3;

public class Tortoise extends Animal {
    String name = "乌龟";

    @Override
    public void run() {
        System.out.println("乌龟跑的贼慢");
    }
    // 乌龟缩头
    public void shrinkHead() {
        System.out.println("乌龟缩头");
    }
}