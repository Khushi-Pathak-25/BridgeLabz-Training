package com.day02.songvault;

// generic base for different media types
public interface Media {
	String getTitle();

	String getArtist();

	String getDuration();

	String getGenre();
}