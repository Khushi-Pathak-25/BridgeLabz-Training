package com.inheritance.multilevelinheritance.educationalcourse;

public class PaidOnlineCourse extends OnlineCourse {

	// private attributes
	private double fee;
	private double discount; // percentage

	// Constructor to initialize paid online course details
	public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee,
			double discount) {
		// calling parent classes constructors
		super(courseName, duration, platform, isRecorded);
		this.fee = fee;
		this.discount = discount;
	}

	// Overridden method to include payment details
	@Override
	public void displayCourseDetails() {
		super.displayCourseDetails();
		System.out.println("Fee         : " + fee);
		System.out.println("Discount    : " + discount + "%");
		System.out.println("Final Price : " + (fee - (fee * discount / 100)));
	}
}
