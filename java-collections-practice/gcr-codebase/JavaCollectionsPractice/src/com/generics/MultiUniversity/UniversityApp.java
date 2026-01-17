package com.generics.MultiUniversity;

import java.util.ArrayList;
import java.util.List;

public class UniversityApp {

    public static void main(String[] args) {

        List<Course<? extends CourseType>> courses = new ArrayList<>();

        courses.add(new Course<>("Data Structures", new ExamCourse()));
        courses.add(new Course<>("Software Engineering", new AssignmentCourse()));
        courses.add(new Course<>("AI Research", new ResearchCourse()));

        System.out.println("University Course List:\n");
        displayCourses(courses);
    }

    public static void displayCourses(List<? extends Course<? extends CourseType>> courses) {
        for (Course<? extends CourseType> c : courses) {
            System.out.println(c.getCourseDetails());
        }
    }
}
