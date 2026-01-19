package com.generics.smartwarehouse;

public class Furniture extends WarehouseItem {

    public Furniture(String name, double price) {
        super(name, price);
    }

    @Override
    public void displayDetails() {
        System.out.println("Furniture: " + getName() + ", Price: " + getPrice());
    }
}

