package com.analysis.fibonacci;

public class IterativeFibonacci {

	public static int compute(int number) {
		if (number <= 1) {
			return number;
		}

		int first = 0, second = 1, third = 0;

		for (int i = 2; i <= number; i++) {
			third = first + second;
			first = second;
			second = third;
		}
		return second;
	}
}
