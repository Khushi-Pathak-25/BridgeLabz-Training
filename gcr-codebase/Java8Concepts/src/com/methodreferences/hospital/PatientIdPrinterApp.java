package com.methodreferences.hospital;

import java.util.ArrayList;
import java.util.List;

public class PatientIdPrinterApp {
    public static void main(String[] args) {
	// sample patient list (as if from hospital database)
	List<Patient> patients = new ArrayList<>();
	patients.add(new Patient("P101", "Ayush Mishra", 56));
	patients.add(new Patient("P102", "Teena Naik", 25));
	patients.add(new Patient("P103", "Veena Prakash", 51));
	patients.add(new Patient("P104", "Neena Diwakar", 26));
	patients.add(new Patient("P105", "Aashi Rajput", 34));

	System.out.println("Hospital Admin - Patient ID Verification List");
	System.out.println("Printing all Patient IDs using Method Reference:");
	System.out.println("---------------------------------------------------");

	// Using method reference: Patient::getPatientId -> String reference
	// then System.out::println to print each ID
	patients.stream()
		.map(Patient::getPatientId) // method reference to getter
		.forEach(System.out::println); // method reference to println

	System.out.println("--------------------------------------------------");
	System.out.println("Total patients verified: " + patients.size());
    }
}