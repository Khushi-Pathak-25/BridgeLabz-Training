package com.reflection.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class LoggingProxy implements InvocationHandler {
    private Object target;

    // constructor
    public LoggingProxy(Object target) {
	this.target = target;
    }

    // Method to call 
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	System.out.println("Calling method: " + method.getName());
	return method.invoke(target, args);
    }
}