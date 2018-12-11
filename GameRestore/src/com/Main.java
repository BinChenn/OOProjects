package com;

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier("zero");
        System.out.println("Before fight: " + soldier.toString());
        CareTaker care = new CareTaker();
        care.saveMemento(soldier.createMemento());
        soldier.fight();
        System.out.println("After fight: " + soldier.toString());
        soldier.restoreMemento(care.getMemento());
        System.out.println("Restore: " + soldier.toString());
    }
}
