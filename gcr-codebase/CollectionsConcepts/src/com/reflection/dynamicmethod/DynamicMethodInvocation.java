package com.reflection.dynamicmethod;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter method name: ");
	String name = input.next();
	
	System.out.print("Enter first number: ");
	int num1 = input.nextInt();
	System.out.print("Enter second number: ");
	int num2 = input.nextInt();
	
	try {
	    MathOperations ops = new MathOperations();
	    Method method = MathOperations.class.getDeclaredMethod(name, int.class, int.class);

	    int result = (int) method.invoke(ops, num1, num2);
	    System.out.println("Result: " + result);

	} catch (Exception e) {
	    System.out.println("Invalid method.");
	}
	input.close();
    }
}