package com;


public class DePrice extends Action{

    public void decreasePrice(){
        System.out.println("亲，有降价大优惠哦，还不赶紧来！");
        super.notifyObserver();
    }



}
