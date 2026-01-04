package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class Process {
    int id;
    int burst;
    int priority;

    int remaining;      // remaining burst time
    int waiting = 0;    // waiting time
    int turnAround = 0;

    Process next;

    public Process(int id, int burst, int priority) {
        this.id = id;
        this.burst = burst;
        this.remaining = burst;
        this.priority = priority;
        this.next = null;
    }
}
