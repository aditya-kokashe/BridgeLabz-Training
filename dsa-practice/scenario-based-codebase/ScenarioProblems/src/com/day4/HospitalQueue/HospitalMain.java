package com.day4.HospitalQueue;

public class HospitalMain {
    public static void main(String[] args) {

        Patient[] queue = {
            new Patient("Ramesh", 3),
            new Patient("Sita", 9),
            new Patient("Ankit", 5),
            new Patient("Meena", 10),
            new Patient("Rahul", 2)
        };

        HospitalQueue.bubbleSort(queue);

        System.out.println("ER Priority List: ");
        for (Patient p : queue) {
            System.out.println(p.name + "\t  Criticality: " + p.criticality);
        }
    }
}
