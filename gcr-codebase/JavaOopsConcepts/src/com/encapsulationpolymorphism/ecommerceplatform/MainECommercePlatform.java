/*2. E-Commerce Platform
Description: Develop a simplified e-commerce platform:
Create an abstract class Product with fields like productId, name, and price, 
and an abstract method calculateDiscount().
Extend it into concrete classes: Electronics, Clothing, and Groceries.
Implement an interface Taxable with methods calculateTax() and getTaxDetails() for applicable product categories.
Use encapsulation to protect product details, allowing updates only through setter methods.
Showcase polymorphism by creating a method that calculates and 
prints the final price (price + tax - discount) for a list of Product.*/

package com.encapsulationpolymorphism.ecommerceplatform;

import java.util.*;

public class MainECommercePlatform {

    // Polymorphic method
    public static void printFinalPrice(List<Product> products) {

        for (Product p : products) {

            double tax = 0;

            if (p instanceof Taxable) {
                tax = ((Taxable) p).calculateTax();
                System.out.println(((Taxable) p).getTaxDetails());
            }

            double discount = p.calculateDiscount();
            double finalPrice = p.getPrice() + tax - discount;

            System.out.println("\nProduct: " + p.getName());
            System.out.println("Base Price: " + p.getPrice());
            System.out.println("Discount: " + discount);
            System.out.println("Tax: " + tax);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("------------------------");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Product> products = new ArrayList<>();

        System.out.print("Enter number of products: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {

            System.out.println("\nProduct " + i);
            System.out.print("Enter Product ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Product Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Type (1-Electronics, 2-Clothing, 3-Groceries): ");
            int type = sc.nextInt();

            Product p;

            if (type == 1) {
                p = new Electronics(id, name, price);
            } else if (type == 2) {
                p = new Clothing(id, name, price);
            } else {
                p = new Groceries(id, name, price);
            }

            products.add(p);
        }

        printFinalPrice(products);
        sc.close();
    }
}
