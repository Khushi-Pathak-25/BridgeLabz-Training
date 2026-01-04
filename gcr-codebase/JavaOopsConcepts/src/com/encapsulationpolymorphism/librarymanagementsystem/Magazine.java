package com.encapsulationpolymorphism.librarymanagementsystem;

public class Magazine extends LibraryItem implements Reservable{

	 private String borrowerName;

	    public Magazine(int id, String title, String author) {
	        super(id, title, author);
	    }

	    @Override
	    public int getLoanDuration() {
	        return 7; // 7 days
	    }

	    @Override
	    public void reserveItem(String borrowerName) {
	        if (isAvailable()) {
	            this.borrowerName = borrowerName;
	            setAvailable(false);
	            System.out.println("Magazine reserved successfully.");
	        } else {
	            System.out.println("Magazine is not available.");
	        }
	    }

	    @Override
	    public boolean checkAvailability() {
	        return isAvailable();
	    }
}
