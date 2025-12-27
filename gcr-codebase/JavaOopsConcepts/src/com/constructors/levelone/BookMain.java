package com.constructors.levelone;

public class BookMain {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		book1.display();
		
		Book book2 = new Book("Chemistry", "ABC", 500);
		book2.display();
	}

}
