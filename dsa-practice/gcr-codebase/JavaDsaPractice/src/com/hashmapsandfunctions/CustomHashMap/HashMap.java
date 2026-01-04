package com.hashmapsandfunctions.CustomHashMap;

public class HashMap {
    //Node class for chaining
    public static class Node {
        int key;
        int value;
        Node next;
        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }
    private int SIZE = 10;
    private Node[] table = new Node[SIZE];

    //Hash function
    private int hash(int key) {
        return key % SIZE;
    }
    //Insert / Put
    public void put(int key, int value) {
        int index = hash(key);
        Node head = table[index];
        //Update if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }
        //Insert new node at head
        Node newNode = new Node(key, value);
        newNode.next = table[index];
        table[index] = newNode;
    }

    //Get
    public Integer get(int key) {
        int index = hash(key);
        Node head = table[index];
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    //Remove
    public void remove(int key) {
        int index = hash(key);
        Node head = table[index];
        Node prev = null;

        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    table[index] = head.next;
                }else {
                    prev.next = head.next;
                }return;
            }
            prev = head;
            head = head.next;
        }
    }

    //Display
    public void display() {
        for (int i = 0; i < SIZE; i++) {
            Node head = table[i];
            System.out.print(i + ": ");
            while (head != null) {
                System.out.print("[" + head.key + "=" + head.value + "] : ");
                head = head.next;
            }
            System.out.println("null");
        }
    }
}
