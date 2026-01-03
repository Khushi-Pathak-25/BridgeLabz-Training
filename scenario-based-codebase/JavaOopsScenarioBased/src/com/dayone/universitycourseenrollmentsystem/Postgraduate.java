package com.dayone.universitycourseenrollmentsystem;

public class Postgraduate extends Student implements Graded {

    public Postgraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        double calculatedGpa = marks / 20; // simple GPA logic
        updateGpa(calculatedGpa);
    }

    @Override
    public void showInfo() {
        System.out.println("Postgraduate Student");
        printTranscript();
    }
}