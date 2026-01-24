package com.collections.queueinterface.circularbuffer;

public class CircularBuffer {

    private int[] buffer;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularBuffer(int capacity) {
        this.capacity = capacity;
        buffer = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Insert element (overwrite if full)
    public void enqueue(int value) {

        buffer[rear] = value;
        rear = (rear + 1) % capacity;

        if (size < capacity) {
            size++;
        } else {
            // buffer full → overwrite oldest
            front = (front + 1) % capacity;
        }
    }

    public void display() {

        if (size == 0) {
            System.out.println("Buffer is empty");
            return;
        }

        System.out.print("Buffer: [ ");
        for (int i = 0; i < size; i++) {
            System.out.print(buffer[(front + i) % capacity] + " ");
        }
        System.out.println("]");
    }
}
