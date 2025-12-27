package com.constructors.levelone;
import java.util.Scanner;

public class LibraryBook {
	
	// attributes -  title, author, price, and availability.
	String title;
	String author;
	double price;
	boolean availability;
	
	// parameterized constructor
	public LibraryBook(String title,String author,double price){
		this.title = title;
		this.author =author;
		this.price = price;
		this.availability = true;
	}
	
	// method to borrow a book
	public void borrowBook() {
		
	    	if (availability) {
	            availability = false;
	            System.out.println("Book borrowed successfully");
	        } 
	    	else {
	            System.out.println("Book not available");
	        }
	 }
	
	 public void display() {
	        System.out.println("{ title:" + title + ", author:" + author + ", price:" + price + ", available:" + availability + " }");
	 }
	    
	 // main
	 public static void main(String[] args) {
	     Scanner input = new Scanner(System.in);
	     System.out.print("Enter book title: ");
	     String title = input.nextLine();
	     System.out.print("Enter book author: ");
	     String author = input.nextLine();
	     System.out.print("Enter book price: ");
	     double price = input.nextDouble();
	    	
	     LibraryBook book = new LibraryBook(title, author, price);
	     book.display();
	     book.borrowBook(); //borrowed
	     book.display();
	     book.borrowBook(); //unavailable
	    
	     input.close();
	}

}
