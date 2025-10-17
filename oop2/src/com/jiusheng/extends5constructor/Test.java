package com.jiusheng.extends5constructor;

public class Test {
    public static void main(String[] args) {
        // 目标：认识子类构造器的特点，再看应用场景。
        // 子类构造器都会必须先调用父类的构造器，再执行自己的构造器。
        Zi zi = new Zi();
    }
}

class Zi extends Fu {
    public Zi(){
        // super(); //默认存在的，写不写都有！
        // super(1); // 指定调用父类的有参构造器，如果父类没有无参构造器那必须需要存在这个，不然会报错！
        System.out.println("子类无参构造器");
    }
}

class Fu {
    public Fu(){
        System.out.println("父类无参构造器");
    }

    public Fu(int a){
        System.out.println("父类有参构造器");
    }
}
