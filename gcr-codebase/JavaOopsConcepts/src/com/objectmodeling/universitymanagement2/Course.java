package com.objectmodeling.universitymanagement2;

public class Course {

	String courseName;
    Professor professor;   // Aggregation

    Course(String courseName) {
        this.courseName = courseName;
    }

    // Communication method
    void assignProfessor(Professor professor) {
        this.professor = professor;
        System.out.println("Professor " + professor.professorName +
                " assigned to course " + courseName);
    }
}
