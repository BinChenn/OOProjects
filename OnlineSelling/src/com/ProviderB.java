package com;

public class ProviderB  extends Order{
    @Override
    public Double getTaxRate() {
        return 0.07;
    }
}
