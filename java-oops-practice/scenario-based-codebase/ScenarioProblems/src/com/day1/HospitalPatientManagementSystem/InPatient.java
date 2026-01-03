package com.day1.HospitalPatientManagementSystem;

public class InPatient extends Patient{

	private int daysAdmitted;
    private double roomCharge;

    public InPatient(int id, String name, int age,String medicalHistory, int days, double roomCharge) {
        super(id, name, age, medicalHistory);
        this.daysAdmitted = days;
        this.roomCharge = 100;
    }

    //Override abstract methods
    @Override
    public double calculateBill() {
        return daysAdmitted * roomCharge + 2000; 	//service charges
    }

}
