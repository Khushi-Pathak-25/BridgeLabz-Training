package com.analysis.datastructures;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class DataStructuresComparison {
	public static void main(String[] args) {
		int n = 1_000_000;
		int target = n - 1;

		int[] array = new int[n];
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> treeSet = new TreeSet<>();

		for (int i = 0; i < n; i++) {
			array[i] = i;
			hashSet.add(i);
			treeSet.add(i);
		}

		long startArray = System.nanoTime();
		boolean arrayResult = ArraySearch.search(array, target);
		long endArray = System.nanoTime();

		long startHashSet = System.nanoTime();
		boolean hashSetResult = HashSetSearch.search(hashSet, target);
		long endHashSet = System.nanoTime();

		long startTreeSet = System.nanoTime();
		boolean treeSetResult = TreeSetSearch.search(treeSet, target);
		long endTreeSet = System.nanoTime();

		System.out.println("Array Search Result   : " + arrayResult);
		System.out.println("Array Search Time     : " + (endArray - startArray) + " ns");
		System.out.println();
		System.out.println("HashSet Search Result : " + hashSetResult);
		System.out.println("HashSet Search Time   : " + (endHashSet - startHashSet) + " ns");
		System.out.println();
		System.out.println("TreeSet Search Result : " + treeSetResult);
		System.out.println("TreeSet Search Time   : " + (endTreeSet - startTreeSet) + " ns");
	}
}
