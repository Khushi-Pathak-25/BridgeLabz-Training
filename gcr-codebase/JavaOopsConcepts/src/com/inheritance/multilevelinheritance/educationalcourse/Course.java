package com.inheritance.multilevelinheritance.educationalcourse;

public class Course {
    
	// attribures
    protected String courseName;
    protected int duration; // duration (in hours)

    // Constructor to initialize course details
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display course information
    public void displayCourseDetails() {
        System.out.println("Course Name : " + courseName);
        System.out.println("Duration    : " + duration + " hours");
    }
}