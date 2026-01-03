package com.dayone.vehiclerentalapplication;

public class Customer {

    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void displayCustomer() {
        System.out.println("Customer ID   : " + customerId);
        System.out.println("Customer Name : " + name);
    }
}