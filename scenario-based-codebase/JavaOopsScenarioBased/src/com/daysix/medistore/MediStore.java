package com.daysix.medistore;

import java.time.LocalDate; 

public class MediStore {

    public static void main(String[] args) {

        Medicine tab = new Tablet("Paracetamol",20,LocalDate.of(2026, 5, 20) );

        Medicine syrup = new Syrup("Cough Syrup",120,LocalDate.of(2025, 2, 10));

        Medicine inj = new Injection("Insulin", 350,LocalDate.of(2024, 12, 30));

        tab.sell(6);
        tab.checkExpiry();

        System.out.println();

        syrup.sell(2);
        syrup.checkExpiry();

        System.out.println();

        inj.sell(1);
        inj.checkExpiry();
    }
}
