package com.dayfour.personalizedlearningplatform;

public class ShortCourse extends Course implements ICertifiable{

	public ShortCourse(String courseName, String courseID) {
		super(courseName, courseID);
	}
	
	public void generateCertificate() {
		
		System.out.println("Short Course Certified !");
	}

}
