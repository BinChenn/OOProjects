package com;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;



public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("Input num1");
            String strA = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Input opstr");
            String opstr = new BufferedReader(new InputStreamReader(System.in)).readLine();
            System.out.println("Input op");
            String strB = new BufferedReader(new InputStreamReader(System.in)).readLine();
            Operation op;
            op = OpFactory.createOperation(opstr);
            Double result;
            op.setNum1(Double.valueOf(strA));
            op.setNum2(Double.valueOf(strB));
            result = op.getResult();
            System.out.println("result = " + result);



        }
        catch(Exception e){
            System.out.println("IO Exception");
        }

        System.out.println("Hello World, this is my first GitHub project!");
        System.out.println("Hello, this is the code I typed in my CUBE Pad");



	// write your code here
    }
}

