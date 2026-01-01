/*Problem 2: University with Faculties and Departments (Composition and Aggregation)
Description: Create a University with multiple Faculty members and Department objects. 
Model it so that the University and its Departments are in a composition relationship 
(deleting a university deletes all departments),
and the Faculty members are in an aggregation relationship 
(faculty can exist outside of any specific department).
Tasks:
Define a University class with Department and Faculty classes.
Demonstrate how deleting a University also deletes its Departments.
Show that Faculty members can exist independently of a Department.
Goal: Understand the differences between composition 
and aggregation in modeling complex hierarchical relationships.*/

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
