package com.dayone.bookshelf;

public class BookLinkedList {

	// head pointer
	private BookNode head;
	
	// add book at last
	public void addBook(Book book) {
		BookNode newNode = new BookNode(book);
		if(head == null) {
			head = newNode;
			return;
		}
		BookNode temp = head;
		if(temp.next != null ) {
			temp = temp.next;
		}
		temp.next = newNode;
	}
	
	// remove book by name
	public void removeBook(String name) {
		if(head == null) {
			return;
		}
		
		if(head.book.name.equals(name)) {
			head = head.next;
			return;
		}
		
		BookNode temp = head;
		while(temp.next !=null && !temp.next.book.name.equals(name)) {
			temp = temp.next;
		}
		
		if(head != null) {
			temp.next = temp.next.next;
		}
	}
	
	// display book
	public void displayBook() {
	    BookNode temp = head;
	    while(temp != null ) {
	    	System.out.println("Title: "+temp.book.name +"| Author: "+temp.book.author);
	    	temp= temp.next;
	    }
	}
	
	// check for empty
	public boolean isEmpty() {
		return head == null;
	}
	
}
