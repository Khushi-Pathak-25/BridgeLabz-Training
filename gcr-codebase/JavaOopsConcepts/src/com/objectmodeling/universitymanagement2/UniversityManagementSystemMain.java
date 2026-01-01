/*Problem 5: University Management System
Description: Model a university system with Student, Professor, and Course classes. 
Students enroll in courses, and professors teach courses. 
Ensure students and professors can communicate through methods like enrollCourse() and assignProfessor().
Goal: Use association and aggregation to create a university system that 
emphasizes relationships and interactions among students, professors, and courses.*/


package com.objectmodeling.universitymanagement2;

public class UniversityManagementSystemMain {
	
	public static void main(String[] args) {

        Student s1 = new Student("Khushi");
        Student s2 = new Student("Shagun");

        Professor p1 = new Professor("Dr.Pathak");

        Course c1 = new Course("Data Structures");
        Course c2 = new Course("OOP in Java");

        // Communication
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        c1.assignProfessor(p1);
        c2.assignProfessor(p1);
    }

}
