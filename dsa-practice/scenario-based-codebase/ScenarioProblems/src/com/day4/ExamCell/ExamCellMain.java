package com.day4.ExamCell;

public class ExamCellMain {
    public static void main(String[] args) {

        Student[] students = {
            new Student("Ravi", 450),
            new Student("Neha", 390),
            new Student("Aman", 480),
            new Student("Pooja", 420),
            new Student("Kiran", 460)
        };

        // Sort students by score (descending)
        ExamCell.mergeSort(students, 0, students.length - 1);

        System.out.println("State Level Rank List:");
        int rank = 1;
        for (Student s : students) {
            System.out.println(rank++ + ". " + s.name + " - " + s.score);
        }
    }
}
