package com.dayone.universitycourseenrollmentsystem;

public class Faculty {
	
	private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void assignGrade(Graded stu, double marks) {
    	// Polymorphism 
        stu.assignGrade(marks);
    }
    
    public void showFaculty() {
    	System.out.println("Faculty Id   : " + facultyId);
        System.out.println("Faculty Name : " + name);
    }

}
