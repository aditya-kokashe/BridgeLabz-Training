package com.linkedlist.SinglyLinkedList.SocialMediaConnections;

public class User {
    public int id;
    public String name;
    public int age;

    public int[] friends = new int[10];
    public int friendCount = 0;

    public User next;

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.next = null;
    }
}
