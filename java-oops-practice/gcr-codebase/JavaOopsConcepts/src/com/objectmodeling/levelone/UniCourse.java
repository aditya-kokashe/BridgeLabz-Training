package com.objectmodeling.levelone;

import java.util.ArrayList;
public class UniCourse {

    String courseName;
    UniProfessor professor;
    ArrayList<UniStudent> students = new ArrayList<>();

    public UniCourse(String courseName) {
        this.courseName = courseName;
    }

    public void addStudent(UniStudent student) {
        students.add(student);
    }

    public void setProfessor(UniProfessor professor) {
        this.professor = professor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void showDetails() {
        System.out.println("\nCourse: " + courseName);
        System.out.println("Professor: " + professor.getName());
        System.out.println("Students:");
        for (UniStudent s : students) {
            System.out.println(s.getName());
        }
    }
}
