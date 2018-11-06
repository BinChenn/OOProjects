package com;

public class zerg {
    private static zerg ourInstance = new zerg();

    public static zerg getInstance() {
        return ourInstance;
    }

    private zerg() {
    }
}
