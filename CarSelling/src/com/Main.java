package com;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        try {
            ArrayList<Car> record = new ArrayList<>();
            Shell.shell(record);
        } catch (IOException ex) {
            System.out.println("input error!");
        } catch (Exception ex) {
            System.out.println("system error!");

        }

    }
}
