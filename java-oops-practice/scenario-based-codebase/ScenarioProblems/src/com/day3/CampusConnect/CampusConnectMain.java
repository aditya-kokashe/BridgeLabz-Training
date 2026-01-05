package com.day3.CampusConnect;

public class CampusConnectMain {

    public static void main(String[] args) {

        Faculty faculty = new Faculty("Mr.Neel Nitin", "neel@uni.edu", "F101");

        Course javaCourse = new Course("Java Programming", faculty);

        int[] grades = {50,90,40};
        Student student = new Student("Mohan", "mohan@bhargav.edu", "S201", grades);

        student.enrollCourse(javaCourse);

        //Polymorphism
        Person p1 = student;
        Person p2 = faculty;

        p1.printDetails();
        p2.printDetails();

        javaCourse.displayCourseDetails();
    }
}
