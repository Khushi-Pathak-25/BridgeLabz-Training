package com.examples.shoppingcart;

import java.util.*;

public class ShoppingCart {

    public static void main(String[] args) {

        // HashMap to store product and price
        Map<String, Integer> productPrices = new HashMap<>();
        productPrices.put("Laptop", 55000);
        productPrices.put("Mouse", 700);
        productPrices.put("Keyboard", 1500);
        productPrices.put("Headphones", 2000);

        // LinkedHashMap to maintain order of items added to cart
        Map<String, Integer> cart = new LinkedHashMap<>();
        cart.put("Laptop", productPrices.get("Laptop"));
        cart.put("Mouse", productPrices.get("Mouse"));
        cart.put("Keyboard", productPrices.get("Keyboard"));
        cart.put("Headphones", productPrices.get("Headphones"));

        // Display cart items in insertion order
        System.out.println(" Items in Cart (Insertion Order):");
        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            System.out.println(entry.getKey() + "- Rs." + entry.getValue());
        }

        // TreeMap to display items sorted by price
        Map<Integer, String> sortedByPrice = new TreeMap<>();

        for (Map.Entry<String, Integer> entry : cart.entrySet()) {
            sortedByPrice.put(entry.getValue(), entry.getKey());
        }

        System.out.println("\n Items Sorted by Price:");
        for (Map.Entry<Integer, String> entry : sortedByPrice.entrySet()) {
            System.out.println(entry.getValue() + "- Rs." + entry.getKey());
        }
    }
}

