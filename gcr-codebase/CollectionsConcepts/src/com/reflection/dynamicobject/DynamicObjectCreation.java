package com.reflection.dynamicobject;

public class DynamicObjectCreation {
    public static void main(String[] args) {
	try {
	
	    Class<?> clazz = Class.forName("com.reflection.dynamicobject.Student");

	    Object obj = clazz.getDeclaredConstructor().newInstance();

	} catch (Exception e) {
	    System.out.println("Creation failed.");
	}
    }
}