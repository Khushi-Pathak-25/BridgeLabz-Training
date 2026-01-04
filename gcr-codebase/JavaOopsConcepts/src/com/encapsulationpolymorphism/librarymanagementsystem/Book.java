package com.encapsulationpolymorphism.librarymanagementsystem;

public class Book extends LibraryItem implements Reservable{
	
	// Encapsulation: borrower data is private
    private String borrowerName;

    public Book(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 14; // 14 days for books
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            this.borrowerName = borrowerName;
            setAvailable(false);
            System.out.println("Book reserved successfully.");
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }

}
