package com.inheritance.multilevelinheritance.onlineretail;

public class DeliveredOrder extends ShippedOrder {

	// attribute
    private String deliveryDate;

    // Constructor to initialize delivered order details
    public DeliveredOrder(int orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method to reflect delivered status
    @Override
    public String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}