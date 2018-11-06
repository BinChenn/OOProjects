package com;

public class NotifyUser {

    public void regSucceed(){
        System.out.println("Congratualtions！You have registered this course successfully.");
    }

    public void payFail(){
        System.out.println("Sorry! Fail in payment, register unsuccessfully.");
    }

    public void coursefull(){
        System.out.println("Sorry! The capacity of course is full, register unsuccessfully.");
    }
}
