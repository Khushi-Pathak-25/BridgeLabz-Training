package com.setinterface;

import java.util.*;

public class SetToSortedList {
	// Way one
	public static List<Integer> toSortedList(Set<Integer> set) {
		return new ArrayList<>(new TreeSet<>(set));
		// TreeSet automatically sorts elements in natural order (ascending)
	}

	// Alternative way
	public static List<Integer> toSortedListAlternative(Set<Integer> set) {
		List<Integer> list = new ArrayList<>(set);
		Collections.sort(list);
		return list;
	}

	public static void main(String[] args) {
		// Input HashSet (order is not guaranteed)
		Set<Integer> numbers = new HashSet<>(Arrays.asList(5, 3, 9, 1));

		System.out.println("Original HashSet : " + numbers);

		System.out.println("Sorted List (TreeSet)  : " + toSortedList(numbers));
		System.out.println("Sorted List (sort)     : " + toSortedListAlternative(numbers));
	}
}
