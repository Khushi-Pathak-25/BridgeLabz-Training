package com.dayone.bookshelf;

import java.util.HashMap;
public class Library {
	
	HashMap<String,BookLinkedList> catalog = new HashMap<>();
	
	// add book
	public void addBook(String genre, Book book) {
		
		// check if genre already exists and if not then it creates an empty linked list
		catalog.putIfAbsent(genre, new BookLinkedList());
		
		if(!catalog.containsKey(genre)) {
			catalog.put(genre, new BookLinkedList());
		}
		// gives the linked list for that genre and then insert book into linked list
		catalog.get(genre).addBook(book);
	}
	
	// remove book
	public void removeBook(String genre, String name) {
		
		if(catalog.containsKey(genre)) {
			catalog.get(genre).removeBook(name);
		}	
		
	}
	
	// display Genre
	public void displayGenre(String genre) {
		if(! catalog.containsKey(genre) || catalog.get(genre).isEmpty() ) {
			System.out.println("No book in this genre.");
		}
		
		System.out.println("Genre :"+genre);
		catalog.get(genre).displayBook();
		
	}
	

}
