package com.github.zia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Enter a score (0-100) or type exit to leave the program");
            String userInput = sc.nextLine();
            if (userInput.equalsIgnoreCase("exit")) {
                running = false;
                System.out.println("Exiting Grade calculator.Goodbye!");
            } else {
                try {
                    double score = Double.parseDouble(userInput);
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid input. Please enter a number between 0-100 or type 'exit'.");
                    } else {
                        if (score >= 90) {
                            System.out.println("Grade: A | Comment: Excellent work! You've mastered this material.");
                        } else if (score >= 80) {
                            System.out.println("Grade: B | Comment: Good job! A solid performance.");
                        } else if (score >= 70) {
                            System.out.println("Grade: C | Comment: Satisfactory. There is room to grow.");
                        } else if (score >= 60) {
                            System.out.println("Grade: D | Comment: Needs improvement. Consider reviewing the material.");
                        } else {
                            System.out.println("Grade: F | Comment: Unsatisfactory. Please seek help or tutoring.");
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: That is not a valid number. Try again or type 'exit'.");
                }
            }
        }
    }
}