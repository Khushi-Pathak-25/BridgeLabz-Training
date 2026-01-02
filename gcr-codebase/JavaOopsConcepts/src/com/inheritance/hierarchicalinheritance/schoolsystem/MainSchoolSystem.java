/* School System with Different Roles
Description: Create a hierarchy for a school system where Person is the superclass, 
and Teacher, Student, and Staff are subclasses.
Tasks:
Define a superclass Person with common attributes like name and age.
Define subclasses Teacher, Student, and Staff with specific attributes 
(e.g., subject for Teacher and grade for Student).
Each subclass should have a method like displayRole() that describes the role.
Goal: Demonstrate hierarchical inheritance by modeling different roles in a school,
each with shared and unique characteristics.*/

package com.inheritance.hierarchicalinheritance.schoolsystem;

public class MainSchoolSystem {

    public static void main(String[] args) {

        // Hierarchical inheritance demonstration
        Person p1 = new Teacher("Mr.Tiwari", 32, "Java");
        Person p2 = new Student("Aman", 15, "10th Grade");
        Person p3 = new Staff("Vinay", 38, "Account Section");

        p1.displayDetails();
        p1.displayRole();
        System.out.println("---------------------");

        p2.displayDetails();
        p2.displayRole();
        System.out.println("---------------------");

        p3.displayDetails();
        p3.displayRole();
    }
}