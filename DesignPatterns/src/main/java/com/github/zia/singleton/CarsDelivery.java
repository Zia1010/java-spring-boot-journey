package com.github.zia.singleton;

public class CarsDelivery {
    public static void main(String[] args) {
        CarManufacturingSystem controlServer = CarManufacturingSystem.getInstance();
        CarBuilder teslaPlant = controlServer.activeAssemblyLine("Tesla");
        CarBuilder hondaPlant = controlServer.activeAssemblyLine("Honda");
        CarBuilder toyotaPlant = controlServer.activeAssemblyLine("Toyota");
        CarBuilder bmwPlant = controlServer.activeAssemblyLine("BMW");
        CarBuilder fordPlant = controlServer.activeAssemblyLine("Ford");

        Car myCustomTesla = teslaPlant.setColor("Silver").setEngineType("V12 twin turbo").build();
        myCustomTesla.printSpecs();
        Car myCustomHonda = hondaPlant.setColor("Black").setEngineType("V6").build();
        myCustomHonda.printSpecs();
        Car myCustomToyota = toyotaPlant.setColor("White").setEngineType("V6").build();
        myCustomToyota.printSpecs();
        Car myCustomBMW = bmwPlant.setColor("Blue").setEngineType("V8").build();
        myCustomBMW.printSpecs();
        Car myCustomFord = fordPlant.setColor("Grey").setEngineType("V8 twin turbo").build();
        myCustomFord.printSpecs();
    }
}
