package com.reflection.objectmapper;

import java.util.Map;
import java.util.HashMap;

public class UseObjectMapper {
    public static void main(String[] args) {
	Map<String, Object> data = new HashMap<>();

	data.put("name", "Ringo");
	data.put("age", 25);

	try {
	    User user = ObjectMapper.toObject(User.class, data);

	    System.out.println("Name: " + user.getName());
	    System.out.println("Age : " + user.getAge());
	} catch (Exception e) {

	    System.out.println("Mapping failed.");
	}
    }
}