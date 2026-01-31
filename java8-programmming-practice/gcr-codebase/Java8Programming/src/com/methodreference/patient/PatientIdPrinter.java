package com.methodreference.patient;

import java.util.*;

public class PatientIdPrinter {

    public static void main(String[] args) {

        List<Integer> patientIds = Arrays.asList(101, 102, 103, 104);

        // Method reference
        patientIds.forEach(System.out::println);
    }
}
