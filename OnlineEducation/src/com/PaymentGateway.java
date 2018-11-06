package com;

public class PaymentGateway {

    public boolean getmoney(Double price){
        if(getBalance() >= price)
            return getMoneyFromBank(price);
        else
            return false;
    }

    private Double getBalance(){
        return 10000.0;
    }

    private boolean getMoneyFromBank(Double price){
        return true;
    }

}
