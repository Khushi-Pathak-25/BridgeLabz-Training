package com.listinterface.nthelementfromend;

import java.util.LinkedList;
import java.util.ListIterator;

public class NthElementFromEnd {

    // Find Nth element from end without calculating size
    public static String findNthFromEnd(LinkedList<String> list, int n) {

        if (list == null || list.isEmpty() || n <= 0) {
            return null;
        }

        ListIterator<String> fast = list.listIterator();
        ListIterator<String> slow = list.listIterator();

        // Move fast pointer n steps ahead
        int count = 0;
        while (count < n) {
            if (!fast.hasNext()) {
                return null; // n greater than list length
            }
            fast.next();
            count++;
        }

        // Move both pointers until fast reaches end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }

        // slow now points to Nth element from end
        return slow.next();
    }

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("List: " + list);
        System.out.println("2nd from end: " + findNthFromEnd(list, 2));
    }
}
