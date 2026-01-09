/*20. "FoodLoop – Restaurant Ordering System"
Story: FoodLoop is an app where users place food orders from local restaurants.
Requirements:
● FoodItem class: name, category, price, availability.
● Order class: contains list of food items and total.
● Interface IOrderable with placeOrder() and cancelOrder().
● Use constructors to create custom combo meals.
● Operators: total price = sum of item prices – discounts.
● Encapsulation: keep item stock levels hidden.
● Inheritance: VegItem, NonVegItem extend FoodItem.
● Polymorphism: applyDiscount() varies by order total.*/

package com.dayseven.foodloop;

import java.util.Scanner;

public class FoodLoopRestaurantOrderingSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User wallet
        System.out.print("Enter your wallet balance: ");
        double userBalance = sc.nextDouble();

        // Create food items
        FoodItem vegBurger = new VegItem("Veg Burger", 120, 5);
        FoodItem paneer = new VegItem("Paneer Roll", 180, 3);
        FoodItem chicken = new NonVegItem("Chicken Biryani", 250, 4);

        Order order = new Order();

        int choice;
        do {
            System.out.println("\n----- Food Menu -----");
            System.out.println("1. Veg Burger (₹120)");
            System.out.println("2. Paneer Roll (₹180)");
            System.out.println("3. Chicken Biryani (₹250)");
            System.out.println("4. Place Order");
            System.out.println("5. Cancel Order");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    order.addFoodItem(vegBurger);
                    break;

                case 2:
                    order.addFoodItem(paneer);
                    break;

                case 3:
                    order.addFoodItem(chicken);
                    break;

                case 4:
                    order.placeOrder(userBalance);
                    break;

                case 5:
                    order.cancelOrder();
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4 && choice != 5);

        sc.close();
    }
}
