package com.github.zia.factory;

public class Cash extends PaymentMethod{


    public Cash(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" from cash");
    }
}
