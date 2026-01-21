package com.setinterface;

import java.util.*;

public class SymmetricDifference {
	
	// Method 1
	public static Set<Integer> symmetricDifference(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result = new HashSet<>(set1);
		result.addAll(set2); // union of both sets
		Set<Integer> common = new HashSet<>(set1);
		common.retainAll(set2); // intersection
		result.removeAll(common); // remove elements that are in both

		return result;
	}

	// Method 2
	public static Set<Integer> symmetricDifferenceShort(Set<Integer> set1, Set<Integer> set2) {
		Set<Integer> result1 = new HashSet<>(set1);
		result1.removeAll(set2); // elements only in set1
		Set<Integer> result2 = new HashSet<>(set2);
		result2.removeAll(set1); // elements only in set2
		result1.addAll(result2);

		return result1;
	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 4, 5));

		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);

		System.out.println("Symmetric Difference: " + symmetricDifference(setA, setB));
		System.out.println("Symmetric Difference: " + symmetricDifferenceShort(setA, setB));
	}
}