package com;

public class RegistrationFacade {
    private RegisterCourse regcou = null;
    private PaymentGateway pay = new PaymentGateway();
    private NotifyUser notice = new NotifyUser();

    public RegistrationFacade(){
        if(regcou==null)
            regcou = new RegisterCourse();
    }

    public void regcourse(){
        Double price = regcou.checkout();
        if(price>0){
            if(pay.getmoney(price))
                notice.regSucceed();
            else
                notice.payFail();
        }
        else
            notice.coursefull();
    }
}
