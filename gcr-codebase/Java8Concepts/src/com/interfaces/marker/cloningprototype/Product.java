package com.interfaces.marker.cloningprototype;

public class Product implements Prototype {
    private String productId;
    private String name;
    private double price;
    private String category;

    // constructor
    public Product(String productId, String name, double price, String category) {
	this.productId = productId;
	this.setName(name);
	this.setPrice(price);
	this.setCategory(category);
    }

    // copy constructor (used in clone for deep copy)
    public Product(Product other) {
	this.productId = other.productId;
	this.setName(other.getName());
	this.setPrice(other.getPrice());
	this.setCategory(other.getCategory());
    }

    @Override
    public Product clone() throws CloneNotSupportedException {
	// calls Object.clone() and casts safely
	return (Product) super.clone();
	// Note: This is shallow clone. For deep clone,
	// use copy constructor or manual field copy
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getPrice() {
	return price;
    }

    public void setPrice(double price) {
	this.price = price;
    }
    
    public String getCategory() {
	return category;
    }

    public void setCategory(String category) {
	this.category = category;
    }
    
    // good string representation
    @Override
    public String toString() {
	return "Product[ID=" + productId + ", Name=" + getName() + ", Price=Rs." + getPrice() + ", Category=" + getCategory() + "]";
    }

}