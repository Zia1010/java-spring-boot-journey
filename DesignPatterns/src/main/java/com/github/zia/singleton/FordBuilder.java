package com.github.zia.singleton;

public class FordBuilder implements CarBuilder {
    private Car car = new Car();

    public FordBuilder() {
        this.car.brand = "Ford";
    }

    @Override
    public CarBuilder setColor(String color) {
        this.car.color = color;
        return this;
    }

    @Override
    public CarBuilder setEngineType(String engineType) {
        this.car.engineType = engineType;
        return this;
    }

    @Override
    public Car build() {
        return this.car;
    }
}

