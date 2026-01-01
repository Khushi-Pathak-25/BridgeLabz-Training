package com.objectmodeling.universitymanagement;

import java.util.ArrayList;

class University {
    String universityName;
    ArrayList<Department> departments;   // Composition
    ArrayList<Faculty> facultyList;       // Aggregation

    University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        facultyList = new ArrayList<>();
    }

    void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    void addFaculty(Faculty faculty) {
        facultyList.add(faculty);
    }

    void displayDetails() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.display();
        }

        System.out.println("Faculty Members:");
        for (Faculty f : facultyList) {
            f.display();
        }
    }
}
