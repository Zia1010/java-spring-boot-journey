package com.github.zia.singleton;

public class BMWBuilder implements CarBuilder {
    private Car car = new Car();

    public BMWBuilder() {
        this.car.brand = "BMW";
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

