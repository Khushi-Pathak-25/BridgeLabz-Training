package com.listinterface.rotateelements;

import java.util.*;

public class ListRotator {
	// Rotate list by given position
    public static void rotate(List<Integer> list, int k) {
        if (list == null || list.isEmpty()) return;
        
        // Make k safe handles large and negative values if k is greater then it removes unnecessary move
        k = k % list.size();
        if (k < 0) k += list.size();
        
        Collections.rotate(list, k);
    }

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(10, 20, 30, 40, 50));
        
        System.out.println("Before : " + nums);
        
        rotate(nums, -2); // for left rotation
        System.out.println("After rotate 2  : " + nums);
        
    }
}