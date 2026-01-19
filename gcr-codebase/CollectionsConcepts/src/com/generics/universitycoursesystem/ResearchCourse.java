package com.generics.universitycoursesystem;

public class ResearchCourse extends CourseType {

    public ResearchCourse() {
        super("Research Work");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through research projects.");
    }
}

