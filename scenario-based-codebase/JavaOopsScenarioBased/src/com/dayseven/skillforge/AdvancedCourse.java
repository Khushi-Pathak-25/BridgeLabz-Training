package com.dayseven.skillforge;

public class AdvancedCourse extends Course {

    public AdvancedCourse(String title, Instructor instructor, String[] modules) {
        super(title, instructor, modules);
    }

    @Override
    public void generateCertificate() {
        System.out.println("Professional Certificate (Advanced Level)");
        System.out.println("Course: " + getTitle());
    }
}

