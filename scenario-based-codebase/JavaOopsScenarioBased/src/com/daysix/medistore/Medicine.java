package com.daysix.medistore;

import java.time.LocalDate;

public class Medicine implements ISellable {

    // Encapsulation: sensitive data hidden
    private double price;
    private int quantity;

    protected String name;
    protected LocalDate expiryDate;

    // Constructor with default quantity
    public Medicine(String name, double price, LocalDate expiryDate) {
        this(name, price, expiryDate, 10); // default quantity = 10
    }

    // Constructor with custom quantity
    public Medicine(String name, double price, LocalDate expiryDate, int quantity) {
        this.name = name;
        this.price = price;
        this.expiryDate = expiryDate;
        this.quantity = quantity;
    }

    // Private pricing logic (Access Modifier requirement)
    private double calculateTotal(int qty) {
        double total = price * qty;

        // discount logic
        if (qty >= 5) {
            total = total * 0.90; // 10% discount
        }
        return total;
    }

    // Selling medicine
    @Override
    public void sell(int qty) {
        if (qty <= quantity) {
            double bill = calculateTotal(qty);
            quantity -= qty; // stock adjustment (operator usage)
            System.out.println(qty + " units sold of " + name);
            System.out.println("Total Bill: Rs." + bill);
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }

    // Base expiry check
    @Override
    public void checkExpiry() {
        if (expiryDate.isBefore(LocalDate.now())) {
            System.out.println(name + " is expired.");
        } else {
            System.out.println(name + " is safe to use.");
        }
    }
}

