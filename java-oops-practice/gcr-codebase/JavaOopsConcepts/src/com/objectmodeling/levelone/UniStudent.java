package com.objectmodeling.levelone;

import java.util.ArrayList;
public class UniStudent {

    String name;
    ArrayList<UniCourse> courses = new ArrayList<>();

    public UniStudent(String name) {
        this.name = name;
    }

    public void enrollCourse(UniCourse course) {
        courses.add(course);
        course.addStudent(this);   // communication
    }

    public String getName() {
        return name;
    }

    public void showCourses() {
        System.out.println("\nCourses of " + name + ":");
        for (UniCourse c : courses) {
            System.out.println(c.getCourseName());
        }
    }
}
