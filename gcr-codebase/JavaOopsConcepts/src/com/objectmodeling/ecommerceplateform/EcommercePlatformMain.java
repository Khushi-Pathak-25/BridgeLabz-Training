package com.objectmodeling.ecommerceplateform;

public class EcommercePlatformMain {
	
	 public static void main(String[] args) {

	        // Products (independent objects)
	        Product p1 = new Product("Laptop", 60000);
	        Product p2 = new Product("Mouse", 1000);
	        Product p3 = new Product("Keyboard", 2000);

	        // Order
	        Order order1 = new Order(111);
	        order1.addProduct(p1);
	        order1.addProduct(p2);
	        order1.addProduct(p3);

	        // Customer
	        Customer customer = new Customer("Khushi");

	        // Communication
	        customer.placeOrder(order1);
	 }

}
