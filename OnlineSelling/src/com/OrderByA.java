package com;

public class OrderByA extends Order {

    public OrderByA(){
        price = 250000.0;
    }

    @Override
    public Double getTaxRate() {
        return 0.05;
    }
}
