package com;

public class OrderByB extends Order {

    public OrderByB(){
        price = 150000.0;
    }

    @Override
    public Double getTaxRate() {
        return 0.07;
    }
}
