package com.inheritance.animalhierarchy;

public class Bird extends Animal {
	 // Constructor to initialize bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overridden method with bird behavior
    @Override
    public void makeSound() {
        System.out.println(name + " says: Chirp Chirp");
    }
}
