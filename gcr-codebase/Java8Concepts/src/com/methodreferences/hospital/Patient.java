package com.methodreferences.hospital;

public class Patient {
    private String patientId;
    private String name;
    private int age;

    // constructor
    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // getter for ID [used in method reference]
    public String getPatientId() {
        return patientId;
    }

    // string representation
    @Override
    public String toString() {
        return "Patient[ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }
}