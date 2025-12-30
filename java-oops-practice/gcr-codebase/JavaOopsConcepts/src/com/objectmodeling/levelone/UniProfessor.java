package com.objectmodeling.levelone;

public class UniProfessor {

    String name;

    public UniProfessor(String name) {
        this.name = name;
    }

    public void assignCourse(UniCourse course) {
        course.setProfessor(this);   // communication
    }

    public String getName() {
        return name;
    }
}
