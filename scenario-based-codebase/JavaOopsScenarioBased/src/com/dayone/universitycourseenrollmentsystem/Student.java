package com.dayone.universitycourseenrollmentsystem;

public abstract class Student {

    private int studentId;
    private String name;
    private double gpa;   // sensitive data

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // overloaded constructor (with elective preference)
    public Student(int studentId, String name, double initialGpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = initialGpa;
    }

    protected void updateGpa(double newGpa) {
        this.gpa = newGpa;
    }

    // public safe access
    public void printTranscript() {
        System.out.println("Student ID  : " + studentId);
        System.out.println("Name        : " + name);
        System.out.println("GPA         : " + gpa);
    }

    // abstract method
    public abstract void showInfo();
}