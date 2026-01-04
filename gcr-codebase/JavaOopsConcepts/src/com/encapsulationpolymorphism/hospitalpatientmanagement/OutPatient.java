package com.encapsulationpolymorphism.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {
	
	private String diagnosis;
    private double consultationFee;

    public OutPatient(int id, String name, int age, double fee) {
        super(id, name, age);
        this.consultationFee = fee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
