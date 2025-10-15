package com.jiusheng.extends3feature;

public class Test2 {
    public static void main(String[] args) {
        // 目标2：继承后子类的访问特点：就近原则。
        Sun sz = new Sun();
        sz.show();
    }
}

class Fu {
    String name = "fu的name";
}

class Zi extends Fu {
    String name = "zi的name";
    public void show() {
        String name = "show的name";
        System.out.println(name); // show的name
        System.out.println(this.name); // zi的name
        System.out.println(super.name); // fu的name
    }
}

class Sun extends Zi {
    String name = "sun的name";
    public void show() {
        String name = "show的name";
        System.out.println(name); // show的name
        System.out.println(this.name); // sun的name
        System.out.println(super.name); // zi的name
        // 由于这里的sun中 sun的父类为zi，而zi的父类为fu，所以打印的为zi的name
        // 如果想直接访问fu中的name是不可以的，因为zi也有name，所以遍历不到fu的name
    }
}