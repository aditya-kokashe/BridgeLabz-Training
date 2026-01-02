package com.encapsulationandpolymorphism.hospitalmanagemant;

public class InPatient extends Patient implements MedicalRecord {

    private int daysAdmitted;
    private double roomCharge;

    public InPatient(int id, String name, int age, int days, double roomCharge) {
        super(id, name, age);
        this.daysAdmitted = days;
        this.roomCharge = roomCharge;
    }

    //Override abstract methods
    @Override
    public double calculateBill() {
        return daysAdmitted * roomCharge + 2000; 	//service charges
    }

    //Override interface methods
    @Override
    public void addRecord(String record) {
        System.out.println("InPatient Record Added: " + record);
    }
    @Override
    public void viewRecords() {
        System.out.println("Viewing InPatient Medical Records");
    }
}
