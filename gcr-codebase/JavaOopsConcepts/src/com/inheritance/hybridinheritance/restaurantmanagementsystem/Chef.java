package com.inheritance.hybridinheritance.restaurantmanagementsystem;

public class Chef extends Person implements Worker {

	// attribute
    private String specialization;

    // Constructor to initialize chef details
    public Chef(String name, int id, String specialization) {
        super(name, id);
        this.specialization = specialization;
    }

    // Implementation of interface method
    @Override
    public void performDuties() {
    	System.out.println("Name :"+name);
        System.out.println("Role : Chef");
        System.out.println("Duties: Cooking " + specialization + " dishes");
    }
}