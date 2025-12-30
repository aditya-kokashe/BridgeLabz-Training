package com.objectmodeling.levelone;

public class SchoolMain {

    public static void main(String[] args) {

    	//School object
        School school = new School("Green Valley School");
        //Student object
        Student s1 = new Student(101, "Aditya");
        Student s2 = new Student(102, "Rahul");
        //Course object
        Course c1 = new Course("Java");
        Course c2 = new Course("Python");

        school.addStudent(s1);
        school.addStudent(s2);

        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        school.showAllStudents();
        s1.showCourses();
        s2.showCourses();

        c1.showStudents();
        c2.showStudents();
    }
}
