package com.objectmodeling.levelone;

import java.util.ArrayList;

public class Student {

    int studentId;
    String name;
    //Association
    ArrayList<Course> courses;   

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
        courses = new ArrayList<>();
    }

    public void enrollCourse(Course course) {
        courses.add(course);
        //Maintain both sides
        course.addStudent(this);     
    }

    public void showCourses() {
        System.out.println("Courses of " + name + ":");
        for (Course c : courses) {
            System.out.println(c.getCourseName());
        }
    }

    public String getName() {
        return name;
    }
}
