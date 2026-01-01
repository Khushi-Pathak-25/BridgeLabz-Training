/*Problem 3: Hospital, Doctors, and Patients (Association and Communication)
Description: Model a Hospital where Doctor and Patient objects interact through consultations.
 A doctor can see multiple patients, and each patient can consult multiple doctors.
Tasks:
Define a Hospital class containing Doctor and Patient classes.
Create a method consult() in the Doctor class to show communication,
 which would display the consultation between a doctor and a patient.
Model an association between doctors and patients to show that doctors and patients can have multiple relationships.
Goal: Practice creating an association with communication between objects by modeling doctor-patient consultations.
*/

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
