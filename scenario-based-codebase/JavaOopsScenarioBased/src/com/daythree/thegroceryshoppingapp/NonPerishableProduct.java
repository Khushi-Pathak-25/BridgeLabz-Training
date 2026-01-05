package com.daythree.thegroceryshoppingapp;

public class NonPerishableProduct extends Product {

    public NonPerishableProduct(String name, double price) {
        super(name, price, "Non-Perishable");
    }

    @Override
    public double applyDiscount(double price) {
        return price * 0.95; // 5% discount
    }
}
