package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Doctor {

    int doctorId;
    String name;
    ArrayList<Patient> patients;   // Association

    public Doctor(int doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
        patients = new ArrayList<>();
    }

    public void consult(Patient patient) {
        System.out.println("Dr. " + name + " is consulting patient " + patient.getName());

        patients.add(patient);        // maintain both sides
        patient.addDoctor(this);
    }

    public void showPatients() {
        System.out.println("\nPatients consulted by Dr. " + name + ":");
        for (Patient p : patients) {
            System.out.println(p.getName());
        }
    }

    public String getName() {
        return name;
    }
}
