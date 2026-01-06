package com.dayfour.eventmanagementplatform;

public class User {

	private String name;
	private String email; // sensitive data → encapsulated

	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	public String getName() {
		return name;
	}
}
