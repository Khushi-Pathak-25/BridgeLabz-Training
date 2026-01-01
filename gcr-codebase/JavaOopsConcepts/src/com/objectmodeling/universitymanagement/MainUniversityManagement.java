package com.objectmodeling.universitymanagement;

public class MainUniversityManagement {
	
    public static void main(String[] args) {

	    Faculty f1 = new Faculty("Dr. Pathak");
	    Faculty f2 = new Faculty("Prof. Tiwari");

	    University uni = new University("RGPV");

	    uni.addDepartment("Computer Science");
	    uni.addDepartment("Information Technology");

	    uni.addFaculty(f1);
	    uni.addFaculty(f2);

	    uni.displayDetails();

	    // Deleting University
	    uni = null;

	    System.out.println("\nUniversity deleted...");

	    // Faculty still exists
	    f1.display();
	    f2.display();
	}
}
