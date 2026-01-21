package com.daynine.medwarehouse;

import java.time.LocalDate;

public class Medicine {
    protected String name;
    protected  LocalDate expiryDate;

    public Medicine(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    @Override
    public String toString() {
        return name + " | Expiry: " + expiryDate;
    }
}
