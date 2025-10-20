package com.jiusheng.demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// lombok 技术可以实现为类自动添加gatter setter方法 无参构造器，toString方法等。
@Data // Data注解可以自动生成getter setter方法 无参构造器，toString方法等
@NoArgsConstructor
@AllArgsConstructor

public class Card {
    private String carId; // 车牌号码
    private String name;
    private String phone;
    private double money; // 余额

    // 预存金额。
    public void saveMoney(double money) {
        this.money += money;
    }

    // 消费金额。
    public void payMoney(double money) {
        this.money -= money;
    }
}
