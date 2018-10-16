package com;

public abstract class InquirePrice {
    public abstract Double getPrice(Double money);
}

class NormalPrice extends InquirePrice{
    @Override
    public Double getPrice(Double money) {
        return money;
    }
}

class RegularPrice extends InquirePrice{
    private Double discount = 0.85; //regular consumer 0.8 discount
    public RegularPrice(){}

    public RegularPrice(Double discou){
        this.discount = discou;
    }

    @Override
    public Double getPrice(Double money) {
        return money*discount;
    }
}

class HolidayPrice extends InquirePrice{
    private Double discount = 0.8;
    public HolidayPrice(){}

    public HolidayPrice(Double dicou){
        this.discount = dicou;
    }

    @Override
    public Double getPrice(Double money) {
        System.out.println("Presented two car maintenance");
        return money*discount;
    }
}




