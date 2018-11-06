package com;

public class ProviderC extends Order {
    @Override
    public Double getTaxRate() {
        return 0.075;
    }
}
