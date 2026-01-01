/*Problem 1: School and Students with Courses (Association and Aggregation)
Description: Model a School with multiple Student objects, 
where each student can enroll in multiple courses, 
and each course can have multiple students.
Tasks:
Define School, Student, and Course classes.
Model an association between Student and Course to show that 
students can enroll in multiple courses.
Model an aggregation relationship between School and Student.
Demonstrate how a student can view the courses they are enrolled in and 
how a course can show its enrolled students.
Goal: Practice association by modeling many-to-many relationships 
between students and courses.
*/

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