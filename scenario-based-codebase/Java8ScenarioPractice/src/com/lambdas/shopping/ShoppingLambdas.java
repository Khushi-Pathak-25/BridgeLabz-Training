package com.lambdas.shopping;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class ShoppingLambdas {
    static class Product {
        String name;
        double price;

        public Product(String name, double price) {
            this.name = name;
            this.price = price;
        }

        @Override
        public String toString() {
            return name + " (Rs." + price + ")";
        }
    }

    public static void main(String[] args) {
        List<Product> cart = Arrays.asList(
            new Product("Laptop", 72000),
            new Product("Headphones", 2500),
            new Product("Mouse", 450),
            new Product("Keyboard", 1800),
            new Product("Monitor", 14500)
        );

        // 1. 10% discount
        Function<Product, Double> discountedPrice = p -> p.price * 0.90;
        System.out.println("1. After 10% discount:");
        cart.forEach(p -> System.out.println(p.name + " ==> Rs." + discountedPrice.apply(p)));

        // 2. Sort by price
        System.out.println("\n2. Sorted by price:");
        cart.stream()
                .sorted(Comparator.comparingDouble(p -> p.price))
                .forEach(System.out::println);

        // 3. Free delivery if > 500
        Predicate<Product> freeDelivery = p -> p.price > 500;
        System.out.println("\n3. Free delivery eligible:");
        cart.forEach(p -> System.out.println(p.name + " ==> " + (freeDelivery.test(p) ? "Yes" : "No")));

        // 4. Final bill amount
        double total = cart.stream()
                .mapToDouble(p -> p.price)
                .sum();
        System.out.println("\n4. Total bill = Rs." + total);

        // 5. Print product names only
        System.out.println("\n5. Product names:");
        cart.forEach(p -> System.out.println(p.name));
    }
}