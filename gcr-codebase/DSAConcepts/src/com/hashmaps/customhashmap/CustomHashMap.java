package com.hashmaps.customhashmap;

public class CustomHashMap {

    private HashNode[] buckets;
    private int capacity;

    // Initialize hash map
    public CustomHashMap(int capacity) {
        this.capacity = capacity;
        buckets = new HashNode[capacity];
    }

    // Simple hash function
    private int getIndex(int key) {
        return key % capacity;
    }

    // Insert or update key-value pair
    public void put(int key, int value) {

        int index = getIndex(key);
        HashNode head = buckets[index];

        // Check if key already exists
        while (head != null) {
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.next;
        }

        // Insert new node at bucket
        HashNode newNode = new HashNode(key, value);
        newNode.next = buckets[index];
        buckets[index] = newNode;
    }

    // Retrieve value using key
    public Integer get(int key) {

        int index = getIndex(key);
        HashNode head = buckets[index];

        // Traverse bucket list
        while (head != null) {
            if (head.key == key) {
                return head.value;
            }
            head = head.next;
        }

        return null;
    }

    // Remove key-value pair
    public void remove(int key) {

        int index = getIndex(key);
        HashNode head = buckets[index];
        HashNode prev = null;

        // Traverse bucket list
        while (head != null) {
            if (head.key == key) {
                if (prev == null) {
                    buckets[index] = head.next;
                } else {
                    prev.next = head.next;
                }
                return;
            }
            prev = head;
            head = head.next;
        }
    }
}