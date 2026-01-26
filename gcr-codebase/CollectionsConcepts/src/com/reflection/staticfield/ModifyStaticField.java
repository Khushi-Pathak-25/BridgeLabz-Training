package com.reflection.staticfield;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) {
	try {
	    Field field = Configuration.class.getDeclaredField("API_KEY");

	    field.setAccessible(true);
	    field.set(null, "NEWKEY");

	    System.out.println("Updated static field value: " + field.get(new Configuration()));

	} catch (Exception e) {

	    System.out.println("Error.");
	}
    }
}