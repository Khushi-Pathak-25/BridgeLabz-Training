package com.dayone.hospitalpatientmanagementsystem;

public class MainHospitalPatientManagementSystem {
	public static void main(String[] args) {
		Doctor doctor = new Doctor(111, "Dr. Shagun", "Neurologist");
		doctor.displayInfo();
        System.out.println("----------------------");

		Patient p1 = new InPatient(02, "Richa", 25, 4, "Neurological disorde");
		p1.assignDoctor(doctor);

		Patient p2 = new OutPatient(01, "Veena", 55, "Stroke");
		p2.assignDoctor(doctor);

		Bill b1 = new Bill(5000, 0.05, 200);
		p1.generateBill(b1);
        p1.displayInfo();

        System.out.println("-----------------------");
        
		Bill b2 = new Bill(60000, 0.05, 1000);
		p2.generateBill(b2);
		p2.displayInfo();
	}
}