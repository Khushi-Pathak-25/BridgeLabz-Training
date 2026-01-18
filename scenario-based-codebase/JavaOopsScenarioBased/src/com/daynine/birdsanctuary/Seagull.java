package com.daynine.birdsanctuary;

public class Seagull extends Bird implements Flyable, Swimmable {

    public Seagull(String name, String id) {
        super(name, "Seagull", id);
    }

    public void fly() {
        System.out.println("Seagull is flying over the sea.");
    }

    public void swim() {
        System.out.println("Seagull is swimming on water.");
    }
}
