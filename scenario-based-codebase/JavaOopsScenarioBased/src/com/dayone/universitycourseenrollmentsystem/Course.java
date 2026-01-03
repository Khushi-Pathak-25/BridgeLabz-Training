package com.dayone.universitycourseenrollmentsystem;

public class Course {

	// attribute of course class
    private String courseCode;
    private String courseName;
    
    // constructor for assigning value 
    public Course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }
    
    // show course 
    public void showCourse() {
        System.out.println("Course Code : " + courseCode);
        System.out.println("Course Name : " + courseName);
    }
}
