package com.reflection.objectmapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    
    // Method creates and populates object using reflection
	
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
	T obj = clazz.getDeclaredConstructor().newInstance();

	for (String key : properties.keySet()) {
	    Field field = clazz.getDeclaredField(key);

	    field.setAccessible(true);
	    field.set(obj, properties.get(key));
	}
	return obj;
    }
}