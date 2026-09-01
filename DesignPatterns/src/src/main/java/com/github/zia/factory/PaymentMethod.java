package com.github.zia.factory;

public abstract class PaymentMethod {
    private int balance;

    public PaymentMethod(int balance) {
        this.balance = balance;
    }

    public abstract void pay(int amount);

    public int checkBalance(){
        return balance;
    }
}
