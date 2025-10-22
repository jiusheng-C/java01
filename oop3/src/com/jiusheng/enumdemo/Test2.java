package com.jiusheng.enumdemo;

public class Test2 {
    public static void main(String[] args) {
        // 目标：掌握索引类的应用场景，做信息的分类和标志。
        // 需求：模拟上下左右移动图片。
        // 第一种是常量做信息标志和分类：但参数值不受约束。
        move(1); // 即使是输入0,1,2,3以外的数字也能运行
        // 第二种是枚举做信息标志和分类：参数值受枚举类约束。
        move2(Direction.LEFT); // 如果输入不是枚举对象里面的内容 会报错。
    }

    public static void move2 (Direction direction) {
        // 根据这个方向做移动：上下左右。
        switch (direction) {
            case UP:
                System.out.println("向上移动");
                break;
            case DOWN:
                System.out.println("向下移动");
                break;
            case LEFT:
                System.out.println("向左移动");
                break;
            case RIGHT:
                System.out.println("向右移动");
        }
    }

    public static void move (int direction) {
        // 根据这个方向做移动：上下左右。
        switch (direction){
            case 0:
                System.out.println("向上移动");
                break;
            case 1:
                System.out.println("向下移动");
                break;
            case 2:
                System.out.println("向左移动");
                break;
            case 3:
                System.out.println("向右移动");
                break;
            default:
                System.out.println("输入有误");
        }
    }
}

