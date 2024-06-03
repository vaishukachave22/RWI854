package program;
interface Payment {
    void processPayment(double amount);
}

class CreditCardPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of " + amount);
    }
}

class PayPalPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal Payment of " + amount);
    }
}

class BankTransferPayment implements Payment {
    public void processPayment(double amount) {
        System.out.println("Processing bank transfer payment of " + amount);
    }
}

public class InterfacePaymentProcessor {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment paypal = new PayPalPayment();
        Payment bankTransfer = new BankTransferPayment();
        
        creditCard.processPayment(150.00);
        paypal.processPayment(250.00);
        bankTransfer.processPayment(300.00);
    }
}
