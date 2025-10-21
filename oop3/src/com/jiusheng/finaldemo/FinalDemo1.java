package com.jiusheng.finaldemo;

public class FinalDemo1 {

    // final修饰静态成员变量
    // final修饰静态变量，这个变量今后被称为常量，可以记住一个固定值，并且程序中不能修改了，通常这个值作为系统的配置信息。
    // 常量名称：建议全部大写，多个单词用下划线链接
    public static final String SCHOOL_NAME = "玖笙";

    // final修饰实例变量（一般没有意义）
    private final String name = "猪刚鬣";


    public static void main(String[] args) {
        // 目标：认识final关键字的作用。
        // 3、final修饰变量：变量有且仅能被赋值一次。
        /*
            变量有哪些呢？
                a、成员变量：
                   静态成员变量
                   实例成员变量
                b、局部变量
         */
        final double rate = 3.14;
        // rate = 3.16 // 第二次赋值，报错。

        buy(0.8);

        FinalDemo1 f = new FinalDemo1();
        System.out.println(f.name);
        // f.name = "高翠兰"; //第二次赋值，报错。

        final int a = 20;
        // a = 10; // 第二次赋值，报错。

        final int arr[] = {10, 20, 30, 40};
        // arr = new int[] {20, 30, 40, 50}; // 报错，final修饰引用类型的变量中，变量存储的地址不能被改变。
        arr[2] = 40; // 不报错，final修饰引用类型的变量中地址所指的对象内容是可以被改变的。
    }

    public static void buy(final double z){
        // z = 0.1; // 第二次复制，报错。
        System.out.println(z);
    }
}

// 1、final修饰类，类不能被继承。
final class A{

}
// class B extends A{} //报错，重写了修饰类

// 2、final修饰方法，方法不能被重写。
class C{
    public final void show(){
        System.out.println("show方法被执行");
    }
}

class D extends C{
    /*
        @Override
        public void show(){
            System.out.println("重写show方法");
        } // 报错，重写了类方法
    */
}