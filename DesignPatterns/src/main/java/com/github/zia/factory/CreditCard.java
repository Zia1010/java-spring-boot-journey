package com.github.zia.factory;

public class CreditCard extends PaymentMethod{
    public CreditCard(int balance) {
        super(balance);
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+ amount+" from Credit Card");
    }
}
