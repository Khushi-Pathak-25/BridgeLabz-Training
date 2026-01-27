package com.csvdata.csvtoobject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentCSVReader {
    public static void main(String[] args) {
	// sample file path
	String filePath = "src/com/csvdata/csvtoobject/student.csv";
	List<Student> students = new ArrayList<>();

	try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
	    String line;
	    boolean isHeader = true;

	    while ((line = reader.readLine()) != null) {
		// skip header row
		if (isHeader) {
		    isHeader = false;
		    continue;
		}

		// split CSV line
		String[] arr = line.split(",");
		Student student = new Student(Integer.parseInt(arr[0]), arr[1], Integer.parseInt(arr[2]),
			Integer.parseInt(arr[3]));
		students.add(student);
	    }

	    // print student objects
	    for (Student s : students) {
		System.out.println(s);
	    }

	} catch (IOException e) {
	    System.out.println("Error reading CSV file");
	}
    }
}