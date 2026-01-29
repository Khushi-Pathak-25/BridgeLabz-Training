package com.json.convertlisttojson;


import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Employee {
    public int id;
    public String name;
    public int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class JsonReport {
    public static void main(String[] args) {

        try {
            List<Employee> records = new ArrayList<>();
            records.add(new Employee(1, "Amit", 50000));
            records.add(new Employee(2, "Neha", 65000));

            ObjectMapper mapper = new ObjectMapper();
            String report = mapper.writeValueAsString(records);

            System.out.println("JSON Report:");
            System.out.println(report);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
