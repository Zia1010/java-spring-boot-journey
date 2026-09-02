interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card.");
    }
}

class UpiPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI.");
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash.");
    }
}

class Main {
    public static void main(String[] args) {
        Payment card = new CreditCardPayment();
        Payment upi = new UpiPayment();
        Payment cash = new CashPayment();

        card.pay(1500.50);
        upi.pay(500.00);
        cash.pay(120.25);
    }
}
