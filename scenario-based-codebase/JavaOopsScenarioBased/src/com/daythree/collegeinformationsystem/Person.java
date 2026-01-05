package com.daythree.collegeinformationsystem;

public abstract class Person {

	// name, email, id
	protected String name;
	protected String email;
	protected int id;
	
	public Person( int id,String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}
	
    public abstract void printDetails();
}
