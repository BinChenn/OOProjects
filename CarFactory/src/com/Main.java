package com;

public class Main {

    public static void main(String[] args) {
        Consumer consumer1 = new Consumer("special");
        DomesticProxy proxy1 = new DomesticProxy(consumer1);
        proxy1.produceAudi();
        proxy1.produceAudi();
        proxy1.produceBenz();
        System.out.println("quanity: "+proxy1.inquireQuanity());//高级客户可以访问生产数量
        System.out.println("---------------------------------");
        Consumer consumer2 = new Consumer("normal");
        DomesticProxy proxy2 = new DomesticProxy(consumer2);
        proxy2.produceAudi();
        proxy2.produceAudi();
        proxy2.produceBenz();
        System.out.println("quanity: "+proxy2.inquireQuanity());//普通客户无法访问生产数量


        // write your code here
    }
}
