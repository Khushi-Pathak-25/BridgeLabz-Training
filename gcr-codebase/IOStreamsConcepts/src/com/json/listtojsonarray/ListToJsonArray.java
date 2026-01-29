package com.json.listtojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListToJsonArray {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();

            List<Student> list = new ArrayList<>();
            list.add(new Student("Amit", 22));
            list.add(new Student("Neha", 24));

            String jsonArray = mapper.writeValueAsString(list);
            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

