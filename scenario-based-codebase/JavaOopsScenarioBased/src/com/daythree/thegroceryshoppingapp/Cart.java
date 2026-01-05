package com.daythree.thegroceryshoppingapp;

import java.util.ArrayList;

public class Cart implements ICheckout {

    private ArrayList<Product> products;
    private double totalPrice;

    // Constructor (empty cart)
    public Cart() {
        products = new ArrayList<>();
        totalPrice = 0;
    }

    // Constructor with pre-selected items
    public Cart(ArrayList<Product> products) {
        this.products = products;
        calculateTotal();
    }

    // Only Cart can update price
    private void calculateTotal() {
        totalPrice = 0;
        for (Product p : products) {
            totalPrice += p.applyDiscount(p.getPrice());
        }
    }

    public void addProduct(Product product, int quantity) {
        for (int i = 0; i < quantity; i++) {
            products.add(product);
        }
        calculateTotal(); // price * quantity
    }

    @Override
    public double applyDiscount(double coupon) {
        totalPrice = totalPrice - coupon;
        return totalPrice;
    }

    @Override
    public void generateBill() {
        System.out.println("----- SwiftCart Bill -----");
        for (Product p : products) {
            System.out.println(p.getName() + " - ₹" + p.getPrice());
        }
        System.out.println("Total Price: ₹" + totalPrice);
    }
}

