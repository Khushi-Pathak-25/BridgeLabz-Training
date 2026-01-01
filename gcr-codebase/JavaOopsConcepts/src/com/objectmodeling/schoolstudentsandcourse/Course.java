package com.objectmodeling.schoolstudentsandcourse;

import java.util.ArrayList;

public class Course {

	String courseName;
	ArrayList<Student> students;

	// Constructor to initialize course
	public Course(String courseName) {
		this.courseName = courseName;
		students = new ArrayList<>();
	}

	// Method to add student to course
	public void addStudent(Student student) {
		students.add(student);
	}

	// Method to display enrolled students
	public void showStudents() {
		System.out.println("\nCourse: " + courseName);

		// Loop to display students in this course
		for (Student student : students) {
			System.out.println("Student: " + student.studentName);
		}
	}
}