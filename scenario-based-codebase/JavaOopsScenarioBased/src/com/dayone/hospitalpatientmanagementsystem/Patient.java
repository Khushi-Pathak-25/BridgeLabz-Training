package com.dayone.hospitalpatientmanagementsystem;

import java.util.ArrayList;

public abstract class Patient {
    
	// attributes
	private int patientId;
	private String name;
	private int age;
	private Bill bill;
	protected Doctor doctor;
	private ArrayList<String> medicalHistory;

	// for normal patient
	public Patient(int patientId, String name, int age) {
		this.patientId = patientId;
		this.name = name;
		this.age = age;
		this.medicalHistory = new ArrayList<>();
	}

	// for emergency case
	public Patient(int patientId, String name, int age, String condition) {
		this(patientId, name, age);
		medicalHistory.add(condition);
	}

	public void assignDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	protected void addMedicalHistory(String record) {
		medicalHistory.add(record);
	}

	public void showMedicalHistory() {
		System.out.println("Medical History:");
		if (medicalHistory.isEmpty()) {
			System.out.println("No records available");
		} else {
			for (String record : medicalHistory) {
				System.out.println("- " + record);
			}
		}
	}

	public void generateBill(Bill bill) {
		this.bill = bill;
	}

	public void showBill() {
		if (bill != null) {
			System.out.println("Total Bill Amount: Rs." + bill.calculatePayment());
		} else {
			System.out.println("No bill generated");
		}
	}

	public String getSummary() {
		return "Patient ID: " + patientId + ", Name: " + name + ", age: " + age + ", Doctor: "
				+ (doctor != null ? doctor.getName() : "Not Assigned");
	}

	public abstract void displayInfo();
}