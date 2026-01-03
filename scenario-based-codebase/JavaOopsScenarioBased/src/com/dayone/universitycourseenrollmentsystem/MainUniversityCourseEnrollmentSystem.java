/*3. University Course Enrollment System
Scenario: Students should be able to enroll in courses, and faculty can assign grades.
Concepts Used:
● Class: Student, Course, Faculty, Enrollment
● Constructors: Used to create students with/without elective preferences
● Access Modifiers: private for internal GPA fields, public method to access
transcript
● Interface: Graded with method assignGrade()
● Operators: GPA calculations and comparisons (using +, /, etc.)
● OOP:
○ Encapsulation: Secure handling of grades
○ Inheritance: Undergraduate, Postgraduate extend Student

Scenario-based Problems
○ Abstraction: Interface allows different grading styles
○ Polymorphism: assignGrade() works differently for pass/fail vs. letter grading*/

package com.dayone.universitycourseenrollmentsystem;

public class MainUniversityCourseEnrollmentSystem {
	
    public static void main(String[] args) {

        Student ugStudent = new Undergraduate(111, "Shagun");
		Student pgStudent = new Postgraduate(112, "Pawan");

		Course course = new Course("CS801", "Object Oriented Programming");
		course.showCourse();
		System.out.println("-----------------------");

		Faculty faculty = new Faculty(1, "Dr. Tiwari");
		faculty.showFaculty();
		System.out.println("-----------------------");

		Enrollment e1 = new Enrollment(ugStudent, course);
		Enrollment e2 = new Enrollment(pgStudent, course);

		faculty.assignGrade((Graded) ugStudent, 45);
		faculty.assignGrade((Graded) pgStudent, 90);

		e1.showEnrollment();
		System.out.println("-----------------------");
		e2.showEnrollment();
	}
}

