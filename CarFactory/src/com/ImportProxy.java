package com;

import java.util.Date;

public class ImportProxy implements ProduceCar {
    ImportFactory df;
    public ImportProxy(Consumer consumer){
        df = new ImportFactory(consumer);
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
