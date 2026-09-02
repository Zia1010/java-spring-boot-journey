package com.github.zia;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Connected to the database.");
    }
}

class Main {
    public static void main(String[] args) {
        Singleton connection1 = Singleton.getInstance();
        Singleton connection2 = Singleton.getInstance();

        connection1.connect();

        System.out.println("Both variables point to the same instance: " + (connection1 == connection2));
    }
}
