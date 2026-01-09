package com.searching.strings;

public class StringBufferVsStringBuilder {

	public static void main(String[] args) {

		int iterations = 1_000_000;

		// StringBuffer test
		StringBuffer buffer = new StringBuffer();

		long startBuffer = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			buffer.append("hello");
		}
		long endBuffer = System.nanoTime();
		long bufferTime = endBuffer - startBuffer;

		// StringBuilder test
		StringBuilder builder = new StringBuilder();

		long startBuilder = System.nanoTime();
		for (int i = 0; i < iterations; i++) {
			builder.append("hello");
		}
		long endBuilder = System.nanoTime();
		long builderTime = endBuilder - startBuilder;

		// Displaying the results
		System.out.println("StringBuffer Time (ns) : " + bufferTime);
		System.out.println("StringBuilder Time (ns): " + builderTime);
	}
}