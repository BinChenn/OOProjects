package com;

public class Payment10w_Dis extends PayDiscount {
    private Double price;
    public Payment10w_Dis(Double p){
        this.price = p;
    }

    @Override
    public Double pay() {
        System.out.println("客户订单额大于10万，打9折");
        System.out.println("原价为： "+price+"， 现价为： "+price*0.9);
        return price*0.9;
    }
}
