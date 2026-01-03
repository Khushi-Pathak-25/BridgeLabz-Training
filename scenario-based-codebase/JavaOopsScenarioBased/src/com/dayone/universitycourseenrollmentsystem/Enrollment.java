package com.dayone.universitycourseenrollmentsystem;

public class Enrollment {

    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void showEnrollment() {
        student.showInfo();
        course.showCourse();
    }
}