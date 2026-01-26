package com.annotations.logexecutiontime;

import java.lang.reflect.Method;

public class UseLogExecutionTime {
    public static void main(String[] args) throws Exception {
        PerformanceService service = new PerformanceService();
        Method[] methods = PerformanceService.class.getDeclaredMethods();

        // Print execution time using Reflection
        for (Method method : methods) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
        	System.out.println();
                long start = System.nanoTime();
                method.invoke(service);
                long end = System.nanoTime();

                // Printing execution time
                System.out.println("Execution Time (ns): " + (end - start));
            }
        }
    }
}