package com.jiusheng.demo;

public class GoldCard extends Card{
    public GoldCard(String carId, String name, String phone, double money) {
        setCarId(carId);
        setName(name);
        setPhone(phone);
        setMoney(money);
    }

    @Override
    public void payMoney(double money){
        System.out.println("您消费的金额为：" + money);
        System.out.println("优惠后的价格为：" + money * 0.8);
        // 更新卡类余额：
        setMoney(getMoney() - money *0.8);
        if(getMoney() < money * 0.8){
            System.out.println("您的余额不足，请充值后再试！");
            return;
        }
        System.out.println("消费后的卡类余额为：" + getMoney());
        if(money * 0.8 >= 200){
            printTicket();
        }
        System.out.println("欢迎下次光临！");
    }

    public void printTicket(){
        System.out.println("欢迎使用金卡，您的消费金额达到200元，请到前台领取洗车票");
    }
}
