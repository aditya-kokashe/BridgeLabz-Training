package com.encapsulationandpolymorphism.hospitalmanagemant;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;
    private String diagnosis;  		 //encapsulated sensitive data
    private String medicalHistory;   //sensitive data

    //Constructor
    public Patient(int id, String name, int age) {
        this.patientId = id;
        this.name = name;
        this.age = age;
    }

    //Encapsulation
    public int getPatientId() {
        return patientId;
    }
    public String getName() {
        return name;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }
    protected String getDiagnosis() {
        return diagnosis;
    }

    public void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }
    protected String getMedicalHistory() {
        return medicalHistory;
    }

    
    //Concrete method
    public void getPatientDetails() {
        System.out.println("ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    //Abstract method
    public abstract double calculateBill();
}
