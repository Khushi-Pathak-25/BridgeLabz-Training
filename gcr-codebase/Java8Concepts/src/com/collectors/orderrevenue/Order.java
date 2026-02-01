package com.collectors.orderrevenue;

class Order {
	
    private String customerName;
    private double amount;

    // Constructor
    Order(String customerName, double amount) {
        this.customerName = customerName;
        this.amount = amount;
    }

    // Getter methods
    public String getCustomerName() {
        return customerName;
    }

    public double getAmount() {
        return amount;
    }
}