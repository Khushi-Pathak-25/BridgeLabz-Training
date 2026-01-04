package com.encapsulationpolymorphism.librarymanagementsystem;

public class DVD extends LibraryItem implements Reservable{
	
	private String borrowerName;

    public DVD(int id, String title, String author) {
        super(id, title, author);
    }

    @Override
    public int getLoanDuration() {
        return 3; // 3 days
    }

    @Override
    public void reserveItem(String borrowerName) {
        if (isAvailable()) {
            this.borrowerName = borrowerName;
            setAvailable(false);
            System.out.println("DVD reserved successfully.");
        } else {
            System.out.println("DVD already issued.");
        }
    }

    @Override
    public boolean checkAvailability() {
        return isAvailable();
    }

}
