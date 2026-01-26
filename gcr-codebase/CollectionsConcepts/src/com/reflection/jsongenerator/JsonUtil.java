package com.reflection.jsongenerator;

import java.lang.reflect.Field;

public class JsonUtil {
    // Converts object to JSON-like string
    public static String toJson(Object obj) {
	StringBuilder json = new StringBuilder("{");
	Field[] fields = obj.getClass().getDeclaredFields();

	for (int i = 0; i < fields.length; i++) {
	    Field field = fields[i];

	    field.setAccessible(true);
	    try {
		json.append("\"").append(field.getName()).append("\":");

		Object value = field.get(obj);

		if (value instanceof String) {
		    json.append("\"").append(value).append("\"");
		    
		} else {
		    json.append(value);
		}

		if (i < fields.length - 1) {
		    json.append(",");
		}

	    } catch (IllegalAccessException e) {
		System.out.println("JSON creation failed.");
	    }
	}

	json.append("}");
	return json.toString();
    }
}