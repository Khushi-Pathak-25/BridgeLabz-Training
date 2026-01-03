package com.dayone.hospitalpatientmanagementsystem;

public class OutPatient extends Patient {

	// for normal patient 
	public OutPatient(int patientId, String name, int age) {
		super(patientId, name, age);
	}

	// for emergency case
	public OutPatient(int patientId, String name, int age, String condition) {
		super(patientId, name, age, condition);
	}

	@Override
	public void displayInfo() {
		System.out.println("Out-Patient Details");
		System.out.println(getSummary());
		showMedicalHistory();
		showBill();
	}
}