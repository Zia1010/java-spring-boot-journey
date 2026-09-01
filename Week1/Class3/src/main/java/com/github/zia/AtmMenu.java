package com.github.zia;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class AtmMenu {
    public static void main(String[] args) {
        String atmPin = "1234";
        double balance = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your 4-digit Pin:");
        String userPin = sc.next();
        if (userPin.length() != 4) {
            System.out.println("Error: Pin must be exactly 4 digits.");
            return;
        }
        if (!userPin.equals(atmPin)) {
            System.out.println("Error: Incorrect Pin.Access Denied.");
            return;
        }
        System.out.println("Access Granted!");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("Please choose an option between 1 to 3:");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.println("Your current balance is: $" + balance);
                break;
            case 2:
                System.out.println("Enter deposit amount:");
                int depositAmount = sc.nextInt();
                if (depositAmount <= 0) {
                    System.out.println("Error: Deposit amount must be greater than zero.");
                } else {
                    balance = balance + depositAmount;
                    System.out.println("Deposit Successful! New balance: $" + balance);
                }
                break;
            case 3:
                System.out.println("Enter withdraw amount:");
                int withdrawAmount = sc.nextInt();
                if (withdrawAmount <= 0) {
                    System.out.println("Error: withdraw amount must be greater than zero.");
                } else if (withdrawAmount > balance) {
                    System.out.println("Error: Insufficient Funds! your balance is only: $" + balance);
                } else {
                    balance = balance - withdrawAmount;
                    System.out.println("Withdraw Successful! your remaining balance is: $" + balance);
                }
                break;
            default: {
                System.out.println("Error: Invalid choice. Please choose options between 1 to 3.");
            }
            break;
        }
        System.out.println("Thank You for using our ATM. Goodbye!");
    }
}
