package com;

public class ProviderA extends Order {
    @Override
    public Double getTaxRate() {
        return 0.05;
    }
}
