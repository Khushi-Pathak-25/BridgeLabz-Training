package com.annotations.cacheresult;

import java.lang.reflect.Method;

public class UseCacheResult {
    public static void main(String[] args) throws Exception {
	ExpensiveService service = new ExpensiveService();
	Method method = ExpensiveService.class.getDeclaredMethod("square", int.class);

	// First call - computed
	int result1 = (int) CacheManager.invoke(service, method, 5);
	System.out.println("Result: " + result1);

	// Second call - cached
	int result2 = (int) CacheManager.invoke(service, method, 5);
	System.out.println("Result: " + result2);
    }
}