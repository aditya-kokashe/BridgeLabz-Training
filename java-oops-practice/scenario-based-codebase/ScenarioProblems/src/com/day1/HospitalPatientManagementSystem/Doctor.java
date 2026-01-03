package com.day1.HospitalPatientManagementSystem;

public class Doctor {

	private int doctorId;
    private String name;
    private String specialization;

    //Constructor
    public Doctor(int id, String name, String specialization) {
        this.doctorId = id;
        this.name = name;
        this.specialization = specialization;
    }

    //Encapsulation
    public int getDoctorId() {
        return doctorId;
    }
    public String getName() {
        return name;
    }
    
    //Concrete method
    public void displayInfo() {
        System.out.println("\nDoctor ID: " + doctorId);
        System.out.println("Doctor: " + name);
        System.out.println("Specialization: " + specialization);
    }

}
