package com.day10.TicketAVL;

public class EventAVL {

    EventNode root;

    int height(EventNode n) {
        return n == null ? 0 : n.height;
    }

    int balance(EventNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    EventNode rightRotate(EventNode y) {
        EventNode x = y.left;
        EventNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    EventNode leftRotate(EventNode x) {
        EventNode y = x.right;
        EventNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public EventNode insert(EventNode node, int time, String name) {

        if (node == null)
            return new EventNode(time, name);

        if (time < node.time)
            node.left = insert(node.left, time, name);
        else
            node.right = insert(node.right, time, name);

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int b = balance(node);

        if (b > 1 && time < node.left.time)
            return rightRotate(node);

        if (b < -1 && time > node.right.time)
            return leftRotate(node);

        if (b > 1 && time > node.left.time) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        if (b < -1 && time < node.right.time) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void inorder(EventNode node) {
        if (node != null) {
            inorder(node.left);
            System.out.println(node.eventName + " ( Time: " + node.time+ " )");
            inorder(node.right);
        }
    }
}