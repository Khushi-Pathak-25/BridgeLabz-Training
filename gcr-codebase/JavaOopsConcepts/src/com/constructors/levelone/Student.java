package com.constructors.levelone;

public class Student {
	
	public int 	rollNumber ;
	protected String name;
	private double CGPA;
	
	// constructor
	 public Student(int rollNumber, String name, double CGPA) {
	     this.rollNumber = rollNumber;
	     this.name = name;
	     this.CGPA = CGPA;
	 }
	
	// public getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // public setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    // display method
    public void displayStudent() {
        System.out.println("Roll Number : " + rollNumber);
        System.out.println("Name : " + name);
        System.out.println("CGPA : " + CGPA);
        System.out.println("--------------------------------");
    }     

}
