package com.constructors.levelone;

public class Product {
    
	// Instance Variables: productName, price.
	String productName;
	double price;
    // Class Variable: totalProducts
    static int totalProducts=0;
    
    // constructor
    Product (String productName, double price){
    	this.productName= productName;
    	this.price = price;
    	totalProducts++;
    }
    
    //  instance method 
    public void displayProductDetails() {
    	System.out.println("Product Name: " + productName);
		System.out.println("Product Price: " + price);
    }
    
    	
    
    // class method 
    public static void displayTotalProducts() {
    	System.out.println("Total Products: " + totalProducts);
    }
    
    public static void main(String[] args) {
		Product p1 = new Product("Laptop", 100000);
		Product p2 = new Product("Mobile", 50000);

		p1.displayProductDetails();
		p2.displayProductDetails();

		Product.displayTotalProducts();
	}
    
    
}
