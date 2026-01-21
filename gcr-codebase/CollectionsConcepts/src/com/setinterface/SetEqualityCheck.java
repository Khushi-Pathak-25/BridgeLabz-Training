package com.setinterface;

import java.util.*;

public class SetEqualityCheck {

	// Way 1
	public static boolean areSetsEqual(Set<Integer> set1, Set<Integer> set2) {
		return set1.equals(set2);
	}

	// Alternative way
	public static boolean areSetsEqualManual(Set<Integer> set1, Set<Integer> set2) {
		// Quick size check first
		if (set1.size() != set2.size()) {
			return false;
		}

		// Check if every element of set1 exists in set2
		return set1.containsAll(set2);
		// or: set2.containsAll(set1) -> both are equivalent here
	}

	public static void main(String[] args) {
		Set<Integer> setA = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> setB = new HashSet<>(Arrays.asList(3, 2, 1));
		Set<Integer> setC = new HashSet<>(Arrays.asList(1, 2, 4));
		Set<Integer> setD = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);
		System.out.println("Set C: " + setC);
		System.out.println();

		System.out.println("A equals B ? " + areSetsEqual(setA, setB)); // true
		System.out.println("A equals C ? " + areSetsEqual(setA, setC)); // false
		System.out.println("A equals D ? " + areSetsEqual(setA, setD)); // false

		// Using manual version
		System.out.println("\nManual check A == B: " + areSetsEqualManual(setA, setB)); // true
	}
}