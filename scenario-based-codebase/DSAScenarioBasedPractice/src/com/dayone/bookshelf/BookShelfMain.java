/*1. BookShelf – Library Organizer (HashMap + Linked List)
Story: In a library system, books are arranged based on genre and author. 
A HashMap maps genre → list of books (LinkedList). Each list is dynamically updated 
when books are borrowed or returned.
Requirements:
● Maintain genre-wise catalog.
● Efficient insert, delete using LinkedList.
● Avoid duplication using HashSet (optional).*/

package com.dayone.bookshelf;

public class BookShelfMain {

	public static void main(String[]args) {
		
		Library library = new Library();
		
		library.addBook("Programming", new Book("Let Us C","Yashwant Kannetkar"));
		library.addBook("Novel", new Book("The Alcemist","Paulo Coelho"));
		library.addBook("History",new Book("Chanakya's Chant","Ashwin Sanghi "));
		
        library.displayGenre("Novel");
        library.removeBook("Novel","The Alcemist");
        System.out.println();
        System.out.println("After removing book: ");
        library.displayGenre("Novel");
        
	}
}
