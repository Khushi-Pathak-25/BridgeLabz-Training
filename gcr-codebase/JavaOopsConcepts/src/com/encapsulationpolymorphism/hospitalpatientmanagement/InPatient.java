
package com.encapsulationpolymorphism.hospitalpatientmanagement;

public class InPatient extends Patient implements MedicalRecord {
	
	// Sensitive medical data (encapsulated)
    private String diagnosis;
    private int daysAdmitted;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis: " + diagnosis);
    }
	
}
