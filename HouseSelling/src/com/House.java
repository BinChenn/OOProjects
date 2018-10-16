package com;

public class House {

    private String address;
    protected Double price;
    protected String descriotion;

    public House(){}

    public House(String address){
        this.address = address;
        this.descriotion = "House ";
        this.price = 0.0;

    }

    public String getDescriotion(){
        return descriotion;
    }

    public Double getPrice(){
        return price;
    }
}

class FortySQMHouse extends House{
    public FortySQMHouse(String addr){
        super(addr);
        this.descriotion= "Forty SQM House";
    }
    public String getDescription(){
        return descriotion;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+600000.0;
    }
}

class EightySQMHouse extends House{
    public EightySQMHouse(String addr){
        super(addr);
        this.descriotion="Eighty SQM House";
    }
    public String getDescription(){
        return descriotion;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+1000000.0;
    }
}

class OneHundredSQMHouse extends House{
    public OneHundredSQMHouse(String addr){
        super(addr);
        this.descriotion="Eighty SQM House";
    }
    public String getDescription(){
        return descriotion;
    }

    @Override
    public Double getPrice() {
        return super.getPrice()+2000000.0;
    }
}


