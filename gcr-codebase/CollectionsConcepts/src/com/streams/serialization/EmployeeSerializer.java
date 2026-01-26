package com.streams.serialization;

import java.io.*;
import java.util.*;

public class EmployeeSerializer {

    public static void main(String[] args) {

        // File to store serialized objects
        String fileName = "src/com/streams/serialization/employees.dat";
        // Creating a list of employees
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Amit", "IT", 50000));
        empList.add(new Employee(102, "Neha", "HR", 45000));
        empList.add(new Employee(103, "Rahul", "Finance", 55000));

        // Serialization - Write objects to file
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(empList);
            System.out.println("Employee list has been serialized to file successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
