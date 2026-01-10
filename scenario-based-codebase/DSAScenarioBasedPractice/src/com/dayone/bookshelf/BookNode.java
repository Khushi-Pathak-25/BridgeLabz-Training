package com.dayone.bookshelf;

public class BookNode {
	
	Book book;
	BookNode next;

	public BookNode(Book book) {	
		this.book = book;
		this.next = null;
	}
}
