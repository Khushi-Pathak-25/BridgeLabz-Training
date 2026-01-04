package com.encapsulationpolymorphism.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{
	
	public VegItem(String name, double price, int quantity) {
        super(name, price, quantity);
    }

    // Total price without extra charges
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    @Override
    public double applyDiscount() {
        return calculateTotalPrice() * 0.10; // 10% discount
    }

    @Override
    public String getDiscountDetails() {
        return "Veg Item Discount: 10%";
    }

}
