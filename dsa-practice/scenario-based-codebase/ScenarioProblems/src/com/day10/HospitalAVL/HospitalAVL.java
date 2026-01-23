package com.day10.HospitalAVL;

public class HospitalAVL {

    PatientNode root;

    int height(PatientNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(PatientNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PatientNode rightRotate(PatientNode y) {
        PatientNode x = y.left;
        PatientNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PatientNode leftRotate(PatientNode x) {
        PatientNode y = x.right;
        PatientNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public PatientNode insert(PatientNode node, int time, String name) {

        if (node == null)
            return new PatientNode(time, name);

        if (time < node.arrivalTime)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int b = balance(node);

        if (b > 1 && time < node.left.arrivalTime)
            return rightRotate(node);

        if (b < -1 && time > node.right.arrivalTime)
            return leftRotate(node);

        if (b > 1 && time > node.left.arrivalTime) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (b < -1 && time < node.right.arrivalTime) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void inorder(PatientNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.name + " ( Arrival: " + node.arrivalTime+" )");
            inorder(node.right);
        }
    }
}