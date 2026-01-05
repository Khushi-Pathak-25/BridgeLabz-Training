/*5. Doubly Linked List: Library Management System
Problem Statement: Design a library management system using a doubly linked list. 
Each node represents a book and contains the following attributes: Book Title, Author, Genre, Book ID, and 
Availability Status. Implement the following functionalities:
Add a new book at the beginning, end, or at a specific position.
Remove a book by Book ID.
Search for a book by Book Title or Author.
Update a book’s Availability Status.
Display all books in forward and reverse order.
Count the total number of books in the library.*/

package com.linkedlists.doubly.librarymanagementsystem;;

public class MainLibraryManagementSystem {

    public static void main(String[] args) {

        LibraryDoublyLinkedList library = new LibraryDoublyLinkedList();

        library.addFirst(111, "Basic Java", "James Gosling","Programming", true);
        library.addLast(112, "Let Us C", "Yashwant Kannetkar", "Programming", true);
        library.addLast(113, "Harry Potter", "J.K. Rowling", "Fantasy", false);

        library.addAtPosition(1, 114, "The Alchemist","Paulo Coelho", "Fantasy", true);

        System.out.println("Library (Forward):");
        library.displayForward();

        System.out.println("Library (Reverse):");
        library.displayReverse();

        System.out.println("Search by Author: J.K. Rowling");
        library.searchByAuthor("J.K. Rowling");

        System.out.println("Update Availability (Book ID 113):");
        library.updateAvailability(113, true);

        System.out.println("Remove Book ID 112:");
        library.removeByBookId(112);

        System.out.println("Final Library:");
        library.displayForward();

        System.out.println("Total Books: " + library.getTotalBooks());
    }
}
