package com.generics.MultiUniversity;

public class Course<T extends CourseType> {

    private String courseName;
    private T courseType;

    public Course(String courseName, T courseType) {
        this.courseName = courseName;
        this.courseType = courseType;
    }

    public String getCourseDetails() {
        return courseName + " ( " + courseType.getEvaluationType() +" ) ";
    }
}
