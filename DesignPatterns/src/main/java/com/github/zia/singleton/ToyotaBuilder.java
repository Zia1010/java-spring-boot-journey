package com.github.zia.singleton;

public class ToyotaBuilder implements CarBuilder {
    private Car car = new Car();

    public ToyotaBuilder() {
        this.car.brand = "Toyota";
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

