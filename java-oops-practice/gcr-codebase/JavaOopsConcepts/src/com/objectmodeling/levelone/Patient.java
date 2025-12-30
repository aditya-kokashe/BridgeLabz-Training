package com.objectmodeling.levelone;

import java.util.ArrayList;
public class Patient {

    int patientId;
    String name;
    ArrayList<Doctor> doctors;   // Association

    public Patient(int patientId, String name) {
        this.patientId = patientId;
        this.name = name;
        doctors = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void showDoctors() {
        System.out.println("\nDoctors consulted by " + name + ":");
        for (Doctor d : doctors) {
            System.out.println("Dr. " + d.getName());
        }
    }

    public String getName() {
        return name;
    }
}
