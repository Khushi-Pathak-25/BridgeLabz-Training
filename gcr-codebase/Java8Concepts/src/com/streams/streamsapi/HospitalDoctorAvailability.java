package com.streams.streamsapi;

import java.util.*;
import java.util.stream.*;

class Doctor {
    String name;
    String specialty;
    boolean availableOnWeekend;

    //Constructor to initialize doctor details
    Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    //Getter methods
    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }
}

public class HospitalDoctorAvailability {
    public static void main(String[] args) {

        // List of doctors
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiology", true),
            new Doctor("Dr. Mehta", "Orthopedic", false),
            new Doctor("Dr. Verma", "Neurology", true),
            new Doctor("Dr. Singh", "Dermatology", true),
            new Doctor("Dr. Gupta", "Orthopedic", true)
        );

        // Stream processing
        doctors.stream()

               // Filter doctors available on weekends
               .filter(doctor -> doctor.isAvailableOnWeekend())

               // Sort doctors by specialty (alphabetical order)
               .sorted(Comparator.comparing(Doctor::getSpecialty))

               // Print doctor details
               .forEach(doctor ->
                   System.out.println(
                       doctor.getName() + " - " + doctor.getSpecialty()
                   )
               );
    }
}
