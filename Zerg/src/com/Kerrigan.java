package com;

public class Kerrigan {
    private static Kerrigan kerrigan = null;

    private Kerrigan(){}

    synchronized public static Kerrigan getInstance(){
        if(kerrigan==null){
            kerrigan = new Kerrigan();
            return kerrigan;
        }
        else
            return kerrigan;
    }

    public void info(){
        System.out.println("this is kerrigan");
    }

}
