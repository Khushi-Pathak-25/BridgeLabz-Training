package com.constructors.levelone;

public class StudentMain {
	
	// main  method 
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent(111, "Ringo", 9.5);

        pg.displayStudent();
        pg.displayPostgraduate();

        pg.setCGPA(9.0);
        System.out.println("Updated CGPA: " + pg.getCGPA());
    }

}
