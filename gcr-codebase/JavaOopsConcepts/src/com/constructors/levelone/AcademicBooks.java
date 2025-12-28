package com.constructors.levelone;

public class AcademicBooks {
	
	// Public
    public String ISBN;

    // Protected
    protected String title;

    // Private
    private String author;

    // constructor
    public AcademicBooks(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    
    // Set and get the author name
    public void setName(String author) {
    	this.author= author;
    }

    public String getName() {
    	return author;
    }
    // display method
    public void displayBookDetails() {
        System.out.println("ISBN : " + ISBN);
        System.out.println("Title : " + title);
        System.out.println("Author : " + author);
        System.out.println("--------------------------");
    }

}
