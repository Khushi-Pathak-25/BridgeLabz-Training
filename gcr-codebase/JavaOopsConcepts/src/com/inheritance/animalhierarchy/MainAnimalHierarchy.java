/*Animal Hierarchy
Description: Create a hierarchy where Animal is the superclass, 
and Dog, Cat, and Bird are subclasses. Each subclass has a unique behavior.
Tasks:
Define a superclass Animal with attributes name and age, and a method makeSound().
Define subclasses Dog, Cat, and Bird, each with a unique implementation of makeSound().
Goal: Learn basic inheritance, method overriding, and polymorphism with simple classes.
*/

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
