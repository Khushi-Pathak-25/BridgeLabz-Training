package com.hashmaps.customhashmap;

public class MainCustomHashMap {

	public static void main(String[] args) {

		CustomHashMap map = new CustomHashMap(5);

		map.put(1, 100);
		map.put(6, 200); // collision with key 1
		map.put(11, 300); // collision with key 1

		System.out.println(map.get(1));
		System.out.println(map.get(6));
		System.out.println(map.get(11));

		map.remove(6);
		System.out.println(map.get(6));
	}
}
