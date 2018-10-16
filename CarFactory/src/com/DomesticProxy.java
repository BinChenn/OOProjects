package com;

import java.util.Date;

public class DomesticProxy implements ProduceCar {
    DomesticFactory df;
    public DomesticProxy(Consumer consumer){
        df = new DomesticFactory(consumer);
    }
    @Override
    public void produceBMW() {
        df.produceBMW();
    }

    @Override
    public void produceAudi() {
        df.produceAudi();
    }

    @Override
    public void produceBenz() {
        df.produceBenz();
    }

    @Override
    public int inquireQuanity() {
        if(df.consumer.getType().equalsIgnoreCase("special"))
            return df.inquireQuanity();
        else
            return -1;
    }

    @Override
    public Date inquireEndDate() {
        return df.inquireEndDate();
    }
}
