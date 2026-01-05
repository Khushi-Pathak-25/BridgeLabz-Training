/*8. "CampusConnect – College Information System"
Story: Your university launches CampusConnect, a portal to manage students, teachers, and
courses. You're developing the academic module.
Requirements:
● Person (base class): common fields like name, email, id.
● Student and Faculty extend Person (use inheritance).
● ICourseActions interface with methods like enrollCourse() and dropCourse().
● Course class has a list of students and a faculty assigned.
● Use constructors to initialize students and courses.
● Use access modifiers: student grades must be private.
● Use operators to calculate GPA based on grades.
● Polymorphism: printDetails() works differently for Student and Faculty.*/

package com.daythree.collegeinformationsystem;

import java.util.Scanner;
import java.util.ArrayList;

public class MainCollegeInformationSystem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Faculty input
		System.out.println("----Enter Faculty Details----");

		System.out.print("Enter Faculty ID: ");
		int facultyID = input.nextInt();
		input.nextLine(); // clear buffer

		System.out.print("Enter Faculty Name: ");
		String facultyName = input.nextLine();

		System.out.print("Enter Faculty Email: ");
		String facultyMail = input.nextLine();

		System.out.print("Enter Faculty Department: ");
		String facultyDept = input.nextLine();

		Faculty faculty = new Faculty(facultyID, facultyName, facultyMail, facultyDept);

		// Course input
		System.out.println("----Enter Course Details----");
		System.out.print("Enter Course Name: ");
		String courseName = input.nextLine();

		Course course = new Course(courseName, faculty);

		// Student inputs
		System.out.println("----Enter Student Details----");

		// Number of students
        System.out.println("Enter number of students:");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {

        System.out.println("\nEnter details for Student " + i);
		
		System.out.print("Enter Student ID: ");
		int studentID = input.nextInt();
		input.nextLine(); // clear buffer

		System.out.print("Enter Student Name: ");
		String studentName = input.nextLine();

		System.out.print("Enter Student Email: ");
		String studentMail = input.nextLine();


        System.out.print("Enter number of grades: ");
        int gCount = input.nextInt();

        double[] grades = new double[gCount];
        for (int j = 0; j < gCount; j++) {
            System.out.print("Grade " + (j + 1) + ": ");
            grades[j] = input.nextDouble();
        }

        Student student = new Student(studentID, studentName, studentMail, grades);
        student.enrollCourse(course);
    }

		// Output
        
		System.out.println("\n----- FACULTY DETAILS -----");
		faculty.printDetails();
		System.out.println();
		
		System.out.println("\n===== ALL STUDENTS =====");
        course.displayStudents();
        
        input.close();

	}

}
