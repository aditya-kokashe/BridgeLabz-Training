package com.objectmodeling.levelone;

public class UniDepartment {

    private String deptName;

    public UniDepartment(String deptName) {
        this.deptName = deptName;
        System.out.println("Department " + deptName + " created.");
    }

    public void closeDepartment() {
        System.out.println("Department " + deptName + " closed.");
    }

    public String getDeptName() {
        return deptName;
    }
}

