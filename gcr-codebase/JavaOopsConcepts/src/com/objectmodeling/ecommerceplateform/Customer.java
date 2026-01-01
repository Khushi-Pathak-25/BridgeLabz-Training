package com.objectmodeling.ecommerceplateform;

public class Customer {

	String customerName;

    Customer(String customerName) {
        this.customerName = customerName;
    }

    void placeOrder(Order order) {
        System.out.println(customerName + " placed an order.");
        order.showOrderDetails();
    }
}
