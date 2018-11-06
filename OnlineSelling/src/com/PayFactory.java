package com;

public class PayFactory{

    public static Payment getPayment(String paytype, Double price){
        if(paytype.equalsIgnoreCase("discount")){
            if(price<100000.0)
                return new NormalPay(price);
            else if(price<200000.0)
                return new Payment10w_Dis(price);
            else
                return new Payment20w_Dis(price);
        }
        else if(paytype.equalsIgnoreCase("fullsubtract")){
            if(price<100000.0)
                return new NormalPay(price);
            else if(price<200000.0)
                return new Payment10w_Full(price);
            else
                return new Payment20w_Full(price);
       }
        else
            return new NormalPay(price);

    }

}
