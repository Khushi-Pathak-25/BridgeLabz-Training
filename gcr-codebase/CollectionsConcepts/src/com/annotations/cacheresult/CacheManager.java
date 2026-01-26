package com.annotations.cacheresult;

import java.lang.reflect.Method;
import java.util.HashMap;

public class CacheManager {
    private static HashMap<String, Object> cache = new HashMap<>();

    // Executes method with caching support
    public static Object invoke(Object obj, Method method, Object... args) {
	String key = method.getName() + args[0];

	if (cache.containsKey(key)) {
	    System.out.println("Returning cached result...");
	    return cache.get(key);
	}

	try {
	    Object result = method.invoke(obj, args);
	    cache.put(key, result);

	    return result;
	} catch (Exception e) {
	    System.out.println("Invocation error.");
	    return null;
	}
    }
}