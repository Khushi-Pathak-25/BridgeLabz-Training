package com.dayone.hospitalpatientmanagementsystem;

public class Doctor {
    
	// attributes
	private int doctorId;
	private String name;
	private String specialization;

	// constructor
	public Doctor(int doctorId, String name, String specialization) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}
	
    // display information of doctor
	public void displayInfo() {
		System.out.println("Doctor ID: " + doctorId);
		System.out.println("Doctor Name: " + name);
		System.out.println("Specialization: " + specialization);
	}
}