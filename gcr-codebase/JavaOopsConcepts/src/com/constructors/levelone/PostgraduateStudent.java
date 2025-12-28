package com.constructors.levelone;

public class PostgraduateStudent extends Student{

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double cgpa) {
        super(rollNumber, name, cgpa);
    }

    // Method to display the results
    public void displayPostgraduate() {
        System.out.println("Postgraduate Student Name: " + name);
    }

}

