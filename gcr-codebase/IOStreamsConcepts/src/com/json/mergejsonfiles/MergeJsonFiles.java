package com.json.mergejsonfiles;

import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MergeJsonFiles {
    public static void main(String[] args) {

        try {
            String json1 = new String(Files.readAllBytes(Paths.get("src/com/json/mergejsonfiles/file1.json")));
            String json2 = new String(Files.readAllBytes(Paths.get("src/com/json/mergejsonfiles/file2.json")));

            JSONObject obj1 = new JSONObject(json1);
            JSONObject obj2 = new JSONObject(json2);

            for (String key : obj2.keySet()) {
                obj1.put(key, obj2.get(key));
            }

            System.out.println(obj1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

