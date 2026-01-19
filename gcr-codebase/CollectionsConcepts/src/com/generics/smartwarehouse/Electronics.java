package com.generics.smartwarehouse;

public class Electronics extends WarehouseItem {

    public Electronics(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Electronics: " + getName() + ", Price: " + getPrice());
    }
}
