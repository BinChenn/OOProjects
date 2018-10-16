package com;

public abstract class DecoType extends House{
    protected House house;

    public DecoType(){
        super();
        this.descriotion+="Decorate Type: ";
    }

}

class PrimaryType extends DecoType{

    public PrimaryType(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" PrimaryType";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+50000.0;
    }
}

class NormalType extends DecoType{

    public NormalType(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" NormalType ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+200000.0;
    }
}

class DelicateType extends DecoType{

    public DelicateType(House house1){
        this.house = house1;
        this.descriotion = this.house.descriotion +" DelicateType ";
    }

    @Override
    public Double getPrice() {
        return this.house.getPrice()+500000.0;
    }
}
