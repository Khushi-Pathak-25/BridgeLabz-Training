package com.finalandstatic.levelone;

public class Patient {

	  // Static variable shared among all patients
	   private static String hospitalName;
	   private static int totalPatients = 0;
	   
	   // Instance variables
	   private final String patientID; // Final variable to uniquely identify each patient
	   private String name;
	   private int age;
	   private String ailment;
	   
	   // Constructor to initialize name, age, ailment, and patientID
	   public Patient(String name, int age, String ailment, String patientID) {
	       this.name = name;
	       this.age = age;
	       this.ailment = ailment;
	       this.patientID = patientID;
	       totalPatients++;
	   }
	   
	   // Static method to set the hospital name
	   public static void setHospitalName(String name) {
	       hospitalName = name;
	   }
	   
	   // Static method to get the total number of patients admitted
	   public static int getTotalPatients() {
	       return totalPatients;
	   }
	   
	   // Method to display patient details
	   public void displayPatientDetails() {
	       // Using 'instanceof' to verify the object's type before displaying details
	       if (this instanceof Patient) {
	           System.out.println("Hospital Name: " + hospitalName);
	           System.out.println("Patient ID: " + patientID);
	           System.out.println("Name: " + name);
	           System.out.println("Age: " + age);
	           System.out.println("Ailment: " + ailment);
	       } else {
	           System.out.println("The object is not an instance of the Patient class.");
	       }
	   }
	   
	   // Getters for instance variables (optional, but recommended for encapsulation)
	   public String getName() {
	       return name;
	   }
	   public int getAge() {
	       return age;
	   }
	   public String getAilment() {
	       return ailment;
	   }
	   public String getPatientID() {
	       return patientID;
	   }
	  
	   public static void main(String[] args) {
	       // Set the hospital name (static variable)
	       Patient.setHospitalName("City Hospital");
	       // Create new patient instances
	       Patient patient1 = new Patient("Lathika", 30, "Flu", "P001");
	       Patient patient2 = new Patient("Lidiya", 45, "Fracture", "P002");
	       // Display total number of patients admitted
	       System.out.println("Total Patients Admitted: " + Patient.getTotalPatients());
	       // Display patient details
	       patient1.displayPatientDetails();
	       System.out.println();
	       patient2.displayPatientDetails();
	   }
}
