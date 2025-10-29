package com.jiusheng.abstract2;

public class Test {
    public static void main(String[] args) {
        // 目标：搞清楚使用抽象类的好处。
        Animal a = new Cat();
        a.cry();
        // 在这基础上,如果想换成狗,可以直接把Cat改成Dog即可;
        // 减少了修改代码的成本。
    }
}
