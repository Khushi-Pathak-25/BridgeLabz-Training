package com.daynine.birdsanctuary;

public class Eagle extends Bird implements Flyable {

    public Eagle(String name, String id) {
        super(name, "Eagle", id);
    }

    public void fly() {
        System.out.println("Eagle is flying.");
    }
}
