package com.daynine.musicapp;

public class SongNode {
	
	int trackId;
    String title;
    SongNode left, right;

    SongNode(int trackId, String title) {
        this.trackId = trackId;
        this.title = title;
        left = right = null;
    }
}
