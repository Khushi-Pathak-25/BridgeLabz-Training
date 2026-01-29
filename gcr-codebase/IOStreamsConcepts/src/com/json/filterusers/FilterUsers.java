package com.json.filterusers;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class FilterUsers {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode array = mapper.readTree(new File("src/com/json/filterusers/users.json"));

            for (JsonNode node : array) {
                if (node.get("age").asInt() > 25) {
                    System.out.println(node);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
