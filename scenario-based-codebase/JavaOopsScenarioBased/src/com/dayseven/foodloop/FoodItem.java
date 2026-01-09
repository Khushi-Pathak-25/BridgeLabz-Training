package com.dayseven.foodloop;

public abstract class FoodItem {

    private String name;
    private String category;
    private double price;
    private int stock; // hidden stock level

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    public void reduceStock() {
        if (stock > 0) stock--;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
