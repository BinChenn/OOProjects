package com;

public class Payment10w_Full extends PayFullSubtract {
    private Double price;
    public Payment10w_Full(Double p){
        this.price = p;
    }


    @Override
    public Double pay() {
        System.out.println("客户订单额大于10万，满减1万");
        System.out.println("原价为： "+price+"， 现价为： "+String.valueOf(price-10000.0));
        return price-10000.0;
    }
}
