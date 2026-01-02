package com.encapsulationandpolymorphism.hospitalmanagemant;

import java.util.*;
public class HospitalMain {

    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(1, "Vishad Harode", 21, 4, 3000));
        patients.add(new OutPatient(2, "Rahul Tiwari", 24));

        for (Patient p : patients) {

            p.getPatientDetails();
            System.out.println("Bill Amount: " + p.calculateBill());

            if (p instanceof MedicalRecord) {
                MedicalRecord m = (MedicalRecord) p;
                m.addRecord("Initial Checkup Completed");
                m.viewRecords();
            }
            System.out.println();
        }
    }
}
