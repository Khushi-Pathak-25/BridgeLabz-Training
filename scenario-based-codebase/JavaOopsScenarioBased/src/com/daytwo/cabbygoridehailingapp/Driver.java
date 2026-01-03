package com.daytwo.cabbygoridehailingapp;

public class Driver {
   
	// attributes name, licenseNumber, rating
	private String name ;
	private String licenseNumber;
	private double rating;
	
	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.licenseNumber = licenseNumber;
		this.rating = rating;
	}
	
	// use getters for name and rating
	public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }
	
	
    
    
}
