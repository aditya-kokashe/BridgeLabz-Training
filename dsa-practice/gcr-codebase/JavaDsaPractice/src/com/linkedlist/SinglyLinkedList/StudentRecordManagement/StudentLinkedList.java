package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

public class StudentLinkedList {

    private StudentNode head;

    //Insert at Beginning
    public void addAtBeginning(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = head;
        head = newNode;
    }

    //Insert at End
    public void addAtEnd(int roll, String name, int age, char grade) {
        StudentNode newNode = new StudentNode(roll, name, age, grade);

        if (head == null) {
            head = newNode;
            return;
        }

        StudentNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    //Insert at Specific Position
    public void addAtPosition(int pos, int roll, String name, int age, char grade) {
        if (pos == 1) {
            addAtBeginning(roll, name, age, grade);
            return;
        }

        StudentNode temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println(" Invalid Position!");
            return;
        }

        StudentNode newNode = new StudentNode(roll, name, age, grade);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Delete by Roll Number
    public void deleteByRoll(int roll) {
        if (head == null) {
            System.out.println(" List is empty!");
            return;
        }

        if (head.roll == roll) {
            head = head.next;
            System.out.println(" Student Deleted!");
            return;
        }

        StudentNode temp = head;
        while (temp.next != null && temp.next.roll != roll) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println(" Student Not Found!");
        }else{
            temp.next = temp.next.next;
            System.out.println(" Student Deleted!");
        }
    }

    //Search Student
    public void searchStudent(int roll) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                System.out.println("\n Found: " + temp.name + ", Age: " + temp.age + ", Grade: " + temp.grade);
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Student Not Found!");
    }

    //Update Grade
    public void updateGrade(int roll, char newGrade) {
        StudentNode temp = head;

        while (temp != null) {
            if (temp.roll == roll) {
                temp.grade = newGrade;
                System.out.println(" Grade Updated!");
                return;
            }
            temp = temp.next;
        }
        System.out.println(" Student Not Found!");
    }

    //Display All Records
    public void displayAll() {
        if (head == null) {
            System.out.println(" No Records Found!");
            return;
        }

        StudentNode temp = head;
        System.out.println("\n Roll   Name   Age   Grade");
        System.out.println("+--------------------------+");
        while (temp != null) {
            System.out.println(" "+temp.roll + "    " + temp.name + "   " + temp.age + "    " + temp.grade);
            temp = temp.next;
        }
    }
}
