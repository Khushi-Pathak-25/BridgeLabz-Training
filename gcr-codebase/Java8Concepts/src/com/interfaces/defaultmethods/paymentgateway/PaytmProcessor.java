package com.interfaces.defaultmethods.paymentgateway;

public class PaytmProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount, String transactionId) {
        System.out.println("Paytm -> Payment of Rs." + amount +
                " received (TxID: " + transactionId + ")");
    }

    // Does NOT override refund -> will use default implementation
}