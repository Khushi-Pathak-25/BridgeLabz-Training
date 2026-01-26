package com.streams.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.IOException;
import java.util.List;

public class EmployeeDeserializer {

    public static void main(String[] args) {

        // File containing serialized objects
        String fileName = "src/com/streams/serialization/employees.dat";

        // Deserialization - Read objects from file
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {

            List<Employee> empList = (List<Employee>) ois.readObject();

            System.out.println("Employees retrieved from file:");
            for (Employee e : empList) {
                e.display();
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
