package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try{
            OrderByA order1 = new OrderByA();
            System.out.println("输入优惠类型(discount, fullsubtract)：");
            String paytype = new BufferedReader(new InputStreamReader(System.in)).readLine();
            order1.calculateAll(paytype);
            System.out.println("------------------------------------");
            OrderByB order2 = new OrderByB();
            System.out.println("输入优惠类型(discount, fullsubtract)：");
            paytype = new BufferedReader(new InputStreamReader(System.in)).readLine();
            order2.calculateAll(paytype);


        }
        catch(IOException ex){
            System.out.println("input error");
        }

    }
}
