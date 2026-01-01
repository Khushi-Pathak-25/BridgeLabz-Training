package com.objectmodeling.schoolstudentsandcourse;

import java.util.ArrayList;

public class Student {
        
	    // attributes
		String studentName;
		ArrayList<Course> courses;

		// Constructor to initialize student
		public Student(String studentName) {
			this.studentName = studentName;
			courses = new ArrayList<>();
		}

		// Method to enroll student into a course (association)
		public void enrollCourse(Course course) {
			courses.add(course);
			course.addStudent(this);
		}

		// Method to view enrolled courses
		public void viewCourses() {
			System.out.println("\nStudent Name: " + studentName);

			// Loop to display enrolled courses
			for (Course course : courses) {
				System.out.println("Course: " + course.courseName);
			}
	    }
}
