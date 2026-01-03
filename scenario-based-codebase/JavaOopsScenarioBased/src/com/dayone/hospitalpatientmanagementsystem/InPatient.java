package com.dayone.hospitalpatientmanagementsystem;

public class InPatient extends Patient {

	private int daysAdmitted;

	// for normal patient
	public InPatient(int patientId, String name, int age, int daysAdmitted) {
		super(patientId, name, age);
		this.daysAdmitted = daysAdmitted;
	}

	// for emergency case
	public InPatient(int patientId, String name, int age, int daysAdmitted, String condition) {
		super(patientId, name, age, condition);
		this.daysAdmitted = daysAdmitted;
	}

	@Override
	public void displayInfo() {
		System.out.println("In-Patient Details");
		System.out.println(getSummary());
		System.out.println("Days Admitted: " + daysAdmitted);
		showMedicalHistory();
		showBill();
	}
}