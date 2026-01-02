package com.inheritance.multilevelinheritance.onlineretail;

public class ShippedOrder extends Order {

	// attribute
    protected String trackingNumber;

    // Constructor to initialize shipped order details
    public ShippedOrder(int orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method to reflect shipped status
    @Override
    public String getOrderStatus() {
        return "Order Shipped (Tracking No: " + trackingNumber + ")";
    }
}
