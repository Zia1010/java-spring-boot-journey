public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {

        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient funds for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful! Remaining balance: $" + balance);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(500.00);
        try {
            System.out.println("Attempting to withdraw $600.00...");
            myAccount.withdraw(600.00);
        } catch (InsufficientBalanceException e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
        System.out.println("The program safely continued running past the error.");

    }
}
