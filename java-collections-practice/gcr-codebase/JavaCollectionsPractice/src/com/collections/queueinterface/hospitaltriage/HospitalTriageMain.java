package com.collections.queueinterface.hospitaltriage;

import java.util.PriorityQueue;

public class HospitalTriageMain {

    public static void main(String[] args) {

        PriorityQueue<Patient> queue =
                new PriorityQueue<>(
                        (p1, p2) -> p2.severity - p1.severity
                );

        queue.add(new Patient("John", 3));
        queue.add(new Patient("Alice", 5));
        queue.add(new Patient("Bob", 2));

        System.out.println("Treatment Order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
    }
}
