package com.daynine.birdsanctuary;

public class Bird {

    private String name;
    private String species;
    private String id;

    public Bird(String name, String species, String id) {
        this.name = name;
        this.species = species;
        this.id = id;
    }

    public void eat() {
        System.out.println(name + " is eating.");
    }

    public String getId() {
        return id;
    }

    public String getInfo() {
        return "ID: " + id + ", Name: " + name + ", Species: " + species;
    }
}

