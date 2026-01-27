package com.csvdata.encryptcsv;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EncryptDecryptCSV {
    public static void main(String[] args) {
	encryptCSV();
	decryptCSV();
    }

    // encrypt CSV data
    public static void encryptCSV() {
	// sample file path
	String inputFile = "src/com/csvdata/encryptcsv/employees.csv";
	String encryptedFile = "src/com/csvdata/encryptcsv/encrypted_employees.csv";

	try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
		FileWriter writer = new FileWriter(encryptedFile)) {

	    String line;
	    boolean isHeader = true;
	    while ((line = reader.readLine()) != null) {
		// write header
		if (isHeader) {
		    writer.write(line + "\n");
		    isHeader = false;
		    continue;
		}

		String[] arr = line.split(",");

		// simple encryption by shifting characters
		String encryptedSalary = encrypt(arr[3]);

		writer.write(arr[0] + "," + arr[1] + "," + arr[2] + "," + encryptedSalary + "\n");
	    }
	    System.out.println("CSV data encrypted successfully");

	} catch (IOException e) {
	    System.out.println("Error encrypting CSV file");
	}
    }

    // decrypt CSV data
    public static void decryptCSV() {
	// sample file path
	String encryptedFile = "src/com/csvdata/encryptcsv/encrypted_employees.csv";
	String decryptedFile = "src/com/csvdata/encryptcsv/decrypted_employees.csv";

	try (BufferedReader reader = new BufferedReader(new FileReader(encryptedFile));
		FileWriter writer = new FileWriter(decryptedFile)) {

	    String line;
	    boolean isHeader = true;
	    while ((line = reader.readLine()) != null) {
		// write header
		if (isHeader) {
		    writer.write(line + "\n");
		    isHeader = false;
		    continue;
		}

		String[] arr = line.split(",");

		// decrypt salary
		String decryptedSalary = decrypt(arr[3]);

		writer.write(arr[0] + "," + arr[1] + "," + arr[2] + "," + decryptedSalary + "\n");
	    }
	    System.out.println("CSV data decrypted successfully");

	} catch (IOException e) {
	    System.out.println("Error decrypting CSV file");
	}
    }

    // simple encrypt logic
    public static String encrypt(String value) {
	String result = "";
	for (int i = 0; i < value.length(); i++) {
	    result = result + (char) (value.charAt(i) + 2);
	}
	return result;
    }

    // simple decrypt logic
    public static String decrypt(String value) {
	String result = "";
	for (int i = 0; i < value.length(); i++) {
	    result = result + (char) (value.charAt(i) - 2);
	}
	return result;
    }
}