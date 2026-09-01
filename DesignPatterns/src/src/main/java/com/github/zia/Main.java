package com.github.zia;

import com.github.zia.factory.PaymentFactory;
import com.github.zia.factory.PaymentMethod;
import com.github.zia.singleton.Printer;

public class Main {
    public static void main(String[] args) {
        Printer.getInstance().printInfo("This is info message from Singleton Printer");
        Printer.getInstance().printError("This is error message from Singleton Printer");


        PaymentMethod cash = PaymentFactory.create("cash", 10);
        PaymentMethod raast = PaymentFactory.create("raast", 100);
        PaymentMethod paypal = PaymentFactory.create("paypal", 100);

    }
}