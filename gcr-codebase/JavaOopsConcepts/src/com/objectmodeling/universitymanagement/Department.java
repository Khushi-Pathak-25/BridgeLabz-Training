package com.objectmodeling.universitymanagement;

// department class is part of composition 
// department depends upon University 
class Department {
    String deptName;

    Department(String deptName) {
        this.deptName = deptName;
    }

    void display() {
        System.out.println("Department: " + deptName);
    }
}
