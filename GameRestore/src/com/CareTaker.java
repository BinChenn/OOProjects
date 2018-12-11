package com;

public class CareTaker {
    private MementoIF mem;

    public MementoIF getMemento() {
        return mem;
    }

    public void saveMemento(MementoIF mem) {
        this.mem = mem;
    }
}
