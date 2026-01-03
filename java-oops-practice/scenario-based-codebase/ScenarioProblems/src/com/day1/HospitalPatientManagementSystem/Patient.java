package com.day1.HospitalPatientManagementSystem;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;
    private String medicalHistory;   //sensitive data

    //Constructor
    public Patient(int id, String name, int age, String medicalHistory) {
        this.patientId = id;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    //Encapsulation
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }

    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
    public String getSummary() {
        return medicalHistory;
    }
    
    //Concrete method
    public void displayInfo() {
        System.out.println("\nPatient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Medical History: " + medicalHistory);
    }

    //Abstract method
    public abstract double calculateBill();
}