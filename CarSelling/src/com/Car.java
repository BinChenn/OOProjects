package com;

import java.util.Date;

public abstract class Car {
    private Double price;
    private int quanity;
    private Date InDate;
    private Date OutDate;

    public Date getInDate() {
        return InDate;
    }
    public void setInDate(Date inDate) {
        InDate = inDate;
    }

    public Date getOutDate() {
        return OutDate;
    }

    public void setOutDate(Date outDate) {
        OutDate = outDate;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuanity() {
        return quanity;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public abstract Double getMoney();
    public abstract void InCar();
    public abstract void OutCar();
}

class ToyataCar extends Car{
    @Override
    public Double getMoney() {
        return getPrice()*getQuanity();
    }

    @Override
    public void InCar() {

    }

    @Override
    public void OutCar() {

    }
}

class BMWCar extends Car{
    @Override
    public Double getMoney() {
        return getPrice()*getQuanity();
    }

    @Override
    public void InCar() {

    }

    @Override
    public void OutCar() {

    }
}

class FordCar extends Car{
    @Override
    public Double getMoney() {
        return getPrice()*getQuanity();
    }

    @Override
    public void InCar() {

    }

    @Override
    public void OutCar() {

    }
}

class BenzCar extends Car{
    @Override
    public Double getMoney() {
        return getPrice()*getQuanity();
    }

    @Override
    public void InCar() {

    }

    @Override
    public void OutCar() {

    }
}

class AudiCar extends Car{
    @Override
    public Double getMoney() {
        return getPrice()*getQuanity();
    }

    @Override
    public void InCar() {

    }

    @Override
    public void OutCar() {

    }
}
