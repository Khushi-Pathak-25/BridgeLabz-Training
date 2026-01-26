package com.annotations.jsonfield;

import java.lang.reflect.Field;

public class JsonSerializer {
    // Converts object to JSON string using annotations
    public static String toJson(Object obj) {
	StringBuilder json = new StringBuilder();
	json.append("{");

	Field[] fields = obj.getClass().getDeclaredFields();

	for (int i = 0; i < fields.length; i++) {
	    Field field = fields[i];
	    field.setAccessible(true);

	    if (field.isAnnotationPresent(JsonField.class)) {
		JsonField annotation = field.getAnnotation(JsonField.class);

		try {
		    json.append("\"").append(annotation.name()).append("\":");

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
		    System.out.println("Serialization error.");
		}
	    }
	}

	json.append("}");
	return json.toString();
    }
}