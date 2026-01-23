package com.day7.EduResults;

public class EduResultsMain {

    public static void main(String[] args) {

        Student[] students = {
                new Student("Aman", 88),
                new Student("Sneha", 92),
                new Student("Pratik", 75),
                new Student("Aarya", 95)
        };

        EduResults er = new EduResults();
        er.mergeSort(students, 0, students.length - 1);

        System.out.println("State-wise Rank List:");
        for (Student s : students)
            System.out.println(s);
    }
}