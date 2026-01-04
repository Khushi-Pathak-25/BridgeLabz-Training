package com.encapsulationpolymorphism.hospitalpatientmanagement;

public abstract class Patient {
	
	// Encapsulation: private fields
    private int patientId;
    private String name;
    private int age;

    // Constructor
    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Getters (no direct access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
