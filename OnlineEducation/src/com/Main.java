package com;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) {
        try{
            System.out.println("Input operation wanted");
            String command = new BufferedReader(new InputStreamReader(System.in)).readLine();
            if(command.equalsIgnoreCase("register")){
                RegistrationFacade regfacade = new RegistrationFacade();
                regfacade.regcourse();
            }

        }
        catch(IOException ex){
            System.out.println("IO error");
        }
    }
}
