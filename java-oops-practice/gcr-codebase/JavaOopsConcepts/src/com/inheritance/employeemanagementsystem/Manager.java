package com.inheritance.employeemanagementsystem;

public class Manager extends Employee{
	int teamSize;
	public Manager(String name, int id, double salary, int teamSize) {
		super(name, id, salary);
		this.teamSize = teamSize;
	}

}
