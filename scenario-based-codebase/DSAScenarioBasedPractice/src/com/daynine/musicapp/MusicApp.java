/*Story: Music App - Organize Songs by Track ID
A music streaming app organizes tracks in a library using track IDs.
Scenarios:
● 🔹 Scenario 1: Search Track — Users want to search a song using track ID.
● 🔹 Scenario 2: Insert New Track — Add new releases to the library.
● 🔹 Scenario 3: Show Playlist Alphabetically — In-order traversal by song title.*/

package com.daynine.musicapp;

public class MusicApp {

	public static void main(String[] args) {

		MusicBST bst = new MusicBST();

		bst.root = bst.insert(bst.root, 105, "Dreams");
		bst.insert(bst.root, 102, "Believer");
		bst.insert(bst.root, 108, "Thunder");
		bst.insert(bst.root, 101, "Alone");

		System.out.println("Playlist:");
		bst.inorder(bst.root);

		SongNode song = bst.search(bst.root, 102);
		if (song != null)
			System.out.println("\nSong Found: " + song.title);
	}
}
