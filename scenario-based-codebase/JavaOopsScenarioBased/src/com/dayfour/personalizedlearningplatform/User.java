package com.dayfour.personalizedlearningplatform;

public class User {

	// name, email, userId
	protected String userId;
	protected String name;
	protected String email;
	
	// constructor
	public User(String userId, String name, String email) {
		this.userId = userId;
		this.name = name;
		this.email = email;
	}

	public void displayUser() {
		System.out.println(userId +" | " +name +" | "+email);
		System.out.println("---------------------------------------");
	}
}
