package com;

public class Payment20w_Full extends PayFullSubtract {
    private Double price;
    public Payment20w_Full(Double p){
        this.price = p;
    }


    @Override
    public Double pay() {
        System.out.println("客户订单额大于20万，满减5万");
        System.out.println("原价为： "+price+"， 现价为： "+String.valueOf(price-50000.0));
        return price-50000.0;
    }
}
