package com.reflection.executiontime;

import java.lang.reflect.Method;

public class ExecutionTimer {
    public static void main(String[] args) {
	try {
	    SampleService service = new SampleService();
	    Method method = SampleService.class.getDeclaredMethod("slowTask");

	    long start = System.nanoTime();
	    method.invoke(service);
	    long end = System.nanoTime();

	    System.out.println("Execution Time: " + (end - start) + " ns");
	} catch (Exception e) {
	    System.out.println("Timing failed.");
	}
    }
}