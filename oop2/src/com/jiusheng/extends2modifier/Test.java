package com.jiusheng.extends2modifier;
// 目的：认识四种权限修饰符的修饰范围
public class Test {
    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privataMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}