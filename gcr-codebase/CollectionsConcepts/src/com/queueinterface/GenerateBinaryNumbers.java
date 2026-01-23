package com.queueinterface;
import java.util.*;

public class GenerateBinaryNumbers {


	    public static List<String> generateBinary(int n) {
	        List<String> result = new ArrayList<>();
	        Queue<String> queue = new LinkedList<>();

	        queue.add("1");

	        for (int i = 0; i < n; i++) {
	            String current = queue.poll();
	            result.add(current);

	            queue.add(current + "0");
	            queue.add(current + "1");
	        }
	        return result;
	    }

	    public static void main(String[] args) {
	        int n = 5;
	        System.out.println(generateBinary(n));
	    }
	}
