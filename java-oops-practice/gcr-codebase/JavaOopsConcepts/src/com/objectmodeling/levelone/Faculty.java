package com.objectmodeling.levelone;

public class Faculty {

    private int facultyId;
    private String name;

    public Faculty(int facultyId, String name) {
        this.facultyId = facultyId;
        this.name = name;
    }

    public void showFaculty() {
        System.out.println("Faculty ID: " + facultyId + "  Name: " + name);
    }

    public String getName() {
        return name;
    }
}
