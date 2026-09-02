public class Animals {
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

class Dog extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animals {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Main {
    public static void main(String[] args) {
        Animals[] animals = new Animals[3];
        animals[0] = new Animals();
        animals[1] = new Dog();
        animals[2] = new Cat();

        for (Animals animal : animals) {
            animal.makeSound();
        }
    }
}
