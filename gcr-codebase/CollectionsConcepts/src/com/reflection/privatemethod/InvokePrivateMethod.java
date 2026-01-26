package com.reflection.privatemethod;

import java.lang.reflect.Method;

public class InvokePrivateMethod {
	
    public static void main(String[] args) {
	try {
	    Calculator calc = new Calculator();
	    Method method = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);

	    method.setAccessible(true);
	    int result = (int) method.invoke(calc, 4, 5);

	    System.out.println("Result: " + result);

	} catch (Exception e) {
	    System.out.println("Invocation failed.");
	}
    }
}