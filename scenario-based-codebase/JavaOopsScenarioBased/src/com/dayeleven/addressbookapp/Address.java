package com.dayeleven.addressbookapp;

public class Address {
	private String city;
	private String state;
	private String zip;

	// constructor
	public Address(String city, String state, String zip) {
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	// getters
	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	// good string format
	@Override
	public String toString() {
		if (city == null || city.isEmpty()) {
			return "No address provided";
		}
		return city + ", " + state + " - " + zip;
	}
}