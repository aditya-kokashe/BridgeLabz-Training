package com.day3.CampusConnect;

import java.util.ArrayList;

public class Student extends Person implements ICourseActions {

    private ArrayList<Course> courses;
    private int[] grades;   // private as required

    public Student(String name, String email, String id, int[] grades) {
        super(name, email, id);
        this.grades = grades;
        this.courses = new ArrayList<>();
    }

    // GPA calculation using operators
    public double calculateGPA() {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }

    @Override
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
    }

    @Override
    public void dropCourse(Course course) {
        courses.remove(course);
        course.removeStudent(this);
    }

    // Polymorphism
    @Override
    public void printDetails() {
        System.out.println("Student Name: " + getName());
        System.out.println("Email: " + getEmail());
        System.out.println("ID: " + getId());
        System.out.println("GPA: " + calculateGPA());
        System.out.println();
    }
}
