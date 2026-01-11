package com.analysis.stringconcat;

public class StringConcatenationComparison {
	public static void main(String[] args) {
		int count = 100_000;

		long startString = System.nanoTime();
		StringConcatenation.concatenate(count);
		long endString = System.nanoTime();

		long startBuilder = System.nanoTime();
		StringBuilderConcatenation.concatenate(count);
		long endBuilder = System.nanoTime();

		long startBuffer = System.nanoTime();
		StringBufferConcatenation.concatenate(count);
		long endBuffer = System.nanoTime();

		System.out.println("String Time       : " + (endString - startString) + " ns");
		System.out.println("StringBuilder Time:   " + (endBuilder - startBuilder) + " ns");
		System.out.println("StringBuffer Time :   " + (endBuffer - startBuffer) + " ns");
	}
}