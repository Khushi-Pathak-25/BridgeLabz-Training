package com.dayfive.bookbazaar;

public abstract class Book implements IDiscountable {
	
	// title, author, price, stock
	protected String title;
	protected String author;
	protected double price;
	private double stock;
	
	public Book(String title, String author, double price, double stock) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	// constructor with offer price
	public Book(String title, String author, double price, double stock, double offerPrice) {
		this(title, author, offerPrice, stock);
	}
	
     public double getStock() {
		return stock;
	 }
     
     // updated stock only via method
     public boolean reduceStock(int quantity) {
    	 if(quantity <= stock ) {
    		stock -= quantity;
    		return true;
    	 }
    	 return false;
     }
     
     // Default discount (no discount)
     public double applyDiscount(double price, int quantity ) {
    	 return price * quantity;
     }
}
