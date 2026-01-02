package com.inheritance.animalhierarchy;

public class Cat extends Animal{

	// Constructor to initialize cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overridden method with cat behavior
    @Override
    public void makeSound() {
        System.out.println(name + " says: Meow Meow");
    }
}
