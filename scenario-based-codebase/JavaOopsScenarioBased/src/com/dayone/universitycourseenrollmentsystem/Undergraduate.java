package com.dayone.universitycourseenrollmentsystem;

public class Undergraduate extends Student implements Graded {

    public Undergraduate(int studentId, String name) {
        super(studentId, name);
    }

    @Override
    public void assignGrade(double marks) {
        if (marks >= 40) {
            updateGpa(4.0);   // pass
        } else {
            updateGpa(0.0);   // fail
        }
    }

    @Override
    public void showInfo() {
        System.out.println("Undergraduate Student");
        printTranscript();
    }
}