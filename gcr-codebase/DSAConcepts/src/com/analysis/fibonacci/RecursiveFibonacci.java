package com.analysis.fibonacci;

public class RecursiveFibonacci {

	public static int compute(int number) {
		if (number <= 1) {
			return number;
		}
		return compute(number - 1) + compute(number - 2);
	}
}
