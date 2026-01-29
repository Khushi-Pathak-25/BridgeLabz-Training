package com.json.csvtojson;

import org.json.JSONArray;
import org.json.JSONObject;

import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.List;

public class CsvToJson {
    public static void main(String[] args) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("src/com/json/csvtojson/data.csv"));

            String[] headers = lines.get(0).split(",");
            JSONArray array = new JSONArray();

            for (int i = 1; i < lines.size(); i++) {
                String[] values = lines.get(i).split(",");
                JSONObject obj = new JSONObject();

                obj.put(headers[0], values[0]);
                obj.put(headers[1], values[1]);

                array.put(obj);
            }

            System.out.println(array);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
