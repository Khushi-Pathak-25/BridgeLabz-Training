package com.dayeleven.addressbookapp;

public class Contact {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private Address address;

	// constructor
	public Contact(String firstName, String lastName, String phoneNumber, String email, Address address) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.address = address;
	}

	// getters and setters
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	// full name for sorting and searching
	public String getFullName() {
		return (firstName + " " + lastName).toLowerCase();
	}

	// good string representation
	@Override
	public String toString() {
		String displayName = capitalizeWords(firstName + " " + lastName);

		return String.format("%-20s | %-15s | %-25s | %s", displayName, phoneNumber, email,
				address != null ? address : "No address provided");
	}

	// Helper method to capitalize each word
	private String capitalizeWords(String name) {
		if (name == null || name.isEmpty()) {
			return "";
		}
		
		String[] words = name.split("\\s+");
		StringBuilder result = new StringBuilder();
		
		for (String word : words) {
			if (!word.isEmpty()) {
				result.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1).toLowerCase())
						.append(" ");
			}
		}

		// Remove trailing space
		return result.toString().trim();
	}

	// check if two contacts are the same (same first + last name)
	public boolean isSamePerson(Contact other) {
		if (other == null)
			return false;
		return this.firstName.equalsIgnoreCase(other.firstName) && this.lastName.equalsIgnoreCase(other.lastName);
	}
}