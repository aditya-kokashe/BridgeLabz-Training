package com.day1.HospitalPatientManagementSystem;

public class Bill implements Payable{

	public Bill() {
		
	}

	@Override
	public int calculatePayment(int n) {
		return n*10;
	}

	@Override
	public int calculatePayment() {
		return 0;
	}

}
