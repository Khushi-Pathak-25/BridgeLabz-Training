package com.daythree.collegeinformationsystem;

import java.util.ArrayList;

public class Course {
	
	private String courseName;
	private Faculty faculty;
	private ArrayList<Student> students = new ArrayList<>();
	
	public Course(String courseName, Faculty faculty) {
		this.courseName = courseName;
		this.faculty = faculty;
	}
    
	// add student to course
	public void addStudent(Student student) {
		students.add(student);
	}
	
	// remove student from course
	public void removeStudent(Student student) {
		students.remove(student);
	}
	
	public void displayStudents() {
        System.out.println("\n===== STUDENT DETAILS =====");
        for (Student s : students) {
            s.printDetails(); // Polymorphism
        }
    }
}
