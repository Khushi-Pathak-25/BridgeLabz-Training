package com.linkedlists.doubly.librarymanagementsystem;

public class BookNode {

	//  Book Title, Author, Genre, Book ID, and Availability Status.
	int bookId;
    String title;
    String author;
    String genre;
    boolean isAvailable;

    BookNode next;
    BookNode prev;

    // Constructor to initialize book node
    BookNode(int bookId, String title, String author, String genre, boolean isAvailable) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
	
}
