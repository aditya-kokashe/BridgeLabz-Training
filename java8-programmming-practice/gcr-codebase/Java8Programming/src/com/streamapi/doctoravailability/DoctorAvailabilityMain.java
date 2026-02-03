package com.streamapi.doctoravailability;

import java.util.Arrays;
import java.util.List;

public class DoctorAvailabilityMain {

    public static void main(String[] args) {

        List<Doctor> doctors = Arrays.asList(
                new Doctor("Dr. Mehta", "Cardiology", true),
                new Doctor("Dr. Mohan", "Orthopedics", false),
                new Doctor("Dr. Khan", "Neurology", true),
                new Doctor("Dr. Prateek", "Dermatology", true),
                new Doctor("Dr. Sharma", "Pediatrics", false)
        );

        System.out.println("Doctors available on weekends :");

        doctors.stream()
                .filter(Doctor::isAvailableOnWeekend)
                .sorted((d1, d2) -> d1.getSpecialty()
                        .compareToIgnoreCase(d2.getSpecialty()))
                .forEach(System.out::println);
    }
}
