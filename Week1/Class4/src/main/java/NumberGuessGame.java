import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNum = (int) (Math.random() * 100) + 1;
        int attempts = 0;
        int userGuess = 0;
        System.out.println("Welcome to Number Guessing Game!");
        System.out.println("I have picked a secret number between 1 and 100. Try to guess it!");
        while (userGuess != secretNum) {
            System.out.println("Enter your guess:");
            userGuess = sc.nextInt();
            attempts = attempts + 1;
            if (userGuess > secretNum) {
                System.out.println("Too high! Try a lower number.");
            } else if (userGuess < secretNum) {
                System.out.println("Too low! Try a higher number.");
            } else {
                System.out.println("Congratulations! You guessed the secret number!");
                System.out.println("It took you " + attempts + " attempts to win the game.");
            }
        }
    }
}

