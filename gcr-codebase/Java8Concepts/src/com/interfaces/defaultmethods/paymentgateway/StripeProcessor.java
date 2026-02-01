package com.interfaces.defaultmethods.paymentgateway;

public class StripeProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Stripe -> Charge of Rs." + amount +
                " succeeded (TxID: " + transactionId + ")");
    }

    // Does NOT override refund - will use default implementation
}