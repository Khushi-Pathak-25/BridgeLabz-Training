package com.streams.bytearray;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageByteArrayCopy {
	public static void main(String[] args) {
		String sourceImage = "src/com/streams/bytearray/source.jpg";
		String destinationImage = "src/com/streams/bytearray/copied.jpg";

		try {
			// Read image into byte array
			byte[] imageBytes = readImageToByteArray(sourceImage);

			// Write byte array back to image
			writeByteArrayToImage(imageBytes, destinationImage);

			System.out.println("Image copied successfully using ByteArray Streams.");

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	// Reads image file and converts it to byte array
	private static byte[] readImageToByteArray(String filePath) throws IOException {
		try (FileInputStream fis = new FileInputStream(filePath);
				ByteArrayOutputStream baos = new ByteArrayOutputStream()) {

			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, bytesRead);
			}

			return baos.toByteArray();
		}
	}

	// Writes byte array back to image file
	private static void writeByteArrayToImage(byte[] data, String filePath) throws IOException {
		try (ByteArrayInputStream bais = new ByteArrayInputStream(data);
				FileOutputStream fos = new FileOutputStream(filePath)) {

			byte[] buffer = new byte[4096];
			int bytesRead;

			while ((bytesRead = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, bytesRead);
			}
		}
	}
}