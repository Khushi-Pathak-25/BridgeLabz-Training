package com.exceptionhandling.propagation;

public class ExceptionPropagation {
	// Method that throws ArithmeticException
	static void method1() {
		// Exception occurs here
		int result = 10 / 0;
		System.out.println(result);
	}

	// Method that calls method1()
	static void method2() {
		// Exception propagates to caller
		method1();
	}

	public static void main(String[] args) {
		try {
			// Exception reaches main method
			method2();
		} catch (ArithmeticException e) {
			// Handle exception here
			System.out.println("Handled exception in main");
		}
	}
}