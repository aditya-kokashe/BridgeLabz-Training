package com.day1.HospitalPatientManagementSystem;

public class OutPatient extends Patient{

	public OutPatient(int id, String name, int age, String medicalHistory) {
        super(id, name, age, medicalHistory);
    }

    //Abstract method override
    @Override
    public double calculateBill() {
        return 500;		 //consultation fee
    }
}
