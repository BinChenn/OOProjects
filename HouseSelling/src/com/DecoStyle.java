package com;

public class DecoStyle extends House{

    protected House house;

    public DecoStyle(){
        super();
        this.descriotion+="Decorate Style: ";
    }

}

class ChineseStyle extends DecoStyle{

    public ChineseStyle(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" ChineseStyle ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+200000.0;
    }
}

class JapaneseStyle extends DecoStyle{

    public JapaneseStyle(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" JapaneseStyle ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+300000.0;
    }
}

class AmericanStyle extends DecoStyle{

    public AmericanStyle(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" AmericanStyle ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+400000.0;
    }
}

class EuropeStyle extends DecoStyle{

    public EuropeStyle(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" EuropeStyle ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+600000.0;
    }
}




