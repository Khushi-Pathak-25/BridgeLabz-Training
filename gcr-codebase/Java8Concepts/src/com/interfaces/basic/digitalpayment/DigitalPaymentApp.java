package com.interfaces.basic.digitalpayment;

import java.util.Scanner;

public class DigitalPaymentApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // create different payment methods
        PaymentProcessor upi = new UpiPayment("ringo@upi");
        PaymentProcessor creditCard = new CreditCardPayment("1234567890123456", "Shagun Pathak");
        PaymentProcessor wallet = new WalletPayment("Paytm");

        System.out.println("====== Digital Payment Demo ======");
        System.out.println("Available payment methods:");
        System.out.println("1 - UPI");
        System.out.println("2 - Credit Card");
        System.out.println("3 - Wallet");
        System.out.print("Choose payment method (1-3): ");

        int choice = input.nextInt();
        System.out.print("Enter amount to pay (Rs.): ");
        double amount = input.nextDouble();

        PaymentProcessor selectedPayment;

        if (choice == 1) {
            selectedPayment = upi;
        } else if (choice == 2) {
            selectedPayment = creditCard;
        } else if (choice == 3) {
            selectedPayment = wallet;
        } else {
            System.out.println("Invalid choice. Payment cancelled.");
            input.close();
            return;
        }

        System.out.println("\nProcessing payment...");
        selectedPayment.pay(amount);
        System.out.println("Payment completed successfully!");

        input.close();
    }
}