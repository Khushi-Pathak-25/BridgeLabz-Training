package com.objectmodeling.universitymanagement2;

public class Student {

	String studentName;

    Student(String studentName) {
        this.studentName = studentName;
    }

    // Communication method
    void enrollCourse(Course course) {
        System.out.println(studentName + " enrolled in " + course.courseName);
    }
    
}
