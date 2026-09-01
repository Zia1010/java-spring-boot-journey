package com.github.zia.factory;

public class PaymentFactory {

    public static PaymentMethod create(String type,int openingAmount){
        return switch (type) {
            case "cash" -> new Cash(openingAmount);
            case "raast" -> new Raast(openingAmount);
            case "creditcard" -> new CreditCard(openingAmount);
            case "paypal" -> new CreditCard(openingAmount);
            default -> throw new RuntimeException("Payment Method not supported: " + type);
        };
    }
}
