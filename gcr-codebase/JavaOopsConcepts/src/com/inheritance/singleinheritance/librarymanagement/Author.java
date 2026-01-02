package com.inheritance.singleinheritance.librarymanagement;

public class Author extends Book {
    
	// attributes
    private String authorName;
    private String bio;

    // Constructor to initialize author and book details
    public Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    // Overridden method to display book and author details
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name      : " + authorName);
        System.out.println("Author Bio       : " + bio);
    }
}