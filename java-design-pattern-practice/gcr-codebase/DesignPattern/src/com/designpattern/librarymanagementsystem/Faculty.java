package com.designpattern.librarymanagementsystem;

public class Faculty implements User{

	@Override
	public void getRole() {
		System.out.println("Faculty : Excended borrowing");
		
	}

}
