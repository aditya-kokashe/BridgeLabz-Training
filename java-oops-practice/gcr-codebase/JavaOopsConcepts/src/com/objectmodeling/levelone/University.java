package com.objectmodeling.levelone;

import java.util.ArrayList;

public class University {

    private String universityName;

    private ArrayList<UniDepartment> departments;   // Composition
    private ArrayList<Faculty> faculties;        	// Aggregation

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    public void addDepartment(String deptName) {
    	//Created inside University
        departments.add(new UniDepartment(deptName));   
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void showDetails() {
        System.out.println("\nUniversity: " + universityName);

        System.out.println("Departments:");
        for (UniDepartment d : departments) {
            System.out.println(d.getDeptName());
        }

        System.out.println("\nFaculties:");
        for (Faculty f : faculties) {
            System.out.println(f.getName());
        }
    }

    //Simulating destruction
    public void closeUniversity() {
        System.out.println("\nClosing University: " + universityName);
        for (UniDepartment d : departments) {
        	// Departments destroyed with University
            d.closeDepartment();     
        }
        //Composition life cycle ends here
        departments.clear();         
        System.out.println("University closed.");
    }
}
