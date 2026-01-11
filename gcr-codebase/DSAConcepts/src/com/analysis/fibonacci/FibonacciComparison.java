package com.analysis.fibonacci;

public class FibonacciComparison {
	public static void main(String[] args) {
		int number = 30;

		long startRecursive = System.nanoTime();
		int recursiveResult = RecursiveFibonacci.compute(number);
		long endRecursive = System.nanoTime();

		long startIterative = System.nanoTime();
		int iterativeResult = IterativeFibonacci.compute(number);
		long endIterative = System.nanoTime();

		System.out.println("Recursive Fibonacci Result : " + recursiveResult);
		System.out.println("Recursive Time (ns)        : " + (endRecursive - startRecursive));
		System.out.println();
		System.out.println("Iterative Fibonacci Result : " + iterativeResult);
		System.out.println("Iterative Time (ns)        : " + (endIterative - startIterative));
	}
}
