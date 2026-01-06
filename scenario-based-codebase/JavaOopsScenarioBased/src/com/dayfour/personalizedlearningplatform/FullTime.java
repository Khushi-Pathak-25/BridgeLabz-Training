package com.dayfour.personalizedlearningplatform;

public class FullTime extends Course implements ICertifiable {

	public FullTime(String courseName, String courseID) {
		super(courseName, courseID);
	}
	
    public void generateCertificate() {
		
		System.out.println("Full-Time Course Certified !");
	}


}
