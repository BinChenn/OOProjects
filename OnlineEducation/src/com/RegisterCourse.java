package com;

public class RegisterCourse {
    static final Double NONE_CAPACITY = -1.0;
    private String name;
    private Double price;
    private static int capacity;

    public RegisterCourse(){
        name = "course";
        capacity = 3;
        price = 100.0;
    }

    public Double checkout(){
        if(capacity>0){
            capacity--;
            return price;
        }
        else
            return NONE_CAPACITY;
    }


}
