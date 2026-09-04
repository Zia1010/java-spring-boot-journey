package com.github.zia.decorator;

public interface Coffee {
    String getDescription();
    double getCost();
}
class SimpleCoffee implements Coffee {
    @Override
    public String getDescription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 2.00; // Base price
    }
}
