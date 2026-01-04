package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobinMain {
    public static void main(String[] args) {

        RoundRobin rr = new RoundRobin();

        rr.addProcess(1, 10, 1);
        rr.addProcess(2, 5, 2);
        rr.addProcess(3, 8, 1);

        rr.showQueue();

        rr.run(3);   // Time Quantum = 3
    }
}
