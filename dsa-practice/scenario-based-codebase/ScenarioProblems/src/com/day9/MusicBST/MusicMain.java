package com.day9.MusicBST;

public class MusicMain {

    public static void main(String[] args) {

        MusicBST bst = new MusicBST();

        bst.insert(20, "Believer");
        bst.insert(10, "Faded");
        bst.insert(30, "Perfect");

        System.out.print("Playlist (Sorted by Track ID): ");
        bst.inorder();

        bst.search(10);
    }
}