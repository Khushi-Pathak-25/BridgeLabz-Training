package com.encapsulationpolymorphism.ecommerceplatform;

class Clothing extends Product implements Taxable {

	// constructor
    public Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * 0.20; // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.12; // 12% GST
    }

    @Override
    public String getTaxDetails() {
        return "Clothing GST: 12%";
    }
}
