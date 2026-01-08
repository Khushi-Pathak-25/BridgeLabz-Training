package com.daysix.medistore;

import java.time.LocalDate; 

public class Tablet extends Medicine {

    public Tablet(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Tablet expiry check (preserved medicine):");
        super.checkExpiry();
    }
}

