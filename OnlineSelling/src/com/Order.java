package com;

public abstract class Order {
    private String name;
    protected Double price;


    public final void calculateAll(String paytype){
        Double money = pay(paytype, price);
        Double tax =  getTaxRate()*money;
        System.out.println("税率："+getTaxRate()+",税费："+tax);
        System.out.println("实收："+String.valueOf(tax+money));
    }

    public final Double pay(String paytype, Double price){
        Payment payment = PayFactory.getPayment(paytype, price);
        return payment.pay();
    }

    public abstract Double getTaxRate();

}
