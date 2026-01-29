package com.json.studentjson;

import org.json.JSONArray;
import org.json.JSONObject;

public class StudentJson {
    public static void main(String[] args) {

        // Create JSON array for subjects
        JSONArray subjects = new JSONArray();
        subjects.put("Maths");
        subjects.put("Science");
        subjects.put("English");

        // Create JSON object
        JSONObject student = new JSONObject();
        student.put("name", "Rahul");
        student.put("age", 20);
        student.put("subjects", subjects);

        // Print JSON
        System.out.println(student.toString());
    }
}
