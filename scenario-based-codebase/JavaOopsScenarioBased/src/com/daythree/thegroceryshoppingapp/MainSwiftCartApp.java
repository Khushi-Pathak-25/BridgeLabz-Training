/*9. "SwiftCart – The Grocery Shopping App"
Story: You're building SwiftCart, an online grocery platform where users add items to cart and
check out. The backend logic for cart management is your task.
Requirements:
● Product class: name, price, category.
● Cart class: holds a list of products and totalPrice.
● Constructors allow cart creation with or without pre-selected items.
● ICheckout interface with generateBill() and applyDiscount().
● Use encapsulation to protect price calculations.
● Operators for total: price * quantity, discount: totalPrice - coupon.
● Inheritance: different product types like PerishableProduct,
NonPerishableProduct.
● Use polymorphism in discount application (e.g., discount varies by product type).
● Apply access modifiers so only Cart can update prices.*/

package com.daythree.thegroceryshoppingapp;

import java.util.Scanner;

public class MainSwiftCartApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nProduct " + i);
            System.out.print("Enter product name: ");
            String name = sc.next();

            System.out.print("Enter price: ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();

            System.out.print("Enter type (1-Perishable, 2-NonPerishable): ");
            int type = sc.nextInt();

            Product product;

            if (type == 1) {
                product = new PerishableProduct(name, price);
            } else {
                product = new NonPerishableProduct(name, price);
            }

            cart.addProduct(product, quantity);
        }

        System.out.print("\nEnter coupon discount amount: ");
        double coupon = sc.nextDouble();

        cart.applyDiscount(coupon);
        cart.generateBill();

        sc.close();
    }
}
