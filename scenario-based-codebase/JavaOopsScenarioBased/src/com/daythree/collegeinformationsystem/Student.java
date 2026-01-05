package com.daythree.collegeinformationsystem;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {
	
	 private double[] grades;   // private
	 private ArrayList<Course> courses = new ArrayList<>();

	// constructor
	public Student(int id, String name, String email,double[] grades) {
        super(id, name, email);
        this.grades = grades;
    }
	
	
	// calculate GPA
	public double calculateGPA() {
	    if (grades == null || grades.length == 0) {
	        return 0.0;
	    }

	    double sum = 0;
	    for (double g : grades) {
	        sum += g;
	    }
	    return sum / grades.length;
	}

	
	// enroll in course
	@Override
	public void enrollCourse(Course course){
		courses.add(course);
		course.addStudent(this);
	}
	// drop from course
	@Override
	public void dropCourse(Course course) {
		courses.remove(course);
		course.removeStudent(this);
	}
	 @Override
	    public void printDetails() {
	        System.out.println("Student ID: " + id);
	        System.out.println("Name: " + name);
	        System.out.println("Email: " + email);
	        System.out.println("GPA: " + calculateGPA());
	        System.out.println("-------------------------");
	    }
}

