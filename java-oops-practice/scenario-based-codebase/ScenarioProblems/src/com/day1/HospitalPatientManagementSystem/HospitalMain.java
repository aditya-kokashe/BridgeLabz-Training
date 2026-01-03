package com.day1.HospitalPatientManagementSystem;

public class HospitalMain {

	public static void main(String[] args) {

		Patient p1 = new InPatient(101, "Abhijeet", 25, "Brain Tumor", 2, 0);
		Patient p2 = new OutPatient(102, "Prince", 22, "Fever");

		Doctor d = new Doctor(101, "Dr. Shrivastva", "Brain surgeon");
		
		Bill b = new Bill();
		
		p1.displayInfo();
		p2.displayInfo();
		
		d.displayInfo();
		
		System.out.println("Total Bill: "+ b.calculatePayment(5));
		
	}

}
