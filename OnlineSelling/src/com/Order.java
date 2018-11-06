package com;

public abstract class Order {
    protected String providerType;
    private String name;
    //private Double price;


    public final Double getTax(){
        return getTaxRate()*pay();
    }

    public abstract Double getTaxRate();

    public Double pay(){


    }

}
