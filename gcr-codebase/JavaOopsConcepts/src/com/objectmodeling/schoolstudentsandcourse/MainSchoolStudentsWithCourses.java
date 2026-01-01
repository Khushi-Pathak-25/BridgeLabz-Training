package com.objectmodeling.schoolstudentsandcourse;

import java.util.Scanner;

public class MainSchoolStudentsWithCourses {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter school name: ");
		String schoolName = input.nextLine();
		School school = new School(schoolName);

		System.out.print("Enter student name: ");
		String studentName = input.nextLine();
		Student student = new Student(studentName);

		school.addStudent(student);

		System.out.print("Enter first course name: ");
		Course course1 = new Course(input.nextLine());

		System.out.print("Enter second course name: ");
		Course course2 = new Course(input.nextLine());

		// Enrolling student into multiple courses
		student.enrollCourse(course1);
		student.enrollCourse(course2);

		school.showStudents();
		student.viewCourses();
		course1.showStudents();
		course2.showStudents();

		input.close();
		
		}
	}