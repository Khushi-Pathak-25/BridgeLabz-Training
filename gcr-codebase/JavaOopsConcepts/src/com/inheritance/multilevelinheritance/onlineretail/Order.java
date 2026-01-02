package com.inheritance.multilevelinheritance.onlineretail;

public class Order {
    
	// attributes
    protected int orderId;
    protected String orderDate;

    // Constructor to initialize order details
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // method to get current order status
    public String getOrderStatus() {
        return "Order Placed";
    }
}