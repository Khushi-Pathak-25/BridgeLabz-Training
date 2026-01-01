package com.objectmodeling.libraryandbook;

import java.util.ArrayList;

public class Library {

	// attributes
     String libraryName;
     ArrayList<Book> books;

    // Constructor to initialize library
    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    // method to add a book to the library
    public void addBook(Book book) {
        books.add(book); // aggregation
    }

    // method to display all books in the library
    public void displayLibraryBooks() {
    	System.out.println("---------------------------------");
        System.out.println("\nLibrary Name: " + libraryName);
        // iterate all books in the library
        for (Book book : books) {
            book.displayBook();
        }
        System.out.println("---------------------------------");
    }
}