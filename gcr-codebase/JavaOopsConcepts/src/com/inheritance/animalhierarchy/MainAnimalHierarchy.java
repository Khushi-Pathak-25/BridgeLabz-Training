package com.inheritance.animalhierarchy;

public class MainAnimalHierarchy {

	 public static void main(String[] args) {

	        // Polymorphism - parent reference holding child class objects
	        Animal animal1 = new Dog("Tommy", 5);
	        Animal animal2 = new Cat("Nonchi", 3);
	        Animal animal3 = new Bird("Beauty", 1);

	        animal1.makeSound();
	        animal2.makeSound();
	        animal3.makeSound();
	}
}
