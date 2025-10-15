package com.jiusheng.object;

public class Test {
    public static void main(String[] args) {
        Star n1=new Star(),n2=new Star();
        n1.name="播妞";
        n1.chinese=100;
        n1.math=100;
        n1.sum=n1.chinese+n1.math;
        n1.average=n1.sum/2;
        n2.name="播仔";
        n2.chinese=59;
        n2.math=100;
        n2.sum=n2.chinese+n2.math;
        n2.average=n2.sum/2;
        System.out.println(n1.name);
        System.out.println(n1.chinese);
        System.out.println(n1.math);
        System.out.println(n1.sum);
        System.out.println(n1.average);
        System.out.println(n2.name);
        System.out.println(n2.chinese);
        System.out.println(n2.math);
        System.out.println(n2.sum);
        System.out.println(n2.average);
    }


}
