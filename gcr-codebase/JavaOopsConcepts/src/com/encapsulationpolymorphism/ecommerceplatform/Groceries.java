package com.encapsulationpolymorphism.ecommerceplatform;

class Groceries extends Product {   
	
	// constructor 
    public Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.05; // 5% discount
    }
}
