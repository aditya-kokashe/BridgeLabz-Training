package com.day9.MusicBST;

public class MusicBST {

    TrackNode root;

    public void insert(int id, String title) {
        root = insertRec(root, id, title);
    }

    private TrackNode insertRec(TrackNode root, int id, String title) {
        if (root == null) return new TrackNode(id, title);

        if (id < root.trackId)
            root.left = insertRec(root.left, id, title);
        else if (id > root.trackId)
            root.right = insertRec(root.right, id, title);

        return root;
    }

    public void search(int id) {
        TrackNode res = searchRec(root, id);
        System.out.println(res == null ? "Track not found" :
                "\nFound: " + res.trackId + " | " + res.title);
    }

    private TrackNode searchRec(TrackNode root, int id) {
        if (root == null || root.trackId == id) return root;
        return id < root.trackId ?
                searchRec(root.left, id) :
                searchRec(root.right, id);
    }

    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(TrackNode root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.trackId + " ");
            inorderRec(root.right);
        }
    }
}