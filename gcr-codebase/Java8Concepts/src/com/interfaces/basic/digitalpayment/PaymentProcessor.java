package com.interfaces.basic.digitalpayment;

public interface PaymentProcessor {
	
    // processes the payment of given amount
    void pay(double amount);
}