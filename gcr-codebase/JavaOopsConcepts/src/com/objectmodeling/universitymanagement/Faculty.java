package com.objectmodeling.universitymanagement;

// faculty is independent entity

public class Faculty {
	
	    String facultyName;

	    Faculty(String facultyName) {
	        this.facultyName = facultyName;
	    }

	    void display() {
	        System.out.println("Faculty: " + facultyName);
	    }
}
