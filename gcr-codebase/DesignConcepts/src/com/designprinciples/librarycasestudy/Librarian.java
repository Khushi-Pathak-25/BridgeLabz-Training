package com.designprinciples.librarycasestudy;

public class Librarian implements User {
	// encapsulated attribute
	private String name;

	// constructor
	public Librarian(String name) {
		this.name = name;
	}

	@Override
	public void showRole() {
		System.out.println(name + " is a Librarian.");
	}

	@Override
	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}