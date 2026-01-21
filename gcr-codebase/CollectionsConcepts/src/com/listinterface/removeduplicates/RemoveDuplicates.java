package com.listinterface.removeduplicates;

import java.util.*;

public class RemoveDuplicates {
	// Approach 1
    public static List<Integer> removeDuplicates(List<Integer> list) {
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    // Approach 2- Alternative: Using HashSet + manual check 
    public static List<Integer> removeDuplicatesManual(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for (Integer num : list) {
            if (seen.add(num)) {    // add() returns true if element was not present
                result.add(num);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 1, 2, 2, 3, 4);

        System.out.println("Original : " + numbers);

        List<Integer> result1 = removeDuplicates(numbers);
        System.out.println("Using LinkedHashSet : " + result1);

        List<Integer> result2 = removeDuplicatesManual(numbers);
        System.out.println("Manual (HashSet)     : " + result2);
    }
}