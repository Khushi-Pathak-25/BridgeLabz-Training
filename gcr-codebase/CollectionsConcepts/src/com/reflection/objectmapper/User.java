package com.reflection.objectmapper;

public class User {
    private String name;
    private int age;

    // Default constructor required for reflection
    // public User() {}

    public String getName() {
	return name;
    }

    public int getAge() {
	return age;
    }
}