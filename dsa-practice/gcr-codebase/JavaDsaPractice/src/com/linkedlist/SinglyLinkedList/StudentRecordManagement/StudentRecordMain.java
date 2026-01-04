package com.linkedlist.SinglyLinkedList.StudentRecordManagement;

public class StudentRecordMain {
    public static void main(String[] args) {

        StudentLinkedList list = new StudentLinkedList();

        list.addAtBeginning(101, "Amit", 20, 'A');
        list.addAtEnd(102, "Neha", 21, 'B');
        list.addAtPosition(2, 103, "Ravi", 22, 'C');

        list.displayAll();

        list.searchStudent(102);
        list.updateGrade(102, 'A');
        list.deleteByRoll(101);

        list.displayAll();
    }
}
