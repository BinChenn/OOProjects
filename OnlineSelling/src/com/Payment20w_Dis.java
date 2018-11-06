package com;

public class Payment20w_Dis extends PayDiscount {
    private Double price;
    public Payment20w_Dis(Double p){
        this.price = p;
    }

    @Override
    public Double pay() {
        System.out.println("客户订单额大于20万，打8折");
        System.out.println("原价为： "+price+"， 现价为： "+price*0.8);
        return price*0.9;
    }
}
