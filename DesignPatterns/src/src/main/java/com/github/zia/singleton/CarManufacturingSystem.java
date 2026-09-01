package com.github.zia.singleton;

public class CarManufacturingSystem {
    private static CarManufacturingSystem instance = new CarManufacturingSystem();

    private CarManufacturingSystem() {
    }

    public static CarManufacturingSystem getInstance() {
        return instance;
    }

    public CarBuilder activeAssemblyLine(String brand) {
        if (brand.equalsIgnoreCase("Tesla")) {
            return new TeslaBuilder();
        } else if (brand.equalsIgnoreCase("Honda")) {
            return new HondaBuilder();
        } else if (brand.equalsIgnoreCase("Toyota")) {
            return new ToyotaBuilder();
        } else if (brand.equalsIgnoreCase("BMW")) {
            return new BMWBuilder();
        } else if (brand.equalsIgnoreCase("Ford")) {
            return new FordBuilder();
        }
        return null;
    }
}
