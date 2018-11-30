package com;

public class Main {

    public static void main(String[] args) {
        Action de = new DePrice();
        Action in = new InPrice();
        Action coupon = new Coupon();
        Consumer consumer1 = new Consumer("consumer1");
        Consumer consumer2 = new Consumer("consumer2");
        Consumer consumer3 = new Consumer("consumer3");

        //add observation and notify test
        consumer1.addObservable(de);
        consumer2.addObservable(in);
        consumer2.addObservable(coupon);
        consumer3.addObservable(coupon);
        ((DePrice)de).decreasePrice();
        ((InPrice)in).increasePrice();
        ((Coupon)coupon).givecoupon();
        System.out.println("-----------------------------");
        //cancel observation test
        consumer3.deleteObservable(coupon);
        ((Coupon)coupon).givecoupon();
    }
}
