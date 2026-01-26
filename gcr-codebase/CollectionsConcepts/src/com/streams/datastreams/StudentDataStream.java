package com.streams.datastreams;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StudentDataStream {
	public static void main(String[] args) {
		String filePath = "src/com/streams/datastreams/student.dat";

		// Write student data
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(filePath))) {

			// Writing primitive data
			dos.writeInt(111); // Roll Number
			dos.writeUTF("Khushi Pathak"); // Name
			dos.writeDouble(8.18); // GPA

			System.out.println("Student data written successfully.");

		} catch (IOException e) {
			System.out.println("Write Error: " + e.getMessage());
		}

		// Read student data
		try (DataInputStream dis = new DataInputStream(new FileInputStream(filePath))) {

			// Reading primitive data in same order
			int rollNumber = dis.readInt();
			String name = dis.readUTF();
			double gpa = dis.readDouble();

			System.out.println("\nStudent data retrieved from file:");
			System.out.println("Roll Number: " + rollNumber);
			System.out.println("Name: " + name);
			System.out.println("GPA: " + gpa);

		} catch (IOException e) {
			System.out.println("Read Error: " + e.getMessage());
		}
	}
}