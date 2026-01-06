package com.dayfour.virtualpetcareapp;

import java.util.Random;

abstract public class Pet implements IInteractable {

	// name, type, age
	protected String name;
	protected String type;
	protected int age;
	
	// encapsulated fields
	private int hunger; // 0 means no hungry and 100 means very hungry 
	private int mood;   // 0 means sad and 100 mean very happy 
	private int energy; // 0 means no energy and 100 means high energy
	
	public Pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
		
		// for mood and hunger generate number from 0 to 100
		Random random = new Random();
        hunger = random.nextInt(101);  
        mood = random.nextInt(101);
		energy = random.nextInt(101);
	}
	
	// getters for encapsulated fields
	public int getHunger() {
		return hunger;
	}
	
	public int getMood() {
		return mood;
	}
	
	public int getEnergy() {
		return energy;
	}
	
	 // controlled modifiers (operators concept)
    protected void increaseEnergy(int value) {
        energy = Math.min(100, energy+value);
    }

    protected void decreaseEnergy(int value) {
        energy = Math.max(0, energy-value);
    }

    protected void increaseMood(int value) {
        mood = Math.min(100, mood+value);
    }

    protected void decreaseHunger(int value) {
        hunger = Math.max(0, hunger-value);
    }

    protected void increaseHunger(int value) {
        hunger = Math.min(100, hunger+value);
    }

    // abstract method (polymorphism)
    public abstract void makeSound();

    // common status display
    public void showStatus() {
        System.out.println("Hunger: " + hunger);
        System.out.println("Energy: " + energy);
        System.out.println("Mood: " + mood);
    }
}