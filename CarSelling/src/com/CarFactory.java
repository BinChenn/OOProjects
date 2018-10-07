package com;

public class CarFactory {
    public static Car createCar(String name)throws Exception{
        if(name.equalsIgnoreCase("Toyota"))
            return new ToyataCar();
        else if(name.equalsIgnoreCase("Ford"))
            return new FordCar();
        else if(name.equalsIgnoreCase("Benz"))
            return new BenzCar();
        else if(name.equalsIgnoreCase("Audi"))
            return new AudiCar();
        else if(name.equalsIgnoreCase("BWM"))
            return new BMWCar();
        else
            throw new Exception();
    }

}
