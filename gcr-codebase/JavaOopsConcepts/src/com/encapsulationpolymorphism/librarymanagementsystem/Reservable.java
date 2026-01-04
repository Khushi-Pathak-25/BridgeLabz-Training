package com.encapsulationpolymorphism.librarymanagementsystem;

public interface Reservable {

	// abstract methods
	void reserveItem(String borrowerName);

    boolean checkAvailability();
}
