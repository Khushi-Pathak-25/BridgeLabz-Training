package com.constructors.levelone;

public class AcademicBooksMain {

	public static void main(String[] args) {
		 AcademicBooks b1 = new AcademicBooks("978-6307", "Let US C", "Yashwant");
	        b1.displayBookDetails();

	        // modifying private author using setter
	        b1.setName("Yashwant Kanetkar");
	        System.out.println("Updated Author : " + b1.getName());

	        EBook eb = new EBook(
	                "976-5991",
	                "Harry Potter",
	                "J.K. Rowling"
	                );
	        eb.displayEBookDetails();
	    }
	}
	