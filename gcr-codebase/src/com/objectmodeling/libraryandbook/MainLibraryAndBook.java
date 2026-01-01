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
