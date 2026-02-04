package com.designprinciples.librarycasestudy;

public class Student implements User {

	// encapsulated attribute
    private String name;

    // constructor
    public Student(String name) {
        this.name = name;
    }
 
    @Override
    public void showRole() {
        System.out.println(name + " is a Student.");
    }

    @Override
    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}

