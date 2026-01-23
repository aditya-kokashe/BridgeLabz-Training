package com.day10.GamingAVL;

public class GamingMain {

    public static void main(String[] args) {

        PlayerAVL avl = new PlayerAVL();

        avl.root = avl.insert(avl.root, 2500, "Mohan");
        avl.root = avl.insert(avl.root, 3100, "Kartik");
        avl.root = avl.insert(avl.root, 1800, "Rakesh");
        avl.root = avl.insert(avl.root, 2900, "Aman");

        System.out.println("Leaderboard (Top Scores):\n");
        avl.inorder(avl.root);
    }
}