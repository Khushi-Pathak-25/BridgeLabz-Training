package com.inheritance.animalhierarchy;

public class Animal {

	// attributes name and age
	String name ;
	int age;
	
	// Constructor to initialize animal details
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
	
	// method to be overridden by subclasses
	public void makeSound() {
		 System.out.println("Animal makes a sound");
	}
}
