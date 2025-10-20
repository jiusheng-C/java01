package com.jiusheng.demo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("欢迎来到加油卡支付小程序！");
        // 目标：加油站支付小程序。
        // 1、创建卡片类，以便创建金卡或者银卡对象，封装车主的数据。
        // 2、定义一个卡片类：Card，定义金卡和银卡的共同属性和方法。
        // 3、分别定义继承的金卡和银卡：
        //      金卡：重写消费方法（8折优惠），独有功能打印洗车票。
        //      银卡：重写消费方法（9折优惠）。
        // 4、分别办理两张卡：
        //      创建金卡对象。交给独立的业务（支付机）来完成：存款，消费。
        GoldCard goldCard = new GoldCard("京A88888", "张三", "13888888888", 5000);
        pay(goldCard);
        //      创建银卡对象。交给独立的业务（支付机）来完成：存款，消费。
        SilverCard silverCard = new SilverCard("京A9999", "李四", "13999999999", 2000);
        pay(silverCard);
    }
    // 支付机：用一个方法来刷卡：可能接收金卡，也可能接收银卡对象。
    public static void pay(Card c){
        System.out.println("请刷卡支付，并输入消费金额：");
        Scanner sc = new Scanner(System.in);
        double money = sc.nextDouble();
        c.payMoney(money);
    }
}