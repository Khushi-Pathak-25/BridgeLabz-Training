package com.streams.filecopy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;

public class FileReadWriteStream {
	public static void main(String[] args) {

		String sourceFile = "src/com/streams/filecopy/source.txt";
		String destinationFile = "src/com/streams/filecopy/destination.txt";

		File file = new File(sourceFile);

		// Check if source file exists
		if (!file.exists()) {
			System.out.println("Source file does not exist.");
			return;
		}

		// Try-with-resources ensures streams are closed
		try (FileInputStream fis = new FileInputStream(sourceFile);
				FileOutputStream fos = new FileOutputStream(destinationFile)) {

			int data;

			// Read byte by byte and write to destination file
			while ((data = fis.read()) != -1) {
				fos.write(data);
			}

			System.out.println("File copied successfully.");

		} catch (IOException e) {
			System.out.println("Error occurred: " + e.getMessage());
		}
	}
}