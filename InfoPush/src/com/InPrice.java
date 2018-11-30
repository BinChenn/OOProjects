package com;

public class InPrice extends Action {
    public void increasePrice(){
        System.out.println("亲，我们的商品热销，就要涨价了，你可要抓紧了哦！");
        super.notifyObserver();
    }
}
