package com.dayseven.skillforge;

public class Student extends User {

    private int progress;   // % progress
    private int grade;      // marks

    public Student(String name, String email) {
        super(name, email);
        this.progress = 0;
        this.grade = 0;
    }

    // Operators for progress & grading
    public void updateProgress(int completedModules, int totalModules) {
        progress = (completedModules * 100) / totalModules;
    }

    public void calculateGrade(int score) {
        grade = score; // assignment/exam score
    }

    public int getProgress() {
        return progress;
    }

    public int getGrade() {
        return grade;
    }
}
