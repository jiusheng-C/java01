package com.jiusheng.polymorphsm2;

public class Wolf extends Animal {
    String name = "狼";

    @Override
    public void run() {
        System.out.println("狼跑的贼快");
    }
}
