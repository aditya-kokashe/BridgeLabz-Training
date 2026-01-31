package com.collectors.studentgrouping;

import java.util.*;
import java.util.stream.Collectors;

public class StudentMain {

    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
            new Student("Aakash", "A"),
            new Student("Rohit", "B"),
            new Student("Sneha", "A"),
            new Student("Priya", "C"),
            new Student("Aman", "B")
        );

        Map<String, List<String>> studentsByGrade =
                students.stream()
                        .collect(Collectors.groupingBy(
                                Student::getGrade,
                                Collectors.mapping(Student::getName, Collectors.toList())
                        ));

        System.out.println(studentsByGrade);
    }
}
