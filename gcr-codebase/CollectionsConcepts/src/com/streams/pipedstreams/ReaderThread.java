package com.streams.pipedstreams;

import java.io.IOException;
import java.io.PipedInputStream;

public class ReaderThread extends Thread {
	private PipedInputStream inputStream;

	// constructor
	public ReaderThread(PipedInputStream inputStream) {
		this.inputStream = inputStream;
	}

	@Override
	public void run() {
		try {
			int data;

			// Read data from the pipe
			while ((data = inputStream.read()) != -1) {
				System.out.print((char) data);
			}

			inputStream.close();

		} catch (IOException e) {
			System.out.println("Reader Error: " + e.getMessage());
		}
	}
}