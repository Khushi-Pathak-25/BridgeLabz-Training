package com.daynine.birdsanctuary;

public class Duck extends Bird implements Flyable, Swimmable {

    public Duck(String name, String id) {
        super(name, "Duck", id);
    }

    public void fly() {
        System.out.println("Duck is flying.");
    }

    public void swim() {
        System.out.println("Duck is swimming.");
    }
}

