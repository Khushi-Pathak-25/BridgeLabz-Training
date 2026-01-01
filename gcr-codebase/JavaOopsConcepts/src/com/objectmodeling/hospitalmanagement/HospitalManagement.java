package com.objectmodeling.hospitalmanagement;

public class HospitalManagement {

	public static void main(String[] args) {

        Hospital hospital = new Hospital();

        Doctor d1 = new Doctor("Dr. Sharma", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Verma", "Neurologist");

        Patient p1 = new Patient("Richa");
        Patient p2 = new Patient("Arun");

        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Association + Communication
        d1.consult(p1);
        d1.consult(p2);

        d2.consult(p1);
    }
}
