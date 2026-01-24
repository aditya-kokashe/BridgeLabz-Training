package com.collections.queueinterface.circularbuffer;

public class CircularBufferMain {

    public static void main(String[] args) {

        CircularBuffer cb = new CircularBuffer(3);

        cb.enqueue(1);
        cb.enqueue(2);
        cb.enqueue(3);
        cb.display();

        cb.enqueue(4); // overwrites 1
        cb.display();
    }
}
