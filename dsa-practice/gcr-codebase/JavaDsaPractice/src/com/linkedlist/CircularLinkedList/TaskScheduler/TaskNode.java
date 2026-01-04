package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskNode {
    int id;
    String name;
    int priority;
    String dueDate;
    TaskNode next;

    public TaskNode(int id, String name, int priority, String dueDate) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.dueDate = dueDate;
        this.next = null;
    }
}
