package com.lambdas.ecommerce;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EcommerceCustomSortingApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // sample products 
        List<Product> products = new ArrayList<>();
        products.add(new Product("Earbuds", 2599.00, 4.4, 17));
        products.add(new Product("Smart Watch", 6000.00, 4.8, 20));
        products.add(new Product("Bluetooth Speaker", 3000.00, 4.1, 10));
        products.add(new Product("Gaming Mouse", 2999.00, 4.6, 25));
        products.add(new Product("Portable Charger", 999.00, 4.2, 5));

        System.out.println("----- E-Commerce Custom Sorting Demo -----");
        System.out.println("Available sorting options for current campaign:");
        System.out.println("1 - sort by Price (Low to High)");
        System.out.println("2 - sort by Rating (High to Low)");
        System.out.println("3 - sort by Discount % (High to Low)");
        System.out.print("choose sorting criteria (1-3): ");

        int choice = input.nextInt();
        input.nextLine(); // consume newline

        // Define different Comparator behaviors using lambda expressions
        Comparator<Product> comparator;

        switch (choice) {
            case 1:
                // Sort by price ascending
                comparator = (p1, p2) -> Double.compare(p1.getPrice(), p2.getPrice());
                break;

            case 2:
                // Sort by rating descending
                comparator = (p1, p2) -> Double.compare(p2.getRating(), p1.getRating());
                break;

            case 3:
                // sort by discount percentage descending
                comparator = (p1, p2) -> Integer.compare(p2.getDiscountPercent(), p1.getDiscountPercent());
                break;

            default:
                System.out.println("Invalid choice. Showing products in original order.");
                comparator = (_, _) -> 0; // no sorting
                break;
        }

        // sort the list using the dynamically chosen comparator (lambda)
        products.sort(comparator);

        System.out.println("\nProducts after sorting:");
        System.out.println("----------------------------------------------------------------------");
        for (Product p : products) {
            System.out.println(p);
        }
        System.out.println("----------------------------------------------------------------------");

        input.close();
    }
}