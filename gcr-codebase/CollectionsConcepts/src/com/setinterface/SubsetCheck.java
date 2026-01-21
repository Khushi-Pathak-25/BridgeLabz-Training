package com.setinterface;

import java.util.*;

public class SubsetCheck {
	public static boolean isSubset(Set<Integer> subset, Set<Integer> superset) {
		// Returns true if ALL elements of subset exist in superset
		return superset.containsAll(subset);
	}

	public static void main(String[] args) {

		Set<Integer> setA = new HashSet<>(Arrays.asList(2, 3));
		Set<Integer> setB = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		Set<Integer> setC = new HashSet<>(Arrays.asList(2, 5));
		Set<Integer> setD = new HashSet<>(Arrays.asList(1, 2, 3, 4));

		System.out.println("Set A: " + setA);
		System.out.println("Set B: " + setB);
		System.out.println("Is A subset of B? " + isSubset(setA, setB)); // true

		System.out.println("\nSet C: " + setC);
		System.out.println("Set D: " + setD);
		System.out.println("Is C subset of D? " + isSubset(setC, setD)); // false
	}
}