package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        String area=null, type=null, style=null;
        House house1;
        try{
            System.out.println("Input area(40, 80, 100)");
            area = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Input Decorate Type(simple, normal, delicate)");
            type = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Input Decorate Style(Chinese,american, europe, japanese)");
            style = new BufferedReader(new InputStreamReader(System.in)).readLine();
        }
        catch (IOException ex){
            System.out.println("io error");
        }
        if(area.equalsIgnoreCase("40"))
            house1 = new FortySQMHouse("beijing");
        else if(area.equalsIgnoreCase("80"))
            house1 = new EightySQMHouse("beijing");
        else
            house1 = new OneHundredSQMHouse("beijing");
        if(type.equalsIgnoreCase("simple"))
            house1 = new PrimaryType(house1);
        else if(type.equalsIgnoreCase("normal"))
            house1 = new NormalType(house1);
        else
            house1 = new DelicateType(house1);

        if(style.equalsIgnoreCase("american"))
            house1 = new AmericanStyle(house1);
        else if(style.equalsIgnoreCase("chinese"))
            house1 = new ChineseStyle(house1);
        else if(style.equalsIgnoreCase("europe"))
            house1 = new EuropeStyle(house1);
        else
            house1 = new JapaneseStyle(house1);


        System.out.println(house1.getDescriotion());
        System.out.println(house1.getPrice());

    }
}
