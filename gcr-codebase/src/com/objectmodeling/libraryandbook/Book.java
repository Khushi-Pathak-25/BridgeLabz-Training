package com.objectmodeling.libraryandbook;

public class Book {
    
	// attributes
     String title;
     String author;

    // Constructor to initialize book details
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Method to display book details
    public void displayBook() {
       System.out.println("Title  :"+title);
       System.out.println("Author :"+author);
        
    }
}