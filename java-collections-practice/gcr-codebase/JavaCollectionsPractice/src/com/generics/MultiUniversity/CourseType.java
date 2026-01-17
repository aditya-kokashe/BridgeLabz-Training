package com.generics.MultiUniversity;

public abstract class CourseType {

    private String evaluationType;

    public CourseType(String evaluationType) {
        this.evaluationType = evaluationType;
    }

    public String getEvaluationType() {
        return evaluationType;
    }
}
