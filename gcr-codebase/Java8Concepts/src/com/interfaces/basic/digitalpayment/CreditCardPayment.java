package com.interfaces.basic.digitalpayment;

public class CreditCardPayment implements PaymentProcessor {
	
    private String cardNumber;
    private String cardHolder;

    // constructor
    public CreditCardPayment(String cardNumber, String cardHolder) {
	this.cardNumber = cardNumber;
	this.cardHolder = cardHolder;
    }

    @Override
    public void pay(double amount) {
	System.out.println("Credit Card Payment (" + cardHolder + ", ****"
		+ cardNumber.substring(cardNumber.length() - 4) + ") -> Rs." + amount + " charged successfully");
    }
}