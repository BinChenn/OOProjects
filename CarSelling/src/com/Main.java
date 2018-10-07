package com;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	try{
        ArrayList<Car> record = new ArrayList<>();
        Shell.shell(record);
    }
    catch(Exception ex){
        System.out.println("System error");
    }

    }
}
