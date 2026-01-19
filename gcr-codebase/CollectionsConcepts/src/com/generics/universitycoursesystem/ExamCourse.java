package com.generics.universitycoursesystem;

public class ExamCourse extends CourseType {

    public ExamCourse() {
        super("Written Examination");
    }

    @Override
    public void evaluate() {
        System.out.println("Evaluation through written exams.");
    }
}
