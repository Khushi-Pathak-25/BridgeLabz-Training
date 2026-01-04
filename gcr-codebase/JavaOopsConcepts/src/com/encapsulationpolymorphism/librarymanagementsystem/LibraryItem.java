package com.encapsulationpolymorphism.librarymanagementsystem;

public abstract class LibraryItem {
	
    // Encapsulation: private fields
    private int itemId;
    private String title;
    private String author;
    private boolean available = true;

    // Constructor
    public LibraryItem(int itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getters (no direct access)
    public int getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    protected boolean isAvailable() {
        return available;
    }

    protected void setAvailable(boolean status) {
        this.available = status;
    }

    // Abstract method
    public abstract int getLoanDuration();

    // Concrete method
    public void getItemDetails() {
        System.out.println("\nItem ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Loan Duration: " + getLoanDuration() + " days");
    }

}
