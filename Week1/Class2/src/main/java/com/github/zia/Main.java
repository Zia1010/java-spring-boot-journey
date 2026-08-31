package com.github.zia;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator");
        System.out.println("Enter your first number:");
        double a = sc.nextDouble();
        System.out.println("Enter your second number:");
        double b = sc.nextDouble();

        System.out.println("The sum of your two numbers is: " + (a + b));
        System.out.println("The difference of your two numbers is: " + (a - b));
        System.out.println("The product of your two numbers is: " + (a * b));
        if (b != 0) {
            System.out.println("The quotient of your two numbers is: " + (a / b));
            System.out.println("The remainder of your two numbers is: " + (a % b));
        } else {
            System.out.println("The quotient cannot be calculated: Cannot divide by zero.");
            System.out.println("The remainder cannot be calculated: Cannot divide by zero.");
        }
        sc.close();
    }
}