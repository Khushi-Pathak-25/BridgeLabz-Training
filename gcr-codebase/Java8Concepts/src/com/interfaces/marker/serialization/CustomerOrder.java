package com.interfaces.marker.serialization;

public class CustomerOrder implements Backupable {
    private static final long serialVersionUID = 1L;

    private String orderId;
    private String customerName;
    private double totalAmount;
    private String status;

    // constructor
    public CustomerOrder(String orderId, String customerName, double totalAmount, String status) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.status = status;
    }

    // good string representation
    @Override
    public String toString() {
        return "Order[ID=" + orderId + ", Customer=" + customerName +
                ", Amount=Rs." + totalAmount + ", Status=" + status + "]";
    }
}