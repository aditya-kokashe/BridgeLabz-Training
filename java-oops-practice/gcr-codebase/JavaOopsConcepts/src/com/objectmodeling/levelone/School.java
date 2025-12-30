package com.objectmodeling.levelone;

import java.util.ArrayList;

public class School {

    String schoolName;
    //Aggregation
    ArrayList<Student> students;   

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void showAllStudents() {
        System.out.println("Students of " + schoolName + ":");
        for (Student s : students) {
            System.out.println(s.getName());
        }
    }
}
