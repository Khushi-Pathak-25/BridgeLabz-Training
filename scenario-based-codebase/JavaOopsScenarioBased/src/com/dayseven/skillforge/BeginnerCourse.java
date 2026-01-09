package com.dayseven.skillforge;

public class BeginnerCourse extends Course {

    public BeginnerCourse(String title, Instructor instructor) {
        super(title, instructor);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Certificate of Completion (Beginner Level)");
        System.out.println("Course: " + getTitle());
    }
}
