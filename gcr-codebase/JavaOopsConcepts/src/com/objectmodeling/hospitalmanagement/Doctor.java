package com.objectmodeling.hospitalmanagement;

class Doctor {
	
	// attributes
    String doctorName;
    String specialization;

    // constructor
    Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
    }

    // Communication method
    void consult(Patient patient) {
        System.out.println("Doctor " + doctorName +
                " is consulting patient " + patient.patientName);
    }

}
