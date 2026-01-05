package com.daythree.thegroceryshoppingapp;

public class PerishableProduct extends Product {

    public PerishableProduct(String name, double price) {
        super(name, price, "Perishable");
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.90; // 10% discount
    }
}

