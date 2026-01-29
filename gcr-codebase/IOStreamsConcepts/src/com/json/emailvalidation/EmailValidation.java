package com.json.emailvalidation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

public class EmailValidation {
    public static void main(String[] args) {

        try {
            ObjectMapper mapper = new ObjectMapper();
            JsonNode user = mapper.readTree(new File("src/com/json/emailvalidation/user.json"));

            String email = user.get("email").asText();

            if (email.contains("@") && email.contains(".")) {
                System.out.println("Valid Email");
            } else {
                System.out.println("Invalid Email");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
