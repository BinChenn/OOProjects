package com;

import java.util.Date;

public class ImportFactory implements ProduceCar {

    Consumer consumer;
    int produceQuanity=0;
    Date endTime;
    public ImportFactory(Consumer consu){
        this.consumer = consu;
    }

    @Override
    public void produceBMW() {
        produceQuanity+=1;
        endTime = new Date();


        System.out.println("Produce import BMW, 流线型好");
    }

    @Override
    public void produceAudi() {
        produceQuanity+=1;
        endTime = new Date();

        System.out.println("Produce import Audi, 外壳坚硬");
    }

    @Override
    public void produceBenz() {
        produceQuanity+=1;
        endTime = new Date();

        System.out.println("Produce import Benz, 速度最快");
    }

    @Override
    public int inquireQuanity() {
        return produceQuanity;
    }

    @Override
    public Date inquireEndDate() {
        return endTime;
    }
}
