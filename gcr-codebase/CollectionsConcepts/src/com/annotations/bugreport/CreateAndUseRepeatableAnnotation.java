package com.annotations.bugreport;

import java.lang.reflect.Method;

public class CreateAndUseRepeatableAnnotation {
    public static void main(String[] args) {
	SampleService service = new SampleService();
	service.processData();

	// Reading repeatable annotations using reflection
	Method[] methods = SampleService.class.getDeclaredMethods();
	for (Method method : methods) {
	    BugReport[] reports = method.getAnnotationsByType(BugReport.class);
	    
	    for (BugReport report : reports) {
		System.out.println("Bug : " + report.description());
	    }
	}
    }
}