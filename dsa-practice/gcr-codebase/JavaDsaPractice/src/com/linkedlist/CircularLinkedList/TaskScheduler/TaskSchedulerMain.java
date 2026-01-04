package com.linkedlist.CircularLinkedList.TaskScheduler;

public class TaskSchedulerMain {
	public static void main(String[] args) {

        CircularTaskList list = new CircularTaskList();

        list.addTask(1, "Study", 1, "05 Jan");
        list.addTask(2, "Project", 2, "07 Jan");
        list.addTask(3, "Exam", 1, "10 Jan");

        list.displayAll();

        list.viewNextTask();
        list.viewNextTask();   // automatically loops

        list.searchByPriority(1);
        list.deleteTask(2);

        list.displayAll();
    }
}
