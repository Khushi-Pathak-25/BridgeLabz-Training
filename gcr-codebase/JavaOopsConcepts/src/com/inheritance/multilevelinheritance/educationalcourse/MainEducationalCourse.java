/* Educational Course Hierarchy
Description: Model a course system where Course is the base class, 
OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system. */

package com.inheritance.multilevelinheritance.educationalcourse;

public class MainEducationalCourse {

    public static void main(String[] args) {

        // Multilevel inheritance demonstration
        Course course1 = new Course("Java Basics", 50);
        Course course2 = new OnlineCourse("Advanced Java", 70 , "YouTube", true);
        Course course3 = new PaidOnlineCourse("Spring Boot", 100, "Udemy", true, 10000, 10);

        // calling methods 
        course1.displayCourseDetails();
        System.out.println("----------------------");

        course2.displayCourseDetails();
        System.out.println("----------------------");

        course3.displayCourseDetails();
    }
}