class Car {
    private String make;
    private String model;
    private int speed;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public void start() {
        System.out.println(make + " " + model + " started.");
    }

    public void accelerate() {
        speed += 10;
        System.out.println(make + " " + model + " accelerated. Current speed: " + speed + " mph.");
    }
}

public class CarDriving {
    public static void main(String[] args) {
        Car car1 = new Car("Toyota", "Corolla");
        Car car2 = new Car("Honda", "Civic");
        Car car3 = new Car("Ford", "Mustang");

        car1.start();
        car1.accelerate();

        car2.start();
        car2.accelerate();

        car3.start();
        car3.accelerate();
    }
}