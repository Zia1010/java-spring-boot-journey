package com.github.zia.factory;

public class Raast extends PaymentMethod{

    public Raast(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" from online Raast");
    }
}
