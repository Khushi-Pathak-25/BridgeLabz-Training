package com.constructors.levelone;

import java.util.Scanner;
public class Course {

	// Instance Variables: courseName, duration, fee
	String courseName;
	int duration;
	double fee;
	
	// Class Variable: instituteName
	static String instituteName = "TIT";
	
	// constructor
	Course(String courseName, int duration, double fee ){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
	}
	
	// instance method 
	public void displayCourseDetails() {
		System.out.println("[Course Name : "+courseName+"] [ Duration : "+duration +"]  [Fee : "
	                       +fee+"]  [Institute Name : "+instituteName+"]");
		System.out.println("-------------------------------------------------------------------------");
		
	}
	
	// class method
	public static void updateInstituteName(String newInstituteName) {
		instituteName = newInstituteName;
	}
	
	// main method
	public static void main(String [] args) {
		Scanner input =new Scanner(System.in);
		
		// take inputs
		System.out.println("Enter Course Name : ");
		String courseName = input.nextLine();
		
		System.out.println("Enter Duration (in year): ");
		int duration = input.nextInt();
		
		System.out.println("Enter Fee : ");
		double fee = input.nextDouble();
		
		Course c1 = new Course (courseName, duration, fee);
		c1.displayCourseDetails();
		
        // update institute name
        Course.updateInstituteName("VIT");
        
		Course c2 = new Course (courseName, duration, fee);
		c2.displayCourseDetails();
		
		input.close();
		
	}
}
