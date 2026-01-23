package com.examples.insurancepolicymanagementset;

import java.time.LocalDate;

public class InsurancePolicyApp {
	public static void main(String[] args) {
		PolicyService service = new PolicyService();

		// Added example policies
		service.add(new Policy("P101", "Krish", LocalDate.now().plusDays(15), "Health", 5200));
		service.add(new Policy("P102", "Ayushi", LocalDate.now().plusDays(45), "Auto", 8900));
		service.add(new Policy("P103", "Riya", LocalDate.now().plusDays(8), "Health", 6100));
		service.add(new Policy("P104", "Shagun", LocalDate.now().plusDays(75), "Home", 14500));

		// Trying duplicate
		System.out.println("Duplicate attempt:");
		service.showDuplicate(new Policy("P101", "Fake", LocalDate.now().plusDays(20), "Health", 5000));
		System.out.println();

		// Results
		System.out.println("All policies:");
		print(service.getAll());

		System.out.println("Expiring soon (30 days):");
		print(service.getExpiringSoon());

		System.out.println("Health policies:");
		print(service.getByType("Health"));
	}

	private static void print(Iterable<Policy> items) {
		for (Policy p : items) {
			System.out.println(p);
		}
		System.out.println();
	}
}