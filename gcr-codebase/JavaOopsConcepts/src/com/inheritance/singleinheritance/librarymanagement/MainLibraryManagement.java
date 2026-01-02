package com.inheritance.singleinheritance.librarymanagement;

public class MainLibraryManagement {

    public static void main(String[] args) {

        // Single inheritance demonstration between book and author
        Book book = new Author( "Basic Java", 1991 , "James Gosling", "Developed Java");

        book.displayInfo();
    }
}