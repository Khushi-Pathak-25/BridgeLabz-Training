package com.queueinterface;

import java.util.*;

public class HospitalTriageSystem {
	// Patient class with name and severity
	static class Patient implements Comparable<Patient> {
		String name;
		int severity; // higher number = more critical

		// constructor
		public Patient(String name, int severity) {
			this.name = name;
			this.severity = severity;
		}

		// method to compare patients
		@Override
		public int compareTo(Patient other) {
			// Higher severity comes first (max-heap behavior)
			return Integer.compare(other.severity, this.severity);
		}

		// good string representation
		@Override
		public String toString() {
			return name + " (severity: " + severity + ")";
		}
	}

	public static void main(String[] args) {
		// Create priority queue (max-heap by severity)
		PriorityQueue<Patient> triageQueue = new PriorityQueue<>();

		// Add patients
		triageQueue.add(new Patient("Kiara", 3));
		triageQueue.add(new Patient("Alena", 5));
		triageQueue.add(new Patient("Krish", 2));
		triageQueue.add(new Patient("Roma", 4));
		triageQueue.add(new Patient("Elly", 7));
		triageQueue.add(new Patient("Seena", 1));

		System.out.println("Triage Queue (patients waiting):");
		System.out.println("Size: " + triageQueue.size() + " patients\n");

		System.out.println("Treatment order (highest severity first):");
		int order = 1;

		// Treat patients in order of priority
		while (!triageQueue.isEmpty()) {
			Patient next = triageQueue.poll();
			System.out.printf("%d. Treating: %s%n", order++, next);
		}
	}
}