package com.generics.smartwarehouse;

public class Groceries extends WarehouseItem {

    public Groceries(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Grocery Item: " + getName() + ", Price: " + getPrice());
    }
}

