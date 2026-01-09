package com.dayseven.foodloop;

import java.util.*;

public class Order implements IOrderable {

    private List<FoodItem> items = new ArrayList<>();
    private double total;

    public void addFoodItem(FoodItem item) {
        if (item.isAvailable()) {
            items.add(item);
            item.reduceStock();
            total += item.getPrice();
            System.out.println(item.getName() + " added.");
        } else {
            System.out.println("Item not available.");
        }
    }

    // Polymorphism based on order total
    private double applyDiscount() {
        if (total >= 1000) return total * 0.2;
        if (total >= 500) return total * 0.1;
        return 0;
    }

    @Override
    public void placeOrder(double userBalance) {
        double discount = applyDiscount();
        double finalAmount = total - discount;

        if (userBalance >= finalAmount) {
            System.out.println("Order placed!");
            System.out.println("Total: " + total);
            System.out.println("Discount: " + discount);
            System.out.println("Payable: " + finalAmount);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void cancelOrder() {
        items.clear();
        total = 0;
        System.out.println("Order cancelled.");
    }
}
