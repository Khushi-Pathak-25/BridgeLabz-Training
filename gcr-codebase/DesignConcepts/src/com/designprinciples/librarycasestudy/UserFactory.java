package com.designprinciples.librarycasestudy;

public class UserFactory {
	public static User createUser(String type, String name) {
		switch (type.toLowerCase()) {
		case "student":
			return new Student(name);
		case "faculty":
			return new Faculty(name);
		case "librarian":
			return new Librarian(name);
		default:
			throw new IllegalArgumentException("Unknown type");
		}
	}

}
