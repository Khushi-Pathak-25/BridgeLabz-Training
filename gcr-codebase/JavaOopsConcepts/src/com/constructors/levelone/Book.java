package com.constructors.levelone;

public class Book {

	//  attributes
	String title;
	String author;
	double price;
	
	//  default constructor
	Book(){
		title = "XYZ";
		author = "Sam";
		price = 200.0;		
	}
	
	
	// parameterized constructor
    Book (String title, String author, double price){
    	this.title = title;
    	this.author= author;
    	this.price = price;
    }
    
    // display result
    public void display() {
 	   System.out.println("title: " + title);
 	   System.out.println("author: " + author);
 	   System.out.println("price: " + price);
 	   System.out.println();
 	}
    
}
