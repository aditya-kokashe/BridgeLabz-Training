package com.day10.TicketAVL;

public class TicketMain {

    public static void main(String[] args) {

        EventAVL avl = new EventAVL();

        avl.root = avl.insert(avl.root, 1800, "Concert");
        avl.root = avl.insert(avl.root, 1500, "Conference");
        avl.root = avl.insert(avl.root, 2000, "Stand-up");

        System.out.println("Upcoming Events:\n");
        avl.inorder(avl.root);
    }
}