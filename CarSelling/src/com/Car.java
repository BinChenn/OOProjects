package com;

import java.util.Date;

public abstract class Car  implements Purchase, Sell, Inquire{
    private String name;
    private Double price;
    private int quanity;
    private Date InDate;
    private Date OutDate;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Date getInDate() {
        return InDate;
    }
    public void setInDate(Date inDate) {
        InDate = inDate;
    }

    public String getOutDate() {
        return OutDate.toString();
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

}

class ToyataCar extends Car{
    @Override
    public void purchase(int number, Double price) {
        this.setName("Toyata");
        this.setInDate(new Date());
        this.setQuanity(this.getQuanity()+number);
        this.setPrice(price);
    }

    @Override
    public void Sell(int number) throws Insufficient{
        if(number <= getQuanity()){
            setOutDate(new Date());
            setQuanity(getQuanity() - number);
        }
        else
            throw new Insufficient();
    }

    @Override
    public String inquire(String command) {
        if(command.equalsIgnoreCase("indate"))
            return this.getInDate().toString();
        else if(command.equalsIgnoreCase("price"))
            return this.getPrice().toString();
        else if(command.equalsIgnoreCase("quanity"))
            return Integer.toString(this.getQuanity());
        else
            return "don't exist this command";
    }
}

class BMWCar extends Car{
    @Override
    public void purchase(int number, Double price) {
        this.setName("BMW");
        this.setInDate(new Date());
        this.setQuanity(this.getQuanity()+number);
        this.setPrice(price);
    }

    @Override
    public void Sell(int number) throws Insufficient{
        if(number <= getQuanity()){
            setOutDate(new Date());
            setQuanity(getQuanity() - number);
        }
        else
            throw new Insufficient();
    }


    @Override
    public String inquire(String command) {
        if(command.equalsIgnoreCase("indate"))
            return this.getInDate().toString();
        else if(command.equalsIgnoreCase("price"))
            return this.getPrice().toString();
        else if(command.equalsIgnoreCase("quanity"))
            return Integer.toString(this.getQuanity());
        else
            return "don't exist this command";
    }

}

class FordCar extends Car {
    @Override
    public void purchase(int number, Double price) {
        this.setName("Ford");
        this.setInDate(new Date());
        this.setQuanity(this.getQuanity()+number);
        this.setPrice(price);
    }

    @Override
    public void Sell(int number) throws Insufficient{
        if(number <= getQuanity()){
            setOutDate(new Date());
            setQuanity(getQuanity() - number);
        }
        else
            throw new Insufficient();
    }

    @Override
    public String inquire(String command) {
        if(command.equalsIgnoreCase("indate"))
            return this.getInDate().toString();
        else if(command.equalsIgnoreCase("price"))
            return this.getPrice().toString();
        else if(command.equalsIgnoreCase("quanity"))
            return Integer.toString(this.getQuanity());
        else
            return "don't exist this command";
    }

}

class BenzCar extends Car{
    @Override
    public void purchase(int number, Double price) {
        this.setName("Benz");
        this.setInDate(new Date());
        this.setQuanity(this.getQuanity()+number);
        this.setPrice(price);
    }

    @Override
    public void Sell(int number) throws Insufficient{
        if(number <= getQuanity()){
            setOutDate(new Date());
            setQuanity(getQuanity() - number);
        }
        else
            throw new Insufficient();
    }

    @Override
    public String inquire(String command) {
        if(command.equalsIgnoreCase("indate"))
            return this.getInDate().toString();
        else if(command.equalsIgnoreCase("price"))
            return this.getPrice().toString();
        else if(command.equalsIgnoreCase("quanity"))
            return Integer.toString(this.getQuanity());
        else
            return "don't exist this command";
    }

}

class AudiCar extends Car {
    @Override
    public void purchase(int number, Double price) {
        this.setName("Audi");
        this.setInDate(new Date());
        this.setQuanity(this.getQuanity()+number);
        this.setPrice(price);
    }

    @Override
    public void Sell(int number) throws Insufficient{
        if(number <= getQuanity()){
            setOutDate(new Date());
            setQuanity(getQuanity() - number);
        }
        else
            throw new Insufficient();
    }

    @Override
    public String inquire(String command) {
        if(command.equalsIgnoreCase("indate"))
            return this.getInDate().toString();
        else if(command.equalsIgnoreCase("price"))
            return this.getPrice().toString();
        else if(command.equalsIgnoreCase("quanity"))
            return Integer.toString(this.getQuanity());
        else
            return "don't exist this command";
    }

}
