package com.interfaces.defaultmethods.paymentgateway;

import java.util.Scanner;

public class PaymentGatewayApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Payment Gateway Integration Demo");
        System.out.println("1 - Razorpay (custom refund support)");
        System.out.println("2 - Paytm (uses default refund)");
        System.out.println("3 - Stripe (uses default refund)");
        System.out.print("Choose provider (1-3): ");

        int choice = input.nextInt();
        System.out.print("Enter amount (Rs.): ");
        double amount = input.nextDouble();
        System.out.print("Enter transaction ID: ");
        String txId = input.next();

        PaymentProcessor processor;

        if (choice == 1) {
            processor = new RazorpayProcessor();
        } else if (choice == 2) {
            processor = new PaytmProcessor();
        } else if (choice == 3) {
            processor = new StripeProcessor();
        } else {
            System.out.println("Invalid choice.");
            input.close();
            return;
        }

        System.out.println("\nProcessing payment...");
        processor.processPayment(amount, txId);

        System.out.print("\nInitiate refund? (yes/no): ");
        input.nextLine(); // consume newline
        String refundChoice = input.nextLine().trim().toLowerCase();

        if (refundChoice.equals("yes")) {
            System.out.println("\nInitiating refund...");
            processor.refund(amount, txId);
        }

        input.close();
    }
}