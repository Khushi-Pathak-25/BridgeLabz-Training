package com.encapsulationpolymorphism.ecommerceplatform;

class Electronics extends Product implements Taxable {

	// Constructor
    public Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.10; // 10% discount
    }

    @Override
    public double calculateTax() {
    	// 18% GST
        return getPrice() * 0.18; 
    }

    @Override
    public String getTaxDetails() {
        return "Electronics GST: 18%";
    }
}
