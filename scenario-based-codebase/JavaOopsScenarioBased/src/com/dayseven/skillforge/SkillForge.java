/*21. "SkillForge – Online Learning Portal"
Story: A startup builds SkillForge, where instructors upload courses and students enroll,
complete, and get certified.
Requirements:
● Course class: title, instructor, rating, modules[].
● User class → Student, Instructor (inheritance).
● Interface ICertifiable with generateCertificate() method.
● Constructors for courses with default or custom module lists.
● Use operators for grading, progress tracking.
● Encapsulation: course rating logic protected.
● Polymorphism: certificate format varies per course level.
● Access Modifiers: internal course reviews are read-only.*/

package com.dayseven.skillforge;

import java.util.Scanner;

public class SkillForge {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Instructor input
        System.out.print("Enter Instructor Name: ");
        String instructorName = sc.nextLine();

        System.out.print("Enter Instructor Email: ");
        String instructorEmail = sc.nextLine();

        Instructor instructor = new Instructor(instructorName, instructorEmail);

        // Student input
        System.out.print("\nEnter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Student Email: ");
        String studentEmail = sc.nextLine();

        Student student = new Student(studentName, studentEmail);

        // Course input
        System.out.print("\nEnter Course Title: ");
        String courseTitle = sc.nextLine();

        System.out.println("Select Course Level:");
        System.out.println("1. Beginner");
        System.out.println("2. Advanced");
        int choice = sc.nextInt();

        Course course;

        if (choice == 1) {
            course = new BeginnerCourse(courseTitle, instructor);
        } else {
            sc.nextLine(); // clear buffer
            System.out.print("Enter number of modules: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[] modules = new String[n];
            for (int i = 0; i < n; i++) {
                System.out.print("Enter module " + (i + 1) + ": ");
                modules[i] = sc.nextLine();
            }

            course = new AdvancedCourse(courseTitle, instructor, modules);
        }

        // Progress & grading
        System.out.print("\nEnter completed modules: ");
        int completed = sc.nextInt();

        student.updateProgress(completed, course.getTotalModules());

        System.out.print("Enter student score: ");
        int score = sc.nextInt();
        student.calculateGrade(score);

        // Output
        System.out.println("\n---- Student Report ----");
        System.out.println("Progress: " + student.getProgress() + "%");
        System.out.println("Grade: " + student.getGrade());

        System.out.println("\n---- Certificate ----");
        course.generateCertificate();

        sc.close();
    }
}
