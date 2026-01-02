package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Waiter extends Person implements Worker {

	// attribute
    private int numOfTable;

    // Constructor to initialize waiter details
    public Waiter(String name, int id, int numOfTable) {
        super(name, id);
        this.numOfTable = numOfTable;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
    	System.out.println("Name :"+name);
        System.out.println("Role : Waiter");
        System.out.println("Duties: Serving " + numOfTable + " tables");
    }
}
