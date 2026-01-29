package com.json.objectlisttojsonarray;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

class User {
    public String name;
    public int age;

    User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ObjListToJsonArray {
    public static void main(String[] args) {

        try {
            List<User> users = new ArrayList<>();
            users.add(new User("Amit", 22));
            users.add(new User("Neha", 28));

            ObjectMapper mapper = new ObjectMapper();
            String jsonArray = mapper.writeValueAsString(users);

            System.out.println(jsonArray);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
