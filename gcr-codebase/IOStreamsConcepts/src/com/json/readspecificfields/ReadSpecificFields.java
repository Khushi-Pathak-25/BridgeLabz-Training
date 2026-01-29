package com.json.readspecificfields;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class ReadSpecificFields {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode node = mapper.readTree(new File("src/com/json/readspecificfields/user.json"));

            System.out.println("Name: " + node.get("name").asText());
            System.out.println("Email: " + node.get("email").asText());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

