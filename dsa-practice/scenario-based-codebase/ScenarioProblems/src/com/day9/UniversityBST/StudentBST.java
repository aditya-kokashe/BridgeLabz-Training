package com.day9.UniversityBST;

public class StudentBST {

    StudentNode root;

    public void insert(int roll, String name) {
        root = insertRec(root, roll, name);
    }

    private StudentNode insertRec(StudentNode root, int roll, String name) {
        if (root == null) return new StudentNode(roll, name);

        if (roll < root.roll)
            root.left = insertRec(root.left, roll, name);
        else if (roll > root.roll)
            root.right = insertRec(root.right, roll, name);

        return root;
    }

    public void search(int roll) {
        StudentNode res = searchRec(root, roll);
        System.out.println(res == null ? "Student not found" :
                "\nFound: \n" + res.roll + " - " + res.name);
    }

    private StudentNode searchRec(StudentNode root, int roll) {
        if (root == null || root.roll == roll) return root;
        return roll < root.roll ?
                searchRec(root.left, roll) :
                searchRec(root.right, roll);
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(StudentNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.roll + " ");
            inorderRec(root.right);
        }
    }
}