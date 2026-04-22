package Interface;

import java.util.*;

// Interface
interface PaymentGateway {
    void processPayment(double amount);
}

// CreditCardPayment Class
class CreditCardPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing credit card payment of %.2f%n", amount);
    }
}

// UPIPayment Class
class UPIPayment implements PaymentGateway {
    @Override
    public void processPayment(double amount) {
        System.out.printf("Processing UPI payment of %.2f%n", amount);
    }
}

class Main {
    public static void main(String[] args) {
        // Hardcoded input
        String[] paymentMethod = { "credit", "upi" };
        double[] paymentValue = { 284.5, 27476.2 };

        // Process payments based on method
        for (int i = 0; i < paymentMethod.length; i++) {
            PaymentGateway paymentGateway;
            if (paymentMethod[i].equals("credit")) {
                paymentGateway = new CreditCardPayment();
            } else if (paymentMethod[i].equals("upi")) {
                paymentGateway = new UPIPayment();
            } else {
                continue; // If payment method is unknown
            }
            paymentGateway.processPayment(paymentValue[i]);
        }
    }
}

