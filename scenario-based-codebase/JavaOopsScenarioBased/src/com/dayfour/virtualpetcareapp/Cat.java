package com.dayfour.virtualpetcareapp;

public class Cat extends Pet  {

	 public Cat(String name, int age) {
	        super(name, "Cat", age);
	    }

	    @Override
	    public void feed() {
	        decreaseHunger(20);
	        increaseMood(10);
	        System.out.println(name + " enjoyed the food..");
	    }

	    @Override
	    public void play() {
	        decreaseEnergy(20);
	        increaseMood(20);
	        increaseHunger(10);
	        System.out.println(name + " is playing happily..");
	    }

	    @Override
	    public void sleep() {
	        increaseEnergy(30);
	        System.out.println(name + " is sleeping peacefully..");
	    }

	    @Override
	    public void makeSound() {
	        System.out.println(" Meow - Meow!");
	    }
}
