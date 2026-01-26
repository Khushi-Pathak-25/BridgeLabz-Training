package com.annotations.overridecorrectly;

public class Dog extends Animal {
    // Overriding parent method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}