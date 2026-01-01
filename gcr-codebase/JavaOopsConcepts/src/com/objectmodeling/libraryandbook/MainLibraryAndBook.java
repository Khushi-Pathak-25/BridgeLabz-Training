/*Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. 
Model the relationship such that a library can have many books, 
but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects.*/


package com.objectmodeling.libraryandbook;

public class MainLibraryAndBook {

	public static void main(String []args) {
		
		Book book1 = new Book("Let US C","Yashwant Kannetkar");
		Book book2 = new Book("Basic JAVA","James Gosling");
		Book book3 = new Book("Half GirlFriend", "Chetan Bhagat");
		
		Library library1 = new Library("Central Library");
		Library library2 = new Library("College Library");
		
		library1.addBook(book1);
		library1.addBook(book2);
		
		library2.addBook(book2);// same book in both libraries
		library2.addBook(book3);
		
		library1.displayLibraryBooks();
		library2.displayLibraryBooks();	
		
	}
}
