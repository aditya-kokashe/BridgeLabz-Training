package com.day10.GamingAVL;

public class PlayerAVL {

    PlayerNode root;

    int height(PlayerNode n) {
        return n == null ? 0 : n.height;
    }

    int getBalance(PlayerNode n) {
        return n == null ? 0 : height(n.left) - height(n.right);
    }

    PlayerNode rightRotate(PlayerNode y) {
        PlayerNode x = y.left;
        PlayerNode T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    PlayerNode leftRotate(PlayerNode x) {
        PlayerNode y = x.right;
        PlayerNode T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public PlayerNode insert(PlayerNode node, int score, String name) {

        if (node == null)
            return new PlayerNode(score, name);

        if (score < node.score)
            node.left = insert(node.left, score, name);
        else if (score > node.score)
            node.right = insert(node.right, score, name);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));
        int balance = getBalance(node);

        // LL
        if (balance > 1 && score < node.left.score)
            return rightRotate(node);

        // RR
        if (balance < -1 && score > node.right.score)
            return leftRotate(node);

        // LR
        if (balance > 1 && score > node.left.score) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && score < node.right.score) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void inorder(PlayerNode node) {
        if (node != null) {
            inorder(node.right);
            System.out.println(node.name + " ( Score: " + node.score+" )");
            inorder(node.left);
        }
    }
}