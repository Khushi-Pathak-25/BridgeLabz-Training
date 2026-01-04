/*6. Online Food Delivery System
Description: Create an online food delivery system:
Define an abstract class FoodItem with fields like itemName, price, and quantity.
Add abstract methods calculateTotalPrice() and concrete methods like getItemDetails().
Extend it into classes VegItem and NonVegItem, overriding calculateTotalPrice() 
to include additional charges (e.g., for non-veg items).
Use an interface Discountable with methods applyDiscount() and getDiscountDetails().
Demonstrate encapsulation to restrict modifications to order details and use polymorphism 
to handle different types of food items in a single order-processing method.*/

package com.encapsulationpolymorphism.onlinefooddeliverysystem;

import java.util.*;

public class MainOnlineFoodDeliverySystem {
	
    // Polymorphic order processing method
    public static void processOrder(List<FoodItem> order) {

        double grandTotal = 0;

        for (FoodItem item : order) {

            item.getItemDetails();

            double total = item.calculateTotalPrice();
            double discount = 0;

            if (item instanceof Discountable) {
                Discountable d = (Discountable) item;
                discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
            }

            double finalPrice = total - discount;
            grandTotal += finalPrice;

            System.out.println("Total Price: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Final Price: " + finalPrice);
            System.out.println("---------------------------");
        }

        System.out.println("Grand Total Amount: " + grandTotal);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<FoodItem> order = new ArrayList<>();

        System.out.print("Enter number of food items: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nFood Item " + i);
            sc.nextLine();

            System.out.print("Enter Item Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Price: ");
            double price = sc.nextDouble();

            System.out.print("Enter Quantity: ");
            int qty = sc.nextInt();

            System.out.print("Item Type (1-Veg, 2-NonVeg): ");
            int type = sc.nextInt();

            FoodItem item;

            if (type == 1) {
                item = new VegItem(name, price, qty);
            } else {
                item = new NonVegItem(name, price, qty);
            }

            order.add(item);
        }

        processOrder(order);
        sc.close();
    }

}
