package com.setinterface;

import java.util.*;

public class UnionAndIntersection {

	public static void main(String[] args) {
		// Method 1: Using HashSet
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

		System.out.println("Set1: " + set1);
		System.out.println("Set2: " + set2);

		// Union
		Set<Integer> union = new HashSet<>(set1); // copy set1
		union.addAll(set2); // add all elements from set2

		// Intersection
		Set<Integer> intersection = new HashSet<>(set1);
		intersection.retainAll(set2); // keep only common elements

		System.out.println("Union        : " + union);
		System.out.println("Intersection : " + intersection);
	}
}