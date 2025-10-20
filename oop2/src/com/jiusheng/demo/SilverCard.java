package com.jiusheng.demo;

public class SilverCard extends Card{
    public SilverCard(String carId, String name, String phone, double money) {
    }

    @Override
    public void payMoney(double money) {
        System.out.println("您消费的金额为：" + money);
        System.out.println("优惠后的价格为：" + money * 0.9);
        // 更新卡类余额：
        setMoney(getMoney() - money * 0.9);
        if (getMoney() < money * 0.9) {
            System.out.println("您的余额不足，请充值后再试！");
            return;
        }
        System.out.println("消费后的卡类余额为：" + getMoney());
        System.out.println("欢迎下次光临！");
    }
}
