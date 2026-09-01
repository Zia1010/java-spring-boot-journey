package com.github.zia.singleton;

public class Car {
     String brand;
     String color;
     String engineType;

    public void printSpecs(){
        System.out.println("Your Brand new Car is ready! Brand: " + brand + " | Color: " + color + " | Engine: " + engineType );
    }
}
interface CarBuilder {
    CarBuilder setColor(String color);
    CarBuilder setEngineType(String engineType);
    Car build();
}
