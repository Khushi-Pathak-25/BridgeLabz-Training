package com.generics.universitycoursesystem;

public class AssignmentCourse extends CourseType {

    public AssignmentCourse() {
        super("Assignments");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through assignments.");
    }
}

