package com.daynine.musicapp;

public class MusicBST {

	SongNode root;

    // Insert Song
    SongNode insert(SongNode root, int id, String title) {
        if (root == null)
            return new SongNode(id, title);

        if (id < root.trackId)
            root.left = insert(root.left, id, title);
        else if (id > root.trackId)
            root.right = insert(root.right, id, title);

        return root;
    }

    // Search Song by Track ID
    SongNode search(SongNode root, int id) {
        if (root == null || root.trackId == id)
            return root;

        if (id < root.trackId)
            return search(root.left, id);
        else
            return search(root.right, id);
    }

    // Inorder Traversal (Sorted Playlist)
    void inorder(SongNode root) {
        if (root != null) {
            inorder(root.left);
            System.out.println(root.title + " (Track ID: " + root.trackId + ")");
            inorder(root.right);
        }
    }

}
