package com.jiusheng.extends2modifier;

import java.security.spec.RSAOtherPrimeInfo;

public class Fu {
    // 1.private 只能当前类中访问。
    public void privataMethod(){
        System.out.println("privateMethod");
    }

    // 2.缺省：只能当前类中，同一个包下的其他类中
    void method(){
        System.out.println("method");
    }

    // 3.protected：只能当前类中，同一个包下的其他类中子类中，不同包下的子类中
    protected void protectedMethod(){
        System.out.println("protectedMethod");
    }

    // 4.public：任何地方都可以访问
    public void publicMethod(){
        System.out.println("publicMethod");
    }

    public static void main(String[] args) {
        Fu fu = new Fu();
        fu.privataMethod();
        fu.method();
        fu.protectedMethod();
        fu.publicMethod();
    }
}