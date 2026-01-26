package com.streams.bufferedcopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;

public class BufferedVsUnbuffered {

	private static final int BUFFER_SIZE = 4096; // 4 KB

	public static void main(String[] args) {

		String sourceFile = "src/com/streams/buffercopy/largefile_10MB.txt";
		String unbufferedDest = "src/com/streams/buffercopy/unbuffered_copy.txt";
		String bufferedDest = "src/com/streams/buffercopy/buffered_copy.txt";

		// Unbuffered copy
		long unbufferedTime = copyUsingUnbufferedStreams(sourceFile, unbufferedDest);

		// Buffered copy
		long bufferedTime = copyUsingBufferedStreams(sourceFile, bufferedDest);

		System.out.println("Unbuffered Stream Time (ns): " + unbufferedTime);
		System.out.println("Buffered Stream Time (ns): " + bufferedTime);
	}

	// Copy using FileInputStream and FileOutputStream
	private static long copyUsingUnbufferedStreams(String src, String dest) {

		long start = System.nanoTime();

		try (FileInputStream fis = new FileInputStream(src); FileOutputStream fos = new FileOutputStream(dest)) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.out.println("Unbuffered Error: " + e.getMessage());
		}

		return System.nanoTime() - start;
	}

	// Copy using BufferedInputStream and BufferedOutputStream
	private static long copyUsingBufferedStreams(String src, String dest) {

		long start = System.nanoTime();

		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest))) {

			byte[] buffer = new byte[BUFFER_SIZE];
			int bytesRead;

			while ((bytesRead = bis.read(buffer)) != -1) {
				bos.write(buffer, 0, bytesRead);
			}

		} catch (IOException e) {
			System.out.println("Buffered Error: " + e.getMessage());
		}

		return System.nanoTime() - start;
	}
}