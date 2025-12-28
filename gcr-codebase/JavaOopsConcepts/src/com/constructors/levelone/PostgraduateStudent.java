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

    // main 
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(111, "Ringo", 9.5);

        pg.displayStudent();
        pg.displayPostgraduate();

        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }
	}

