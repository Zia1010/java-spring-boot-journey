package com.github.zia;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("===Actions List===");
            System.out.println("1. Distance (km <-> miles)");
            System.out.println("2. Temperature (C <-> F)");
            System.out.println("3. Weight (kg <-> lbs)");
            System.out.println("4. Exit");
            System.out.println("Choose an option (1-4): ");
            int mainChoice = sc.nextInt();
            switch (mainChoice) {
                case 1:
                    System.out.println("\n--- Distance Converter ---");
                    System.out.println("1. Kilometers to Miles");
                    System.out.println("2. Miles to Kilometers");
                    System.out.print("Choose the direction (1 or 2): ");
                    int distanceChoice = sc.nextInt();

                    System.out.print("Enter the distance value to convert: ");
                    double distanceInput = sc.nextDouble();
                    double distanceResult;
                    if (distanceChoice == 1) {
                        distanceResult = distanceInput * 0.621371;
                        System.out.println(distanceInput + " km is equal to " + distanceResult + " miles.");
                    } else if (distanceChoice == 2) {
                        distanceResult = distanceInput * 1.60934;
                        System.out.println(distanceInput + " miles is equal to " + distanceResult + " km.");
                    } else {
                        System.out.println("Invalid directional choice.");
                    }
                    break;
                case 2:
                    System.out.println("\n--- Temperature Converter ---");
                    System.out.println("1. Celsius to Fahrenheit");
                    System.out.println("2. Fahrenheit to Celsius");
                    System.out.print("Choose the direction (1 or 2): ");
                    int tempChoice = sc.nextInt();
                    System.out.print("Enter the temperature value to convert: ");
                    double tempInput = sc.nextDouble();
                    double tempResult;

                    if (tempChoice == 1) {
                        tempResult = (tempInput * 9 / 5) + 32;
                        System.out.println(tempInput + "°C is equal to " + tempResult + "°F.");
                    } else if (tempChoice == 2) {
                        tempResult = (tempInput - 32) * 5 / 9;
                        System.out.println(tempInput + "°F is equal to " + tempResult + "°C.");
                    } else {
                        System.out.println("Invalid directional choice.");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Weight Converter ---");
                    System.out.println("1. Kilograms to Pounds");
                    System.out.println("2. Pounds to Kilograms");
                    System.out.print("Choose the direction (1 or 2): ");
                    int weightChoice = sc.nextInt();

                    System.out.print("Enter the weight value to convert: ");
                    double weightInput = sc.nextDouble();
                    double weightResult;

                    if (weightChoice == 1) {
                        weightResult = weightInput * 2.20462;
                        System.out.println(weightInput + " kg is equal to " + weightResult + " lbs.");
                    } else if (weightChoice == 2) {
                        weightResult = weightInput / 2.20462;
                        System.out.println(weightInput + " lbs is equal to " + weightResult + " kg.");
                    } else {
                        System.out.println("Invalid directional choice.");
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid menu option (1-4).");
                    break;
            }
        }
        sc.close();
    }
}