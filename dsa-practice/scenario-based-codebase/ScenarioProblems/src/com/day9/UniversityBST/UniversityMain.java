package com.day9.UniversityBST;

public class UniversityMain {

    public static void main(String[] args) {

        StudentBST bst = new StudentBST();

        bst.insert(101, "Mohan");
        bst.insert(105, "Vicky");
        bst.insert(103, "Aman");

        System.out.print("Sorted Roll Numbers: \n");
        bst.inorder();

        bst.search(103);
    }
}