package com;

public class Coupon extends Action {
    public void givecoupon(){
        System.out.println("亲，你好久没来了，我们这里买一个商品即送价值10元的优惠劵哦！");
        super.notifyObserver();
    }
}
