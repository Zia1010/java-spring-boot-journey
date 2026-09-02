public class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public String describe() {
        return "This is a " + brand + " vehicle";
    }
}

class Car extends Vehicle {
    public Car(String brand) {
        super(brand);
    }

    @Override
    public String describe() {
        return super.describe() + ", specifically a car.";
    }
}

class Bike extends Vehicle {
    public Bike(String brand) {
        super(brand);
    }

    @Override
    public String describe() {
        return super.describe() + ", specifically a bike.";
    }
}

class Truck extends Vehicle {
    public Truck(String brand) {
        super(brand);
    }

    @Override
    public String describe() {
        return super.describe() + ", specifically a truck.";
    }
}

class Ride {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota");
        Vehicle bike = new Bike("Yamaha");
        Vehicle truck = new Truck("Volvo");

        System.out.println(car.describe());
        System.out.println(bike.describe());
        System.out.println(truck.describe());
    }
}
