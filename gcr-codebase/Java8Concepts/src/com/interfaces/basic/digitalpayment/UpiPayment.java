package com.interfaces.basic.digitalpayment;

public class UpiPayment implements PaymentProcessor {
    private String upiId;

    // constructor
    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    public void pay(double amount) {
        System.out.println("UPI Payment (" + upiId + ") -> Rs." + amount + " paid successfully via UPI");
    }
}