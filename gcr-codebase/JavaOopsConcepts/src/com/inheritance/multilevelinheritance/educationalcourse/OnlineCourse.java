package com.inheritance.multilevelinheritance.educationalcourse;

public class OnlineCourse extends Course {

	// attributes
    protected String platform;
    protected boolean isRecorded; //(true , false)

    // Constructor to initialize online course details
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Overridden method to include online-specific details
    @Override
    public void displayCourseDetails() {
        super.displayCourseDetails();
        System.out.println("Platform    : " + platform);
        System.out.println("Recorded    : " + isRecorded);
    }
}