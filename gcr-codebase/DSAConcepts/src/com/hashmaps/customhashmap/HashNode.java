package com.hashmaps.customhashmap;

class HashNode {

    int key;
    int value;
    HashNode next;

    // Stores key-value pair
    HashNode(int key, int value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}