package com.linkedlist.CircularLinkedList.RoundRobinSchedulingAlgorithm;

public class RoundRobin {

    private Process head;

    // Add process at end
    public void addProcess(int id, int burst, int priority) {
        Process p = new Process(id, burst, priority);

        if (head == null) {
            head = p;
            p.next = head;
            return;
        }

        Process temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = p;
        p.next = head;
    }

    // Run Round Robin
    public void run(int timeQuantum) {
        if (head == null) return;

        Process curr = head;
        int time = 0;
        int totalWT = 0, totalTAT = 0;
        int count = 0;

        while (head != null) {
            if (curr.remaining > 0) {
                int exec = Math.min(timeQuantum, curr.remaining);
                curr.remaining -= exec;
                time += exec;

                // Add waiting time to others
                Process t = head;
                do {
                    if (t != curr && t.remaining > 0)
                        t.waiting += exec;
                    t = t.next;
                } while (t != head);

                // If finished, remove it
                if (curr.remaining == 0) {
                    curr.turnAround = curr.waiting + curr.burst;
                    totalWT += curr.waiting;
                    totalTAT += curr.turnAround;
                    count++;

                    remove(curr.id);
                }
            }
            curr = curr.next;
            showQueue();
        }

        System.out.println("\nAverage Waiting Time = " + (totalWT / (double) count));
        System.out.println("Average Turnaround Time = " + (totalTAT / (double) count));
    }

    // Remove finished process
    private void remove(int id) {
        if (head == null) return;

        Process temp = head, prev = null;
        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    Process last = head;
                    while (last.next != head) {
                        last = last.next;
                    }    
                    if (head == head.next) {
                        head = null;
                        return;
                    }
                    head = head.next;
                    last.next = head;
                }
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
    }

    // Display Queue
    public void showQueue() {
        if (head == null) {
            System.out.println("Queue Empty");
            return;
        }

        Process temp = head;
        System.out.print("Queue: ");
        do {
            System.out.print("P" + temp.id + "(" + temp.remaining + ") ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}
