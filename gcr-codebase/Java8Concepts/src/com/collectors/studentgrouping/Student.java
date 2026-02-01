package com.collectors.studentgrouping;

class Student {
	
    String name;
    String grade;

    // constructor
    Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getGrade() {
        return grade;
    }
}
