package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Hospital {

    String hospitalName;
    ArrayList<Doctor> doctors;
    ArrayList<Patient> patients;

    public Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
        doctors = new ArrayList<>();
        patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public void showHospitalData() {
        System.out.println("\nHospital: " + hospitalName);

        System.out.println("Doctors:");
        for (Doctor d : doctors) {
            System.out.println("Dr. " + d.getName());
        }

        System.out.println("Patients:");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }
}
