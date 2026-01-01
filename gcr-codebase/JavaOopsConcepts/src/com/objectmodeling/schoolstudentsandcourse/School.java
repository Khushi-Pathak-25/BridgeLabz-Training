package com.objectmodeling.schoolstudentsandcourse;

import java.util.ArrayList;

public class School {

	String schoolName;
	ArrayList<Student> students;

	// Constructor to initialize school
	public School(String schoolName) {
		this.schoolName = schoolName;
		students = new ArrayList<>();
	}

	// Method to add student to school
	public void addStudent(Student student) {
		students.add(student); // aggregation
	}

	// Method to display all students in school
	public void showStudents() {
		System.out.println("\nSchool Name: " + schoolName);

		// Loop to display students
		for (Student student : students) {
			System.out.println("Student: " + student.studentName);
		}
	}
}