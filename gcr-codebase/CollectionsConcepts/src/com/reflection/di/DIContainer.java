package com.reflection.di;

import java.lang.reflect.Field;

public class DIContainer {
    // Creates object and injects dependencies
    public static <T> T create(Class<T> clazz) throws Exception {

	T obj = clazz.getDeclaredConstructor().newInstance();
	Field[] fields = clazz.getDeclaredFields();

	for (Field field : fields) {
	    if (field.isAnnotationPresent(Inject.class)) {

		field.setAccessible(true);
		Object dependency = field.getType().getDeclaredConstructor().newInstance();
		field.set(obj, dependency);
	    }
	}
	return obj;
    }

    public static void main(String[] args) {
	try {
	    Client client = create(Client.class);
	    client.run();

	} catch (Exception e) {
	    System.out.println("Injection failed.");
	}
    }
}