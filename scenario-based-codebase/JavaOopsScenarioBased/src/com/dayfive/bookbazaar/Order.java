package com.dayfive.bookbazaar;

import java.util.*;

public class Order {

	protected String userName;
	protected Book book;
	protected int quantity;
	
	private String orderStatus;

	public Order(String userName, Book book, int quantity, String orderStatus) {
		this.userName = userName;
		this.book = book;
		this.quantity = quantity;
		this.orderStatus = orderStatus;
	}
	
    // Only internal method can update status
    protected void updateStatus(String status) {
        this.orderStatus = status;
    }
    
    // calculate total price 
    public double calculateTotal() {
        return book.applyDiscount(book.price, quantity);
    }

    public void confirmOrder() {
        if (book.reduceStock(quantity)) {
            updateStatus("CONFIRMED");
            System.out.println("Order Confirmed!");
        } 
        else {
            updateStatus("FAILED");
            System.out.println("Insufficient Stock!");
        }
    }

    public void showOrderDetails() {
        System.out.println("\n--- Order Details ---");
        System.out.println("User: " + userName);
        System.out.println("Book: " + book.title);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Amount: rs." + calculateTotal());
        System.out.println("Order Status: " + orderStatus);
    }
}
	
