package com.encapsulationpolymorphism.onlinefooddeliverysystem;

public class NonVegItem extends FoodItem implements Discountable {
	
	public NonVegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Extra charge for non-veg items
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + 100;
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.05; // 5% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: 5%";
    }

}
