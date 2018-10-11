package com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Shell {
    public static void shell(ArrayList<Car> record) throws Exception{
        String command;
        while(true){
            System.out.println("Please input command:");
            command = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if(command.equalsIgnoreCase("purchase")){
                System.out.println("Please input car name wanted to purchase");
                String carname = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Please input the number of car wanted to purchase");
                int carnum = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
                System.out.println("Please input the price of car wanted to purchase");
                Double price = Double.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
                try{
                    Purchase newcar = (Purchase)CarFactory.createCar(carname);
                    for (Car carele:
                            record) {
                        if(carele.getName().equalsIgnoreCase(carname)){
                            newcar = (Purchase) carele;
                        }
                    }
                    newcar.purchase(carnum, price);
                    record.add((Car) newcar);

                }
                catch (NoneCarExcp ex){
                    System.out.println("Don't exist this car!");
                }
            }
            else if(command.equalsIgnoreCase("sell")){
                System.out.println("Please input car name wanted to sell");
                String carname = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Please input the number of car wanted to sell");
                int carnum = Integer.valueOf(new BufferedReader(new InputStreamReader(System.in)).readLine());
                int flag = 0;
                try{
                    for (Sell carele:
                            record) {
                        Car temp = (Car) carele;
                        if(temp.getName().equalsIgnoreCase(carname)){
                            carele.Sell(carnum);
                            flag = 1;
                            break;
                        }
                    }
                    if(flag==0)
                        System.out.println("Car don't exist");
                } catch (Insufficient ex){
                    System.out.println("Car insufficient");
                }
            }
            else if(command.equalsIgnoreCase("inquire")){
                System.out.println("Please input car name wanted to inquire");
                String carname = new BufferedReader(new InputStreamReader(System.in)).readLine();
                System.out.println("Please input info(indate,price,quanity) wanted to inquire");
                String info = new BufferedReader(new InputStreamReader(System.in)).readLine();
                for (Inquire carele:
                        record) {
                    Car temp = (Car) carele;
                    if(temp.getName().equalsIgnoreCase(carname)){
                        InquireAction inqu = new
                        System.out.println(carele.inquire(info));
                        break;
                    }
                }

            }
            else if(command.equalsIgnoreCase("exit"))
                break;
            else
                System.out.println("Command don't exist!");

        }
    }
}
