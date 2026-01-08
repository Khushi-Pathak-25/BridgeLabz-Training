package com.daysix.medistore;

import java.time.LocalDate; 

public class Injection extends Medicine {

    public Injection(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Injection expiry check:");
        super.checkExpiry();
    }
}
