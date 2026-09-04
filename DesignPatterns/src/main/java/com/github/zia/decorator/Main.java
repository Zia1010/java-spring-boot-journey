package com.github.zia.decorator;

public class Main {
    public static void main(String[] args) {

        Coffee coffee = new SimpleCoffee();
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        coffee = new MilkDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

        coffee = new CaramelDecorator(coffee);
        System.out.println(coffee.getDescription() + " -> $" + coffee.getCost());

    }
}

