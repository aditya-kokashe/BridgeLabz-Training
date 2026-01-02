package com.encapsulationandpolymorphism.hospitalmanagemant;

public class OutPatient extends Patient implements MedicalRecord {

    public OutPatient(int id, String name, int age) {
        super(id, name, age);
    }

    //Abstract method override
    @Override
    public double calculateBill() {
        return 500;		 //consultation fee
    }

    //Interface methods override
    @Override
    public void addRecord(String record) {
        System.out.println("OutPatient Record Added: " + record);
    }
    @Override
    public void viewRecords() {
        System.out.println("Viewing OutPatient Medical Records");
    }
}
