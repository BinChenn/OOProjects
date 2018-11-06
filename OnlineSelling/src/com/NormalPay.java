package com;

public class NormalPay implements Payment {
    private Double price;
    public NormalPay(Double p){
        this.price = p;
    }

    @Override
    public Double pay() {
        System.out.println("订单价格为："+price);
        return price;
    }
}
