package com.linkedlist.CircularLinkedList.TaskScheduler;

public class CircularTaskList {

    private TaskNode head;
    //Add at End (simple & safe)
    public void addTask(int id, String name, int priority, String dueDate) {
        TaskNode node = new TaskNode(id, name, priority, dueDate);

        if (head == null) {
            head = node;
            node.next = head;
            return;
        }

        TaskNode temp = head;
        while (temp.next != head)
            temp = temp.next;

        temp.next = node;
        node.next = head;
    }

    //Delete by ID
    public void deleteTask(int id) {
        if (head == null) return;

        TaskNode temp = head, prev = null;

        do {
            if (temp.id == id) {
                if (prev != null) {
                    prev.next = temp.next;
                } else {
                    TaskNode last = head;
                    while (last.next != head)
                        last = last.next;
                    head = head.next;
                    last.next = head;
                }
                System.out.println("\n Task Deleted.");
                return;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);

        System.out.println(" Task Not Found.");
    }

    //View Next Task
    public void viewNextTask() {
        if (head == null) return;
        System.out.println(" Current Task: " + head.name);
        head = head.next;
    }

    //Search by Priority
    public void searchByPriority(int p) {
        if (head == null) return;

        TaskNode temp = head;
        do {
            if (temp.priority == p)
                System.out.println(" "+temp.id + " " + temp.name);
            temp = temp.next;
        } while (temp != head);
    }

    //Display All
    public void displayAll() {
        if (head == null) return;

        TaskNode temp = head;
        do {
            System.out.println(" Id: "+temp.id + "\t Name: " + temp.name + "\t Priority: " + temp.priority + "\t Due Date: " + temp.dueDate);
            temp = temp.next;
        } while (temp != head);
    }
}
