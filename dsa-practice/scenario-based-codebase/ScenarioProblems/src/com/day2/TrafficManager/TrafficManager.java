package com.day2.TrafficManager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    private Vehicle head;                 // circular linked list
    private Queue<String> waitingQueue;   // entry queue
    private int maxQueueSize = 3;

    public TrafficManager() {
        waitingQueue = new LinkedList<>();
    }

    // Vehicle arrives at roundabout (queue)
    public void enqueueVehicle(String number) {
        if (waitingQueue.size() >= maxQueueSize) {
            System.out.println("Queue Overflow! Vehicle " + number + " must wait.");
            return;
        }
        waitingQueue.add(number);
        System.out.println("Vehicle queued: " + number);
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return;
        }

        String number = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(number);

        if (head == null) {
            head = newVehicle;
            newVehicle.next = head;
        } else {
            Vehicle temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = newVehicle;
            newVehicle.next = head;
        }

        System.out.println("Vehicle entered roundabout: " + number);
    }

    // Remove vehicle from roundabout
    public void exitRoundabout(String number) {
        if (head == null) {
            System.out.println("Roundabout empty!");
            return;
        }

        Vehicle curr = head;
        Vehicle prev = null;

        do {
            if (curr.number.equals(number)) {
                if (prev != null) {
                    prev.next = curr.next;
                }
                if (curr == head) {
                    head = curr.next;
                }
                System.out.println("Vehicle exited: " + number);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Display current roundabout state
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout: ");
        do {
            System.out.print(temp.number + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }
}