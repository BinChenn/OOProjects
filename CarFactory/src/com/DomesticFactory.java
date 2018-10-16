package com;

import java.util.Date;

public class DomesticFactory implements ProduceCar{
    Consumer consumer;
    int produceQuanity=0;
    Date endTime;

    public DomesticFactory(Consumer consu){
        this.consumer = consu;
    }

    @Override
    public void produceBMW() {
        produceQuanity+=1;
        System.out.println("Produce domestic BMW, 流线型好");
        endTime = new Date();
    }

    @Override
    public void produceAudi() {
        produceQuanity+=1;
        System.out.println("Produce domestic Audi, 外壳坚硬");
        endTime = new Date();
    }

    @Override
    public void produceBenz() {
        produceQuanity+=1;
        System.out.println("Produce domestic Benz, 速度最快");
        endTime = new Date();
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
