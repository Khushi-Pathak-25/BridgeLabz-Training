package com.designprinciples.librarycasestudy;

public class Faculty implements User {
	// encapsulated attribute
	private String name;

	// constructor
	public Faculty(String name) {
		this.name = name;
	}

	@Override
	public void showRole() {
		System.out.println(name + " is a Faculty.");
	}

	@Override
	public void update(String msg) {
		System.out.println(name + " notified: " + msg);
	}
}
