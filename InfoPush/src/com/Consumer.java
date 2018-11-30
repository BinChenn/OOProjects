package com;


public class Consumer implements Observerr{
    private String name;

    public Consumer(String name){
        this.name = name;
    }

    public void addObservable(Action o){
        o.addObserver(this);
    }

    public void deleteObservable(Action o){
        o.deleteObserver(this);
    }

    @Override
    public void update(Action o, Object arg) {
        if(o instanceof DePrice)
            System.out.println(name+": 来了来了");
        else if(o instanceof InPrice)
            System.out.println(name+": 朕知道了");
        else if(o instanceof Coupon)
            System.out.println(name+": 谢谢你的优惠卷");
        else
            System.out.println("---");

    }
}
