package com;

public abstract class PayOrderMoney implements PayType {
    public abstract void pay();
}

abstract class PayOrderAmount implements PayType {
    public abstract void pay();
}
