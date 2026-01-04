/*7. Hospital Patient Management
Description: Design a system to manage patients in a hospital:
Create an abstract class Patient with fields like patientId, name, and age.
Add an abstract method calculateBill() and a concrete method getPatientDetails().
Extend it into subclasses InPatient and OutPatient, implementing calculateBill() with different billing logic.
Implement an interface MedicalRecord with methods addRecord() and viewRecords().
Use encapsulation to protect sensitive patient data like diagnosis and medical history.
Use polymorphism to handle different patient types and display their billing details dynamically.*/

package com.encapsulationpolymorphism.hospitalpatientmanagement;

import java.util.*;

public class MainHospitalPatientManagement {
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Patient> patients = new ArrayList<>();

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.println("\nPatient " + i);
            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Patient Type (1-InPatient, 2-OutPatient): ");
            int type = sc.nextInt();

            Patient p;

            if (type == 1) {
                System.out.print("Enter Days Admitted: ");
                int days = sc.nextInt();

                System.out.print("Enter Daily Charge: ");
                double charge = sc.nextDouble();

                p = new InPatient(id, name, age, days, charge);
            } else {
                System.out.print("Enter Consultation Fee: ");
                double fee = sc.nextDouble();

                p = new OutPatient(id, name, age, fee);
            }

            sc.nextLine();
            System.out.print("Enter Diagnosis: ");
            String diagnosis = sc.nextLine();

            // Polymorphic access via interface
            MedicalRecord record = (MedicalRecord) p;
            record.addRecord(diagnosis);

            patients.add(p);
        }

        // Polymorphism demonstration
        System.out.println("\n===== Patient Billing Details =====");
        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            MedicalRecord record = (MedicalRecord) p;
            record.viewRecords();

            System.out.println("-----------------------------");
        }

        sc.close();
    }
}
	
	


