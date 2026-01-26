package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

public class PipedStream {
	public static void main(String[] args) {
		try {
			// Create piped streams
			PipedOutputStream pos = new PipedOutputStream();
			PipedInputStream pis = new PipedInputStream(pos);

			// Create threads
			WriterThread writer = new WriterThread(pos);
			ReaderThread reader = new ReaderThread(pis);

			// Start threads
			writer.start();
			reader.start();

		} catch (IOException e) {
			System.out.println("Pipe Connection Error: " + e.getMessage());
		}
	}
}