
import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorException {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter your First number:");
            double num1 = sc.nextDouble();
            System.out.println("Enter an operator(+, -, *, /): ");
            char operator = sc.next().charAt(0);
            System.out.println("Enter your Second number:");
            double num2 = sc.nextDouble();

            double result = 0;
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Division by zero is not allowed.");
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    return;
            }
            System.out.println("Result: " + result);
        } catch (InputMismatchException e) {
            System.out.println("\"Error: Bad input. Please enter valid numbers.\"");
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: Something unexpected happened.");
        }

        sc.close();
    }
}
