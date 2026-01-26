package com.reflection.classinfo;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class GetClassInformation {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	// Example input -> java.util.Scanner
	System.out.print("Enter fully qualified class name: ");
	String className = input.nextLine();
	try {
	    Class<?> clazz = Class.forName(className);

	    System.out.println("\n--- Fields ---");
	    Field[] fields = clazz.getDeclaredFields();
	    for (Field field : fields) {
		System.out.println(field.getType().getSimpleName() + " " + field.getName());
	    }

	    System.out.println("\n--- Methods ---");
	    Method[] methods = clazz.getDeclaredMethods();
	    for (Method method : methods) {
		System.out.println(method.getReturnType().getSimpleName() + " " + method.getName());
	    }

	    System.out.println("\n--- Constructors ---");
	    Constructor<?>[] constructors = clazz.getDeclaredConstructors();
	    for (Constructor<?> constructor : constructors) {
		System.out.println(constructor.getName() + Arrays.toString(constructor.getAnnotatedParameterTypes()));
	    }
	    
	} catch (ClassNotFoundException e) {
	    System.out.println("Class not found.");

	}
	input.close();
    }
}