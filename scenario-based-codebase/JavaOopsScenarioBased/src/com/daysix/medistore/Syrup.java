package com.daysix.medistore;

import java.time.LocalDate; 

public class Syrup extends Medicine {

    public Syrup(String name, double price, LocalDate expiryDate) {
        super(name, price, expiryDate);
    }

    @Override
    public void checkExpiry() {
        System.out.println("Syrup expiry check (liquid medicine):");
        if (expiryDate.isBefore(java.time.LocalDate.now().minusDays(5))) {
            System.out.println(name + " is unsafe due to liquid degradation.");
        } else {
            System.out.println(name + " is safe to use.");
        }
    }
}

