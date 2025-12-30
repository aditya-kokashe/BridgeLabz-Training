package com.objectmodeling.levelone;

public class UniversityMain1 {

    public static void main(String[] args) {

        UniStudent s1 = new UniStudent("Brajesh");
        UniStudent s2 = new UniStudent("Rajesh");

        UniProfessor p1 = new UniProfessor("Dr. Sharma");

        UniCourse java = new UniCourse("Java");

        s1.enrollCourse(java);
        s2.enrollCourse(java);
        p1.assignCourse(java);

        s1.showCourses();
        java.showDetails();
    }
}
