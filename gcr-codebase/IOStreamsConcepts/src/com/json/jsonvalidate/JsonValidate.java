package com.json.jsonvalidate;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class JsonValidate {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(new File("src/com/json/jsonvalidate/user.json"));

            if (node.has("name") && node.has("email")) {
                System.out.println("JSON is valid");
            } else {
                System.out.println("JSON is invalid");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

