package com.constructors.levelone;

public class EBook extends AcademicBooks {

	public EBook(String ISBN, String title, String author){
		super(ISBN, title, author);
	}
	
    // method to display the results
    public void displayEBookDetails() {
		System.out.println("ISBN: " + ISBN);
		System.out.println("Title: " + title);
		System.out.println("Author: " + getName());
	}
}

